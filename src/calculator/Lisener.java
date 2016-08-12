
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Lisener implements ActionListener {
    
    Frame calc;
    char action = ' ';
    double result = 0;
    
    Lisener(Frame calc){
        this.calc = calc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String dispFieldText = calc.textField.getText();
        double displayValue = 0;
        
        if (!"".equals(dispFieldText)){ try{
            displayValue = Double.parseDouble(dispFieldText);
            } catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Пожалуйста, введите число",
                        "Неправильный ввод",JOptionPane.PLAIN_MESSAGE);
            }
        }
        if (e.getSource() == calc.bc) {
            calc.textField.setText(null);
        }
        if (e.getSource() == calc.bPlus) {
            action = '+';
            result = displayValue;
            calc.textField.setText(null);
        } else if (e.getSource() == calc.bMinus) {
            action = '-';
            result = displayValue;
            calc.textField.setText(null);
        } else if (e.getSource() == calc.bMulti) {
            action = '*';
            result = displayValue;
            calc.textField.setText(null);
        } else if (e.getSource() == calc.bDiv) {
            action = '/';
            result = displayValue;
            calc.textField.setText(null);
        } else if (e.getSource() == calc.bsqrt){
            action = 's';
            result = Math.sqrt(displayValue);
            calc.textField.setText(Double.toString(result));
        } else if (e.getSource() == calc.bEqual){
                if (action == '+') {
                result += displayValue; 
                calc.textField.setText("" + result);
            } else if (action == '-') {
                result -= displayValue;
                calc.textField.setText("" + result);
            } else if (action == '*') {
                result *= displayValue; 
                calc.textField.setText("" + result);
            } else if (action == '/') {
                if (displayValue == 0){
                    JOptionPane.showMessageDialog(null, "На ноль делить нельзя");
                } else{
                result /= displayValue;
                calc.textField.setText("" + result);
                }  
            } 
        }
        
        if (e.getSource() == calc.b0){
            calc.textField.setText(calc.textField.getText()+"0");
        } else if (e.getSource() == calc.b1) {
            calc.textField.setText(calc.textField.getText()+"1");
        } else if (e.getSource() == calc.b2) {
            calc.textField.setText(calc.textField.getText()+"2");
        } else if (e.getSource() == calc.b3) {
            calc.textField.setText(calc.textField.getText()+"3");
        } else if (e.getSource() == calc.b4) {
            calc.textField.setText(calc.textField.getText()+"4");
        } else if (e.getSource() == calc.b5) {
            calc.textField.setText(calc.textField.getText()+"5");
        } else if (e.getSource() == calc.b6) {
            calc.textField.setText(calc.textField.getText()+"6");
        } else if (e.getSource() == calc.b7) {
            calc.textField.setText(calc.textField.getText()+"7");
        } else if (e.getSource() == calc.b8) {
            calc.textField.setText(calc.textField.getText()+"8");
        } else if (e.getSource() == calc.b9) {
            calc.textField.setText(calc.textField.getText()+"9");
        } else if (e.getSource() == calc.b10) {
            calc.textField.setText(calc.textField.getText()+".");
        } 
           
    }
    
}
