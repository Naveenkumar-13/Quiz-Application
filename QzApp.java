package com.gqt.core_java_mini_project;

import java.util.Scanner;
interface QuestionsList{
	String question1 = "Who is he Owner of GQT?";
	String question2 = "Who is Father of Java?";
	String question3 = "Who Wrote 'Remeo' and' 'Juliet";
	String question4 = "Which company developed the windows opearting system?";
	String question5 = "which bird is known for its beautiful tailfeathers?";
	String question6 = "Which is the largest ocean in the world?";
	String question7 = "Who is known as the 'Missile Man of India'?";
	String question8 = "Who is called as Mr IPL";
	String question9 = "Who won the 2011 world cup in Cricket";
	String question10 = "Who painted the Mona Lisa";
}
class Candidate{
	String name;
	int age;
	String state;
	String country;
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter candidate state: ");
        String state = sc.nextLine();

        System.out.print("Enter candidate country: ");
        String country = sc.nextLine();

        // Output Section
        System.out.println("\n--- Candidate Details ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("State   : " + state);
        System.out.println("Country : " + country);
        System.out.println("\n");

	}
}
class Options{
	static int lifeline=2;
	int FF=1, AP=1;
	Scanner sc=new Scanner(System.in);
	boolean quest1() {
		System.out.println(QuestionsList.question1);
		System.out.println("option-1: Raghu Sir\n"
				+ "option-2: Narendra Reddy sir\n"
				+ "Option-3: Naveen\n"
				+ "Option-4: NTR\n"
				+ "Option-5: Lifeline");
		System.out.println("Select the correct option");
		int op = sc.nextInt();
		if(op==2) {
			return true;
		}
		else if(op==5) {
			if(lifeline > 0) {
				System.out.println("Please select the lifeline");
				if(AP==1)
					System.out.println("Audience phone = AP");
				if(FF==1)
					System.out.println("50-50 = FF");
				String opt = sc.next();
				if(opt.equals("AP")&& AP==1) {
					AP = 0;
					lifeline--;
					System.out.println("option-1: Raghu Sir (10%)\n "
							+ "option-2: Narendra Reddy Sir (50%)\n"
							+ "Option-3: Naveen (20%)\n"
							+ "Option-4: NTR (20%)\n"
							+ "Please select the option");
					op = sc.nextInt();
					if(op == 2) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(opt.equals("FF")&& FF==1) {
					FF = 0;
					lifeline--;
					System.out.println("option-1: Raghu Sir (10%)\n "
							+ "option-2: Narendra Reddy Sir (50%)\n"
							+ "Please select the option");
					op = sc.nextInt();
					if(op == 2) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		return false;
	}
		public boolean question2() {
			System.out.println(QuestionsList.question2);
			System.out.println("option-1: James Gosling\n"
					+ "option-2: Dennis Ritchie\n"
					+ "Option-3: Naveenkumar\n"
					+ "Option-4: Guido Van Rossum\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==1) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: James Gosling (70%)\n "
								+ "option-2: Dennis Ritchie (50%)\n"
								+ "Option-3: Navenkumar (20%)\n"
								+ "Option-4: Guido Van Rossum (40%)\n"
								+ "Please select an option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF")&& FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: James Gosling (50%)\n "
								+ "option-3: Navenkumar (10%)\n"
								+ "Please select an option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the option");
					op = sc.nextInt();
					if(op == 1) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question3() {
			System.out.println(QuestionsList.question3);
			System.out.println("option-1: William Shakespeare\n"
					+ "option-2: Atthur Brooke \n"
					+ "Option-3: Romeo \n"
					+ "Option-4: Juliet \n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==1) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: William Shakespeare (70%)\n "
								+ "option-2: arthur Brooke (50%)\n"
								+ "Option-3: Romeo (20%)\n"
								+ "Option-4: Juliet (40%)\n"
								+ "Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: William Shakespeare (50%)\n "
								+ "option-3: Romeo (10%)\n"
								+ "Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}

				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 1) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question4() {
			System.out.println(QuestionsList.question4);
			System.out.println("option-1: Microsoft\n"
					+ "option-2: Apple\n"
					+ "Option-3: IBM\n"
					+ "Option-4: Google\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==1) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1:Microsoft (70%)\n "
								+ "option-2: Apple(50%)\n"
								+ "Option-3: IBM(20%)\n"
								+ "Option-4: Google(40%)\n");
						System.out.println("Please select the correct option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1:Microsoft (50%)\n "
								+ "option-3:IBM(10%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 1) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question5() {
			System.out.println(QuestionsList.question5);
			System.out.println("option-1: Sparrow\n"
					+ "option-2: Parrot\n"
					+ "Option-3: Peacock\n"
					+ "Option-4: Crow\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==3) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: Sparrow(30%)\n "
								+ "option-2: Parrot (50%)\n"
								+ "Option-3: Peacock (70%)\n"
								+ "Option-4: Crow (40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						System.out.println("option-1: Sparrow (50%)\n "
								+ "option-3: Peacock (10%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 3) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question6() {
			System.out.println(QuestionsList.question6);
			System.out.println("option-1: Atlantic Ocean\n"
					+ "option-2: Pacific Ocean\n"
					+ "Option-3: Indian Ocean\n"
					+ "Option-4: Arctic Ocean\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==2) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: Atlantic Ocean (50%)\n "
								+ "option-2: Pacific Ocean (70%)\n"
								+ "Option-3: Indian Ocean (20%)\n"
								+ "Option-4: Arctic Ocean (40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 2) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: Pacific Ocean (50%)\n "
								+ "option-3: Indian Ocean (10%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 2) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question7() {
			System.out.println(QuestionsList.question7);
			System.out.println("option-1: Dr. A. P. J. Abdul Kamal \n"
					+ "option-2: Vikram\n"
					+ "Option-3: Naveen\n"
					+ "Option-4: Albert Einstein\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==1) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1:Dr. A. P. J. Abdul Kamal  (70%)\n "
								+ "option-2: Vikram (50%)\n"
								+ "Option-3: Naveen(20%)\n"
								+ "Option-4: Albert Einstein(40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF")) {
						FF = 0;
						lifeline--;
						System.out.println("option-1:Dr. A. P. J. Abdul Kamal (50%)\n "
								+ "option-3:Vikram(10%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 1) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 1) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question8() {
			System.out.println(QuestionsList.question8);
			System.out.println("option-1: Jadeja\n"
					+ "option-2: MS Dhoni\n"
					+ "Option-3: Suresh Raina\n"
					+ "Option-4: Kohli\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==3) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: Jadeja (30%)\n "
								+ "option-2: MS Dhoni (50%)\n"
								+ "Option-3: Suresh Raina(70%)\n"
								+ "Option-4: Kohli (40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: Raina (50%)\n "
								+ "option-3: Suresh Raina (10%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 3) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question9() {
			System.out.println(QuestionsList.question9);
			System.out.println("option-1: NewZeland\n"
					+ "option-2: India\n"
					+ "Option-3: Australia\n"
					+ "Option-4: Bangladesh\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==2) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: Newzeland (30%)\n "
								+ "option-2: India (70%)\n"
								+ "Option-3: Australia(50%)\n"
								+ "Option-4: Bangladesh (40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 2) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: NewZeland (10%)\n "
								+ "option-2: India (50%)\n");
						System.out.println("Plese select the option");
						op = sc.nextInt();
						if(op == 2) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 2) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
		public boolean question10() {
			System.out.println(QuestionsList.question10);
			System.out.println("option-1: Vincent van Gogh\n"
					+ "option-2: Naveenkumar\n"
					+ "Option-3: Leonardo da vinci\n"
					+ "Option-4: Jyothish\n"
					+ "Option-5: Lifeline");
			System.out.println("Select the correct option");
			int op = sc.nextInt();
			if(op==3) {
				return true;
			}
			else if(op==5) {
				if(lifeline > 0) {
					System.out.println("Please select the lifeline");
					if(AP==1)
						System.out.println("Audience phone = AP");
					if(FF==1)
						System.out.println("50-50 = FF");
					String opt = sc.next();
					if(opt.equals("AP") && AP==1) {
						AP = 0;
						lifeline--;
						System.out.println("option-1: Vincent van gogh (30%)\n "
								+ "option-2: Naveenkumar (50%)\n"
								+ "Option-3: Leonardo da vinci(70%)\n"
								+ "Option-4: Jyothish (40%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
					else if(opt.equals("FF") && FF==1) {
						FF = 0;
						lifeline--;
						System.out.println("option-1: Vincent van gogh (20%)\n "
								+ "option-3: Leonardo da vinci (50%)\n");
						System.out.println("Please select the option");
						op = sc.nextInt();
						if(op == 3) {
							return true;
						}
						else {
							return false;
						}
					}
				}
				else {
					System.out.println("No lineline left please "
							+ "select the correct option");
					op = sc.nextInt();
					if(op == 3) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				return false;
			}
			return false;
		}
	}
public class QzApp {
	public static void main(String[] args) {
		Candidate user=new Candidate();
		user.getDetails();
		Options op=new Options();
		boolean opt1=op.quest1();
		if (opt1==true) {
			System.out.println("Naveen Your answer is Correct");
			System.out.println("\u001B[32m CONGRATULATIONS You won Rs.1000/-\u001B[0m");
			System.out.println("The next Question is:");
			opt1=op.question2();
			if(opt1 == true) {
				System.out.println("Naveen Your answer is Correct");
				System.out.println("\u001B[32m CONGRATULATIONS You won Rs.2000/-\u001B[0m");
				System.out.println("The next Question is:");
				opt1 = op.question3();
				if(opt1 == true) {
					System.out.println("Naveen Your answer is Correct");
					System.out.println("\u001B[32m CONGRATULATIONS You won Rs.3000/-\u001B[0m");
					System.out.println("The next Question is:");
					opt1 = op.question4();
					if(opt1 == true) {
						System.out.println("Naveen Your answer is Correct");
						System.out.println("\u001B[32m CONGRATULATIONS You won Rs.4000/-\u001B[0m");
						System.out.println("The next Question is:");
						opt1 = op.question5();
						if(opt1 == true) {
							System.out.println("Naveen Your answer is Correct");
							System.out.println("\u001B[32m CONGRATULATIONS You won Rs.5000/-\u001B[0m");
							System.out.println("The next Question is:");
							opt1 = op.question6();
							if(opt1 == true) {
								System.out.println("Naveen Your answer is Correct");
								System.out.println("\u001B[32m CONGRATULATIONS You won Rs.6000/-\u001B[0m");
								System.out.println("The next Question is:");
								opt1 = op.question7();
								if(opt1 == true) {
									System.out.println("Naveen Your answer is Correct");
									System.out.println("\u001B[32m CONGRATULATIONS You won Rs.7000/-\u001B[0m");
									System.out.println("The next Question is:");
									opt1 = op.question8();
									if(opt1 == true) {
										System.out.println("Naveen Your answer is Correct");
										System.out.println("\u001B[32m CONGRATULATIONS You won Rs.8000/-\u001B[0m");
										System.out.println("The next Question is:");
										opt1 = op.question9();
										if(opt1 == true) {
											System.out.println("Naveen Your answer is Correct");
											System.out.println("\u001B[32m CONGRATULATIONS You won Rs.9000/-\u001B[0m");
											System.out.println("The next Question is:");
											opt1 = op.question10();
											if(opt1==true) {
												System.out.println("Naveen Your answer is Correct");
												System.out.println("\u001B[32m CONGRATULATIONS You won Rs.10000/-\u001B[0m");
											}
											else {
												System.out.println("\u001B[31mNaveen Your is Incorrect, You are out of the game \u001B[0m");
												System.out.println("\u001B[32m You won Rs.5000/-\u001B[0m");
											}
										}
										else {
											System.out.println("\u001B[31mNaveen Your Answer is Incorrect, You are out of the game \u001B[0m");
											System.out.println("\u001B[32m You won Rs.5000/-\u001B[0m");
										}
									}
									else {
										System.out.println("\u001B[31mNaveen Your Answer is Incorrect, You are out of the game \u001B[0m");
										System.out.println("\u001B[32m You won Rs.5000/-\u001B[0m");
									}
								}
								else {
									System.out.println("\u001B[31mNaveen Your Answer is Incorrect, You are out of the game \u001B[0m");
									System.out.println("\u001B[32m You won Rs.5000/-\u001B[0m");
								}
							}
							else {
								System.out.println("\u001B[31mNaveen Your Answer is Incorrect, You are out of the game \u001B[0m");
								System.out.println("\u001B[32m You won Rs.5000/-\u001B[0m");
							}
						}
						else {
							System.out.println("\u001B[31mNaveen Your Answer is Incorrect answer you are out of the game and YOU won Rs.0/-\u001B[0m");
						}
					}
					else {
						System.out.println("\u001B[31mNaveen Your Answer is Incorrect answer you are out of the game and YOU won Rs.0/-\u001B[0m");
					}
				}
				else {
					System.out.println("\u001B[31mNaveen Your Answer is Incorrect answer you are out of the game and YOU won Rs.0/-\u001B[0m");
				}
			}
			else {
				System.out.println("\u001B[31mNaveen Your Answer is Incorrect answer you are out of the game and YOU won Rs.0/-\u001B[0m");
			}
		}
		else {
			System.out.println("\u001B[31mNaveen Your Answer is Incorrect answer you are out of the game and YOU won Rs.0/-\u001B[0m");
			System.out.println("Thankyou for Participate Quiz Game");
		}
	}
}