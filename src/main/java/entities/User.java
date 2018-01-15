package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String dni;
	private List <Mobile> mobiles;
	private List <Language> languages;
	
	public User( String dni ) {
		this.dni = dni;
		this.mobiles = new ArrayList<>();
		this.languages = new ArrayList<>();
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public List<Mobile> getMobiles() {
		return this.mobiles;
	}
	
	@Override
	public String toString() {
		return "User [dni=" + dni + ", mobiles=" + mobiles + ", languages=" + languages + "]";
	}

}
