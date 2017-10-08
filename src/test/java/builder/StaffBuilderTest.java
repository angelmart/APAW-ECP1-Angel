package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entities.Staff;

public class StaffBuilderTest {
    
    private Staff staff;
    
    @Before
    public void before() {
        staff = new StaffBuilder(1).familyName("Federico").country("Grecia").build();
    }
    
    @Test
    public void testStaffId() {
        staff = new StaffBuilder(2).build();
        assertEquals(2, staff.getId());
    }
    
    @Test
    public void testStaffFamilyName() {
        staff = new StaffBuilder(1).familyName("Laura").build();
        assertEquals("Laura", staff.getFamilyName());
    }
    
    @Test
    public void testStaffCountry() {
        staff = new StaffBuilder(1).country("Italia").build();
        assertEquals("Italia", staff.getCountry());
    }

}
