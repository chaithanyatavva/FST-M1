import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_5 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        //Click jobs

        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();

        //Check the title of the page
        String title = driver.getTitle();

        Assert.assertEquals(title, "Jobs – Alchemy Jobs");
        //Print the title of the page
        System.out.println("Page title is: " + title);

       //close the driver
        driver.quit();

    }
}
