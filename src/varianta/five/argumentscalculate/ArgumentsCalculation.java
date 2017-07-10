/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.five.argumentscalculate;

import varianta.five.argumentscalculate.action.MathFunction;
import varianta.five.argumentscalculate.action.WorkInputOutputData;

/**
 *
 * @author SLAVA
 */
public class ArgumentsCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WorkInputOutputData act=new WorkInputOutputData();
        if (act.checkNumbers(args)==true) {
            MathFunction function = new MathFunction(); 
            int calcSum = function.calcSum(args);
            int calcMult= function.calcMultiplication(args);
            System.out.println("Сумма аргументов равна " + String.valueOf(calcSum));
            System.out.println("Произведение аргументов равно " + String.valueOf(calcMult));
        }


    }
}
