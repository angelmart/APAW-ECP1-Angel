package composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import builder.CompanyBuilder;
import entities.Company;

public class CompanyCompositeTest {
    
    private Company company1;
    private Company company2;
    
    private CompanyComponent companyComponent1;
    private CompanyComponent companyComponent2;
    private CompanyComponent companyComponent3;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void before() {
        
        this.company1 = new CompanyBuilder(1).name("companyOne").address("companyOneAddress").build();
        this.company2 = new CompanyBuilder(2).name("companyTwo").address("companyTwoAddress").build();

        this.companyComponent1 = new CompanyComposite("companyCompositeOne");
        this.companyComponent2 = new CompanyLeaf( this.company1 );
        this.companyComponent3 = new CompanyLeaf( this.company2 );
        
    }

    @Test
    public void testIsComposite() {
        assertEquals( true, this.companyComponent1.isComposite() );
        assertEquals( false, this.companyComponent2.isComposite() );
        assertEquals( false, this.companyComponent3.isComposite() );
    }
    
    @Test
    public void testAddIfLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.companyComponent2.add( this.companyComponent3 );
    }
    
    @Test
    public void testRemoveIfLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.companyComponent2.remove( this.companyComponent3 );
    }
    
    @Test
    public void testView() {
        assertEquals("1", this.companyComponent2.view());
        assertEquals("2", this.companyComponent3.view());
        assertEquals("companyCompositeOne", this.companyComponent1.view());
    }


}

