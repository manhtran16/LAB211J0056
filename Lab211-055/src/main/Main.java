package main;

import bo.SalaryHistoryBO;
import bo.WorkerBO;
import constance.IMessage;
import constance.IRegex;
import entity.Worker;
import java.util.ArrayList;
import mock.Data;
import utils.validate;
import view.menu;

public class Main {
    public static void main(String[] args) {     
        WorkerBO workerbo = new WorkerBO(new ArrayList<>());
        SalaryHistoryBO salarybo = new SalaryHistoryBO(new ArrayList<>());
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    workerbo.addWorker();
                    break;
                case 2:
                    Worker worker = new Worker();
                    String codeupdate = validate.getString(
                            "Enter worker code you want to update salary: ", 
                            IMessage.ENTER_AGAIN,
                            IRegex.VALID_CODE);
                    
                    worker = workerbo.searchWorkerByCode(codeupdate);
                    
                    salarybo.add(worker, 100);
                    
                    break;
                case 3:
                    workerbo.display();
                    break;
                case 4:
                    salarybo.display();
                    break;
                case 5:
                    workerbo.setList(Data.listdata());
                    break;
                case 6:
                    System.out.println("Exit");
                    return;
            }

        }

    }
}

