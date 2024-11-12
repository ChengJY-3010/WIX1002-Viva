package q5_digitgrouping;
import java.util.Scanner;

public class Q5_DigitGrouping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input
        int numGroup=0,longestGrpLength=0,sumGrpLength=0;
        String n;

        //Input number as a String
        do{
            System.out.print("Enter a positive integer: ");
            n = input.next();
        }while(!n.matches("\\d+") || n.charAt(0) == '0');  //!n.matches("\\d+") ensures that the input string is numeric.
                                                            //n.charAt(0) == '0' ensures that the input doesn't start with a '0'.
        char longestDigit = n.charAt(0);  //Set the first digit as longest digit
        
        //Variables to track the current group
        char currentDigit = n.charAt(0);
        int currentGrpLength = 1;
        
        for(int i=1;i<n.length();i++){
            //If same digit, increase the current group length
            if(n.charAt(i)==currentDigit){
                currentGrpLength++;
                
            //If different digit, finalise the current group
            }else{
                numGroup++;
                sumGrpLength+=currentGrpLength;
                
                //Check if this is the longest group
                if(currentGrpLength>longestGrpLength){
                    longestGrpLength = currentGrpLength;
                    longestDigit = currentDigit;
                }

                //Reset for this new group encountered  
                currentDigit = n.charAt(i);
                currentGrpLength = 1;
            }
        }
        
        //Finalise the last group
        numGroup++;
        sumGrpLength+=currentGrpLength;
        
        if(currentGrpLength>longestGrpLength){
            longestGrpLength = currentGrpLength;
            longestDigit = currentDigit;
        }
        
        //Output the results
        System.out.println(numGroup);  //Total number of digits group
        System.out.println(longestDigit + " " + longestGrpLength);  //Longest group and its length
        System.out.println(sumGrpLength); //The sum of the lengths of all digit groups
        
    }
    
}
