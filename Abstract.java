
abstract class Game
{
   abstract  void Play();
}
class Cricket extends Game
{
      void Play()
      {
       System.out.println("Cricket Class Called");
      }
}
class Tennis extends Game
{
    void Play()
    {
     System.out.println("Tennis Class Called");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.Play();
        Tennis t = new Tennis();
        t.Play();
        // final int a =5;
        // System.out.println(a);

    }
}
