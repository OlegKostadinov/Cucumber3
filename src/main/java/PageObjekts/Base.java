package PageObjekts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    public static WebDriver driver;

    public static  void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


    }
    public static void toHome(){
        driver.navigate().to("https://www.python.org/");
        driver.manage().window().maximize();

    }
    public static void driverClose(){

        driver.close();

    }
}
