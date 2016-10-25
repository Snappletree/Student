
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{

    private String name;
    private double test1;
    private double test2;
    private double test3;
    private double testAverage = test1 + test2 + test3 / 3;

    public Student (){

        name = null;
        test1 = 0.0;
        test2 = 0.0;
        test3 = 0.0;
    }

    public Student (String namea, double test1a, double test2a, double test3a){

        name = namea;
        test1 = test1a;
        test2 = test2a;
        test3 = test3a;
    } 
    //name
    public String getname(){  

        return name;

    }

    public void setname(String newname){
        name = newname;
    }
    //test1
    public double gettest1(){
        return test1;
    }

    public void settest1(double newtest1){
        test1 = newtest1;
    }
    //test2
    public double gettest2(){
        return test2;
    }

    public void settest2(double newtest2){
        test1 = newtest2;
    }
    //test3
    public double gettest3(){
        return test3;
    }

    public void settest3(double newtest3){
        test1 = newtest3;
    }
    //test average
    public double gettestAverage(){
        double testAverage;
        testAverage = test1 + test2 + test3 / 3;
        return testAverage;

    }
}