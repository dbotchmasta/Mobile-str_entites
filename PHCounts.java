package structures.entities;

import java.util.Date;

public class PHCounts extends Entity {
    
    public PHCounts(int id , Date dateopen, Date dateclose, String name, 
            String address, String phone, String email) {
        super(id, dateopen, dateclose, name, address, phone, email);
    }
}
