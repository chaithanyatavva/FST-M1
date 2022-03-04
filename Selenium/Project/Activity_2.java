import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_2 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement wbHeader  = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
        String Header  = wbHeader.getText();
        Assert.assertEquals(Header , "Welcome to Alchemy Jobs");
        System.out.println(" header is: " +Header);

        //Close the browser
        driver.quit();
    }
}
