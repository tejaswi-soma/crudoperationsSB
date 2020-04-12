package com.example.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.employee.model.Employee;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeStepDef extends EmployeeApplicationTests{
	
	Employee response ;
    String url = DEFAULT_URL + "employees/";

@When("the client calls  \\/employee")
public void the_client_calls_employee() {
    response = restTemplate.getForObject(url, Employee.class);
    System.out.println(response);
   }
@Then("the client receives answer as {Long},{string},{string},{string}")
public void the_client_receives_answer_as(Long id, String firstName, String lastName, String email) {
   
    Employee result = restTemplate.getForObject(url, Employee.class);
    assertEquals(id, result.getId());
    assertEquals(firstName, result.getFirstName());
    assertEquals(lastName, result.getLastName());
    assertEquals(email, result.getEmail());
    
}


}
