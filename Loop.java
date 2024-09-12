/*
This project is done by Naomi Johnson. It contains a loop that will print out the numbers 1-100 saying if the number is odd or even.
The sum of all the numbers added up will also be printed out at the bottom.
*/
public class Loop {
  public static void main(String[] args) {
    int sum = 0;
    //This is where I set up my variables.
    String type = "";
      for(int i = 1; i < 101; i++) {
        //This is the loop set up so it starts on 1 and repeats until it reaches 101.
          if(i % 2 == 0) {
            /*
            This is where I set up the modulus. i % 2 checks what the ramainer of each number is when it is divided by 2.
            If the remainder is 0, it is an even number.
             */
              type = "even";
              //If it is even, print out "even".
          } else {
            //If it isn't even, then it has to be odd.
              type = "odd";
              //If it is odd, print out "odd".
          }
          sum += i;
          //This will add the current number in the loop to the sum variable.
           System.out.println(i + ": " + type);
           //This prints the number and whether it is odd or even.
      }
      System.out.println("The sum of the numbers 1-100 is " + sum);
      //After the loop, this will print out the sum of all the numbers 1-100.
  }
}