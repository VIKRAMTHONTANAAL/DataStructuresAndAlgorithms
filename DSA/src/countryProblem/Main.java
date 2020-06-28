package countryProblem;
 import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
     
    
     public class Main {
    
     	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int option = 0;
    		Country c = new Country();
    
    		do {
    			System.out.println(
    					"1. Add state\n2. Get state with max population\n3. View state in population range\n4. View state above a range\n5. Exit");
    			System.out.println("Enter choice");
    			option = sc.nextInt();
    
    			switch (option) {
    			case 1: {
    
    				System.out.println("Enter name of State and population");
    			
    				String stateName=sc.next();
    				Long population=sc.nextLong();
    				// fill the code here
    				c.addStateDetails(stateName,population);
    				
    				
    				
    				break;
    			}
    
    			case 2: {
    				
    				System.out.print(c.countStateMaxPopulation());
    
    				if(c.countStateMaxPopulation()>1){
    					System.out.println(" States are with maximum population");
    				}
    				else{
    					System.out.println(" State is with maximum population");
    				}
    				
    				// fill the code here
    				
   				break;
    			}
    
    			case 3: {
    
    				System.out.println("Enter start and end range");
    				List <String>String= new ArrayList<String>();
    				// fill the code here
    				
    				long startRange=sc.nextLong();
    				
    				long endRange=sc.nextLong();
    				
    			String=	c.viewStatesPopulationRange(startRange,endRange);
    			
    			
    			for(int i=0;i<String.size();i++){
    				System.out.println(String.get(i));
    				
    			}
    				
    			
    				break;
    			}
    
    			case 4: {
    				System.out.println("Enter the population");
    				// fill the code here
    			//	List <String>String= new ArrayList<String>();
    				long population=sc.nextLong();
    				Map<String, Long> popRange=	c.viewStateAboveRange(population);
    			for(Map.Entry<String, Long> e: popRange.entrySet()){
    				System.out.println(e.getKey()+" "+e.getValue());
    				
    				
    			}
    				
    				
    				break;
    			}
    
    			case 5: {
    				System.out.println("Thank you");
    				break;
    			}
    
    			}
    
    		} while (option != 5);
    sc.close();
    	}
   }
   