package main;

import bo.TaskBO;
import mock.Data;
import model.Task;
import utils.validate;

public class Main {
        public static void main(String[] args) {
        TaskBO taskbo = new TaskBO(Data.listdata());
        
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Delete Task");
            System.out.println("3. Show Task");
            System.out.println("4. Exit");
            int choice = utils.validate.getInt("Enter your choice: "
                    ,"Eror!! Enter again!!" ,
                    "Enter again!!" ,1, 6);
            switch (choice) {
                case 1:
                    taskbo.add();
                    break;
                case 2:
                    Task Task = new Task();
                    int deleteid = validate.getInt("Enter id want to delete: "
                    ,"Eror!! Enter again!!" ,
                    "Enter again!!" ,1, taskbo.getList().size());
                    
                    Task task = taskbo.getTaskByCode(deleteid);
                    
                    taskbo.delete(task);
                    
                    break;
                case 3:
                    taskbo.display();
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
            }

        }

    }
}
