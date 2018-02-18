package com.ukraine.springmvc.model;

public class Project {
    private int projectId;
    private String projectName;
    private String projectDiscuss;
    private String projectSpecification;
    private String projectSullution;
    private String projectTechImpl;
    private String projectStart;
    private int objectId;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDiscuss() {
        return projectDiscuss;
    }

    public void setProjectDiscuss(String projectDiscuss) {
        this.projectDiscuss = projectDiscuss;
    }

    public String getProjectSpecification() {
        return projectSpecification;
    }

    public void setProjectSpecification(String projectSpecification) {
        this.projectSpecification = projectSpecification;
    }

    public String getProjectSullution() {
        return projectSullution;
    }

    public void setProjectSullution(String projectSullution) {
        this.projectSullution = projectSullution;
    }

    public String getProjectTechImpl() {
        return projectTechImpl;
    }

    public void setProjectTechImpl(String projectTechImpl) {
        this.projectTechImpl = projectTechImpl;
    }

    public String getProjectStart() {
        return projectStart;
    }

    public void setProjectStart(String projectStart) {
        this.projectStart = projectStart;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Project() {
    }
}
