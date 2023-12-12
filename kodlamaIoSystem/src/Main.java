import kodlamaIoSystem.business.CourseManager;
import kodlamaIoSystem.core.logging.DatabaseLogger;
import kodlamaIoSystem.core.logging.EmailLogger;
import kodlamaIoSystem.core.logging.FileLogger;
import kodlamaIoSystem.core.logging.IBaseLogger;
import kodlamaIoSystem.dataAccess.HibernateDataAccess;
import kodlamaIoSystem.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course("Java", "12345", 12, "Back-End", "Engin Demiroğ",1250);
        Course course2 = new Course("JavaScript", "12346", 8, "Front-End", "Engin Demiroğ",999);
        Course course3 = new Course("C#", "12347", 9, "Back-End2", "Engin Demiroğ",1550);



        Course[] courses = {course1,course2,course3};

        IBaseLogger[] loggers = new IBaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger()};


        CourseManager courseManager = new CourseManager(courses, new HibernateDataAccess(), loggers);
        courseManager.add(new Course("Phyton","12348",12,"Back-End3","Engin Demiroğ",2500));
    }
}