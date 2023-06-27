package PageObjekts;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Objects;

public class  POlink_download extends Base {
   public static   String downlink = "//a[contains(text(),'Downloads')]";
   public static String titleone = "Welcome to Python.org";

   public static void downlinkone() throws InterruptedException{

     driver.findElement(By.xpath(downlink)).click();
      Thread.sleep(7000);


   }
   public static void checkTitle(){
      Assert.assertTrue(driver.getTitle().contains("Download"));
   }
}

