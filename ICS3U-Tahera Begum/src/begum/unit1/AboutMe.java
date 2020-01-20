package begum.unit1;
/**
 * September 18, 2019
 * 
 * Personal information and a phrase that encourages our school.
 * Also my class schedule.
 * @author Tahera Begum
 */
public class AboutMe {
	/** 
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		//personal information
		System.out.println("Tahera.B");
		System.out.println("Ms.Kemp");
		System.out.println("Runnymede C.I.");
		
		//phrase that encourages our school
		System.out.println("\"Go Ravens!!!\"\n");
		
		//my class schedule
		System.out.format("%-15s %-15s %-1s", "Period", "Day 1", "Day 2\n");
		
		//period 1
		System.out.format("%-15s %-15s %-1s", "1", "SPH3U1-01", "SPH3U1-01\n");
		System.out.format("%-15s %-15s %-1s", "08:45", "Enns,M", "Enns,M\n");
		System.out.format("%-15s %-15s %-1s", "10:02", "226", "226\n\n");
		
		//period 2
		System.out.format("%-15s %-15s %-1s", "2", "BDI3C1-01", "BDI3C1-01\n");
		System.out.format("%-15s %-15s %-1s", "10:07", "Pinero,D", "Pinero,D\n");
		System.out.format("%-15s %-15s %-1s", "11:24", "022", "022\n\n");
		
		//lunch
		System.out.format("%-1s", "Lunch\n");
		System.out.format("%-1s", "11:24\n");
		System.out.format("%-1s", "12:26\n\n");
		
		//period 3
		System.out.format("%-15s %-15s %-1s", "3", "ICS3U3-02", "HSP3U1-02\n");
		System.out.format("%-15s %-15s %-1s", "12:26", "Kemp,C", "Alam,N\n");
		System.out.format("%-15s %-15s %-1s", "13:43", "024", "216\n\n");
		
		//period 4
		System.out.format("%-15s %-15s %-1s", "4", "HSP3U1-02", "ICS3U3-02\n");
		System.out.format("%-15s %-15s %-1s", "13:48", "Alam,N", "Kemp,C\n");
		System.out.format("%-15s %-15s %-1s", "15:05", "216", "024\n");




	}

}
