import models.HibernateProject;
import models.SpringProject;

public class Main {
    public static void main(String[] args) {
        HibernateProject hp = new HibernateProject("Health", "Le Van Duc", 10,
                "1.0.0", "Tracking people's health");
        SpringProject sp = new SpringProject("Money", "Le Thi PHuong", 20,
                "1.2.1", "Make a loan");
        System.out.println(hp.toString());
        System.out.println(sp.toString());
    }
}