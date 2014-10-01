package chatbot.model;

import java.util.ArrayList;


public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	
    /**
     * creates a Chatbot object with a specified name.  Initializes the total chats to 0.
     * @param name The name of the chatbot.
     */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		
		/**
		 * Creates a list of memes.
		 */
		memeList = new ArrayList<String>();
		fillTheMemeList();
	}
    
	/**
	 * This calls for the name.
	 * @return the name value.
	 */
	public String getName()
	{
		return name;
	}
    
	/**
	 * This calls for the number of chats for this chatbot.
	 * @return the current number of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
    
	/**
	 * Sets the name of the chatbot.
	 * @param name The new name for the Chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}
    
	/**
	 * numberOfChats++ keeps track of the amount of chats there have been.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	
	/**
	 * A list of memes that the program will check for in the user text.
	 */
	private void fillTheMemeList()
	{
		memeList.add("you mad bro");
		memeList.add("doh!");
		memeList.add("one does not simply");
		memeList.add("Diggy Diggy Hole");
		memeList.add("Grumpy Cat");
		memeList.add("Troll");
	}
	
	
	
	/**
	 * Processed the supplied text from the user to provide a message from Chatbot.
	 * @param userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		if(memeChecker(userText))
		{
			processedText = "hey, you found a meme: " +userText;
			processedText += " isn't that cool.";
		}
		else
		{
			processedText = "Boring, that wasn't a meme.";
		}
		
		return processedText;
	}
	
	/**
	 * Check if the current text is a meme.
	 * @param currentText Checks the current text.
	 * @return A message based on if it is true of false.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;	
	}
	
	/**
	 * This checks to see if it is ok to quit the program.
	 * @param input Checks if the input matches.
	 * @return True or False.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("good bye"))
		{
			okToQuit = true;
		}
		
		return okToQuit;		
	}

}
