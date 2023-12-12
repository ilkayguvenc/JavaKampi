package kodlamaIoSystem.dataAccess;

import kodlamaIoSystem.entities.Course;
public class HibernateDataAccess implements IDataAccess{

    @Override
    public void add(Course[] courses) {

        System.out.print("Hibernate ile veritabanına eklendi: ");
        for(Course course:courses){
            System.out.print(" "+course.getName()+",");
        }
    }
}
