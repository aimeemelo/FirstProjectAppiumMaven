import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Practice1 {

    /*public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateBrowserSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://tesla.com");
        driver.findElement(By.xpath("//*[@id=\"tds-menu-header-main\"]/div[2]/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tds-menu-header-main\"]/div[2]/div/nav/nav[2]/ol/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tesla-hero-showcase-1838\"]/div/div[1]/div/div[2]/div/div[6]/a")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/span/span/span")));
 //       Thread.sleep(10000);
        Dimension size = driver.manage().window().getSize();
        for(int i=0;i<2;i++){
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();
        }
 //       Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")
        )).click();
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[3]/button")).click();

        WebElement element = driver.findElement(By.xpath("//input[@id='FIRST_NAME']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.sendKeys("Omprakash");
    }*/
}
