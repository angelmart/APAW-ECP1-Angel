package strategy;

public class AlienConductaStrategy implements ConductaStrategy{

    @Override
    public void saludar() {
        System.out.println("Le hace una reverencia");
    }
    
}
