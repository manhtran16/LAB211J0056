/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock;

import java.util.ArrayList;
import java.util.List;
import model.Task;

/**
 *
 * @author manht
 */
public class Data {
    public static List<Task> listdata(){
        List listdata = new ArrayList<Task>();
        listdata.add(new Task(1, 1, "Dev program", "28/08/2025", 8, 16, "Dev", "Lead"));
        listdata.add(new Task(2, 2, "Dev program", "28/08/2025", 8, 16, "Dev", "Lead"));
        listdata.add(new Task(3, 4, "Dev program", "28/08/2025", 8, 16, "Dev", "Lead"));
            return listdata;
    }
}
