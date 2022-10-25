package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyToTxt {
    public List<String> readFile(String filePath) throws IOException {
        File file = new File(filePath);

        List<String> strings = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null) {
            strings.add(line);
        }
        br.close();
        return strings;
    }

    public void writeFile(List<String> strings, String filePath) throws IOException {
        File file = new File(filePath);

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < strings.size(); i++) {
            bw.write(strings.get(i));
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String[] args) {
        CopyToTxt copyToTxt = new CopyToTxt();
        List<String> str = copyToTxt.readFile("IO Text file\src\copy_file_text\source.txt");
    }
}
