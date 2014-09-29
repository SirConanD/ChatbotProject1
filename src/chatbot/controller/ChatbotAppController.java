package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;
    
	/**
	 * Creates a ChatbotAppController and initializes the associated VIew and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
        notSoCleverBot = new Chatbot("Mr. Chatbot");
	}
	
	
	/**
	 * Allows other objects access to the notSoCleverBot.
	 * @return The CHatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	/**
	 * Starts the Chatbot Application.
	 */
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name.");
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatbotConversations(message);
		}
		
	}
	
	/**
	 * This quits the program.
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
