
package entity;

import bo.WorkerBO;
import constance.IMessage;
import constance.IRegex;
import java.util.List;
import utils.validate;

public class Worker {
    private String code;
    private String name;
    private int age;
    private int salary;

    public Worker() {
    }

    public Worker(String code, String name, int age, int salary) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void input(WorkerBO wbo) {
        this.code = validate.getString(
                "Enter worker code: ",
                IMessage.ENTER_AGAIN,
                IRegex.VALID_CODE);
        if (wbo.searchWorkerByCode(this.code) != null) {
            System.err.println(IMessage.VALUE_EXIST);
            return;
        }
        this.name = validate.getString(
                "Enter worker name: ",
                IMessage.ENTER_AGAIN, 
                IRegex.REGULAR_STRING);
        this.age = utils.validate.getInt(
                "Enter worker age: ", 
                IMessage.ENTER_AGAIN, 
                IMessage.ENTER_AGAIN,
                18, 
                50);
        this.salary =  validate.getInt(
                "Enter worker salary: ", 
                IMessage.ENTER_AGAIN, 
                IMessage.ENTER_AGAIN,
                0,
                Integer.MAX_VALUE);
    }
    public void display(){
        System.out.printf("%-10s%-20s%-10d%-15d",
                this.code,
                this.name,
                this.age,
                this.salary);
    }
}
