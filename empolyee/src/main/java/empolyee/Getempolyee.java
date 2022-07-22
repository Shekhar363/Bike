package empolyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Getempolyee {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Empolyee empolyee = entityManager.find(Empolyee.class,1);
		
		if(empolyee!=null)
		{
		System.out.println("empolyee eid"+empolyee.getEid());
		System.out.println("empolyee Name"+empolyee.getEname());
		System.out.println("empolyee sal"+empolyee.getSal());
		System.out.println("empolyee desgantio"+empolyee.getDesegnation());
		System.out.println("empolyee age"+empolyee.getAge());		
		}
	
	else
	{
		System.out.println("no data found");
	}
			

	}

}
