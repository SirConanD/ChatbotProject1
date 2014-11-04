package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	/**
	 * Creates swing button.
	 */
	private JButton sampleButton;
	private JButton memeButton;
	private JButton randomButton;
	/**
	 * creates swing text area.
	 */
	private JTextArea chatArea;
	/**
	 * Creates swing scroll pane.
	 */
	private JScrollPane chatPane;
	/**
	 * creates a layout for the panel.
	 */
	private SpringLayout baseLayout;
	private JTextField sampleField;
	/**
	 * Calls the App Controller.
	 * @param baseController  
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("click on me please.");
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 118, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -19, SpringLayout.NORTH, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 60, SpringLayout.WEST, this);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Sets up what goes in the frame.
	 */
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(chatPane);
		
		JButton memeButton = new JButton("Random Meme");
		add(memeButton);
		
		JButton randomButton = new JButton("Random Reference");
		add(randomButton);
		
		sampleField = new JTextField();
	}
	/**
	 * Where all auto generated code goes.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, memeButton, 39, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 68, SpringLayout.EAST, randomButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -19, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.NORTH, memeButton, 0, SpringLayout.NORTH, memeButton);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 6, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 10, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -10, SpringLayout.EAST, chatPane);
		add(sampleField);
		sampleField.setColumns(10);
	}
    /**
     * Creates a listener for buttons.
     */
	private void setupListeners()

	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}
		});
		
	}
	
	/**
	 * displays text to the user.
	 * @param input user text.
	 */
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}
