package epam.CleanCode_Task4;

import java.io.*;      
abstract public class TotalAmount{  
         protected double rate;  
         abstract void getRate();  
   

		public double calculateBill(double sqrfoot) {
			return sqrfoot*rate;
		}  
}  