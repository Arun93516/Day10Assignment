package Day10Assignment;

import java.math.*;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		Random status = new Random();
		int RandomNumber = status.nextInt(2);
		int day = 20, Hours = 100;
		int Wage_per_Hour = 20, Full_Day_Hour = 8;
		int Part_Time_Hour = 8, Total_Wage = 0;
		int Total_Wage_Sum = 0;
		while (day != 0 && Hours != 0) {
			switch (RandomNumber) {
			case 0: {
				System.out.println("Employee is absent");
				System.out.println(Total_Wage);
				break;
			}
			case 1: {
				System.out.println("Part time Hour");
				Total_Wage = Wage_per_Hour * Part_Time_Hour;
				Total_Wage_Sum =Total_Wage_Sum + Total_Wage;
				System.out.println(Total_Wage_Sum);
				break;
			}
			default: {
				Total_Wage = Wage_per_Hour * Full_Day_Hour;
				System.out.println("Employee is present");
				System.out.println(Total_Wage);
				break;

			}
			}
			day--;
			Hours--;
		}
	}

}
