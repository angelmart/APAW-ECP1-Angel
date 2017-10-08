package factory;

import java.util.HashMap;
import java.util.Map;

import entities.Company;

public class CompanyFactory {
    
    private static final CompanyFactory factory = new CompanyFactory();

    private Map<Integer, Company> companies;

    private CompanyFactory() {
        this.companies = new HashMap<>();
    }

    public static CompanyFactory getFactory() {
        return factory;
    }

    public Company getCompany(int id) {   
        return this.companies.get( id );
    }
    
    public boolean addCompany( Company company ){
        Company companyResult = getCompany( company.getId() );
        
        if (companyResult == null) {
            companies.put(company.getId(), company);
            return true;
        }else {
            return false;
        }
    }
    
    public void removeCompany(int id) {
        this.companies.remove(id);
    }


}
