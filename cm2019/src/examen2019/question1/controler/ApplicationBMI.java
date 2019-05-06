package examen2019.question1.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import examen2019.question1.model.Person;
import examen2019.question1.view.JFrameBMI;

public class ApplicationBMI implements ActionListener {
	private JFrameBMI jFrameBMI;
	private Person person;
	
	public ApplicationBMI() {
		jFrameBMI = new JFrameBMI();
		jFrameBMI.addAction(this);
		person = new Person();
	}
	public static void main(String[] args) {
		ApplicationBMI application = new ApplicationBMI();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		person.setHeight(jFrameBMI.getHeight_());
		person.setMass(jFrameBMI.getMass());
		jFrameBMI.setResult(person.getBMI());
	}
}
