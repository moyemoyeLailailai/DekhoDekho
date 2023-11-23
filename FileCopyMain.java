import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopyThread extends Thread {
    private String inputFileName;
    private String outputFileName;

    public FileCopyThread(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             FileWriter writer = new FileWriter(outputFileName)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class FileCopyMain {
    public static void main(String[] args) {
        String inputFileName = "Text1.txt";  // Replace with your input file name
        String outputFileName = "output.txt";  // Replace with your output file name

        // Creating thread for reading and writing
        FileCopyThread fileCopyThread = new FileCopyThread(inputFileName, outputFileName);

        // Starting thread
        fileCopyThread.start();

        try {
            // Waiting for the thread to finish
            fileCopyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Content copied successfully.");
    }
}
