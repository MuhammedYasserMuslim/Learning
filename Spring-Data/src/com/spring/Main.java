package com.spring;


import com.spring.model.Child;
import com.spring.model.Mother;
import com.spring.model.Person;
import com.spring.model.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Wife.class)
                .addAnnotatedClass(Mother.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();



            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
        }




    }
}
