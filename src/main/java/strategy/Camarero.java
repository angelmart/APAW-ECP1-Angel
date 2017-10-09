package strategy;

public class Camarero {
    
    private ConductaStrategy strategy;
    
    public String saludar() {
        return this.strategy.saludar();  
    }
    
    public void setStrategy(ConductaStrategy strategy) {
        this.strategy = strategy;
    }
    
}
