import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Session session = entityManager.unwrap(Session.class);

        Transaction transaction = session.beginTransaction();

        vehicle v1 = new vehicle();
        v1.setVehi1(2);
        v1.setVnmae("BMW");

        Person p1 = new Person();
        p1.setpId(1);
        p1.setName("Omkar");
        p1.setVehi(v1);

       session.save(p1);
       session.save(v1);

       transaction.commit();
       session.close();
       entityManager.close();



    }
}
