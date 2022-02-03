package com.colections.emp;

import java.sql.SQLException;
import java.util.List;

public class app {
    public static void main(String[] args) throws SQLException {
        new Employee("john", "smith");
        EmployeeDao dao = new EmployeeDao();
        // save
//        dao.create(new Employee("Maria", "Popescu"));
        // update
        // get all
        List<Employee> employeeList = dao.readAll();
        for(Employee emp: dao.readAll()){
            System.out.println(emp);
        };

        Employee emp = employeeList.get(0);
        emp.setName("Jill");
        emp.setSurname("Smith");

        dao.update(emp);

        // delete
    }
}
