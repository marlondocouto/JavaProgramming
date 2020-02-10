package assigment;

public class season2 {
	//*******************************************************************

	//SeasonTwo
	//
	//It takes a day and a month and prints the season
	//By: Marlon Do Couto
	//Feb 10,2020
	//*******************************************************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(season(6,16));
		System.out.println(season(10,16));
	}
	public static String season(int m, int d) {
	    //if between Jan or Feb, it doesn't matter the day
		//if less than march 15 or more than december 16:
		if(m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
	        return "Winter";
	    } //if between April and May, it doesn't matter the day
		// if more than March 16 or less than June 15:
		else if((m < 6 && m>3) || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
	        return "Spring";
	    } 
		//if between July or August, day doesn't matter
		//if more than June 16 or less than Sept 15:
		else if((6 < m && m < 9) || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
	        return "Summer";
	    } 
		//all other dates will return fall:
		else {
	        return "Fall";
	    }
	}

}
