import java.io.*;

public class LargeFileReading {
    static void efficiencyTest(String filePath) {
        long startTime, endTime;
        double netTime;

        // FileReader with BufferedReader
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            startTime = System.nanoTime();

            char[] buffer = new char[8192]; // Read in chunks (efficient for large files)
            while (bufferedReader.read(buffer) != -1) {
                // File is read, but not printed
            }

            endTime = System.nanoTime();
            netTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("FileReader Time: " + netTime + " ms.");


        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.err.println("Error reading the file.");
        }

        // InputStreamReader with BufferedReader
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            startTime = System.nanoTime();

            char[] buffer = new char[8192]; // Read in chunks
            while (bufferedReader.read(buffer) != -1) {
                // File is read, but not printed
            }

            endTime = System.nanoTime();
            netTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("InputStreamReader Time: " + netTime + " ms.");


        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.err.println("Error reading the file.");
        }
    }

    public static void main(String[] args) {
        String filePath1 = "D:\\Week_03\\Day_05\\TextFiles\\large_file_1_MB.txt";
        String filePath2 = "D:\\Week_03\\Day_05\\TextFiles\\large_file_100_MB.txt";
        String filePath3 = "D:\\Week_03\\Day_05\\TextFiles\\large_file_500_MB.txt";

        System.out.println("\n\tReading 1_MB File");
        efficiencyTest(filePath1);

        System.out.println("\n\tReading 100_MB File");
        efficiencyTest(filePath2);

        System.out.println("\n\tReading 500_MB File");
        efficiencyTest(filePath3);
    }
}
