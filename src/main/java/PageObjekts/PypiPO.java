package PageObjekts;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PypiPO extends Base{


public static String Pypilink = "//*[@id=\"top\"]/nav/ul/li[4]/a";
public static String Pypifield = "//*[@id=\"search\"]";
public static String Pypiconf = "//*[@id=\"content\"]/div[1]/div/form/button/i";

public static void pypiclick() throws InterruptedException {
    driver.findElement(By.xpath(Pypilink)).click();
    Thread.sleep(4500);

    String winHandleBefore = driver.getWindowHandle();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }




}
 public static void pypienter() throws  InterruptedException{
    driver.findElement(By.xpath(Pypifield)).sendKeys("try");
    Thread.sleep(2500);
}
public static void pypiconf() {
    driver.findElement(By.xpath(Pypiconf)).click();
}
    public static void checkresult(){
        Assert.assertTrue(driver.getTitle().contains("PyPI"));
}
}
