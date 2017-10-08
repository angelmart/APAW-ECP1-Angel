package composite;

public interface CompanyComponent {
    
    public boolean isComposite();
    
    public void add(CompanyComponent companyComponent);
    
    public void remove(CompanyComponent companyComponent);
    
    public String view();

}
