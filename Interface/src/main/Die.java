import java.util.Random;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die
{
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public int cast()
   {
      return 1 + generator.nextInt(sides);
   }
   
   private Random generator;
   private int sides;
}
