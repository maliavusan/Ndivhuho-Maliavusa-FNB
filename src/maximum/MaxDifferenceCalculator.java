package maximum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxDifferenceCalculator {

    /**
     * Determines the maximum difference between any two elements such that the larger element appears after the smaller element
     * @param arrIntegers Test data
     * @return maximum difference output
     */
    private static String getMaxDifference(int[] arrIntegers) {
        List<Integer> arrDifference = new ArrayList<>();

        for(int i = 0; i< arrIntegers.length; i++) {
            for(int c = i; c >= 0; c--) {
                if(arrIntegers[i] > arrIntegers[c]) {
                    int intDifference = arrIntegers[i] - arrIntegers[c];
                    arrDifference.add(intDifference);
                }
            }
        }

        Collections.sort(arrDifference);

        return arrDifference.get(arrDifference.size()-1) + " is the maximum difference.";
    }

    /**
     * Reads the input file and passes the integer array to getMaxDifference
     * @param file input file
     */
    public void inputHandler(File file) {
        try {
            try (Scanner myScanner = new Scanner(file)) {
                
                while(myScanner.hasNextLine()) {
                    
                    String strInput = myScanner.nextLine();
                    
                    System.out.println("**************************************");
                    System.out.println("Given array : [ " + strInput + " ]");
                    
                    String[] strArray = strInput.split(",\\s*");
                    
                    int[] intArray = new int[strArray.length];
                    
                    for(int i = 0; i < strArray.length; i++) {
                        intArray[i] = Integer.parseInt(strArray[i]);
                    }
                    
                    System.out.println(getMaxDifference(intArray));
                    System.out.println("**************************************");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.print("An error has occurred.\n" + e);
        }
    }
}
