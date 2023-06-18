package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.DashboardPage;
import util.BrowserFactory;

public class DashBordPageTest {

	WebDriver driver;
	String categoryName = "Furniture";
	String itemName = "couch--sofa";

	@Test
	public void checkAllCheckBoxes() {
		driver = BrowserFactory.init();
		DashboardPage dp = PageFactory.initElements(driver, DashboardPage.class);
		dp.clickOnAllCheckBox();

		// assert all checkboxes are selected

		if ((dp.getListItemsCheckboxes()).size() != 0) {
			for (WebElement item : dp.getListItemsCheckboxes()) {
				assertTrue(item.isSelected());
			}
		}

	}

}
