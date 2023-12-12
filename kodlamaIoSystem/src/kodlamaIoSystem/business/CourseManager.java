package kodlamaIoSystem.business;

import kodlamaIoSystem.core.logging.IBaseLogger;
import kodlamaIoSystem.dataAccess.IDataAccess;
import kodlamaIoSystem.entities.Course;

public class CourseManager {
    IDataAccess dataAccess;
    Course[] courses;
    IBaseLogger[] loggers;

    public CourseManager(Course[] courses, IDataAccess dataAccess, IBaseLogger[] loggers) {
        this.dataAccess = dataAccess;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {

            if (course.getPrice() < 0) throw new Exception("Ürünün fiyatı 0Tl'den az olamaz!");
            for(Course crs: courses){
                if(course.getName().equals(crs.getName())) throw new Exception("Kursun ismi aynı olamaz!");
                if(course.getCategory().equals(crs.getCategory())) throw new Exception("Kategoriler aynı olamaz!");
            }

        for (IBaseLogger logger : loggers) {
            logger.log("Başarılı");
        }
        dataAccess.add(courses);

    }

}




