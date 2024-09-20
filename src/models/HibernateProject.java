package models;

public class HibernateProject extends Project{
    private String version;
    private String description;

    public HibernateProject() {}

    public HibernateProject(String projectName, String projectOwner, int numberOfMember,
                            String version, String description) {
        super(projectName, projectOwner, numberOfMember);
        this.version = version;
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() + "HibernateProject{" +
                "version='" + version + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
