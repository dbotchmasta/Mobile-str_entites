package structures.entities;

import java.util.Date;

public abstract class Entity {
    
    private final int id;
    private Date dateopen;
    private Date dateclose;
    private String name;
    private String address;
    private String phone;
    private String email;
    
    public Entity(int id, Date dateopen, Date dateclose, 
            String name, String address, String phone, String email) {
        this.id = id;
        this.dateopen = dateopen;
        this.dateclose = dateclose;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    
    
    public Date getDateOpen(){
        return dateopen;
    }
    
    public Date getDateClose(){
        return dateclose;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
}
