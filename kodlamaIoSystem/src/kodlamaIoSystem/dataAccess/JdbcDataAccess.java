package kodlamaIoSystem.dataAccess;

import kodlamaIoSystem.entities.Course;


public class JdbcDataAccess implements  IDataAccess{
    @Override
    public void add(Course[] courses) {
        System.out.print("Jdbc ile veritabanına eklendi.");
        for(Course course:courses){
            System.out.print(" "+course.getName()+",");
        }
    }
}