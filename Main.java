public class Main{
  public static void main (String [] args){ //solving merge conflict --- just solved
    //Mohammed Sadiq and Aliasgar Mullamithawala
    Addition x = (a, b) -> { 
      int sum = 0;
      for(int i = a; i <= b; i++) {
        sum += i;
      }
      return sum;
    };
    System.out.println(x.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}
