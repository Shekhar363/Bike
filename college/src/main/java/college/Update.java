package college;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		College college = new College();
		
		college.setBranch("mca");
		college.setEmail("raju1999@gmail.com");
		college.setSadd("mysore");
		college.setSdob(01-06-1999);
		college.setSection("b");
		college.setSid(2);
		college.setSname("raju");

		entityTransaction.begin();
		entityManager.merge(college);
		entityTransaction.commit();
	}

}
