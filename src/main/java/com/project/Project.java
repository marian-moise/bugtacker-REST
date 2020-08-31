package com.project;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    public Project() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId")
    Integer projectId;

    @Column(name = "name")
    String name;

    @Column(name = "identifier")
    String identifier;

    @Column(name = "description")
    String description;

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public Project(Integer projectId, String name, String identifier, String description) {
        this.projectId = projectId;
        this.name = name;
        this.identifier = identifier;
        this.description = description;
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
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
