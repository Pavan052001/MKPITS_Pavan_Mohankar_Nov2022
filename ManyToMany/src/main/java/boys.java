import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class boys {
   @Id
    private int Sr_no;

    private String Name;

    @ManyToMany
    private Collection<bikes> bikes_type=new ArrayList<>();

    public boys() {
    }

    public boys(int sr_no, String name, Collection<bikes> bikes_type) {
        Sr_no = sr_no;
        Name = name;
        this.bikes_type = bikes_type;
    }

    public int getSr_no() {
        return Sr_no;
    }

    public void setSr_no(int sr_no) {
        Sr_no = sr_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Collection<bikes> getBikes_type() {
        return bikes_type;
    }

    public void setBikes_type(Collection<bikes> bikes_type) {
        this.bikes_type = bikes_type;
    }
}
