
public class Gorilla extends Mammal {

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}



	public void throwSomething() {
		setEnergyLevel(getEnergyLevel()-5);
		System.out.println("gorilla has thrown something and decrease energy level by 5");
		
	}
	
	public void eatBananas() {
	setEnergyLevel(getEnergyLevel()+10);
		System.out.println("gorilla is satisfied and increase its energy by 10");
		
		
	}
	
	public void climb() {
		setEnergyLevel(getEnergyLevel()-10);
		System.out.println("gorilla has climbed a tree and drcreased its energy by 10");
		
	}
}
