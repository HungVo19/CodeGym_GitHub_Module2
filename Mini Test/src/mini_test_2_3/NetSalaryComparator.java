package mini_test_2_3;

import java.util.Comparator;

public class NetSalaryComparator implements Comparator<FullTimeEmployee> {
    @Override
    public int compare(FullTimeEmployee o1, FullTimeEmployee o2) {
        if (o1.netSalary() > o2.netSalary()){
            return 1;
        } else if (o1.netSalary() == o2.netSalary()) {
            return 0;
        } else {
            return -1;
        }
    }
}
