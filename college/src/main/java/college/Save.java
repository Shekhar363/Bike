package college;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		College college = new College();
		
		college.setBranch("bca");
		college.setEmail("raj123@gamil.com");
		college.setSadd("bangalore");
		college.setSdob(01-06-1999);
		college.setSid(1);
		college.setSection("a");
		college.setSname("raj");	
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityTransaction.commit();

	}

}
