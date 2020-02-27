package com.tyss.capgemini.abstraction;

import Polymorphism.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface // implements MethodsInterface :-> it wont show to add unimplemented methods.
//Mandatory to make abstract class if we have abstract method inside the class.
{
	abstract String display();
	
	abstract String print();

}
