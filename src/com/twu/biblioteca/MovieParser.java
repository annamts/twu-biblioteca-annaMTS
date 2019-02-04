package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieParser {

    public static List<Movie> createListOfMovies(String movieFile) {
        List<Movie> listOfMovies = new ArrayList<>();
        String line;

        try {
            FileReader fileReader =
                    new FileReader(movieFile);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                listOfMovies.add(createMovie(line));
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            movieFile + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + movieFile + "'");
        }

        return listOfMovies;
    }

    protected static Movie createMovie(String movieAsString) {
        String[] movieInfo = movieAsString.split(",, ");
        String name = movieInfo[0];
        String director = movieInfo[1];
        String year = movieInfo[2];
        String ratingWithoutNewLine = movieInfo[3].replaceAll("[^0-9.]", "");
        return new Movie(name, director, Integer.valueOf(year), Double.valueOf(ratingWithoutNewLine));
    }
}
