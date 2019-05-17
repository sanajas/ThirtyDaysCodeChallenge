package ThirtyDaysChallenge;

public class Car 
{

	int maxSpeed =100;
	int minSpeed = 0;
	
	double weight = 4079;
	
	boolean isTheCarOn = false;
	char Condition ='A';
	
	String nameOfCar = "Cooper";
	
	double maxFuel = 16;
	double currentFuel = 8;//allocating space for double..and declaring variable currentFuel , and assigning value 8 gallons
	double mpg = 26.4;
	int numberOfPeopleInCar =1;
	
	//Constructor overrides the default value of properties for default car.
	
	public Car(int customMaxSpeed , double customWeight, boolean customisTheCarOn)
	{
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customisTheCarOn;
	}
	//Create a function 
	
public void PrintVariables()
{
	System.out.println(maxSpeed);
	System.out.println(minSpeed);
	System.out.println(weight);
	System.out.println(isTheCarOn);
	System.out.println(Condition);
	System.out.println(nameOfCar);
	System.out.println(numberOfPeopleInCar);
	
	
}



public void upgradeMaxspeed()
{
	minSpeed = maxSpeed;
	maxSpeed = maxSpeed+1;

			
}

public void getIn()
{
	//numberOfPeopleInCar++;
	numberOfPeopleInCar = numberOfPeopleInCar +1;
	
}

public void getOut()
{
		//numberOfPeopleInCar--;
		numberOfPeopleInCar = numberOfPeopleInCar - 1;
}

public double howManyMilesTillOutOfGas()
{
	return currentFuel * mpg;
}

public double maxMilesPerFillUp()
{
	return maxFuel * mpg;
}



public static void main(String[] arg) {
	
	//Car familyCar = new Car();
	//familyCar.PrintVariables();
	
	//with Constructor -  birthdayPresent car doesnt want to use default values hence pass into arguments
	Car birthdayPresent = new Car(250, 5000.545 ,true);
	System.out.println("birthdayPresent Car Values v1");
	
	birthdayPresent.PrintVariables();
	//add ppl into car 3 persons
	birthdayPresent.getIn();
	birthdayPresent.getIn();
	birthdayPresent.getIn();
	System.out.println("miles left " + birthdayPresent.howManyMilesTillOutOfGas());
	System.out.println("MaxMilesperfillup " + birthdayPresent.maxMilesPerFillUp());
	
	System.out.println("birthdayPresent Car Values v2");
	birthdayPresent.PrintVariables();
	//remove one person from the car
	birthdayPresent.getOut();
	
	System.out.println("birthdayPresent Car Values v3");
	birthdayPresent.PrintVariables();
	
	//System.out.println("christmanPresent Car Values");
	//Car christmanPresent = new Car(500, 4000 ,false);
	//christmanPresent.PrintVariables();
	
}
}
