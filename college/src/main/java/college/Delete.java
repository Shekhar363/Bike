package college;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		College college = entityManager.find(College.class,1);
		
		if(college!=null)
		{
			entityTransaction.begin();
			entityManager.remove(college);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("no records");
		}

	}

}
