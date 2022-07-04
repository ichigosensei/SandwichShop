//Submitted By: Trinidad, Strawberry Ann L.
//Date: November 19, 2021
//Resources: https://www.tutorialspoint.com/how-can-we-add-insert-a-jcheckbox-inside-a-jtable-cell-in-java#:~:text=We%20can%20add%20or%20insert%20a%20checkbox%20inside,the%20getColumnClass%20%28%29%20method%20of%20a%20Class%20type.
//https://stackoverflow.com/questions/28326585/jframe-adding-checkboxes-to-the-screen
//https://www.javatpoint.com/java-jcheckbox
//https://youtu.be/3cuVqLxNBbc

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ValenciaSandwiches { // Start
	
	// Create a string for your meat and bread types
	String sandwichMeat [] = {"Steak", "Turkey", "Vegan"};
	String sandwichBread [] = {"Herb", "White", "Wheat"};
	
	//Create a frame, panels, labels, buttons, and check boxes
	JFrame VSandwiches;
	JPanel panel1, panel2, panel3, panel4, panel5, mainPanel;
	JList meats, breads;
	JLabel valenciaMeat, valenciaBread, sandwichAmount, addOns;
	JTextField sandwichesAmount;
	JButton totalAmount, exitValenciaSandwiches;
	JCheckBox addOn1, addOn2, addOn3, addOn4, addOn5, addOn6, addOn7, addOn8, addOn9, addOn10;
	
ValenciaSandwiches() {
	
	//Title of the window
	VSandwiches = new JFrame("Valencia Sandwiches"); 
	//Adding panels to the window
	panel1 = new JPanel ();
	panel2 = new JPanel ();
	panel3 = new JPanel ();
	panel4 = new JPanel ();
	panel5 = new JPanel ();
	mainPanel = new JPanel (); //Creating a main panel to store all panels
	
	//Adding the lists for meat and bread
	meats = new JList<String>(sandwichMeat);
	breads = new JList<String>(sandwichBread);
	
	//Adding the text for the labels
	valenciaMeat = new JLabel("Select the meat for your sandwich:");
	valenciaBread = new JLabel("Select the bread for your sandwich:");
	sandwichAmount = new JLabel("Amount Total:");
	addOns = new JLabel("Choose up to (3) Free Add-Ons:");
	
	//Creating the check boxes for the add-on ingredients of your sandwich
	addOn1 = new JCheckBox("Lettuce");
	addOn2 = new JCheckBox("Mayonnaise"); 
	addOn3 = new JCheckBox("Tomato");
	addOn4 = new JCheckBox("Cheese");
	addOn5 = new JCheckBox("Banana Peppers");
	addOn6 = new JCheckBox("Avocado");
	addOn7 = new JCheckBox("Jalapenos");
	addOn8 = new JCheckBox("Ketchup");
	addOn9 = new JCheckBox("Mustard");
	addOn10 = new JCheckBox("Valencia Sauce");
	
	//Creating a text field for the price of the sandwich of your choosing
	sandwichesAmount = new JTextField(5);
	
	//Adding the buttons to checkout or cancel the sandwich order
	totalAmount = new JButton("Checkout");
	exitValenciaSandwiches = new JButton("Cancel");
	
	//Designing the layout of your window by assigning panel orders
	panel1.add(valenciaMeat);
	panel1.add(meats);
	
	panel2.add(valenciaBread);
	panel2.add(breads);

	panel3.add(sandwichAmount);
	panel3.add(sandwichesAmount);

	panel4.add(totalAmount);
	panel4.add(exitValenciaSandwiches);
	
	panel5.add(addOns);
	panel5.add(addOn1);
	panel5.add(addOn2);
	panel5.add(addOn3);
	panel5.add(addOn4);
	panel5.add(addOn5);
	panel5.add(addOn6);
	panel5.add(addOn7);
	panel5.add(addOn8);
	panel5.add(addOn9);
	panel5.add(addOn10);
	
	//Adding them all to the main panel for code reference
	mainPanel.add(panel1);
	mainPanel.add(panel2);
	mainPanel.add(panel5);
	mainPanel.add(panel3);
	mainPanel.add(panel4);
	
	//Setting the grid layout and size
	mainPanel.setLayout(new GridLayout(4, 1));
	
	VSandwiches.add(mainPanel);
	VSandwiches.setVisible(true);
	VSandwiches.setSize(625, 525);
	
	//This will exit the program
	exitValenciaSandwiches.addActionListener(new ActionListener()
			
{
		
public void actionPerformed(ActionEvent ae) {
	System.exit(0);

}

	});

	totalAmount.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

	int findMeat = meats.getSelectedIndex();
	int findBread = breads.getSelectedIndex();

		//Prices are going to be based on the list choice by their place on the string
		if(findMeat == 0 && findBread == 0)
			sandwichesAmount.setText("$10.00");

		if(findMeat == 0 && findBread == 1)
			sandwichesAmount.setText("$8.00");

		if(findMeat == 0 && findBread == 2)
			sandwichesAmount.setText("$8.75");

		if(findMeat == 1 && findBread == 0)
			sandwichesAmount.setText("$9.00");

		if(findMeat == 1 && findBread == 1)
			sandwichesAmount.setText("$9.25");

		if(findMeat == 1 && findBread == 2)
			sandwichesAmount.setText("8.25");

		if(findMeat == 2 && findBread == 0)
			sandwichesAmount.setText("9.75");

		if(findMeat == 2 && findBread == 1)
			sandwichesAmount.setText("$8.50");

		if(findMeat == 2 && findBread == 2)
			sandwichesAmount.setText("7.95");

}

	});

		}

public static void main(String[] args) {

	new ValenciaSandwiches();

}
	} // End