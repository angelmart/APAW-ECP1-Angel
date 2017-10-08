package factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import builder.CompanyBuilder;

public class CompanyFactoryTest {
    
    @Before
    public void before() {
        CompanyFactory.getFactory().addCompany( new CompanyBuilder(1).name( "CompanyOne" ).address( "CompanyOneAddress" ).build() );
    }

    @Test
    public void testIsSingleton() {
        assertSame(CompanyFactory.getFactory(), CompanyFactory.getFactory());
    }
    
    @Test
    public void testSingletonNotNull() {
        assertNotNull(CompanyFactory.getFactory());
    }
    
    @Test
    public void testGetCompany() {
        assertEquals( "CompanyOneAddress", CompanyFactory.getFactory().getCompany(1).getAddress() );
    }
    
    @Test
    public void testAddCompany() {
        CompanyFactory.getFactory().addCompany( new CompanyBuilder(1).name( "NewCompanyOne" ).address( "NewCompanyOneAddress" ).build() );
        assertEquals( "CompanyOneAddress", CompanyFactory.getFactory().getCompany(1).getAddress() );
    }
    
    @Test
    public void testAddCompanyRepeatedId() {
        CompanyFactory.getFactory().addCompany( new CompanyBuilder(1).build() );
        assertEquals( false, CompanyFactory.getFactory().addCompany( new CompanyBuilder(1).build() ) );
    }

}
