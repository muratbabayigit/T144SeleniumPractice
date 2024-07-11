package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    /*
          1-Driver oluşturalim
          2-Java class’imiza chnomedriver.exe i tanitalim
          3-Driver’in tum ekranı kaplamasini saglayalim
          4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklesini
            söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
          5-“https://www.google.com” adresine gidelim
          6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
          7-Title’ın ve url inin Google kelimesinin içerip icermedigini kontrol edelim
          8-Ardindan “https://wisequarter.com/” adresine gidip
          9-Bu adresin basligini alalim ve “Quarter” kelimesini icenip icermedigini kontrol edelim
          10-Bir onceki web sayfamiza geri donelim
          11-Sayfayı yenileyelim
          12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
          13-En son adim olarak butun sayfalarimizi kapatmis olalim
    */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://www.google.com");
        String firstSiteTitle=driver.getTitle();
        String firstSiteUrl=driver.getCurrentUrl();

        if(firstSiteTitle.contains("Google") && firstSiteUrl.contains("Google")){
            System.out.println("Google test PASSED");
        }else {
            System.out.println("Google test FAILED");
        }
        driver.navigate().to("https://wisequarter.com/");
        String secondSiteTitle=driver.getTitle();

        if (secondSiteTitle.contains("Quarter")){
            System.out.println("WiseQuarter Test PASSED");
        }else {
            System.out.println("WiseQuarter Test FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();

    }
}
