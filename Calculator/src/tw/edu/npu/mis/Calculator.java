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
    /**
     * 宣告變數
     */
    int x,y;     
    
    /**
     * number 是運算過程的結果
     * Access 是存取數字的地方
     * Determine 是判斷要用哪一個計算方法
     */
    Controller mco;     
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
    /**
     * appendDigit是做數字的輸入，按鈕按下數字，就能讓數字出現
     * @param digit 
     */
    public void appendDigit(int digit) {          //數字添加
        // TODO code application logic here
      number += String.valueOf(digit);
      getDisplay();
    }
    
    public void appendDot() {                   //小數點
        // TODO code application logic here
    }
    /**
     * 判斷各種運算的功能
     * @param operator 
     */
    public void performOperation(Operator operator) {    //操作執行
        // TODO code application logic here
        switch(operator){
            case CLEAR:
                number = "0";
                getDisplay();
                number = "";
                break;
            case CLEAR_ENTRY:
                break;
            case BACKSPACE:
                break;
            case EQUAL:
               switch(Determine){
                    case "+":
                        y= Integer.parseInt(number);
                        number = String.valueOf(x+y);
                        getDisplay();
                        number ="";
                        break;
                    case "-":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x-y);
                        getDisplay();
                        number ="";
                         break;
                    case "*":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x*y);
                        getDisplay();
                        number ="";
                         break;
                    case "/":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x/y);
                        getDisplay();
                        number ="";
                         break;
               }
                break;
            case PLUS:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "+";
                break;
            case MINUS:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "-";
                break;
            case TIMES:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "*";
                break;
            case OVER:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "/";
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
    /**
     * 獲取運算結果
     * @return 
     */
    public String getDisplay() {                //顯示器獲取
        // TODO code application logic here
        setChanged();
        notifyObservers(number);
        return null;
    }
    /**
     * Operator是在存取運算符號，而Contoller抓取這邊的運算符號去執行功能
     * @param tnt 
     */
    public void notation(String tnt)
    {
        if(tnt == "+") performOperation(Operator.PLUS);
        if(tnt == "=") performOperation(Operator.EQUAL);
        if(tnt == "C") performOperation(Operator.CLEAR);
        if(tnt == "-") performOperation(Operator.MINUS);
        if(tnt == "*") performOperation(Operator.TIMES);
        if(tnt == "/") performOperation(Operator.OVER);
    } 
    }


