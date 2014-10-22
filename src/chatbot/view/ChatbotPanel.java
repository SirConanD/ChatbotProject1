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
	/**
	 * Creates swing text field.
	 */
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	/**
	 * creates a layout for the panel.
	 */
	private SpringLayout baseLayout;
	/**
	 * Calls the App Controller.
	 * @param baseController  
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("click on me please.");
		sampleField = new JTextField(25);
		chatArea=new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -19, SpringLayout.NORTH, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -140, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 150, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		
		
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
		this.add(sampleField);
		this.add(chatPane);
	}
	/**
	 * Where all auto generated code goes.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 129, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -66, SpringLayout.EAST, this);
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
