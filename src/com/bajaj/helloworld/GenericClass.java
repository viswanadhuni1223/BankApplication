package com.bajaj.helloworld;
class Employee<T,V,Z>
{
//fixed int
 private T id;
 //fixed String
 private V name;
 private Z salary;
 
 Employee(T id, V name,  Z salary)
 {
	this.id=id;
	this.name=name;
	this.salary=salary;
 }
}

public class GenericClass {
	public static void main(String args[])
	{
                            //long        //long
       Employee<Long,String,Long> e2=new Employee(100,"pavan",100);
    
       Employee<Double,String,Long> e3=new Employee(100.00,"nikhil",100);
       
       
       
	}

}
