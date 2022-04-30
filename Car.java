public class Car extends Vehicle {

    // instance variables
    private int numDoor;
    private int numPassenger;
    public Car(String aMake, String aModel, String aPlate, int aDoor, int numPass){
        super(aMake, aModel, aPlate);
        this.numDoor = aDoor;
        this.numPassenger = numPass;
        
    }

    public int getDoor(){
        return this.numDoor;
    }

    public int getPassenger(){
        return this.numPassenger;
    }

    public String toString(){
        return ("" + this.numDoor + "-door " + this.getMake() + " " + this.getModel() + " with license " + this.getPlate());
    }

    public boolean equals(Object other) {
		if (!(other instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) other;
		return (this.numDoor==otherCar.getDoor() && this.numPassenger==otherCar.getPassenger());
	}

    public Car copy(){
        int newNumDoor = this.numDoor;
        int newNumPassenger = this.numPassenger;
        String newMake = this.getMake();
        String newModel = this.getModel();
        String newPlate = this.getPlate();
        Car newCar = new Car(newMake, newModel, newPlate, newNumDoor, newNumPassenger);
        return newCar;
    }


    public static void main(String[] args){
        String make1 = "Ford";
        String model1 = "newModel";
        String plate1 = "Plate Num: 123";
        int door1 = 4;
        int pass1 = 5;
        Car mainCar = new Car(make1, model1, plate1, door1, pass1);
        String ans = mainCar.getMake();
        System.out.println(ans);
    }
}