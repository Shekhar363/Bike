package empolyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testclass {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Empolyee empolyee1 = new Empolyee();
		
		empolyee1.setAge(23);
		empolyee1.setDesegnation("Software testing");
		empolyee1.setEid(101);
		empolyee1.setEname("raju");
		empolyee1.setSal(45000.00);
		
		entityTransaction.begin();
		entityManager.persist(empolyee1);
	    entityTransaction.commit();
		
	}

}
