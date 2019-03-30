package mvc_v2;



public class MVCBMI {
    
    public static void main(String[] args) {
    	BMIView theView = new BMIView();
    	Person theModel = new Person();
        BMIController theController = new BMIController(theView,theModel);     
        theView.setVisible(true); 
    }
}