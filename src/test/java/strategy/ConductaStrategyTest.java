package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConductaStrategyTest {
    
    private Camarero camarero;

    @Before
    public void before() {
        this.camarero = new Camarero();
    }
    
    @Test
    public void testMujerConductaStrategy() {
        this.camarero.setStrategy( new MujerConductaStrategy() );
        assertEquals( "Le da un beso en la mejilla", this.camarero.saludar() );
    }
    
    @Test
    public void testHombreConductaStrategy() {
        this.camarero.setStrategy( new HombreConductaStrategy() );
        assertEquals( "Le da la mano", this.camarero.saludar() );
    }
    
    @Test
    public void testAlienConductaStrategy() {
        this.camarero.setStrategy( new AlienConductaStrategy() );
        assertEquals( "Le hace una reverencia", this.camarero.saludar() );
    }
}
