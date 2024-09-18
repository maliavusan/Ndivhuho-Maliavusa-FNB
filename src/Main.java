import maximum.MaxDifferenceCalculator;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        MaxDifferenceCalculator objMaxDifferenceCalculator = new MaxDifferenceCalculator();

        // Input file for Test Set
        File testSetFile = new File("src/data/TestSet.txt");
        objMaxDifferenceCalculator.inputHandler(testSetFile);
    }
}