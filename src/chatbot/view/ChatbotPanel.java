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
		chatArea=new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 139, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -18, SpringLayout.NORTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
		
		
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
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton, 68, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -20, SpringLayout.NORTH, sampleButton);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Random Reference");
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 55, SpringLayout.EAST, btnNewButton);
		add(btnNewButton_1);
		
		textField = new JTextField();
		baseLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, chatPane);
		add(textField);
		textField.setColumns(10);
	}
	/**
	 * Where all auto generated code goes.
	 */
	private void setupLayout()
	{
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
