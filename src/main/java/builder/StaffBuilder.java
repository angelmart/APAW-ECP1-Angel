package builder;

import entities.Staff;

public class StaffBuilder {
    
    private Staff staff;
    
    public StaffBuilder( int id ) {
        this.staff = new Staff( id );
    }
    
    public StaffBuilder familyName( String familyName ) {
        this.staff.setFamilyName( familyName );
        return this;
    }
    
    public StaffBuilder country( String country ) {
        this.staff.setCountry( country );
        return this;
    }

    public Staff build() {
        return this.staff;
    }
}
