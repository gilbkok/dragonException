package Projects.dragonExcep.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r = (int) (Math.random() * 2.0) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,you see two caves. In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? (1 or 2)");

        try {
            int ch = sc.nextInt();
            if (ch == r) {
                System.out.println("You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opens his jaws and...Gobbles you down in one bite!");
            } else if (ch > 2) {
                System.out.println("Wrong choice");
            } else {
                System.out.println("You approached the cave, A friendly dragon appears...He shares his treasure with you. Congratulations you got your treasure!");
            }

        } catch (java.lang.Exception e) {
            System.out.println("Something went wrong");

        }
    }
}