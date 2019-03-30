package mvc_v1;

import mvc_v1.controler.CalculatorController;
import mvc_v1.model.Person;
import mvc_v1.vue.BMIView;

/**
 * @author mnv
 *
 */
public class MVCMain {
    
    public static void main(String[] args) {
    	
    	BMIView theView = new BMIView();
        
    	Person theModel = new Person();
        
        CalculatorController theController = new CalculatorController(theView,theModel);
        
        theView.setVisible(true);
        
    }
}