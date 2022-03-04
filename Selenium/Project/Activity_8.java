import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity_8 {

    public static void main(String[] args) {

        //launch browser
        WebDriver driver = new FirefoxDriver();

        String user_name = "root";

        String pwd = "pa$$w0rd";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        //login with cred

        WebElement wbUserId = driver.findElement(By.id("user_login"));

        WebElement wbPwd = driver.findElement(By.id("user_pass"));

        WebElement wbloginBtn = driver.findElement(By.id("wp-submit"));

        wbUserId.sendKeys(user_name);

        wbPwd.sendKeys(pwd);

        wbloginBtn.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Dashboard"));

        String LoggedInDisplayName = driver.findElement(By.xpath("//span[@class='display-name']")).getText();

        Assert.assertEquals(user_name, LoggedInDisplayName);
        System.out.println("name is :"+ LoggedInDisplayName);

        //close the browser
        driver.quit();

    }

}
