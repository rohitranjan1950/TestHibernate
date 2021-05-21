package com.simplemap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalTime time = LocalTime.now();

		LocalDateTime datetime = LocalDateTime.now();

		LocalDate kdt = LocalDate.of(2015, 8, 14);

		LocalTime ktime = LocalTime.of(16, 38);

		LocalDateTime datetime1 = LocalDateTime.of(kdt, ktime);

		// New Changes

//		byte byk = 15;
//
//		byte byk1 = 56;
//
//		short shk = 62;
//
//		short shk1 = 342;

//		Employee emp = new Employee(101, true, byk, shk, 'B', 843188L, 45.9f, 2535.42, "Rohit Ranjan", date, time,
//				datetime);
//
//		Employee emp1 = new Employee(102, false, byk1, shk1, 'D', 814727L, 62.2f, 34000.8, "Priyanka Ranjan",
//				date, time, datetime);

		Employee emp = new Employee(8431L, 45.8f, 642.9, "Neha", date, time, datetime);

		Employee emp1 = new Employee(9342L, 623.92f, 25600.8, "Rohit", kdt, ktime, datetime1);

		Employee emp2 = new Employee(8147L, 419.64f, 4621.13, "Kiya", LocalDate.of(2014, 8, 15), LocalTime.of(9, 46),
				LocalDateTime.of(2008, 12, 25, 11, 18));

		Transaction tx = null;

		try (Session session = new Configuration().configure("com/simplemap/hibernate.cfg.xml").buildSessionFactory()
				.openSession()) {

//			System.out.println("Session Value Before Save session.contains(emp) : "+session.contains(emp));

			tx = session.beginTransaction();

//			int id = (int) session.save(emp);
//
//			int idk = (int) session.save(emp1);
//
//			int dp = (int) session.save(emp2);

//			System.out.println("Before Clear session.contains(emp) : "+session.contains(emp));
//			
//			System.out.println("Before Clear session.contains(emp1) : "+session.contains(emp1));
//			
//			System.out.println("Before Clear session.contains(emp2) : "+session.contains(emp2));
//			
//		    session.clear();

//			System.out.println("Before session.evict(emp) session.contains(emp) : "+session.contains(emp));
//			
//			session.evict(emp);
//			
//			System.out.println("After session.evict(emp) session.contains(emp) : "+session.contains(emp));
//			
//          System.out.println("After Clear session.contains(emp) : "+session.contains(emp));
//			
//			System.out.println("After Clear session.contains(emp1) : "+session.contains(emp1));
//			
//			System.out.println("After Clear session.contains(emp2) : "+session.contains(emp2));

			tx.commit();

//			System.out.println("Session Value After Save And Commit : "+session);

//			System.out.println("Record Inserted : " + id);
//
//			System.out.println("Record Inserted : " + idk);
//
//			System.out.println("Record Inserted : " + dp);
//			
//			System.out.println("===========================");
			
//			Employee k=(Employee)session.get(Employee.class, 3);
//			
//			System.out.println(k);
//			
//			session.clear();
//			
//			Employee k1=(Employee)session.get(Employee.class, 3);
//			
//			System.out.println(k1);
			
			
			
			
			
//		  Employee k=(Employee)session.load(Employee.class, 2);
//		  
//	      System.out.println(k);
//	      
//	      session.clear();
//	      
//          Employee k1=(Employee)session.load(Employee.class, 2);
//		  
//	      System.out.println(k1);
			
			
			
			

		} catch (HibernateException e) {

//			if (tx != null)
//				tx.rollback();

			e.printStackTrace();

		}

	}

}
