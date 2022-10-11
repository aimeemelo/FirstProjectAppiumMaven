import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndAutomateBrowser {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateBrowserSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://tesla.com");
        driver.findElement(By.xpath("//*[@id=\"tds-site-header\"]/ol/li/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tds-global-menu\"]/dialog/section/ol/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tesla-hero-1733\"]/div[2]/div/section/div/a")).click();

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Your Car')]")));

        Dimension size = driver.manage().window().getSize();
        for (int i = 0; i < 6; i++) {
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();

       driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div[8]/div/div/div[2]/button")).click();
       driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div[3]/div/div/div[8]/div/div[2]/div[1]/div[1]/button")).click();

       WebElement element = driver.findElement((By.id("FIRST_NAME")));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
       element.sendKeys("Aimée");



//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Your Car')]")));
//
            }
//        Thread.sleep(10000);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")
//        )).click();
//    //    driver.findElement(By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")).click();
//
        }

    }