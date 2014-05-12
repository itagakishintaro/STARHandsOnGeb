package introWork

import org.junit.Test
import geb.Browser

class introWork1{	
	@Test
	def void "入門課題その1 「動かしてみよう、Selenium」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork1.html"
			report 'introwWork1'
		}
	}
}