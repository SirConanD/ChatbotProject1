package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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
		
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Sets up what goes in the frame.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}
	/**
	 * Where all auto generated code goes.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -66, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -10, SpringLayout.EAST, this);
	}
    /**
     * Creates a listener for buttons.
     */
	private void setupListeners()
	{
		
	}
	
}
