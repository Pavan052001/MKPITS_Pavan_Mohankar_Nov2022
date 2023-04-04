import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

@Id
   private  int pId;

   private String Name;
  @OneToOne
   private vehicle vehi;

    public Person() {
    }

    public Person(int pId, String name) {
        this.pId = pId;
        Name = name;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public vehicle getVehi() {
        return vehi;
    }

    public void setVehi(vehicle vehi) {
        this.vehi = vehi;
    }
}
