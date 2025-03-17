/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.Comparator;
import java.util.List;
import model.Task;

/**
 *
 * @author manht
 */
public class TaskBO {
    private List<Task> list;

    public TaskBO() {
    }

    public TaskBO(List<Task> list) {
        this.list = list;
    }

    public List<Task> getList() {
        return list;
    }

    public void setList(List<Task> list) {
        this.list = list;
    }
    
    public boolean add(){
        Task task = new Task();
        task.input();
        return list.add(task);
    }
    
    public void delete( Task task) {
            list.remove(task);
    }
    
    public Task getTaskByCode( int code) {
        for (Task task : list) {
            if (task.getId() == code) {
                return task;
            }
        }
        return null;
    }
    
    public void display(){
        list.sort(Comparator.comparingInt(Task::getId));
        for (Task task : list) {
            task.display();
        }
    }
}
