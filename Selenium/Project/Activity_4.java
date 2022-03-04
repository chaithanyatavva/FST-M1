import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_4 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement wbHeaderTwo = driver.findElement(By.xpath("//h2"));
        String secondHeader = wbHeaderTwo.getText();
        Assert.assertEquals(secondHeader, "Quia quis non");
        System.out.println("second header  is: " + secondHeader);

            //Close the browser
            driver.quit();

    }
}
