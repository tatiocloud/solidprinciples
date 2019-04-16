package ram.io.di;

import java.util.ArrayList;
import java.util.List;

public class Payroll {

    Worker worker;

    List<Worker> workers = new ArrayList<>();

    public void setWorker(Worker worker){
        this.worker = worker;
        workers.add(worker);
    }

    public void manage(){
        workers.forEach(Worker::work);
    }

}
