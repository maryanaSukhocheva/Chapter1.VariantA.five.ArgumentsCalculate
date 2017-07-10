/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.five.argumentscalculate.action;

/**
 *
 * @author SLAVA
 */
public class MathFunction {
    public MathFunction() { 
        }
    public int calcSum(String[] arguments){
        int sum =0;
        for (int i=0; i<arguments.length; i++) {
            sum=sum+Integer.valueOf(arguments[i]);
                }
        return sum;
    }
    
    public int calcMultiplication(String[] arguments){
        int mult =Integer.valueOf(arguments[0]);
        for (int i=1; i<arguments.length; i++) {
        mult=mult*Integer.valueOf(arguments[i]);
         }
        return mult;
    }
}
