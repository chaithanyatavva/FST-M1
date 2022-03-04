import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_1 {

    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        //Check the title of the page
        String title = driver.getTitle();
        Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");

        //Close the browser
        driver.quit();
    }
}
