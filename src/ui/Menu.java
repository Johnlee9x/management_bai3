package ui;

import util.MyUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Menu {
    List<String> optionList;
    String menuTitle;
    public Menu(List<String> optionList, String menuTitle){
        this.optionList = optionList;
        this.menuTitle = menuTitle;
    }
    public void addNewOption(String option){
        optionList.add(option);
    }
    public void printAllOption(){
        System.out.println(this.menuTitle);
        Optional optional = Optional.ofNullable(optionList);
        optional.ifPresent(System.out::println);
    }
    public int getChoice(){
        int min = 1;
        int max = optionList.size();
        String inputMsg = "your choice is from "+ min +" ... " + max;
        String errMsg = "your choice has to be greater than "+ min +", and smaller than "+ max;
        return MyUtil.getAnInteger(inputMsg, errMsg, min, max);
    }
}
