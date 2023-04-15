// overloading
// public class  pro6 {
//  public static void main(String[] args) {
//     int result1=sum(1,1);
//     int result2=sum(1,2,3);
//     double result3=sum(1.0,2.0);
    
//     System.out.println("result1:"+result1);
//     System.out.println("result2:"+result2);
//     System.out.println("result3:"+result3);
//  }    
//  public static int sum(int a,int b){
//     return a+b;
//  }
//  public static int sum(int a,int b,int c){
//     return a+b+c;
//  }
//  public static double sum(double a,double b){
//     return a+b;
//  }
// }

// overriding is child class(sub class) has same parent class
class Vehicle{  
    void run(){System.out.println("Vehicle is running");}  
  }  
  //Creating a child class  
  class Bike extends Vehicle{  
    public static void main(String args[]){  
    //creating an instance of child class  
    Bike obj = new Bike();  
    //calling the method with child class instance  
    obj.run();  
    }  
  }