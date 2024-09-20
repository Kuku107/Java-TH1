package models;

public class Project {
    private String projectName;
    private String projectOwner;
    private int numberOfMember;

    public Project() {}

    public Project(String projectName, String projectOwner, int numberOfMember) {
        this.projectName = projectName;
        this.projectOwner = projectOwner;
        this.numberOfMember = numberOfMember;
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
                "projectName='" + projectName + '\'' +
                ", projectOwner='" + projectOwner + '\'' +
                ", numberOfMember=" + numberOfMember +
                '}';
    }
}
