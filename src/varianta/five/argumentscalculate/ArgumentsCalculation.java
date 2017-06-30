/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.five.argumentscalculate;

import varianta.five.argumentscalculate.action.Action;

/**
 *
 * @author SLAVA
 */
public class ArgumentsCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Action act=new Action();
        if (act.CheckNumbers(args)==true) {
            int calcSum =act.CalcSum(args);
            int calcMult=act.CalcMultiplication(args);
            System.out.println("Сумма аргументов равна " + String.valueOf(calcSum));
            System.out.println("Произведение аргументов равно " + String.valueOf(calcMult));
        }


    }
}
