package ram.io.di;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        payroll.setWorker(new SoftwareEngineer());
        payroll.setWorker(new ProgramManager());
        payroll.setWorker(new Director());

        payroll.manage();

        Map<String,String> map = new HashMap<>();
    }
}
