import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * Created by Javen on 2018/8/24.
 */

class Student implements Serializable {
    private String name;
    private int age;
    private String school;
    public Student () {}
    public Student (String name, int age) {
        this.setAge(age);
        this.setName(name);
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSchool (String school) {
        this.school = school;
    }
    public String getSchool() {
        return school;
    }
    public String toString(){
        return "学生名称:" + this.name + ";\t学生年龄:" + this.age + ";\t学校：" + this.school;
    }
}

class School implements Serializable {
    private String name;
    private List<Student> studentList;
    public School(){
        this.studentList = new ArrayList<Student>();
    }
    public School(String name){
        this();
        this.setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public String toString(){
        return "学校名称 " + this.name;
    }
}
public class TestDemo {
    public static void main(String args[]) {
        String file = "D:" + File.separator + "PropertiesDemoWrite.txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e){
            e.printStackTrace();
        }
        String schoolName = properties.getProperty("javen");
        School school = new School(schoolName);
        Student student1 = new Student("Javen ", 23);
        Student student2 = new Student("Javen ", 22);
        Student student3 = new Student("Javen ", 21);
        student1.setSchool(schoolName);
        student2.setSchool(schoolName);
        student3.setSchool(schoolName);
        school.getStudentList().add(student1);
        school.getStudentList().add(student2);
        school.getStudentList().add(student3);
        Iterator<Student> iterator = school.getStudentList().iterator();
        System.out.println(school.getName());
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
    }
}
