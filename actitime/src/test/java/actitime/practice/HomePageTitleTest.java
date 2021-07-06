package actitime.practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.PomClass.TimeTrackPage;
import genericsUtils.BaseClass;

@Listeners(genericsUtils.ListenerImplimentationClass.class)
public class HomePageTitleTest extends BaseClass {
	@Test
	public void timeTrackText() {
		String expectedText="Enter Time-Track";
		TimeTrackPage timeTrackPage = new TimeTrackPage(driver);
		String actualText=timeTrackPage.getTitleofTimeTrackPage();
		System.out.println(expectedText);
		System.out.println(actualText);
		
		Assert.assertEquals(actualText, expectedText);
	}

}
