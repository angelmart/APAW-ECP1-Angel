package composite;

import entities.Company;

public class CompanyLeaf extends CompanyComponent{
    
    private Company company;
    
    public CompanyLeaf( Company company ) {
        this.company = company;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String view() {
        return String.valueOf( this.company.getId() );
    }

    @Override
    public void add(CompanyComponent companyComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remove(CompanyComponent companyComponent) {
        // Do nothing because is leaf
    }

}
