package Day10Assignment;

import java.util.Scanner;
import java.math.*;

public class EmployeeWage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		int randomCheck = (int) (Math.random() * 3);
		int Wage_per_Hour = 20;
		int Full_Day_Hour = 8;
		int Off_Day_Hour = 4;
		int Total_Wage = 0;

		if (randomCheck == 0) {
			System.out.println("Employee is absent");
		} else if (randomCheck == 1) {
			Total_Wage = Wage_per_Hour * Full_Day_Hour;

			System.out.println("Employee is present");
			System.out.println(Total_Wage);
		}

	}
}
