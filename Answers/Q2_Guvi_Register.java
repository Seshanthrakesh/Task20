package com.task20.Answers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_Guvi_Register {
	static WebDriver driver=null;
	public static void main(String[] args) {
		driver=new ChromeDriver();//Opens the Chrome Browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();//maximize the browser window
		driver.navigate().to("https://www.guvi.in/");//Navigate to a url

		//Locates the signUp and click on the Sign Button 
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

		//Locate the First Name and Enter the firstName
		driver.findElement(By.id("firstName")).sendKeys("Joseph");


		//Locate the Last Name and Enter the LastName 
		driver.findElement(By.id("lastName")).sendKeys("vijay");

		//Locate the email Id Field and Enter the Valid Email Id
		driver.findElement(By.id("emailInput")).sendKeys("testuser1234@gmail.com");

		//Locate the password field and Enter the Valid password
		driver.findElement(By.id("passwordInput")).sendKeys("testuser12345");

		//Locate the Mobile Number and Enter the mobile Number
		driver.findElement(By.id("mobileNumberInput")).sendKeys("9876543210");

		//Locate the Last Name and Enter the LastName 
		driver.findElement(By.id("signup")).click();

		//Gets the title of the current page and prints 
		String Logintitle=driver.getTitle();
		System.out.println("Page Title : "+Logintitle);

		//Verifies that New User Successfully SignUp 
		if(Logintitle.equalsIgnoreCase("Sign Up | GUVI")) 
			System.out.println("SignUp Successfull");
		else
			System.out.println("SignUp Unsuccessfull");

		//Navigate back from the current page 
		driver.navigate().back();

		//Locates the Login and Click on the Login button
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		//Locate the Email Id field and Enter the Valid Email Id
		driver.findElement(By.id("login_email")).sendKeys("testuser1234@gmail.com");

		//Locate the password field and Enter the Valid password
		driver.findElement(By.id("login_password")).sendKeys("testuser12345");

		//click on the Login Button 
		driver.findElement(By.id("login_button")).click();

		//Gets the title of the current page and prints 
		String title=driver.getTitle();
		System.out.println("Page Title : "+title);

		//Verifies the User is Logged In Successfully
		if(title.equalsIgnoreCase("Sign In | GUVI")) 
			System.out.println("Login Successfull");
		else
			System.out.println("Login Unsuccessfull");


		//close the browser
		driver.quit();
	}

}
