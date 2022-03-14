import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.HibernateUtil;
import entity.StudentEntity;

public class StudentMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obtain the session factory ( this internally does step 1 and step 2 of jdbc
		// so connecting pretty much
		//steop 1 obtain the session factory from hiberntae Util
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		//2) from the sessionFactory opn the session
		Session session = sessionFactory.openSession();
		//3 from the session begin the transation
		Transaction transaction =
		session.beginTransaction();
		
		//step 4 perform the dml operations
		StudentEntity student = new StudentEntity(105, "AABC", "smithy", 55);
		session.save(student);
		System.out.println("Student Saved ");
		
		
		//step 5 commit the transaction
		
		transaction.commit();
		System.out.println("transaction Commited");
		
		//step 6 close the session
		session.close();
		System.out.println("session closed. .  . .");
		//open the session - framework says execute your queries in a session
		
		// from the session start the transaction - framework says execute your queries wihtin a transaction
		
		// perform the crud operation - Data management languyate DML
		
		// commit the tranasction
		
		//close the session
		
		
	}

}
