package Day10Assignment;

import java.util.Scanner;
import java.math.*;

public class EmployeeWage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		int status = (int) (Math.random()* 3);
		int Wage_per_Hour = 20;
		int Full_Day_Hour = 8;
		int Part_Time_Hour = 4;
		int Total_Wage = 0;

		switch (status) {
		case 0: {
			System.out.println("Employee is absent");
			break;
			
		}
		case 1: {
			System.out.println("Part time Hour");
			Total_Wage = Wage_per_Hour * Part_Time_Hour;
			break;
			
		}
		default: {
			Total_Wage = Wage_per_Hour * Full_Day_Hour;
			System.out.println("Employee is present");
			System.out.println(Total_Wage);
		}
		}
	}
}
