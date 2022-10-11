import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import org.openqa.selenium.By;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndInteractsWithApps {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        driver.findElement(views).click();

        Thread.sleep(5000);
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        Thread.sleep(5000);
        driver.terminateApp("io.appium.android.apis");
        Thread.sleep(5000);
        System.out.println(driver.queryAppState("io.appium.android.apis"));
   //     driver.runAppInBackground(Duration.ofMillis(5000));
        //*driver.terminateApp("io.appium.android.apis");
        Thread.sleep(5000);
        driver.activateApp("com.android.settings");
        Thread.sleep(5000);
        driver.activateApp("io.appium.android.apis");//
   //     System.out.println(driver.isAppInstalled("io.appium.android.apis"));
       // driver.terminateApp("io.appium.android.apis");
        String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
      //  driver.installApp(andAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());

    }
}

//Thread.sleep(5000);
//        System.out.println(driver.queryAppState("io.appium.android.apis"));

// o que ele faz é apenas mover o aplicativo para os processos em segundo plano.
//        Thread.sleep(5000);
//        driver.terminateApp("io.appium.android.apis");

// colocar aplicativo em segundo plao por tempo determinado
//        Thread.sleep(5000);
//        System.out.println(driver.queryAppState("io.appium.android.apis"));
//        //     driver.runAppInBackground(Duration.ofMillis(5000));
//        //*driver.terminateApp("io.appium.android.apis");

//
//        Thread.sleep(5000);
//        driver.activateApp("com.android.settings");
//        Thread.sleep(5000);

// verificar se o app esta instalado
//        driver.activateApp("io.appium.android.apis");//
//        //     System.out.println(driver.isAppInstalled("io.appium.android.apis"));
//        // driver.terminateApp("io.appium.android.apis");

//  instalar o aplicativo
//        String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
//        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
////  driver.installApp(andAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());

//  ativar outro aplicativo
////         driver.terminateApp("io.appium.android.apis");
//        Thread.sleep(5000);
//        driver.activateApp("io.appium.settings",);
//        Thread.sleep(5000);
//        driver.terminateApp("io.appium.android.apis");