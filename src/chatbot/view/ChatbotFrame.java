package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame extends JFrame
{
	/**
	 * creates a base panel./
	 */
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotAppController baseController) 
	{
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	/**
	 * sets up the size of the frame.
	 */
    private void setupFrame()
    {
    	this.setContentPane(basePanel);
    	this.setSize(400, 400);
    	this.setResizable(false);
    	this.setVisible(true);
    }
    
}
