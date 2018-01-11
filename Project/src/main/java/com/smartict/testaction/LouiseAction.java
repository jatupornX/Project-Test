package com.smartict.testaction;

import com.opensymphony.xwork2.ActionSupport;

public class LouiseAction extends ActionSupport{
	
	private LouiseModel myModel;

	public String getNameInfo(){
		
		return SUCCESS;
	}
	
	/**
	 * GETTER & SETTER
	 */
	public LouiseModel getMyModel() {
		return myModel;
	}

	public void setMyModel(LouiseModel myModel) {
		this.myModel = myModel;
	}

}
