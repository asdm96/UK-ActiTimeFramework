package actitime.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import actitime.PomClass.TimeTrackPage;
import genericsUtils.BaseClass;
public class GetTimeTractTextTest extends BaseClass {
	@Test
	public void timeTrackText() {
		String expectedText="Enter Time-Track";
		TimeTrackPage timeTrackPage = new TimeTrackPage();
		String actualText=timeTrackPage.getTitleofTimeTrackPage();
		System.out.println(expectedText);
		System.out.println(actualText);
		
		Assert.assertEquals(actualText, expectedText);
	}

}
