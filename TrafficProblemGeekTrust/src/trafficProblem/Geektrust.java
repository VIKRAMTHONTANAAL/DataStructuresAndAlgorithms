package trafficProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Geektrust {


	public static int minTimeToTravel=0;
	public static String vehicleUsedToTravelInMinTime="";
	public static int orbitNumber=0;



	public static void main (String []args) throws FileNotFoundException{


		String input="";
		String[] InputData =new String[3];

		String Weather="";
		int ORBIT_1_TRAFFIC_SPEED=0;
		int ORBIT_2_TRAFFIC_SPEED=0;	

		File file=new File(args[0]);

		//Scanning the text file using scanner
		Scanner scan=new Scanner(file);
		while(scan.hasNext()){
			input=scan.nextLine();
		}
		scan.close();
		input=input.trim();

		//Split the Input string using String Tokenizer
		StringTokenizer token=new StringTokenizer(input," ");
		for(int i=0;token.hasMoreTokens()&&i<3;i++){

			InputData[i]=token.nextToken().trim();

		}

		Weather=InputData[0];

		ORBIT_1_TRAFFIC_SPEED=Integer.parseInt(InputData[1]);
		ORBIT_2_TRAFFIC_SPEED=Integer.parseInt(InputData[2]);

		//To Find the Fastest Path 
		findFastestRouteWithPossibleVehicle(Weather,ORBIT_1_TRAFFIC_SPEED,ORBIT_2_TRAFFIC_SPEED);










	}

	private static void findFastestRouteWithPossibleVehicle(String weather, int ORBIT_1_TRAFFIC_SPEED,int ORBIT_2_TRAFFIC_SPEED) {
		boolean isBikeAvailable=false;
		boolean isTukTukAvailable=false;
		boolean isCarAvailable=false;
		int Orbit1Distance=18000000;
		int Orbit2Distance=20000000;
		int Craters1=20;
		int Craters2=10;
		int timeToTravelOrbit1InCar=Integer.MAX_VALUE;
		int timeToTravelOrbit2InCar=Integer.MAX_VALUE;

		int timeToTravelOrbit1InBike=Integer.MAX_VALUE;
		int timeToTravelOrbit2InBike=Integer.MAX_VALUE;

		int timeToTravelOrbit1InTuktuk=Integer.MAX_VALUE;
		int timeToTravelOrbit2InTuktuk=Integer.MAX_VALUE;



		int bikeSpeedPerMin=10000000/60;
		int tuktukSpeedPerMin=12000000/60;
		int carSpeedPerMin=20000000/60;

		int bikeToCrossOneCraterInMins=2;
		int tuktukToCrossOneCraterInMins=1;
		int carToCrossOneCraterInMins=3;


		int ORBIT_1_TRAFFIC_SPEED_PerMin=(ORBIT_1_TRAFFIC_SPEED*1000000)/60;
		int ORBIT_2_TRAFFIC_SPEED_PerMin=(ORBIT_2_TRAFFIC_SPEED*1000000)/60;





		//Due to Changes in Weather there are some changes in the parameter
		if(weather.equalsIgnoreCase("Sunny")){
			isBikeAvailable=true;
			isTukTukAvailable=true;
			isCarAvailable=true;
			Craters1=(int) (0.90*Craters1);
			Craters2=(int)(0.90*Craters2);


		}
		else if(weather.equalsIgnoreCase("Rainy")){
			isTukTukAvailable=true;
			isCarAvailable=true;
			Craters1=(int) (1.20*Craters1);
			Craters2=(int)(1.20*Craters2);

		}
		else if(weather.equalsIgnoreCase("Windy")){
			isCarAvailable=true;
			isBikeAvailable=true;
		}


		//We will calculate the time to travel using the available vehicles.
		if(isCarAvailable){
			//ORBIT 1
			int travelSpeed=Integer.min(carSpeedPerMin, ORBIT_1_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit1InCar=(Orbit1Distance/travelSpeed)+(Craters1*carToCrossOneCraterInMins);
			//As Car is available in all seasons we are initializing the global parameters which are required to find the minimum time
			minTimeToTravel=timeToTravelOrbit1InCar;
			vehicleUsedToTravelInMinTime="CAR";
			orbitNumber=1;

			//ORBIT 2
			travelSpeed=Integer.min(carSpeedPerMin, ORBIT_2_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit2InCar=(Orbit2Distance/travelSpeed)+(Craters2*carToCrossOneCraterInMins);	
			findAndSetMinimum(timeToTravelOrbit2InCar, 2, "CAR");


		}

		if(isTukTukAvailable){
			//ORBIT 1
			int travelSpeed=Integer.min(tuktukSpeedPerMin, ORBIT_1_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit1InTuktuk=(Orbit1Distance/travelSpeed)+(Craters1*tuktukToCrossOneCraterInMins);
			findAndSetMinimum(timeToTravelOrbit1InTuktuk, 1, "TUKTUK");
			
			//ORBIT 2
			travelSpeed=Integer.min(tuktukSpeedPerMin, ORBIT_2_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit2InTuktuk=(Orbit2Distance/travelSpeed)+(Craters2*tuktukToCrossOneCraterInMins);	
			findAndSetMinimum(timeToTravelOrbit2InTuktuk, 2, "TUKTUK");

		}
		if(isBikeAvailable){
			//ORBIT 1
			int travelSpeed=Integer.min(bikeSpeedPerMin, ORBIT_1_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit1InBike=(Orbit1Distance/travelSpeed)+(Craters1*bikeToCrossOneCraterInMins);
			findAndSetMinimum(timeToTravelOrbit1InBike, 1, "BIKE");
			
			//ORBIT 2
			travelSpeed=Integer.min(bikeSpeedPerMin, ORBIT_2_TRAFFIC_SPEED_PerMin);
			timeToTravelOrbit2InBike=(Orbit2Distance/travelSpeed)+(Craters2*bikeToCrossOneCraterInMins);	
			findAndSetMinimum(timeToTravelOrbit2InBike, 2, "BIKE");

		}		


		System.out.println(vehicleUsedToTravelInMinTime+" ORBIT"+orbitNumber);


	}

	public static void findAndSetMinimum(int minTime,int OrbitNumber,String Vehicle){

		if(minTime<=minTimeToTravel){
			minTimeToTravel=minTime;
			vehicleUsedToTravelInMinTime=Vehicle;
			orbitNumber=OrbitNumber;

		}



	}










}
