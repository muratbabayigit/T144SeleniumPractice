package day01_driverMethods;


import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","files/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
