package countryProblem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Country {

	private Map<String, Long> populationDetails = new TreeMap<String, Long>();
	
	

	public Map<String, Long> getPopulationDetails() {
		return populationDetails;
	}

	public void setPopulationDetails(Map<String, Long> populationDetails) {
		this.populationDetails = populationDetails;
	}

	public void addStateDetails(String stateName, long population) {
		System.out.println("ADDING DETAILS "+stateName+" "+population);
		// fill the code here
		populationDetails.put(stateName, population);



	}

	public int countStateMaxPopulation() {
		int count = 0;

		long max=0;
		long temp=0;
		
		
		for(Map.Entry<String, Long> e:populationDetails.entrySet()  ){
		temp=e.getValue();
		if(max==0){
			max=temp;
		}
			if(temp>=max){
				count ++;
			}
		}
		


//max=populationDetails.values();



		// fill the code here


		return count;
	}

	public List<String> viewStatesPopulationRange(long startRange, long endRange) {

		// fill the code here
		List <String>String= new ArrayList<String>();
		
		for(Map.Entry<String,Long> e:populationDetails.entrySet()){
			if(e.getValue()<=endRange&&startRange<=e.getValue()){
				//System.out.println(e.getKey());
				String.add(e.getKey());
				
			}
			
		}
		
		
		

return String;
	
	}

	public Map<String, Long> viewStateAboveRange(long population) {

		Map<String, Long> popRange = new TreeMap<String, Long>();

		// fill the code here
		
		for(Map.Entry<String, Long>e:populationDetails.entrySet()){
			if(e.getValue()>population){
			popRange.put(e.getKey(),e.getValue());
				
			}
			
		}



		return popRange;
	}

}

