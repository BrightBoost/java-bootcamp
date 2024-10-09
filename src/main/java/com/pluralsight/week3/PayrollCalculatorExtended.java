package com.pluralsight.week3;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculatorExtended {
    public static void main(String[] args) {
        calculatorWithoutArray();
    }

    // exercise page 33
    public static void calculatorWithoutArray() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file employee file to process: ");
            String fileName = scanner.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String payrollFileName = scanner.nextLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(payrollFileName + ".csv"));
            bw.write("id|name|grosspay\n");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            //skip first line with column names
            br.readLine();
            String line;

            while((line = br.readLine()) != null) {
                String[] employeeData = line.split("\\|");
                Employee e = new Employee(Integer.parseInt(employeeData[0]), employeeData[1], Double.parseDouble(employeeData[2]), Double.parseDouble(employeeData[3]));
                bw.write(e.toCsvLine());
            }
            br.close();
            bw.close();
            scanner.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void withArrays() {
        try {
            // read the csv file to get the nr of employees, to use for arr creation
            BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
            int nrOfEmployees = 0;
            while(br.readLine() != null) {
                nrOfEmployees++;
            }
            br.close();

            Employee[] employees = new Employee[nrOfEmployees - 1];

            // read csv file again, to get the employees
            br = new BufferedReader(new FileReader("employees.csv"));

            // turn csv file into employees arr
            String line;
            //skip first line with column names
            br.readLine();
            int index = 0;
            while((line = br.readLine()) != null) {
                String[] employeeData = line.split("\\|");
                employees[index] = new Employee(Integer.parseInt(employeeData[0]), employeeData[1], Double.parseDouble(employeeData[2]), Double.parseDouble(employeeData[3]));
                index++;
            }

            // display info for each employee
            for(Employee e: employees) {
                e.display();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
