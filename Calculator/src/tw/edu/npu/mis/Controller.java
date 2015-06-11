/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author STP
 */
public class Controller {
    newjframe mModel;
    Calculator mView;
    public Controller(newjframe model)
    {
        mModel = model;
    }
    public void setData(String da)
    {
        mModel.appendDigit(Integer.parseInt(da));
        
    }
     public void setOperator(String oper)
    {
        mModel.setOperator(oper);
    }
    
    public void addView(Calculator view){
		mView = view;
                mModel.getDisplay();
   
    }
}
