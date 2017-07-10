/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.five.argumentscalculate.action;

/**
 *
 * @author SLAVA
 */
public class WorkInputOutputData {
    public boolean checkNumbers(String[] arguments){
       boolean check = true;
       int number = 0;
       for (int i=0; i<arguments.length; i++) {
         try {
            number= Integer.valueOf(arguments[i]);
            }  catch (NumberFormatException e) { 
                check = false;
                System.err.println("Неверный формат числа!");  
            }
       }
       return check;
    }
    
    
}
