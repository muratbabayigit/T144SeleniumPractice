package day01_driverMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","files/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.close();
    }

}
