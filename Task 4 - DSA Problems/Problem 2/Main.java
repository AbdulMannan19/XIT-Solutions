import java.io.*;

class Main{
    public static void main(String[] args) {
        try {
            FileInputStream source_file = new FileInputStream("source.txt");
            FileOutputStream output_file = new FileOutputStream("destination.txt");
            int b;
            while ((b = source_file.read()) != -1) {
                output_file.write(b);
            
        }
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
            
        } finally {
            System.out.println("File copied successfully");
        }
    }

}
