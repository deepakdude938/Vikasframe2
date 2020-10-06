package com.stepdefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EvenOddStepdefinations {
	int a, b, res;
	@Given("User has two numbers {int} and {int}")
	public void user_has_two_numbers_and(Integer int1, Integer int2) {
		a=int1;
		b=int2;
	    
	}

	@When("User add both the numbers")
	public void user_add_both_the_numbers() {
		res=a+b;
	  
	}

	@Then("Addition of result must be even")
	public void addition_of_result_must_be_even() {
		System.out.println(res);
	    
	}
	
	
	}
