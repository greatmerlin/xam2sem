package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("If the above expression is true, then you see this one");
//            System.out.println("This will be printed aswell because it is inside the Code Block of the true expression");
//        } else if (score < 1000) {
//            System.out.println("If the first expression is false and the second true, then you see this one");
//        } else {
//            System.out.println("if both of the two above expressions are false, then you see this one");
//        }

        if (gameover == true) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalscore);
        }

    }
}
