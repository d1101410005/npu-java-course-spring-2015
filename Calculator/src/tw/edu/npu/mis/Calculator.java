/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import static org.omg.CORBA.ORB.init;

/**
 * The model class of the calculator application.
 */
public class Calculator extends java.util.Observable{

    
    String number = "";
    String Access = "";
    String Determine = "";
    
    
    
    /**
     * The available operators of the calculator.
     */
    public enum Operator {     //運算子
        CLEAR,       // C
        CLEAR_ENTRY, // CE
        BACKSPACE,   // ⌫
        EQUAL,       // =
        PLUS,        // +
        MINUS,       // -
        TIMES,       // ×
        OVER,        // ⁄
        PLUS_MINUS,  // ±
        RECIPROCAL,  // 1/x
        PERCENT,     // %
        SQRT,        // √
        MEM_CLEAR,   // MC
        MEM_SET,     // MS
        MEM_PLUS,    // M+
        MEM_MINUS,   // M-
        MEM_RECALL   // MR
    }
    
    public void appendDigit(int digit) {          //數字添加
        // TODO code application logic here
      number += String.valueOf(digit);
      getDisplay();
    }
    
    public void appendDot() {                   //小數點
        // TODO code application logic here
        
    }
    
    public void performOperation(Operator operator) {    //操作執行
        // TODO code application logic here
        switch(operator){
            case CLEAR:
                break;
            case CLEAR_ENTRY:
                break;
            case BACKSPACE:
                break;
            case EQUAL:
                break;
            case PLUS:
                performOperation(Operator.EQUAL);
                if(number.length() != 0) Access = number;
                number = "";
                Determine = "+";
                
                break;
            case MINUS:
                break;
            case TIMES:
                break;
            case OVER:
                break;
            case PLUS_MINUS:
                break;
            case RECIPROCAL:
                break;
            case PERCENT:
                break;
            case SQRT:
                break;
            case MEM_CLEAR:
                break;
            case MEM_SET:
                break;
            case MEM_PLUS:
                break;
            case MEM_MINUS:
                break;
            case MEM_RECALL:
                break;
            
                
        
        }
    }
    
    public String getDisplay() {                //顯示器獲取
        // TODO code application logic here
        setChanged();
        notifyObservers(number);
        return null;
    }

    
    }


