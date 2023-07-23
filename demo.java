class VarargsMethod
{
 void arr(int ...v)
 {
  for(int t:v)
  {
    System.out.print(t + " ");
  }
 }
}

public class demo {
    
    public static void main(String[] args) {
       
       VarargsMethod v = new VarargsMethod();
       v.arr(1,2,3);
       v.arr(4);
        

    }
}
