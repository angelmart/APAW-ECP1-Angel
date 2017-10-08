package strategy;

public class HombreConductaStrategy implements ConductaStrategy{

    @Override
    public void saludar() {
        System.out.println("Le da la mano");
    }

}
