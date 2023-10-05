
/**
 * This lab has 3 separate problems in 3 separate methods
 * LEAVE THE main METHOD AND testProblem1, testProblem2, testProblem3 ALONE 
 * The main method calls 3 methods - testProblem1, testProblem2, and testProblem3
 * testProblem1, testProblem2, and testProblem3 call methods problem1, problem2, and problem3
 * 
 * FINISH problem1, problem2, and problem3
 * FOLLOW THE INSTRUCTIONS IN THE METHOD COMMENTS TO IMPLEMENT THE METHODS
 * feel free to debug or to use prints to look at variable values while you work
 */
public class R4 {
    public static void main( String[] args ) {
        //DO NOT ALTER THIS METHOD
        //comment out the test method for the methods you currently are not working on
        testProblem1();
        testProblem2();
        testProblem3();
    }

    //WRITE THIS METHOD
    /*
     * method:      problem1 
     * you'll need: the a.replace( "x", "y" ) method replaces all occurrences of "x" in the String a with "y"
     *              e.g. "moo cow".replace( "o", "a" ) results in a = "maa caw"
     *              
     * problem:     Fred is writing a note to Mia, but when he finds out that her name is actually Mai, 
     *              he has the bright idea of switching all i’s and a’s in his letter. Help him out by 
     *              arranging the lines of code to make that change. Not all lines are useful.
     *              
     * @param       String message
     * @returns     String - the corrected message
     */
    public static String problem1( String message ) {      
        /*message = message.replace( "a", "i" );
        message = message.replace( "i", "a" );
        message = message.replace( "i", "_" );
        message = message.replace( "i", "a" );
        message = message.replace( "a", "_" );*/
    	
    	//String message = "Dear Mia, my diary says we play social trivia soon. I'll bring the giant Fiat.";
        //String correct_message = "Deir Mai, my dairy siys we pliy socail travai soon. I'll brang the gaint Fait.";
    	
    	message = message.replace("i", "_");
    	message = message.replace("a", "i");
    	message = message.replace("_","a");
    	//message = message.replace(0, 0);
        return message;
    }
    
    //WRITE THIS METHOD
    /*
     * method:      problem2 
     * 
     * problem:     Rearrange the following lines to produce a program fragment that computes 
     *              the number of dollars and cents in a piggybank.
     *              
     * @param       int quarters, int dimes, int nickels, int pennies - moneys
     * @returns     String - in the form of $x yc where x is dollars and y is cents
     */
    public static String problem2( int quarters, int dimes, int nickels, int pennies ) {
    	
        int dollars = 0;
        int cents = 0;
        
        cents = pennies;
        cents = cents + nickels * 5;
        cents = cents + dimes * 10; 
        cents = cents + quarters * 25;
        dollars = cents / 100;
        cents = cents % 100;
        
        return "$" + dollars + " " + cents + "c";
    }
    
    //WRITE THIS METHOD
    /*
     * method:      problem3 
     * you'll need: You can get the last digit of a positive integer n as n % 10
     * 
     * problem:     write an expression for secondToLast that gives you the second to last digit from the input variable var
     *              e.g. when var is 123, the method should return 2
     *                   when var is 2987, the method should return 8
     *                   when var is 7, the method should return 0 
     *              
     * @param       int var - the positive integer to get the second to last digit of
     * @returns     int - the second to last digit
     */
    public static int problem3( int var ) {
        int secondToLast = (var % 100) / 10; //replace 0 with the appropriate expression
        return secondToLast;
    }
    
    
    
    public static void testProblem1() {
        //DO NOT ALTER THIS METHOD
        String message = "Dear Mia, my diary says we play social trivia soon. I'll bring the giant Fiat.";
        String correct_message = "Deir Mai, my dairy siys we pliy socail travai soon. I'll brang the gaint Fait.";
        assert correct_message.equals( problem1( message ) ) : "problem1 not correct yet, must return \nDeir Mai, my dairy siys we pliy socail travai soon. I'll brang the gaint Fait.\n but returns\n" + problem1( message );
        message = "Ciao Mia, I have amnesia. Do you have my diamond tiara?";
        correct_message = "Caio Mai, I hive imnesai. Do you hive my daimond tairi?";
        assert correct_message.equals( problem1( message ) ) : "problem1 not correct yet, must return \nCaio Mai, I hive imnesai. Do you hive my daimond tairi? \nbut returns\n" + problem1( message );
        
        System.out.println( "problem1 pass" );
    }
    
    public static void testProblem2() {
        //DO NOT ALTER THIS METHOD
        problem2( 33, 5, 23, 4 );
        assert problem2( 33, 5, 23, 4 ).equals( "$9 94c" ) : "problem2 not correct yet, must return $9 94c but returns " + problem2( 33, 5, 23, 4 );
        problem2( 5, 11, 19, 93 );
        assert problem2( 5, 11, 19, 93 ).equals( "$4 23c" ) : "problem2 not correct yet, must return $4 23c but returns " + problem2( 5, 11, 19, 93 );
        
        System.out.println( "problem2 pass" );
    }
        
    public static void testProblem3() {  
        //DO NOT ALTER THIS METHOD
        problem3( 1729 );
        assert problem3( 1729 ) == 2 : "problem3 not correct yet, must return 2 but returns " + problem3( 1729 );
        problem3( 957 );
        assert problem3( 957 ) == 5 : "problem3 not correct yet, must return 5 but returns " + problem3( 957 );
        problem3( 8 );
        assert problem3( 8 ) == 0 : "problem3 not correct yet, must return 0 but returns " + problem3( 8 );
        
        System.out.println( "problem3 pass" );
    }
}
