Using Multilevel Inheritance
class Bank
{
  int I_R;
  void display(int x)
  {
    I_R = x;
  }
}
class Branch extends Bank
{
     int T_P;
     int T_P_E;
     void display(int x, int y)
     {
        T_P = x;
        T_P_E = y;
     }
}
class Client extends Branch
{    
    int principal=1000;
    float CI;
    void display()
    {
       CI = (1+I_R/T_P);
       System.out.println(CI);
       int power=T_P*T_P_E;
       System.out.println(power);
      double a =  Math.pow( CI,power);
       a = a*principal;
      System.out.println(a);        
    }

}
public class classpractise3 {
    public static void main(String[] args) {
       Client c = new Client();
    c.display(90);
    c.display(2,3);
    c.display();

    }
}

Using Method Overiding
