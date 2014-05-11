package introWork

import org.junit.Before;
import org.junit.Test
import org.openqa.selenium.chrome.ChromeDriver

import geb.Browser

class introWork1{	
	@Test
	def void "入門課題その2:「クリックしてみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork2.html"
			$("#ok_button").click()
			report 'introwWork1'
		}
	}
}