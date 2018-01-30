import java.lang.*;
import java.io.*;

class Emp
{
  int no;
    Emp (int no)
  {
    this.no = no;
  }
}

class Ochange
{
  public static void swap (Emp c1, Emp c2)
  {
    int temp = c1.no;
      c1.no = c2.no;
      c2.no = temp;
  }


  public static void main (String[]args)
  {
    Emp c1 = new Emp (1);
    Emp c2 = new Emp (2);
    System.out.println("_______Before_Swapping_________\n\nE1.no = " + c1.no);
    System.out.println("E2.no = " + c2.no);
    swap (c1, c2);
    System.out.println ("\n_______After_Swapping_______\n\nE1.no = " + c1.no);
    System.out.println ("E2.no = " + c2.no);
  }
}
