package empolyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	 
	    Empolyee empolyee = new Empolyee();
	    
	    empolyee.setAge(23);
	    empolyee.setDesegnation("software developmt");
	    empolyee.setEid(101);
	    empolyee.setEname("raju");
	    empolyee.setSal(50000.00);
	   
	    entityTransaction.begin();
	    entityManager.merge(empolyee);
	    entityTransaction.commit();
		
	}  
}
