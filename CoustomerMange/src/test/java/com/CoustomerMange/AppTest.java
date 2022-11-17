package com.CoustomerMange;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;


public class AppTest 
{
	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int Contact=0;
		int Cust_Name=0;
		if(Contact<=1)
		{
			System.out.println("Customer detail added");
		}
		else
		{
			System.out.println("failled");
		}
		if(Cust_Name<=1)
		{
			System.out.println("Customer detail added");
		}
		else
		{
			System.out.println("failled");
		}
	}
}

