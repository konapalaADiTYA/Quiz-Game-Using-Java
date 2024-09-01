import java.util.Scanner;

public class Question_And_Answer_Display {
	String[] selection = new String[5];
	Question_And_Answers[] q = new Question_And_Answers[5];
	public void Start_Quiz() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		q[0] = new Question_And_Answers(1,"What is the capital of Australia?","Sydney","Canberra"," Melbourne","Brisbane","b");
		q[1] = new Question_And_Answers(2,"Who was the first President of the United States?","Thomas Jefferson","John Adams","George Washington","Benjamin Franklin","c");
		q[2] = new Question_And_Answers(3,"What is the chemical symbol for water?"," H2O","CO2"," O2"," H2","a");
		q[3] = new Question_And_Answers(4,"What is the value of π (pi) to two decimal places?","3.12","3.14","3.16","3.18","b");
		q[4] = new Question_And_Answers(5,"Which programming language is known as the \"mother of all languages\"?","Java","C","Python","Assembly","b");
		for(Question_And_Answers qa : q) {
			System.out.println("Question Number :"+qa.getId());
			System.out.print("Question:");
			System.out.println(qa.getQuestion());
			System.out.println("a)"+qa.getOpt1()+"    b)"+qa.getOpt2());
			System.out.println("c)"+qa.getOpt3()+"    d)"+qa.getOpt4());
			System.out.print("Select an option : ");
			selection[i]= sc.nextLine();
			i++;
		}
	}
	public void Display_Score() {
		int score =0;
		for(int i=0;i<5;i++) {
			String selected =selection[i];
			String user_selected = q[i].getCorrect_option();
			if(selected.equals(user_selected)) {
				score++;
			}
		}
		System.out.println("Your score is : "+score);
	}
	public void Selected_Option_And_Answers() {
		for(int i=0;i<5;i++) {
			System.out.println("What you Selected for Question "+q[i].getId()+" is "+selection[i]+" Correct Option is "+q[i].getCorrect_option());
		}
		
	}
	
}