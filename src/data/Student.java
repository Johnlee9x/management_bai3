package data;

public class Student {
    private String id;
    private String name;
    private String address;
    private int priority;
    private String blockExam;
    public Student(String id, String name, String address, int priority, String blockExam){
        this.name= name;
        this.id = id;
        this.address = address;
        this.priority = priority;
        this.blockExam = blockExam;

    }

    public String getId() {
        return id;
    }

    public String toString(){
        return "Student's iD: " + this.id +", Student's name: " + this.name
                + ", Student's address: " + this.address +", block Examination: "+ this.blockExam;
    }
}
