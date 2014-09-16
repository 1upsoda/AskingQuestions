package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class questions
{
	private Scanner questionScanner;
	private Scanner QuestionScanner;
	
	public questions()
	{
	
		questionScanner = new Scanner(System.in);
		QuestionScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		//askquestions();
		//askOtherQuestions();
		askquestionsGUI();
		
	}
	
	private void askquestionsGUI()
	{
		JOptionPane.showMessageDialog(null, "What is your name?");
		String answerGUI = JOptionPane.showInputDialog("What is your name?");
		answerGUI = JOptionPane.showInputDialog("Hi, " + answerGUI + " How are you today?");
		answerGUI = JOptionPane.showInputDialog("''" + answerGUI + "''? Well that's good, what's your favorite color?");
		answerGUI = JOptionPane.showInputDialog("I don't like the color " + answerGUI + " because I am colorblind... Now tell me your age:");
		JOptionPane.showMessageDialog(null, "The bot has fled");
		JOptionPane.showMessageDialog(null, "He ain't comming back...");
		JOptionPane.showMessageDialog(null, "Like, forever...");
		JOptionPane.showMessageDialog(null, "What did you say to him?");
		answerGUI = JOptionPane.showInputDialog("That you are " + answerGUI + " years old? He for some reason hates the number " +answerGUI+ "... Anyway, what is YOUR favorite number?");
		if(answerGUI.equals("42"))
		{
			JOptionPane.showMessageDialog(null, "The replacement bot has left...");
		}
		else
		{
			answerGUI = JOptionPane.showInputDialog(null, "Oh the number " +answerGUI+ " is pretty cool, what is/was your favorite subject in school?");
			answerGUI = JOptionPane.showInputDialog("I hated all subjects in school, especially " +answerGUI+ ". What subject did/do you hate?");
			answerGUI = JOptionPane.showInputDialog("I never took " +answerGUI+ " so I wouldn't know how it's like... What is your favorite possesion?");
			answerGUI = JOptionPane.showInputDialog("That sounds like a very cool object. Where can I get a(n) ''" +answerGUI+ "''?");
			JOptionPane.showMessageDialog(null, "Well " +answerGUI+ " Seems too far away, I am just going to take yours...");
			JOptionPane.showMessageDialog(null, "The replacement bot has left...");
		}
		
	}
	
	private void askquestions()
	{
		System.out.println("What is your name?");
		String answer = questionScanner.next();
		System.out.println("Why, hello there " + answer + ". How are you today?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println("You feel " + answer + "? Alrighty then. What's your favorite color?");
		answer = questionScanner.nextLine();
		System.out.println("" + answer + "? That is a terrible color. I personally like gray, as I am colorblind. How old are you?");
		answer = questionScanner.nextLine();
		System.out.println("If you are wondering why am asking about your age, it is because of, certain, things, to do, with other things, I do like the number " + answer + " though. What is your favorite number?");
		answer = questionScanner.nextLine();
		System.out.println("" + answer + " is such a predictable answer. Anything else you want me to know?");
		answer = questionScanner.nextLine();
		System.out.println("Okay, I gotta go.");
		answer = questionScanner.next();
		if(answer.equalsIgnoreCase("Bye"))
		{
			System.out.println("Bye");
		}
		else
		{
			System.out.println("I'm sorry?");
		}
	}
	private void askOtherQuestions()
	{
		System.out.println("Oh, wait, how about a guessing game?");
		String answer = QuestionScanner.next();
		if(answer.equalsIgnoreCase("sure"))
		{
			System.out.println("Great");
		}
		else
		{
			System.out.println("Too Bad");
		}
		System.out.println("Choose a number from 1-3");
	}
}
