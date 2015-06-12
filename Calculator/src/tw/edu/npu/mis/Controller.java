/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;
import tw.edu.npu.mis.Calculator.Operator;
/**
 *
 * @author STP
 */
public class Controller {
    /**
     * 宣告變數
     */
    Calculator Cal;
    newjframe mnewjframe;
    /**
     * 讓Contoller
     * @param cal 
     */
    public Controller(Calculator cal)
    {
        Cal = cal;
    }
    
    public void setOperator(String oper)
    {
        Cal.notation(oper);
    }
    public void setData(String da)
    {
        Cal.appendDigit(Integer.parseInt(da));
        
    }
    public void addView(newjframe jframe){
		mnewjframe = jframe;
                Cal.getDisplay();
   
    }
}
