import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Creating driver
        WebDriver driver=new ChromeDriver();

        //Getting the URL
        driver.get("https://10fastfingers.com/typing-test/english");

        //Maximize the browser's window
        driver.manage().window().maximize();

        //Elements

        //closing ad
        WebElement xButton = driver.findElement(By.id("closeIconHit"));
        xButton.click();

        //accepting cookies
        WebElement allowAll =driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]"));
        allowAll.click();

        //input field
        WebElement input = driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div[1]/div[7]/div[2]/div/div[1]/input"));

        //Creating List to store value of every word
        Thread.sleep(5000);
        List<WebElement> spans = driver.findElements(By.cssSelector("#speedtest-main #row1 span"));
        List<String> valuesOfSpans = new ArrayList<String>();
        for(WebElement item : spans) {
            valuesOfSpans.add(item.getText());

        }

        //Sending the words to the input field
        for(WebElement span : spans) {
            input.sendKeys(span.getText());
            input.sendKeys(Keys.SPACE);
            Thread.sleep(90);
       }
}}
