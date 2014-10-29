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
	private JTextArea chatArea;
	private JScrollPane chatPane;
	/**
	 * creates a layout for the panel.
	 */
	private SpringLayout baseLayout;
	private JTextField textField;
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
		
		JButton btnNewButton = new JButton("Random Meme");
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Random Reference");
		add(btnNewButton_1);
		
		textField = new JTextField();
	}
	/**
	 * Where all auto generated code goes.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton, 39, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 68, SpringLayout.EAST, btnNewButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -19, SpringLayout.NORTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -10, SpringLayout.EAST, chatPane);
		add(textField);
		textField.setColumns(10);
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
				sampleField.setText(sampleField.getText() +":O omg");
			}
		});
		
	}
}
