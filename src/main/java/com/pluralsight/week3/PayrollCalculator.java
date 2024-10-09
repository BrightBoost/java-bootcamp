package com.pluralsight.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
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

    public static void calculatorWithoutArray(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            //skip first line with column names
            br.readLine();
            String line;

            while((line = br.readLine()) != null) {
                String[] employeeData = line.split("\\|");
                Employee e = new Employee(Integer.parseInt(employeeData[0]), employeeData[1], Double.parseDouble(employeeData[2]), Double.parseDouble(employeeData[3]));
                e.display();
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
