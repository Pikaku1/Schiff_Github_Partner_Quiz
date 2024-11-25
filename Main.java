@FunctionalInterface
interface Addition {
  int add(int a, int b);
}

public class Main{
  public static void main (String [] args){
    Addition x = (a, b) -> {
      int sum = 0;
      for(int i = a; i <= b; i++) {
        sum += i;
      }
      return sum;
    };
  }
}
