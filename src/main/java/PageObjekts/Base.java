package PageObjekts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;

    public static  void setUp(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(options);
    }
    public static void toHome(){
        driver.get("https://www.python.org/");
        driver.manage().window().maximize();

    }
    public static void driverClose() {

        driver.close();

    }
}
