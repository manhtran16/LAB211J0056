package model;

import constance.IMessage;
import constance.IRegex;
import java.time.LocalDate;
import java.util.List;
import utils.validate;

public class Task {

    private int id;
    private int taskTypeId;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String assign;
    private String reviewer;
    private int count;

    public Task() {
    }

    public Task(int id, int taskTypeId, String requirementName, String date, double planFrom, double planTo, String assign, String reviewer) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assign = assign;
        this.reviewer = reviewer;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void input() {
        this.id = ++count;
        this.taskTypeId = utils.validate.getInt(
                "Enter task type id: ",
                IMessage.ENTER_AGAIN,
                IMessage.ENTER_AGAIN,
                1,
                4
        );
        this.requirementName = utils.validate.getString(
                "Enter requirement name: ",
                IMessage.ENTER_AGAIN,
                IRegex.REGULAR_STRING);
        this.date = utils.validate.getDate(
                "enter date: ", 
                "Enter again!!",
                "Enter again!", 
                "dd/MM/yyyy",
                LocalDate.MIN, LocalDate.MAX);
                
        do {
            this.planFrom = validate.getDouble(
                    "Enter plan from: ",
                    IMessage.ENTER_AGAIN,
                    IMessage.ENTER_AGAIN,
                    8,
                    17.5
            );
            this.planTo = validate.getDouble(
                    "Enter plan to: ",
                    IMessage.ENTER_AGAIN,
                    IMessage.ENTER_AGAIN,
                    this.planFrom,
                    this.planFrom + 8
            );
            if (this.planTo > 17.5) {
                System.out.println("Please enter again.");
            }
        } while (this.planTo > 17.5);
        this.assign = utils.validate.getString(
                "Enter assign",
                IMessage.ENTER_AGAIN,
                IRegex.REGULAR_STRING);
        this.reviewer = utils.validate.getString(
                "Enter reviewer",
                IMessage.ENTER_AGAIN,
                IRegex.REGULAR_STRING);
    }

    public void display() {
        System.out.printf("%-5d%-15s%-15s%-15s%-8.1f%-10s%-10s\n",
                this.id,
                this.requirementName,
                this.taskTypeId,
                this.date,
                this.planTo - this.planFrom,
                this.assign,
                this.reviewer
        );
    }
}
