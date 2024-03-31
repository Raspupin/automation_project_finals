package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selleniun_start_projects.Selleniun_start_projects.IsATriangleTesting.TriangleType;

public class CalcTesting {
	static WebDriver browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","M:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/calculator.html");
		
	  }
	 @Test
	 public void Test1() throws InterruptedException {
		 		String number1 = "1";
		 		String number2 = "2";
				String expectedSum = String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonplus"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test2() throws InterruptedException {
		 		String number1 = "9";
		 		String number2 = "-5";
		 		WebElement minusClick = browser.findElement(By.id("buttonminus"));
				String expectedSum = String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonplus"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				minusClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }	
	 @Test
	 public void Test3() throws InterruptedException {
		 		String number1 = "5";
		 		String number2 = "3";
				String expectedSum = String.valueOf(Integer.parseInt(number1) - Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonminus"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test4() throws InterruptedException {
		 		String number1 = "-3";
		 		String number2 = "2";
		 		WebElement minusClick = browser.findElement(By.id("buttonminus"));
				String expectedSum = String.valueOf(Integer.parseInt(number1) - (Integer.parseInt(number2)));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonminus"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				Thread.sleep(3000); // Delay for 1 second (1000 milliseconds)
				minusClick.click();
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test5() throws InterruptedException {
		 		String number1 = "2";
		 		String number2 = "5";
				String expectedSum = String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonmultiply"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test6() throws InterruptedException {
		 		String number1 = "-5";
		 		String number2 = "2";
		 		WebElement minusClick = browser.findElement(By.id("buttonminus"));
				String expectedSum = String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttonmultiply"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				Thread.sleep(3000); // Delay for 1 second (1000 milliseconds)
				minusClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test7() throws InterruptedException {
		 		String number1 = "4";
		 		String number2 = "2";
				String expectedSum = String.valueOf(Integer.parseInt(number1) / Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttondivide"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test8() throws InterruptedException {
		 		String number1 = "-8";
		 		String number2 = "2";
		 		WebElement minusClick = browser.findElement(By.id("buttonminus"));
				String expectedSum = String.valueOf(Integer.parseInt(number1) / Integer.parseInt(number2));
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttondivide"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				Thread.sleep(3000); // Delay for 1 second (1000 milliseconds)
				minusClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 @Test
	 public void Test9() throws InterruptedException {
		 		String number1 = "5";
		 		String number2 = "0";
				String expectedSum = "Infinity";
				WebElement num1Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number1)))));
				WebElement actionClick = browser.findElement(By.id("buttondivide"));
				WebElement num2Click = browser.findElement(
						By.id("button0"+String.valueOf(Math.abs(Integer.parseInt(number2)))));
				WebElement equals = browser.findElement(By.id("buttonequals"));
				WebElement reset = browser.findElement(By.id("buttonallclear"));
				reset.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num1Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				actionClick.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				num2Click.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				equals.click();
				Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calculated-display")));
			    String textBoxValue = outputTextBox.getAttribute("value");
				assertEquals(expectedSum, textBoxValue);
	  }
	 

}
