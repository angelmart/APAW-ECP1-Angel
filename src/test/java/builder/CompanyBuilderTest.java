package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Company;
import entities.Size;
import entities.Staff;

public class CompanyBuilderTest {
    
    private Staff staff;

    private Staff staff2;

    private Company company;

    @Before
    public void before() {
        staff = new StaffBuilder(1).familyName("Federico").country("Grecia").build();
        staff2 = new StaffBuilder(1).familyName("Diana").country("Dinamarca").build();
        company = new CompanyBuilder(5).staff(staff).address("Calle Fedestreet").size(Size.MEDIUM).staff(staff2).name("Fedecompany")
                .build();
    }
    
    @Test 
    public void testCompanyId() {
        company = new CompanyBuilder(7).build();
        assertEquals(7, company.getId());
    }
    
    @Test 
    public void testCompanyAddress() {
        company = new CompanyBuilder(7).address("Calle Dianastreet").build();
        assertEquals("Calle Dianastreet", company.getAddress());
    }
    
    @Test 
    public void testCompanyName() {
        company = new CompanyBuilder(7).name("Dianacompany").build();
        assertEquals("Dianacompany", company.getName());
    }
    
    @Test 
    public void testCompanySize() {
        company = new CompanyBuilder(7).size(Size.SMALL).build();
        assertEquals(Size.SMALL, company.getSize());
    }
    
    @Test 
    public void testCompanyStaff() {
        company = new CompanyBuilder(5).staff(staff).staff(staff2).build();
        assertEquals(2, company.getStaff().size());
    }
   
}
