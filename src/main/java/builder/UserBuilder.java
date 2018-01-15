package builder;

import java.util.ArrayList;
import java.util.List;

import entities.Language;
import entities.Mobile;
import entities.User;

public class UserBuilder {
	
	private User user;
	private List <Mobile> mobiles;
	private List <Language> languages;
	
	public UserBuilder( String dni ) {
		this.user = new User( dni );
		this.mobiles = new ArrayList<>();
		this.languages = new ArrayList<>();
	}
	
	public UserBuilder mobile( Mobile mobile ) {
		this.mobiles.add( mobile );
		return this;
	}
	
	public UserBuilder language( Language language ) {
		this.languages.add( language );
		return this;
	}
	
	public User build() {
		this.user.setMobiles( this.mobiles );
		this.user.setLanguages( this.languages );

		return this.user;
	}

}
