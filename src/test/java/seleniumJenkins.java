import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class seleniumJenkins {

    public static WebDriver driver;

    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
        System.out.println("Title is : " +title);
    }
    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }



//    @Test
//    public void launchDriver() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        Thread.sleep(5000);
//        driver.manage().window().maximize();
//
//    }
//
//    @Test
//    public void Test1(){
//        driver.get("https://automationtalks.com/");
//        System.out.println("Test1 title is" + driver.getTitle());
//    }
//
//    @Test
//    public void Test2(){
//        driver.get("https://automationtalks.com/");
//        System.out.println("Test2 title is" + driver.getTitle());
//    }
//
//    @Test
//    public void Test3(){
//        driver.get("https://automationtalks.com/");
//        System.out.println("Test3 title is" + driver.getTitle());
//    }
//
//    @Test
//    public void closeBrowser(){
//
//        driver.quit();
//    }

//
}
