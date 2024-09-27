package models;

import java.io.Serializable;

public class Project implements Serializable {
    private int id;
    private String projectName;
    private String projectOwner;
    private int numberOfMember;

    public Project() {}

    public Project(int id, String projectName, String projectOwner, int numberOfMember) {
        this.id = id;
        this.projectName = projectName;
        this.projectOwner = projectOwner;
        this.numberOfMember = numberOfMember;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectOwner='" + projectOwner + '\'' +
                ", numberOfMember=" + numberOfMember +
                '}';
    }
}
