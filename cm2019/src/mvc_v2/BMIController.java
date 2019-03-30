package mvc_v2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class BMIController implements ActionListener {

	private BMIView theView;
	private Person person; // c'est notre modèle
	private Balance balance;
	

	public BMIController(BMIView theView, Person person) {
		this.theView = theView;
		this.person = person;
		this.balance = new Balance(person);
		this.theView.addCalculateListener(this);
		person.addObserver(theView);
	}

	public void actionPerformed(ActionEvent e) {
		double height, weight = 0;
		height = theView.getTheHeight();
		weight = theView.getTheWeight();
		person.setHeight(height);
		person.setMass(weight);
		theView.setCalcSolution(person.getBMI());
	}

}