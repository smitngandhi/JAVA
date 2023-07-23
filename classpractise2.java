
class Student {
    String name;
    int roll_no;

    Student(String n,int roll)
    {
          name=n;
          roll_no=roll;
    }
    void display()
    {
        System.out.println("The Roll number is :" + roll_no);
        System.out.println("The Name is :" + name + "\n");
    }
}
class Exam extends Student
{
    int sub1,sub2,sub3;
    Exam(String name,int roll,int s1,int s2,int s3)
    {
        super(name,roll);
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
   
    void check()
    {
        if(sub1>26 && sub2>26 && sub3>26 )
        {
           System.out.println("The student is pass");
           System.out.println("The Percentage of the student is :" + ((sub1+sub2+sub3)/3) + "%");
    }
    else
    {
        System.out.println("The student is fail");
    }
    } 
        
    
}

public class classpractise2 {
    public static void main(String[] args) {
        
       Exam  e = new Exam("Smit",31,55,76,84);
       e.display();
       e.check();


    }
}
