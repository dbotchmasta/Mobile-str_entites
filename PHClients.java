package structures.entities;

import java.util.Date;

public class PHClients extends Entity {
    
    public PHClients(int id ,Date dateopen, Date dateclose, String name, 
            String address, String phone, String email) {
        super(id, dateopen, dateclose, name, address, phone, email);
    }
}
