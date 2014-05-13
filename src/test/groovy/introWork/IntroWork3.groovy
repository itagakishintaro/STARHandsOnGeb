package introWork

import org.junit.Test
import geb.Browser

class IntroWork3{	
	@Test
	def void "入門課題その3 「文字列を入力してみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork3.html"
			$("#subject").value("Selenium")
			report 'IntrowWork3'
		}
	}
}