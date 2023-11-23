import java.io.*;

class FileReaderThread extends Thread {
    private BufferedReader reader;
    private BufferedWriter writer;

    FileReaderThread(BufferedReader reader, BufferedWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void run() {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                // Write the content to another file using BufferedWriter
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources after writing
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class FileReadWriteWithThreads {
    public static void main(String[] args) {
        String inputFile = "E:\\javaaaa (adi)\\QTDY\\input"; // Replace with your input file
        String outputFile = "output.txt"; // Replace with your output file

        try {
            // FileReader and FileWriter for input and output files
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);

            // BufferedReader and BufferedWriter for reading and writing
            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Create threads for reading and writing
            Thread readerThread = new FileReaderThread(reader, writer);
            Thread writerThread = new FileReaderThread(reader, writer);

            // Start the threads
            readerThread.start();
            writerThread.start();

            // Wait for both threads to complete
            readerThread.join();
            writerThread.join();

            System.out.println("File reading and writing completed successfully.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
