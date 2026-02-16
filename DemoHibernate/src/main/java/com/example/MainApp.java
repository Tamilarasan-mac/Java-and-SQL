package com.example;

import com.example.entity.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setName("Tamil");
        s.setAge(22);

        session.save(s);
        tx.commit();
        session.close();

        System.out.println("Data inserted successfully");
    }
}