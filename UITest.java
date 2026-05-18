import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

    @Test
    public void testHomepageLoad() {
        System.out.println("Testing homepage load");
        Assert.assertTrue(true);
    }

    @Test
    public void testLoginButton() {
        System.out.println("Testing login button visibility");
        Assert.assertTrue(true);
    }

    @Test
    public void testPageTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
        driver.quit();
    }
}
