package builder;

import entities.Company;
import entities.Staff;
import entities.Size;

public class CompanyBuilder {
    
    private Company company;
    
    public CompanyBuilder( int id ) {
        this.company = new Company(id);
    }
    
    public CompanyBuilder staff( Staff staff ) {
        this.company.addStaff( staff );
        return this;
    }
    
    public CompanyBuilder name( String name ) {
        this.company.setName( name );
        return this;
    }
    
    public CompanyBuilder address( String address ) {
        this.company.setAddress( address );
        return this;
    }
    
    public CompanyBuilder size( Size size ) {
        this.company.setSize( size );
        return this;
    }
    
    public Company build() {
        return this.company;
    }
}