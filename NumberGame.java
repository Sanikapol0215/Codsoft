package TASK1;
import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		
				        Scanner sc =new Scanner(System.in);
				        int chances=8;
				        int finnal=0;
				        boolean playAgain=true;
				        System.out.println("Welcome Buddy!");
				        System.out.println("Hey Buddy you have about" +chances+ "to win the game");
				        while(playAgain){
				            int rand=getrand(1,100);
				            boolean guess=false;
				            for(int i=0;i<chances;i++){
				                System.out.println("chances"+(i=1)+"Enter you guess:");
				                int user=sc.nextInt();
				                if(user==rand){
				                    guess=true;
				                    finnal+=1;
				                    System.out.println("You Won it.");
				                    break;
				                }
				                else if(user>rand){
				                   System.out.println("Too Heigh");
				                }
				                else{
				                   System.out.println("Too Low");

				                }
				            }
				            if(guess==false){
				                System.out.println("Sorry Buddy You lost the chances,The number is "+rand);  
				            }
				            System.out.println("Do you want to play Again(y/n)");
				            String pA=sc.next();
				            playAgain=pA.equalsIgnoreCase("y");
				        }
				        System.out.println("Thats it Buddy ,Hope you enjoyed it");
				        System.out.println("Here is your score"+finnal);}

				        public static int getrand(int min,int max){
				            return (int)(Math.random()+(max-min-1)+min);

				                        }


				



	}


