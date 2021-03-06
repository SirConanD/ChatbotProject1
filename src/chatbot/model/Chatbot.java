package chatbot.model;

import java.util.ArrayList;


public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	private ArrayList<String> userInputList;
	private String yogscastContent;
	
	private ChatUser myUser;
	
	
    /**
     * creates a Chatbot object with a specified name.  Initializes the total chats to 0.
     * @param name The name of the chatbot.
     */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		yogscastContent = "";
        /**
         * Fills the Array List with a list of Memes.	
         */
		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		fillTheMemeList();
		myUser = new ChatUser();
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
		
		if (userText !=null && userText.length() > 0)
		{
			if (numberOfChats < 5)
			{
				processedText = introductionUser(userText);
			}
			else	
			{
				processedText = randomChatTopic(userText);
			}
		}		
		else
		{
			numberOfChats--;
			processedText = "Answer the question!";
		}	
		incrementChats();
		return processedText;
				
private String randomChatTopic(String userInput)
{
	String randomTopic = "";
	int randomChoice = (int)(Math.random() * 7);
	if(randomChoice == 0)
	{
		if (StringLengthChecker(userInput))
		{
			randomTopic = "That is way to long to read";
		}
		else
		{
			randomTopic = "short messages are short on meaning";
		}
	}
	else if(randomChoice == 1)
	{
		if(contentChecker(userInput))
		{
			randomTopic = "you know that the secret involves" + userInput;
		}
		else
		{
			randomTopic = "";
		}
	}
	else if(randomChoice == 2)
	{
		if(memeChecker(userInput))
		{
			randomTopic = "hey, you found a meme:" + userInput;
			randomTopic += "isn't that cool.";
		}
		else
		{
			randomTopic = "That was not a meme.";
		}
	}
	else if(randomChoice == 3)
	{
		randomTopic = chooseRandomUserInfo(userInput);
	}
	else if(randomChoice == 4)
	{
		userInputList.add(0, userInput);
		randomTopic = "Thanks for the input, " + myUser.getName();
	}
	else if (randomChoice == 5)
	{
		if(userInputChecker(userInput))
		{
			randomTopic = "Yikes you knew whar you said before!";
		}
		else
		{
			randomTopic = "I don't think I have heard that one before";
		}
	}
	else
	{
		if(chatbotNameChecker(userInput))
		{
			randomTopic = chatbotNameConversation(userInput);
		}
		else
		{
			randomTopic = noNameConversation(userInput);
		}
	}

	return randomTopic;
}

	private String randomChatTopic(String userText)
	{
		return null;
	}

	private String introductionUser(String userText)
	{
		return null;
	}

	/**
	 * Creates a checker for the user input.
	 * @param input  The user input.
	 * @return continues or stops a loop.
	 */
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		
		return matchesInput;
	}
	
	/**
	 * checks for a certain words in the user input.
	 * @param input What the user puts in.
	 * @return Talks about preset content. 
	 */
	private boolean contentChecker(String input)
	{
		boolean myContent = false;
		if(input.contains(yogscastContent))
		{
			myContent = true;
		}
		
		return myContent;
	}
	
	/**
	 * Checks the length of the string.
	 * @param input User input.
	 * @return  
	 */
	private boolean stringChecker(String input)
	{
		boolean tooLong = false;
		
		if(input.length() >= 25)
		{
			tooLong = true;
		}
		
		return tooLong;
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

	/**
	 * Checks to see if the name of the Chatbot is contained within the String supplied by the user.
	 * @param currentInput The user supplied String.
	 * @return Whether the name is inside of not.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		
		return hasNameInString;
	}
	
	/**
	 * creates a class for when the user mentions the chatbots name.
	 * @param currentInput  The users current input.
	 * @return   a conversation to do with the name of the chatbot.
	 */
	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";
		nameConversation.concat(currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length() -1));
		return nameConversation;
	}
	
	/**
	 * Creates a class for if the name of the chatbot is mentioned.
	 * @param currentInput  The users current input.
	 * @return  a text stating that they did not use the name with a special phrase.
	 */
	private String noNameConversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int) (Math.random() * currentInput.length() / 2);
		int largerRandom = (int) (smallRandom + (Math.random() * (currentInput.length() / 2)) + 1);
		
		notNamed = "You didn't say my name so here is a special phrase: " + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
	
	
	
}
