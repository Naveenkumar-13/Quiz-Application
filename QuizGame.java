package com.gqt.core_java_mini_project;//package declaration
import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    static Scanner sc = new Scanner(System.in);//takes the user input

    // Console color codes
    static final String RESET = "\u001B[0m";//Resets all colors
    static final String GREEN = "\u001B[32m";//Green color
    static final String RED = "\u001B[31m";//Red color
    static final String BLUE = "\u001B[34m";//Blue color
    static final String CYAN = "\u001B[36m";//Cyan color
    static final String YELLOW = "\u001B[33m";//Yellow color

    //life-lines
    static boolean used5050 = false;//50-50 life-line
    static boolean usedAudience = false;//Audience poll life-line

  //candidate details
    static String userName;//candidate name
    static int age;//age
    static long mobile;//mobile number
    static String state;//state
    static String country;//country
    
    // Question class
    static class Question {
        String questionText;
        String[] options;
        int correctIndex;
        int prize;

        Question(String questionText, String[] options, int correctIndex, int prize) {
            this.questionText = questionText;
            this.options = options;
            this.correctIndex = correctIndex;
            this.prize = prize;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        userName = sc.nextLine();
        System.out.println("Enter your Age");
        age = sc.nextInt();
        System.out.println("Enter your Mobile Number");
        mobile = sc.nextLong();
        System.out.println("Enter your State");
        state = sc.next();
        System.out.println("Enter your Country");
        country = sc.next();
        System.out.println("Let's start the Game");
        Question[] questions = getQuestions();
        int totalPrize = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println(BLUE + "\nQ" + (i + 1) + ": " + q.questionText + RESET);
            displayOptions(q.options);

            while (true) {
                System.out.println(YELLOW + "Choose (1-4), or type '50' for 50-50, 'A' for Audience Poll:" + RESET);
                String input = sc.next();

                if (input.equalsIgnoreCase("50")) {
                    if (!used5050) {
                        used5050 = true;
                        apply5050(q);
                        continue;
                    } else {
                        System.out.println(RED + "50-50 lifeline already used!" + RESET);
                        continue;
                    }
                }

                if (input.equalsIgnoreCase("A")) {
                    if (!usedAudience) {
                        usedAudience = true;
                        applyAudiencePoll(q);
                        continue;
                    } else {
                        System.out.println(RED + "Audience Poll already used!" + RESET);
                        continue;
                    }
                }
                if(input.matches("[1-4]")) {
                	int answer=Integer.parseInt(input)-1;
                    if (answer == q.correctIndex) {
                        System.out.println(GREEN + "Correct answer, " + userName + "!" + RESET);
                        totalPrize += q.prize;
                        System.out.println("The next question is:");
                        break;
                    } else {
                        System.out.println(RED + "Wrong answer. Game Over, " + userName + "!" + RESET);
                        System.out.println(RED + "You won ₹" + totalPrize + RESET);
                        System.out.println("Thankyou for Participating");
                        return;
                    }
                }
                    else {
                        System.out.println(RED + "Invalid input. Try again." + RESET);
                    }
                }
            }

        System.out.println(GREEN + "\nCongratulations " + userName + "!" + RESET);
        System.out.println("Total Prize: ₹" + totalPrize);
        System.out.println("Thankyou for Participating");

    }

    // Display all options
    static void displayOptions(String[] opts) {
        for (int i = 0; i < opts.length; i++) {
            System.out.println(CYAN + (i + 1) + ". " + opts[i] + RESET);
        }
    }

    // 50-50 life-line logic
    static void apply5050(Question q) {
        System.out.println(BLUE + "50-50 Lifeline Activated!" + RESET);
        int[] wrongIndexes = new int[3];
        int idx=0;
        for (int i = 0; i < q.options.length; i++) {
            if (i != q.correctIndex) {
                wrongIndexes[idx++]=i;
            }
        }
        Random rand=new Random();
        int randomWrong=wrongIndexes[rand.nextInt(3)];
        System.out.println(CYAN + "Remaining Options:" + RESET);
        System.out.println(CYAN + (q.correctIndex + 1) + ". " + q.options[q.correctIndex] + RESET);
        System.out.println(CYAN + (randomWrong + 1) + ". " + q.options[randomWrong] + RESET);
    }

    // Audience Poll life-line logic
    static void applyAudiencePoll(Question q) {
        System.out.println(BLUE + "Audience Poll Activated!" + RESET);
        Random rand = new Random();
        int correctPercent = 50 + rand.nextInt(31); // 50-80%
        int[] percents = new int[4];
        percents[q.correctIndex] = correctPercent;
        int remaining = 100 - correctPercent;

        int[]wrongsIndexes = new int[3];
        int idx=0;
        for (int i = 0; i < 4; i++) {
            if (i != q.correctIndex) wrongsIndexes[idx++]=i;
        }

        for (int i = 0; i < 3; i++) {
            int share = (i == 2) ? remaining : rand.nextInt(remaining + 1);
            percents[wrongsIndexes[i]] = share;
            remaining -= share;
        }

        System.out.println(YELLOW + "Audience Poll Result:" + RESET);
        for (int i = 0; i < 4; i++) {
            System.out.println("Option " + (i + 1) + ": " + percents[i] + "%");
        }
    }

    // List of Questions
    static Question[] getQuestions() {
        Question[] qs= new Question[10];
        qs[0]=new Question("Who is he Owner of GQT?", new String[]{"Raghu", "Narendra Reddy", "Naveen", "NTR"}, 1, 1000);
        qs[1]=new Question("Who is Father of Java?", new String[]{"Dennis", "James Gosling", "Hussain bolt", "Guido Van rossum"}, 1, 2000);
        qs[2]=new Question("Who Wrote 'Remeo' and' 'Juliet\"", new String[]{"William Shakesphere", "Aliabhat", "Juliet", "Sajahan"}, 0, 3000);
        qs[3]=new Question("Which company developed the windows opearting system?", new String[]{"Google", "Microsoft", "Sun Microsystems", "Apple"}, 1, 3000);
        qs[4]=new Question("which bird is known for its beautiful tailfeathers?", new String[]{"Peacock", "Parrot", "Crow", "Eagle"}, 0, 5000);
        qs[5]=new Question("Which is the largest ocean in the world?", new String[]{"Indian", "Pacific", "Atlantic", "Arcitic"}, 1, 1000);
        qs[6]=new Question("Who is known as the 'Missile Man of India'?", new String[]{"Dr. A.P.J.Abdul Kalam", "Newtons", "Mathews", "Naveen"}, 0, 2000);
        qs[7]=new Question("Who is called as Mr IPL", new String[]{"Jaddu", "ABD", "MS Dhoni", "Suresh Raina"}, 3, 3000);
        qs[8]=new Question("Who won the 2011 world cup in Cricket?", new String[]{"Newzeland", "Bangladesh", "India", "Aus"}, 2, 4000);
        qs[9]=new Question("Who painted the Mona Lisa", new String[]{"Naveen", "Victan", "Leonardo da vinci", "jyothish"}, 2, 5000);
        return qs;
    }
}
