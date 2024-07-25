package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    /* Exercise3... */
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculater under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","files/chromedriver.exe");
        //a[@id='calculatetest']  xpath
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        //driver.findElement(By.xpath("//a[@id='calculatetest']"));
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("100");
        driver.findElement(By.id("number2")).sendKeys("400");
        driver.findElement(By.id("calculate")).click();
        String answer=driver.findElement(By.id("answer")).getText();
        System.out.println(answer);
        System.out.println(driver.findElement(By.id("answer")).getText());
        driver.quit();



    }

}
