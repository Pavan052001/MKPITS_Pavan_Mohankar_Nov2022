import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        bikes k1 = new bikes();
        k1.setName("java");
        k1.setSr_no(1);

        bikes k2 = new bikes();
        k2.setSr_no(2);
        k2.setName("yamaha MT15");

        bikes k3 = new bikes();
        k3.setSr_no(3);
        k3.setName("Honda");

      //  k1.getBoys_name().add(b1);


        /////////////////////////////////////////////////////
        boys b1 = new boys();
        b1.setSr_no(1);
        b1.setName("aman");

        boys b2 = new boys();
        b2.setSr_no(2);
        b2.setName("pranay");

        boys b3 = new boys();
        b3.setSr_no(3);
        b3.setName("rahul");


        b1.getBikes_type().add(k1);
        b1.getBikes_type().add(k2);
        b2.getBikes_type().add(k2);
        b3.getBikes_type().add(k3);

        k1.getBoys_name().add(b1);
        k1.getBoys_name().add(b2);
        k2.getBoys_name().add(b2);
        k3.getBoys_name().add(b3);


        entityManager.persist(b1);
        entityManager.persist(b2);
        entityManager.persist(b3);

        entityManager.persist(k1);
        entityManager.persist(k2);
        entityManager.persist(k3);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
