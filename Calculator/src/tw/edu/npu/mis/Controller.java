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
    Calculator mCal;
    newjframe mnewjframe;
    /**
     * 讓Controller了解到cal的方法
     * @param cal 
     */
    public Controller(Calculator cal)
    {
        mCal = cal;
    }
    /**
     * Operator 是運算符號，傳遞到newjframe
     * @param oper 
     */
    public void Operator(String oper)
    {
        mCal.notation(oper);
    }
    /**
     * Data是數字，傳遞到newjframe
     * @param da 
     */
    public void Data(String da)
    {
        mCal.appendDigit(Integer.parseInt(da));
        
    }
    /**
     * 在Controller中，新增jframe
     * @param jframe 
     */
    public void addView(newjframe jframe){
		mnewjframe = jframe;
                mCal.getDisplay();
   
    }
}
