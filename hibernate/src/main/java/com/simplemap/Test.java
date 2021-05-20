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

		byte byk = 15;

		byte byk1 = 56;

		short shk = 62;

		short shk1 = 342;

//		Employee emp = new Employee(101, true, byk, shk, 'B', 843188L, 45.9f, 2535.42, "Rohit Ranjan", date, time,
//				datetime);
//
//		Employee emp1 = new Employee(102, false, byk1, shk1, 'D', 814727L, 62.2f, 34000.8, "Priyanka Ranjan",
//				date, time, datetime);

		Employee emp = new Employee(8431L, 45.8f, 642.9, "Rohit Ranjan", date, time, datetime);

		Transaction tx = null;

		try (Session session = new Configuration().configure("com/simplemap/hibernate.cfg.xml").buildSessionFactory()
				.openSession()) {

			tx = session.beginTransaction();

			int id = (int) session.save(emp);

//			int idk = (int) session.save(emp1);

			tx.commit();

			System.out.println("Record Inserted : " + id);

//			System.out.println("Record Inserted : " + idk);

		} catch (HibernateException e) {

			if (tx != null)
				tx.rollback();

			e.printStackTrace();

		}

	}

}
