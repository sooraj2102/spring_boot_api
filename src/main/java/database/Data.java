package database;

import com.sun.xml.internal.ws.message.StringHeader;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by sooraj on 7/6/17.
 */
@Entity
@Table(name = "users")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NotNull
    String name;
    @NotNull
    String email;
    @NotNull
    String mob;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public Data() {


    }
    public Data(  String name, String email, String mob) {

        this.name = name;
        this.email = email;
        this.mob = mob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
