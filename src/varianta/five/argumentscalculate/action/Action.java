/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.five.argumentscalculate.action;

/**
 *
 * @author SLAVA
 */
public class Action {
    public boolean CheckNumbers(String[] arguments){
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
    
    public int CalcSum(String[] arguments){
        int sum =0;
        for (int i=0; i<arguments.length; i++) {
            sum=sum+Integer.valueOf(arguments[i]);
                }
        return sum;
    }
    
    public int CalcMultiplication(String[] arguments){
        int mult =Integer.valueOf(arguments[0]);
        for (int i=1; i<arguments.length; i++) {
        mult=mult*Integer.valueOf(arguments[i]);
         }
        return mult;
    }
}
