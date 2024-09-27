import dao.ProjectDao;
import models.HibernateProject;
import models.Project;
import models.SpringProject;

public class Main {
    public static void main(String[] args) {
        HibernateProject hp = new HibernateProject(1, "Health", "Le Van Duc", 10,
                "1.0.0", "Tracking people's health");
        SpringProject sp = new SpringProject(1, "Money", "Le Thi PHuong", 20,
                "1.2.1", "Make a loan");
        ProjectDao pd = new ProjectDao();
        pd.add(hp);
        pd.add(sp);
        for(Project p : pd.findAll())
            System.out.println(p.toString());
    }
}