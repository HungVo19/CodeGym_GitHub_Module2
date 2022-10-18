package mini_test_2_2;

import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Material[] material = new Material[10];

        material[0] = new Meat("#6", "bột 1", LocalDate.of(2022, 10, 13),10000, 5);
        material[1] = new Meat("#7", "bột 1", LocalDate.of(2022, 10, 14),10000, 6);
        material[2] = new Meat("#8", "bột 1", LocalDate.of(2022, 10, 15),10000, 11);
        material[3] = new Meat("#9", "bột 1", LocalDate.of(2022, 10, 16),10000, 3);
        material[4] = new Meat("#10", "bột 1", LocalDate.of(2022, 10, 17),10000, 12);
        material[5] = new CrispyFlour("#1", "bột 1", LocalDate.of(2021, 9, 18),10000, 9);
        material[6] = new CrispyFlour("#2", "bột 2", LocalDate.of(2021, 8, 18),10000, 6);
        material[7] = new CrispyFlour("#3", "bột 3", LocalDate.of(2021, 12, 18),10000, 7);
        material[8] = new CrispyFlour("#4", "bột 4", LocalDate.of(2021, 11, 18),10000, 5);
        material[9] = new CrispyFlour("#4", "bột 5", LocalDate.of(2021, 5, 18),10000, 4);

        MaterialManager materialManager = new MaterialManager();

        materialManager.addMaterial(material);
        materialManager.getRealMoney();
    }

}
