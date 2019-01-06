package com.myClass;
public class SingletonClass{
	  private static SingletonClass myObj=new SingletonClass();
	  private SingletonClass(){}
	  public static SingletonClass getObject(){
	  	 return myObj;
	  }
	  public String display(){
	  	 return "shahnawaz";
	  }
}