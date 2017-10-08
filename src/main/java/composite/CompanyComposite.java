package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyComposite extends CompanyComponent{
    
    String name;
    List<CompanyComponent> companyComponentList;
    
    public CompanyComposite( String name ) {
        this.name = name;
        companyComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public String view() {
        return this.name;
    }

    @Override
    public void add(CompanyComponent companyComponent) {
        assert companyComponent != null;
        companyComponentList.add(companyComponent);
        
    }

    @Override
    public void remove(CompanyComponent companyComponent) {
        assert companyComponent != null;
        companyComponentList.remove(companyComponent);
        
    }

}
