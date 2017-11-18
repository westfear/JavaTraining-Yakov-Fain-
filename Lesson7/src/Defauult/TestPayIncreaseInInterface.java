package Defauult;

import com.practicaljava.lesson7.tryit.Contractor;
import com.practicaljava.lesson7.tryit.Employee;
import com.practicaljava.lesson7.tryit.Payable;
public class TestPayIncreaseInInterface {
    public static void main(String[]args) {
    	
    	Payable workers[]= new Payable[3];
    	        workers[0] = new Employee("Jhon");
    	        workers[1] = new Contractor("Bruce");
    	        workers[2] = new Employee("Ivan");
    	        for(Payable p : workers) {
    	        	((Payable)p).increasePay(30);
    	        }
    	
    }
}
