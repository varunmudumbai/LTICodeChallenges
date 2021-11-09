public class ConcreteCreator {

	public static void main(String[] args) {
		
		Creator cycleCreator = new Creator();
		IBicycle cycle= cycleCreator.getCycle();
		//System.out.println(cycle.name);
		cycle.getName();
		cycle.printName();

	}

}
abstract class IBicycle{  
    
	protected String name;
    abstract void getName();
    void printName() {
    	System.out.println("Name is - "+name);
    }
  
}
class ConcreteBicycle extends IBicycle{

	void getName() {
		name="MyCycle";
	}
	
}
class Creator{
	
	public IBicycle getCycle() {
		return new ConcreteBicycle();
	}
	
}