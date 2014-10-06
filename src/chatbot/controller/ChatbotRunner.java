package chatbot.controller;

public class ChatbotRunner
{
	/**
	 * Starts the entire program.
	 * @param arges
	 */
	public static void main(String [] arges)
	{
		ChatbotAppController appController = new ChatbotAppController();
		appController.start();
	}

}
