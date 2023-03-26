import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	private static Select select;
	private static By driver;

	public static void main(String[] args) {
		
		select = new Select(driver.findElement((SearchContext) By.id("month")));
		select.selectByVisibleText("Jul");

		select = new Select(driver.findElement((SearchContext) By.id("day")));
		select.selectByVisibleText("10");

		select = new Select(driver.findElement((SearchContext) By.id("year")));
		select.selectByVisibleText("1965");
	}

}
