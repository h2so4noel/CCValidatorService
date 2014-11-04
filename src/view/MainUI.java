package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ServiceHandler;

/**
 * Main user interface class to provide a view for the CCChecker in CCValidatorService project.
 * Using javax.swing with simple flow layout.
 * @author Pawin Suthipornopas 5510546123
 *
 */
public class MainUI extends JFrame implements Runnable {
	ServiceHandler handler;
	
	Container container;
	
	JPanel firstPanel;
	JPanel secondPanel;
	JPanel thirdPanel;
	JPanel fourthPanel;
	
	JLabel type;
	JLabel number;
	JLabel result;
	
	JComboBox<String> typeBox;
	
	JTextField numberF;
	JTextField resultF;
	
	JButton validate;
	
	String response;
	/**
	 * Constructor for this class.
	 * Injects ServiceHandler to use in UI.
	 * @param handler is the ServiceHandler to be used in this UI.
	 */
	public MainUI(ServiceHandler handler) {
		this.handler = handler;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void run() {
		initComponents();
		this.pack();
		this.setVisible(true);
	}
	/**
	 * Initiate all required components of this user interface.
	 */
	private void initComponents(){
		this.setTitle("Credit Card Validator");
		createComponents();
		setLayout();
		addListener();
		addComponents();
	}
	/**
	 * Create initial components for the UI
	 */
	private void createComponents(){
		firstPanel = new JPanel();
		secondPanel = new JPanel();
		thirdPanel = new JPanel();
		fourthPanel = new JPanel();
		
		type = new JLabel("Card Type");
		number = new JLabel("Card Number");
		result = new JLabel("Result");
		
		String[] typeStrings = {"VISA", "MASTERCARD", "DINERS", "AMEX"};
		typeBox = new JComboBox<String>(typeStrings);
		
		numberF = new JTextField(15);
		resultF = new JTextField(19);
		resultF.setEditable(false);
		
		validate = new JButton("Validate");
	}
	/**
	 * Added created components to the window
	 */
	private void addComponents(){
		firstPanel.add(type);
		firstPanel.add(typeBox);
		secondPanel.add(number);
		secondPanel.add(numberF);
		thirdPanel.add(validate);
		fourthPanel.add(result);
		fourthPanel.add(resultF);
		
		container.add(firstPanel);
		container.add(secondPanel);
		container.add(thirdPanel);
		container.add(fourthPanel);
	}
	/**
	 * Add actionListener to a button.
	 */
	private void addListener(){
		validate.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				try {
					String cardType = typeBox.getSelectedItem().toString();
					String cardNumber = numberF.getText();
					response = handler.validate(cardType, cardNumber);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				resultF.setText(response);
			}
		});
	}
	/**
	 * Set the layout for overall window.
	 */
	private void setLayout(){
		container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		firstPanel.setLayout(new FlowLayout());
		secondPanel.setLayout(new FlowLayout());
		thirdPanel.setLayout(new FlowLayout());
		fourthPanel.setLayout(new FlowLayout());
	}
}
