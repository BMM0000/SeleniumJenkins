import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumJenkins {

    public static WebDriver driver;

    @BeforeTest
    public void navigateToUrl(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\D.S.Mistry\\IdeaProjects\\SeleniumWithJenkins\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

        // Using implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Get the title of the page
        String actualTitle = driver.getTitle();

        // Define the expected title (you can find the actual title by inspecting the page)
        String expectedTitle = "The Internet";

        // Verify the title using Assert.assertEquals()
        Assert.assertEquals(actualTitle, expectedTitle, "Title verified!");

    }

    @Test
    public void addLoginDetails()
    {
        // Enter the username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Click the login button
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));
        loginButton.click();

        // Print success or failure
        System.out.println("Before checking success message");
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        System.out.println("Login Successful: " + successMessage.isDisplayed());
        System.out.println("After checking success message");

        driver.quit();
    }
}
