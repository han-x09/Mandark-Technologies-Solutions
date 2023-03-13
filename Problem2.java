package Java;
import java.io.*;



public class Problem2 {

  

    public static void main(String[] args) {
        String csvFile = "/Users/darshanpatel/Documents/VScode/Java/employees.csv";
        String line;
        String cvsSplitBy = ",";
        String outputCsvFile1 = "/Users/darshanpatel/Documents/VScode/Java/manager.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsvFile1))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] employee = line.split(cvsSplitBy);

                // check if employee is a manager in R&D division
                if (employee[1].equals("Manager") && employee[2].equals("R&D")) {
                    // write employee details to manager.csv file
                    bw.write(employee[0] + "," + employee[1] + "," + employee[2]);
                    bw.newLine();
                }

            }
            System.out.println("Task 1 Completed Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        String outputCsvFile2 = "/Users/darshanpatel/Documents/VScode/Java/single_name_employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsvFile2))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] employee = line.split(cvsSplitBy);

                // check if employee does not have a last name
                if (employee[0].indexOf(' ') == -1) {
                    // write employee details to single_name_employees.csv file
                    bw.write(employee[0] + "," + employee[1] + "," + employee[2]);
                    bw.newLine();
                }
            }
            System.out.println("Task 2 Completed Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



 