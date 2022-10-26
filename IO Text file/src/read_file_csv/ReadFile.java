package read_file_csv;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("IO Text file/src/read_file_csv/source.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<Country> countries = new ArrayList<>();
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            countries.add(new Country(split[0],split[1],split[2]));
        }
        br.close();

        for (Country country : countries) {
            System.out.println(country.getName());
        }

        File target = new File("IO Text file/src/read_file_csv/target.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(target));
        for (Country country : countries) {
            bw.write(country.getName());
            bw.newLine();
        }
        bw.close();
    }
}
