import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement wbHeaderImg = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));
        String img  = wbHeaderImg.getAttribute("src");
        System.out.println(" image url is: " +img);

        //Close the browser
        driver.quit();

    }
}
