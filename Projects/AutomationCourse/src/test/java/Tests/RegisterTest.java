package Tests;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ro.sit.course.course06_07.MyCustomException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegisterTest {
    private WebDriver chromeDriver;

    @FindBy(css = "a[href*='signup']")
    private WebElement signUpButtonElement;

    @FindBy(css = "input#terms+label")
    private WebElement termsCheckboxElement;

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement submitRegistrationButtonElement;

    @DataProvider(name = "RegisterDataProvider")
    public Iterator<Object[]> registerDataProvider() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"", "Please enter your username", ""});
        dp.add(new String[]{"valentina.popa", "", "Invalid username!"});
        return dp.iterator();
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
    }

    @AfterMethod
    public void quit() {
        chromeDriver.quit();
    }

    @Test
    public void testMissingUsername() throws MyCustomException {
        WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
        loginElement.click();

        WebElement signUpElement = chromeDriver.findElement(By.linkText("here"));
        signUpElement.click();

        WebElement usernameElement = chromeDriver.findElement(By.id("username"));
        usernameElement.sendKeys("");

        WebElement passwordElement = chromeDriver.findElement(By.id("password"));
        passwordElement.sendKeys("password");

        WebElement termsElement = chromeDriver.findElement(By.cssSelector("input#terms+label"));
        WebElement submitElement = chromeDriver.findElement(By.cssSelector("button[class='btn btn-primary']"));

        JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
        jse.executeScript("arguments[0].scrollIntoView()", termsElement);

        WebDriverWait wait = new WebDriverWait(chromeDriver, 15);
        wait.until(ExpectedConditions.visibilityOf(termsElement));

        int currentRetry = 0;
        while (currentRetry < 50) {
            try {
                ((JavascriptExecutor) chromeDriver).executeScript(
                        "arguments[0].scrollIntoView(true);", termsElement);
                termsElement.click();
                break;
            } catch (ElementClickInterceptedException e) {
                currentRetry++;
            }
        }
        if (currentRetry >= 50) {
            throw new MyCustomException("Max retry reached");
        }

        WebDriverWait wait2 = new WebDriverWait(chromeDriver, 15);
        wait2.until(ExpectedConditions.visibilityOf(submitElement));

        currentRetry = 0;
        while (currentRetry < 50) {
            try {
                ((JavascriptExecutor) chromeDriver).executeScript(
                        "arguments[0].scrollIntoView(true);", submitElement);
                submitElement.click();
                break;
            } catch (ElementClickInterceptedException e) {
                currentRetry++;
            }
        }
        if (currentRetry >= 50) {
            throw new MyCustomException("Max retry reached");
        }

        WebElement errorElement = chromeDriver.findElement(By.cssSelector("small.form-error"));

        Assert.assertTrue("Error message is not displayed", errorElement.isDisplayed());
        Assert.assertEquals("Error message text is incorrect", "Please choose a username", errorElement.getText());
    }
}
