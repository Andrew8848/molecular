package Mountain8848.molecular.model;

public interface Element {
 
	int getNuclearCharge();
	double getAtomicMass();
	String getGroupName();
	
	default public int getNeutroneNumber() {
		int neutroneNumber = (int) Math.round(getAtomicMass()) - getNuclearCharge();
		return neutroneNumber;
	}
	
	
	
	default public String elementToString() {
		return getGroupName() + " "+ this.getClass().getSimpleName() +
				": Nuclear Charge: " + getNuclearCharge() +
				"; Atomic Mass: " + getAtomicMass() +
				"; Number of Neutrons: " + getNeutroneNumber();
	}
}