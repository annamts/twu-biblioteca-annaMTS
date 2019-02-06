package com.twu.biblioteca;

import java.util.List;

public abstract class ResourceManager {
    private List<Resource> resourceList;
    private String resourceName;

    public ResourceManager(String resourceName) {
        this.resourceName = resourceName;
    }

    public String resourceListAsString() {
        String result = "These are our available " + resourceName + ":\n";
        for (Resource resource : resourceList) {
            if (resource.isAvailable()){
                result += "\n" + resource.toFormattedString();
            }
        }
        return result + "\n";
    }

    public Resource findResource(String title) {
        for(Resource resource : resourceList) {
            String titleLowerCase = title.toLowerCase();
            String resourceTitleLowerCase = resource.getTitle().toLowerCase();
            if (titleLowerCase.equals(resourceTitleLowerCase)) {
                return resource;
            }
        }
        return null;
    }

    public Boolean checkOut(String title) {
        Resource resource = findResource(title);
        if (resource != null && resource.isAvailable()) {
            resource.checkOut();
            return true;
        }
        return false;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }
}
