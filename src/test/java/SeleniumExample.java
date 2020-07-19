import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample {
   SeleniumExample() {
      WebDriverManager.chromedriver().setup();
   }
}
