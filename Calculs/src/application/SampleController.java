package application;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType; 



public class SampleController {

    @FXML
    private Button add;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;

    @FXML
    private Label lblrest;

    @FXML
    private Button sous;
    
    @FXML
    private Button multi;
    
    @FXML
    private Button div;
    
    // gestion des entrées numériques pour les textes 
    
    public void checkNum(TextField a) 
    {
    	try {
			int nbr= Integer.parseInt(a.getText());
		} catch (NumberFormatException e) 
    	{
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écrire un nombre");
			alert.show();
			a.requestFocus();
		}
    
    	
    }
     
    @FXML
    void verifText(KeyEvent e)
    {
    	TextField txt=(TextField)e.getSource();
    	checkNum(txt);
    }
    
    @FXML
    void calculer(ActionEvent e)
    {
     int num1=Integer.parseInt(txt1.getText());
     int num2=Integer.parseInt(txt2.getText());
     int res=0;
     Button btn=(Button)e.getSource();
     
     if(btn.getId().equals("add"))
    	 res=num1+num2;
     else
    	  if(btn.getId().equals("sous"))
        	 res=num1-num2;
    	  else
        	  if(btn.getId().equals("multi"))
            	 res=num1*num2;
        	  else
            	  if(btn.getId().equals("div"))
                	 res=num1/num2;
     
     DecimalFormat nformat = new DecimalFormat("#0.00");
     lblrest.setText(nformat.format(res));
 
     
     
    }
    
}




