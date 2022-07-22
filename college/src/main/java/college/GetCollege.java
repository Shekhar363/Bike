package college;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCollege 
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	College college = entityManager.find(College.class,1);
	{
	
	if(college!=null)
	{
	   System.err.println("college sid"+college.getSid());
	   System.out.println("college sname"+college.getSname());
	   System.out.println("college branch"+college.getBranch());
	   System.out.println("college sadd"+college.getSadd());
	   System.out.println("college smail"+college.getEmail());
	   System.out.println("college section"+college.getSection());
	   System.out.println("college sdob"+college.getSdob());
	   
	}
	else
	{
		System.out.println("no record");
	}
	}

}


