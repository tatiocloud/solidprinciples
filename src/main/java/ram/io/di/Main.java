package ram.io.di;

public class Main {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        payroll.setWorker(new SoftwareEngineer());
        payroll.setWorker(new ProgramManager());
        payroll.setWorker(new Director());

        payroll.manage();
    }
}
