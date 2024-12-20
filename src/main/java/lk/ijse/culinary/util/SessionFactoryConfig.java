package lk.ijse.culinary.util;


import lk.ijse.culinary.entity.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfiguration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        sessionFactory = new Configuration()
                .mergeProperties(Utility.getProperties())
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Admin.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Payment.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(StudentCourse.class)
                .buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfiguration)
                ? factoryConfiguration = new SessionFactoryConfig()
                : factoryConfiguration;
    }
    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}
