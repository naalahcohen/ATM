import java.util.HashMap;
public class atmclass {
	HashMap <Integer, Double> hashie = new HashMap <Integer,Double> ();
	public atmclass (){
		hashie = new HashMap (); 
	}
	public void openAccount (int accountNumber) {
		hashie.put(accountNumber, 0.0);
	}
	public void openAccount (int accountNumber, double amt) {
		hashie.put(accountNumber, amt);
	}
	public void closeAccount (int accountNumber) {
		if(hashie.get(accountNumber) == 0) {
			hashie.remove(accountNumber);
		}
	}
	public double checkBalance (int accountNumber) {
		if (hashie.containsKey(accountNumber)){
			return hashie.get(accountNumber);
		}
		return 0.0;
	}
	public boolean depositMoney (int accountNumber, double amtdeposit) {
		if(hashie.containsKey(accountNumber)) {
			double current = hashie.get(accountNumber);
			hashie.put(accountNumber, amtdeposit+current);
			return true; 
		}
		return false;
	}
	public boolean withdrawMoney (int accountNumber, double amtdeposit) {
		if(hashie.get(accountNumber) < amtdeposit) {
			return false; 
		}
		if(hashie.containsKey(accountNumber)) {
			double current = hashie.get(accountNumber);
			hashie.put(accountNumber, current-amtdeposit);
			return true; 
		}
		return false;
	}


}
