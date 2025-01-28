package RahulShettyAcademy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class rAcademy {

    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void chromeDriverSetUp(){

        //Setup the chrome driver
        WebDriverManager.chromedriver().setup();
        //Initialize the chrome driver
        driver = new ChromeDriver();
        //Maximise the browser window
        driver.manage().window().maximize();
        //Navigate to the website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
    @Test(groups = {"Regression"})
    public void verifyTitle(){
        String actualTitle = "Practice Page";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Reporter.log("The page title is verified");

    }
    @Test(groups = {"Regression"})
    public void verifyOptions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Find the element
        //Select se = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown-class-example"))));
        Select se = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dropdown-class-example"))));
        se.selectByVisibleText("Option1");
        Assert.assertEquals("Option1",se.getFirstSelectedOption().getText());
        Reporter.log("The Dropdown select options are verified",true);
    }
    @Test(groups = {"Regression"})
    public void verifyForm(){
        //Find the element in the check box dropdown
        driver.findElement(By.id("checkBoxOption1")).click();
        //Assert the condition
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Reporter.log("The checkbox is selected",true);
    }
    @AfterMethod
    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
