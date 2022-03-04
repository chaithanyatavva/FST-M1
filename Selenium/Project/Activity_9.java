import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class Activity_9 {

    public static void main(String[] args) {
        //launch browser

    WebDriver driver = new FirefoxDriver();
        String user_name = "root";

        String pwd = "pa$$w0rd";

        String positionName = "TestPosition";

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        //login with cred

        WebElement wbUserId = driver.findElement(By.id("user_login"));

        WebElement wbPwd = driver.findElement(By.id("user_pass"));

        WebElement wbloginBtn = driver.findElement(By.id("wp-submit"));

        wbUserId.sendKeys(user_name);

        wbPwd.sendKeys(pwd);

        wbloginBtn.click();

        //verify logged in to the portal

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Dashboard"));

        String LoggedInDisplayName = driver.findElement(By.xpath("//span[@class='display-name']")).getText();

        Assert.assertEquals(user_name, LoggedInDisplayName);

        System.out.println("name :"+LoggedInDisplayName);

        //Add new job

        WebElement wbNew = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]"));
        wbNew.click();

        WebElement addNew = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/ul/li[3]/a"));
        addNew.click();

        //Enter the details

        driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys(positionName);

        driver.findElement(By.xpath("//input[@name='_job_location']")).sendKeys("Bangalore");

        driver.findElement(By.xpath("//input[@name='_company_name']")).sendKeys("IBM");

        driver.findElement(By.xpath("//input[@name='_company_website']")).sendKeys("https://www.ibm.com/");

        driver.findElement(By.xpath("//input[@name='_company_tagline']")).sendKeys("IBM tagline");

        driver.findElement(By.xpath("//input[@name='_company_twitter']")).sendKeys("@ibmIndia");

        //publish and verify

        driver.findElement(By.xpath("//button[text()='Publish…']")).click();

        driver.findElement(By.xpath("//button[text()='Publish']")).click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class,'post-publish-panel__postpublish-header')]"), "is now live."));

        boolean islive = driver.findElement(By.xpath("//a[text()='"+positionName+"']")).isDisplayed();

        Assert.assertTrue(islive);


        //close the browser
        driver.quit();

    }

}
