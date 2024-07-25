package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test02 {
     /*
        1- http://babayigit.net/test/ adresine gidilir ve pencere maximize edilir
        2- INFO FORM butonuna tıklanır
        3- Form verileri girilir
        4- Save butonuna tıklanır
        5- Sonuç yazdırılır

         */
     public static void main(String[] args) throws InterruptedException {
         System.setProperty("Webdriver.driver.chrome","files/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         driver.get("http://babayigit.net/test/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//img[@src='img/info.png']")).click();
         driver.findElement(By.id("firstName")).sendKeys("Murat");
         driver.findElement(By.id("lastName")).sendKeys("Yiğit");
         driver.findElement(By.id("email")).sendKeys("murat@yigit.net");
         driver.findElement(By.id("phone")).sendKeys("+906542586352");
         driver.findElement(By.id("age")).sendKeys("14");
         driver.findElement(By.id("occupation")).sendKeys("Instructor");
         driver.findElement(By.id("male")).click();
         driver.findElement(By.id("city")).sendKeys("Uskudar");
         driver.findElement(By.id("country")).sendKeys("Turkiye");
         driver.findElement(By.xpath("//img[@src='img/save.png']")).click();
         System.out.println(driver.findElement(By.id("resultMessage")).getText());
         driver.quit();

     }
}
