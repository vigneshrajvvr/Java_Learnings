package SOLID_Principles_Design_Patterns.singleResponsibilityPrinciple;

public class UserPersistenceService {

	private Store store = new Store();
	
	public void saveUser(User user) {
		store.store(user);
	}
	
}
