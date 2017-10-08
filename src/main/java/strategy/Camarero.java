package strategy;

public class Camarero {
    
    private ConductaStrategy strategy;
    
    public void saludar() {
        this.strategy.saludar();  
    }
    
    public void setStrategy(ConductaStrategy strategy) {
        this.strategy = strategy;
    }
    
}
