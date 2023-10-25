package com.task20.Answers;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_datapicker {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();//Opens the Chrome Browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();//Maximize the Browser Window
		driver.navigate().to("https://jqueryui.com/datepicker/");//Navigate  to a Url

		//Locate the WebElement and Switch to iframe
		WebElement wb =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(wb);

		//Locate the datePicker and perform click Operation
		driver.findElement(By.id("datepicker")).click();

		//Locate the WebElement and click on the Next button
		driver.findElement(By.xpath("//a[@title='Next']")).click();

		//Locate date WebElement and click on the date 
		WebElement date=driver.findElement(By.xpath("//a[text()='22']"));
		date.click();

		//Gets date as String and prints the Console
		String dateText=date.getText();
		System.out.println("Selected Date : "+dateText);

		//Close the Browser Window
		driver.close();

		//Quit the WebDriver Instance
		driver.quit();

	}
}
