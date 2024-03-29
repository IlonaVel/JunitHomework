package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver createDriver(Browsers browsers) {
        if (driver == null) {
            switch (browsers) {
                case CHROME -> createChrome();
                case CHROMEINCOGNITO -> createChromeIncognito();
            }

        }
        return driver;
    }



    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");//open chrome in incognito made
        options.addArguments("--start-maximized");//open chrome in window max
//            options.addArguments("--headless");//headlessmode
        driver=new ChromeDriver(options);
    }


    private static void createChrome() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
