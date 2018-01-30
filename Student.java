import java.util.Scanner;
class Student{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Your ID : ");
   int id=sc.nextInt();
   System.out.print("Enter Your Name : ");
   String name=sc.next();
   System.out.print("Enter Your Salary : ");
   double sal=sc.nextDouble();
   System.out.println("ID : "+id+"\tName:"+name+"\tSalary : "+sal);
   sc.close();
 }
}

