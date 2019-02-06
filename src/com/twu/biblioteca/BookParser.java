package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookParser {
    public static List<Resource> createListOfBooks(String bookFile) {
        List <Resource> listOfBooks = new ArrayList<>();
        String line;

        try {
            FileReader fileReader =
                    new FileReader(bookFile);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                listOfBooks.add(createBook(line));
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            bookFile + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + bookFile + "'");
        }

        return listOfBooks;
    }

    protected static Book createBook(String bookAsString) {
        String[] bookInfo = bookAsString.split(",, ");
        String title = bookInfo[0];
        String author = bookInfo[1];
        String yearWithoutNewLine = bookInfo[2].replaceAll("[^0-9]", "");
        return new Book(title, author, Integer.valueOf(yearWithoutNewLine));
    }

}
