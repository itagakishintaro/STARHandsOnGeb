package introWork

import org.junit.Test
import geb.Browser

class introWork2{	
	@Test
	def void "入門課題その2:「クリックしてみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork2.html"
			$("#ok_button").click()
			report 'introwWork2'
		}
	}
}