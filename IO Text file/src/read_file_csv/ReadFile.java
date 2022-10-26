package read_file_csv;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("IO Text file/src/read_file_csv/source.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));

//        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            System.out.println(split[2]);
            str.add(split[2]);
//            countries.add(new Country(split[0],split[1],split[2]));
//            str.add(split[2]);
        }
        br.close();

//        for (Country country : countries) {
//            System.out.println(country.getName());
//        }

//        File target = new File("IO Text file/src/read_file_csv/target.txt");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(target));
//        for (Country country : countries) {
//            bw.write(country.getName());
//            bw.newLine();
//        }
//        bw.close();

        File target1 = new File("IO Text file/src/read_file_csv/target1.csv");
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(target1));
        for (String s : str){
            bw1.write(s);
            bw1.newLine();
        }
        bw1.close();
    }
}
