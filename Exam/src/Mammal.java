
public class Mammal {

	public int energyLevel=100;

	
	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}



	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}

