package com.project.dto;


import java.io.Serializable;

public class IssueDTO implements Serializable {
    Integer projectId;
    String name;
    String identifier;
    String description;

    public IssueDTO(Integer projectId, String name) {
        this.projectId = projectId;
        this.name = name;
    }


    public IssueDTO() {
    }

    public IssueDTO(Integer projectId, String name, String identifier, String description) {
        this.projectId = projectId;
        this.name = name;
        this.identifier = identifier;
        this.description = description;
    }

    public IssueDTO(Integer projectId, String name, String identifier) {
        this.projectId = projectId;
        this.name = name;
        this.identifier = identifier;

    }

    public IssueDTO(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    @Override
    public String toString() {
        return "ProjectDTO{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", description='" + description + '\'' +
                ", projectIDDDDD=" +
                '}';
    }
}
