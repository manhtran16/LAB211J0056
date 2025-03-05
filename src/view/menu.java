package view;
public class menu {
    public static int menu() {
        System.out.println("1. Add doctor");
        System.out.println("2. Update salary");
        System.out.println("3. Display list worker");
        System.out.println("4. Display list salary update");
        System.out.println("5. List Data");
        System.out.println("6. Exit");
        int choice = utils.validate.getInt("Enter your choice: "
                ,"Eror!! Enter again!!" ,
                "Enter again!!" ,1, 6);
        return choice;
    }
}
