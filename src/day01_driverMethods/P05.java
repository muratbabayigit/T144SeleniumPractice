package day01_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

    /*
    https://babayigit.net/test/ adresine gidip adres çubuğuna
    1-Vizontele aratıp sonuç sayısını yazdırın
    2-12 Angry men aratıp sonuç sayısını yazdırın
    3-Saving Private Ryan aratıp sonuç sayısını yazdırın
    4-3 Idiots aratıp sonuç sayısını yazdırın

     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","files/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://babayigit.net/test/");
        driver.findElement(By.id("search")).sendKeys("Vizontele");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.id("hdtb-tls")).click();
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        String sonucText=sonuc.getText();
        System.out.println(sonucText);
        driver.navigate().back();
        driver.navigate().refresh();

    }
}
