import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class bikes {
    @Id
    private int sr_no;
    private String name;
    @ManyToMany
    private Collection<boys> Boys_name=new ArrayList<>();

    public bikes() {
    }

    public bikes(int sr_no, String name, Collection<boys> boys_name) {
        this.sr_no = sr_no;
        this.name = name;
        Boys_name = boys_name;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<boys> getBoys_name() {
        return Boys_name;
    }

    public void setBoys_name(Collection<boys> boys_name) {
        Boys_name = boys_name;
    }
}
