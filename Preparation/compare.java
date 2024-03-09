/*Print the expression that checks if the amount of credits you have earned, 
creditsEarned, is greater than the number of credits you need to graduate, 
creditsToGraduate.*/
 
public class compare {
	public static void main(String[] args) {   
	double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean expression1 = creditsEarned > creditsToGraduate;
    System.out.println(expression1); 

/*Create a variable called creditsAfterSeminar that holds the amount of credits 
earned after taking a seminar, which is worth creditsOfSeminar credits. 
creditsAfterSeminar should be the sum of creditsEarned and creditsOfSeminar.
Print out whether creditsToGraduate is less than creditsAfterSeminar. */
    
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    boolean expression2 = creditsToGraduate < creditsAfterSeminar;
    System.out.println(expression2);
	}
}