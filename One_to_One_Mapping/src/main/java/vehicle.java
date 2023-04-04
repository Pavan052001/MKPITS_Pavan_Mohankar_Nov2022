import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vehicle {
    @Id
     private int vehi1 ;

     private String vnmae;

     public vehicle() {
     }

    public vehicle(int vehi1, String vnmae) {
        this.vehi1 = vehi1;
        this.vnmae = vnmae;
    }

    public int getVehi1() {
        return vehi1;
    }

    public void setVehi1(int vehi1) {
        this.vehi1 = vehi1;
    }

    public String getVnmae() {
        return vnmae;
    }

    public void setVnmae(String vnmae) {
        this.vnmae = vnmae;
    }
}

