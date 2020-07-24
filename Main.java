import java.util.*; 
class Main {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
   System.out.println("How many times did you work on monday?");
   int monday = user_input.nextInt();
    System.out.println("How many times did you work on tuesday?");
   int tuesday = user_input.nextInt();
   System.out.println("How many times did you work on wednesday?");
   int wednesday = user_input.nextInt();
   System.out.println("How many times did you work on thursday?");
   int thursday = user_input.nextInt();
   System.out.println("How many times did you work on friday?");
   int friday = user_input.nextInt();
   int[] hours = new int[]{monday, tuesday, wednesday, thursday, friday};
   int sum = 0;
   for (int i=0; i < hours.length ; i++) {
            sum = sum + hours[i];
            
  }
  System.out.println("total hours worked: ");
  System.out.println(sum);
}
}