package data;

import util.MyUtil;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Cabinet {
    Scanner sc = new Scanner(System.in);
    List<Student> list;
    public Cabinet(List<Student> list){
        this.list = list;
    }
    public void addNewStudent(){
        String id;
        String name;
        String address;
        int priority;
        String blockExam;
        id = MyUtil.getString("please, enter Student's Id format DXXXXX, X represent for number digits:",
                "InputMissMatch and Try again","^[D]\\d{5}$");
        name = MyUtil.getString("Please, enter name of the Student: ",
                "InputMissMatch and Try again");
        address = MyUtil.getString("Please, enter the address of the Student: ",
                "InputMissMatch and Try again");
        priority = MyUtil.getAnInteger("Please, enter the number of priority from 0 to 3:",
                "InputMissMatch and Try again", 0, 3);
        blockExam = MyUtil.getString("Please, enter Student's blockExam(A or B or C): ",
                "InputMissMatch and Try again","^[ABC]$");
        list.add(new Student(id, name, address, priority, blockExam));
        System.out.println("Add successfully");
    }
    public Student searchById(String id){
        if(this.list.isEmpty()) return null;
        return this.list.stream().filter(e->e.getId().equals(id)).findFirst().orElse(null);
    }
    public void showInfo(){
        if(list.isEmpty()){
            System.out.println("There is nothing to show");
        }
        else {
            list.forEach(System.out::println);
        }

    }
}
