package management_PPlication;

import data.Cabinet;
import data.Student;
import ui.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Cabinet cabinet = new Cabinet(list);
        List<String> optionList = new ArrayList<>();
        Menu menu = new Menu(optionList, "Welcome to Management Application");
        menu.addNewOption("1. Add a new Student");
        menu.addNewOption("2. Show information of Student");
        menu.addNewOption("3. Search A Student by Id");
        int choice;
        do{
            menu.printAllOption();
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    cabinet.addNewStudent();
                    break;
                case 2:
                    cabinet.showInfo();
                    break;
                case 3:
                    System.out.println("Please, enter the Student's Id to search");
                    String id = sc.nextLine();
                    Optional optional = Optional.ofNullable(cabinet.searchById(id));
                    if(optional.isPresent()){
                        System.out.println(optional.get());
                    }
                    else{
                        System.out.println("The id is wrong or does not exist");
                    }
                    break;
            }

        }while (choice != 0);
    }
}