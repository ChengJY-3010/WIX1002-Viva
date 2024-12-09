package viva2;
import java.util.Arrays;
import java.util.Scanner;

public class Viva2_Q2_MergeIntoArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //Receives two lines of string
        System.out.print("Array 1: ");
        String str1 = input.next();
        System.out.print("Array 2: ");
        String str2 = input.next();
        
        //Interprets string as integer arrays
        int [] arr1 = parseArray(str1);
        int [] arr2 = parseArray(str2);
        
        //Combines arrays, sort in asc and remove repeated values
        int [] result = mergeArray(arr1,arr2);
        
        //Print result
        System.out.println(Arrays.toString(result));
        
    }
    
    public static int[] parseArray(String str){
        String [] tmp = str.split(",");
        int [] arr = new int[tmp.length];
        for(int i=0;i<tmp.length;i++){
            arr[i] = Integer.parseInt(tmp[i]);    //Integer.parseInt-Converts the String (tmp[i]) into an integer
        }
        return arr;
    }
    
    public static int[] mergeArray(int[]array1,int[]array2){
        //Combine arrays
        int [] mergeArr = new int[array1.length+array2.length];
        for(int i=0;i<array1.length;i++){
            mergeArr[i] = array1[i];
        }
        
        int j = 0;
        for(int i=array1.length;i<mergeArr.length;i++){
            mergeArr[i] = array2[j];
            j++;
        }
        
        //Sort merged array
        for(int pass=1;pass<mergeArr.length;pass++){
            for(int i=0;i<mergeArr.length-1;i++){
                if(mergeArr[i]>mergeArr[i+1]){
                    int hold = mergeArr[i];
                    mergeArr[i] = mergeArr[i+1];
                    mergeArr[i+1] = hold;
                }   
            }
        }
        
        //Remove repeated values by counting unique elements
        int uniqueCount = 0;
        for(int i=0;i<mergeArr.length;i++){
            if(i==0 || mergeArr[i] != mergeArr[i-1]){
                uniqueCount++;
            }
        }
        
        //Create a new array to store only unique values
        int [] uniqueArr = new int[uniqueCount];
        int indexUniqueArr = 0;
        for(int i=0;i<mergeArr.length;i++){
            if(i==0 || mergeArr[i] != mergeArr[i-1]){
                uniqueArr[indexUniqueArr++] = mergeArr[i];
            }
        }
        
        
        return uniqueArr;
    }
    
}
