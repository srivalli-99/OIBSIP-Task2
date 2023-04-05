import java.util.Random;
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int ans,g,s=0;
    final int Max = 100;
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    ans= rand.nextInt(Max)+1;
    for(int i=0;i<5;i++){
      System.out.println("guess a number between 1 and 100");
      g= keyboard.nextInt();
      if(g == ans){
            System.out.println("congratulations! your guess was correct");
            System.out.println("you have completed the task in "+(i+1)+" attempts");
     		s = (5 - i)*10;
            break;}
    
      else if(g < ans){
            System.out.println("your guess is less than the answer");}

      else{
            System.out.println("your guess is greater than the answer");}
    }
     
    if(s == 0){
            System.out.println("sorry, you are out of attempts");
            System.out.println("The answer is "+ans+"\n please try again...");}
    else{
            System.out.println("your score is "+s);}
                   
  }
}
