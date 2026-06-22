import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        try {
          
            BufferedReader br = new BufferedReader(
                    new FileReader("student.txt"));

            
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("reportcard.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                bw.write("Student Name : " + name);
                bw.newLine();
                bw.write("Average Marks : " + average);
                bw.newLine();
                bw.write("-------------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report Card Generated Successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        }
    }
}