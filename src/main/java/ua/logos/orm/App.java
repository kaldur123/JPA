package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDeatails;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = managerFactory.createEntityManager();
        
        em.getTransaction().begin();
        /*TeacherDeatails td = new TeacherDeatails();
        td.setEmail("teacher@gmail.com");
        td.setHobby("Programming");
        em.persist(td);
        
        Teacher teacher = new Teacher();
        teacher.setFirstName("John");
        teacher.setLastName("Doe");
        teacher.setAge(25);
        teacher.setDescription("MyDescription");
        teacher.setTeacherDetails(td);
       
         asdad
        em.persist(teacher);*/
        
        
        
    	
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	managerFactory.close();
    }
}
