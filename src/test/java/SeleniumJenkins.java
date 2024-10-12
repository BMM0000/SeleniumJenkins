import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SeleniumJenkins {

    public static WebDriver driver;
    private static final Logger logger = Logger.getLogger(SeleniumJenkins.class.getName());


    @Test
    public void launchDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\D.S.Mistry\\IdeaProjects\\SeleniumWithJenkins\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void Test1(){
        driver.get("https://automationtalks.com/");
        logger.info("Test1 title is" + driver.getTitle());
    }

    @Test
    public void Test2(){
        driver.get("https://automationtalks.com/");
        logger.info("Test2 title is" + driver.getTitle());
    }

    @Test
    public void Test3(){
        driver.get("https://automationtalks.com/");
        logger.info("Test3 title is" + driver.getTitle());
    }

    @Test
    public void closeBrowser(){

        driver.quit();
    }

//    @Test
//    public void navigateToUrl(){
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\D.S.Mistry\\IdeaProjects\\SeleniumWithJenkins\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("http://the-internet.herokuapp.com/login");
//
//        // Using implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // Get the title of the page
//        String actualTitle = driver.getTitle();
//
//        // Define the expected title (you can find the actual title by inspecting the page)
//        String expectedTitle = "The Internet";
//
//        // Verify the title using Assert.assertEquals()
//        Assert.assertEquals(actualTitle, expectedTitle, "Title verified!");
//
//    }
//
//    @Test
//    public void addLoginDetails()
//    {
//        // Enter the username
//        WebElement usernameField = driver.findElement(By.id("username"));
//        usernameField.sendKeys("tomsmith");
//
//        // Enter the password
//        WebElement passwordField = driver.findElement(By.id("password"));
//        passwordField.sendKeys("SuperSecretPassword!");
//
//        // Click the login button
//        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));
//        loginButton.click();
//
//        // Print success or failure
//        System.out.println("Before checking success message");
//        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
//        System.out.println("Login Successful: " + successMessage.isDisplayed());
//        System.out.println("After checking success message");
//
//        driver.quit();
//    }
}
