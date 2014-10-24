package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;

/**
 * Application Controller for the chatbot project.
 * @author gfet1302
 * @version 1.3 10/1/14
 */
public class ChatbotAppController
{
	/**
	 * The GUI view for the application.
	 */
	private ChatbotView appView;
	/**
	 * The chatbot Model instance.
	 */
	private Chatbot notSoCleverBot;
	/**
	 * The startup message for the chatbot application.
	 */
	private String startMessage;
	/**
	 * The ending message for the Chatbot.
	 */
	private String endMessage;
	/**
	 * GUI frame for the application.
	 */
	private ChatbotFrame baseFrame;
    
	/**
	 * Creates a ChatbotAppController and initializes the associated VIew and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
        notSoCleverBot = new Chatbot("Mr. Chatbot");
        startMessage = "Welcome to the " + notSoCleverBot.getName() +" Chatbot, type in your name.";
	}
	
	/**
	 * Allows other objects access to the notSoCleverBot.
	 * @return The Chatbot for this app.
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
//		String message = appView.displayChatbotConversations(startMessage);
//		
//		while(!notSoCleverBot.quitChecker(message))
//		{
//			message = notSoCleverBot.processText(message);
//			message = appView.displayChatbotConversations(message);
//		}
//		
//		quit();
	}
	
	/**
	 * This quits the program with a message to the user that is using the application.
	 */
	private void quit()
	{
		appView.displayInformation("good bye.");
		System.exit(0);
	}
}