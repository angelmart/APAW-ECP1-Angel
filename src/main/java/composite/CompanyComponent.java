package composite;

public abstract class CompanyComponent {
    
    public abstract boolean isComposite();
    
    public abstract void add(CompanyComponent companyComponent);
    
    public abstract void remove(CompanyComponent companyComponent);
    
    public abstract String view();

}
