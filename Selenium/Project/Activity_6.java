import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_6 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/jobs");

        //Click jobs

        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();

        //Find text field
        WebElement inputtext = driver.findElement(By.xpath("//*[@id=\"search_keywords\"]"));
        inputtext.sendKeys("banking");

        //click on Search job button

        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();

        //click on the job listed
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@class='job_listings']/li[1]/a//h3"), "Banking"));

        WebElement wbFirstJob = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));

        wbFirstJob.click();

        //click on apply job

        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();

        //print email
        WebElement wblink = driver.findElement(By.xpath("//div[@class='application_details']/p/a"));
        String link = wblink.getText();
        System.out.println("Link displayed: "+link);


        //Close browser
        driver.quit();

    }
}