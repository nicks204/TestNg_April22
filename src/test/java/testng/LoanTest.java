package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoanTest {
	
	
	@BeforeTest(alwaysRun=true)
	public void method3() {
		
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		
		System.out.println("Inside method1");
	}
	
	
	@Test(groups= {"Sanity"}, priority=0, description="This test is for Home loan")
	public void HomeLoanTest() {
		
		System.out.println("Inside HomeLoan Test");
	}
	
	@Test(enabled=true, priority=1, description="This test is for Car loan")
	public void CarLoanTest() {
		
		System.out.println("Inside CarLoan Test");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("Inside method2");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4() {
		
		System.out.println("Inside After Test");
	}

}
