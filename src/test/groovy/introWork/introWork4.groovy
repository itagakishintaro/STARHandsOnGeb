package introWork

import org.junit.Test
import geb.Browser

class introWork4{	
	@Test
	def void "入門課題その4 「ラジオボタンを選択してみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork4.html"
			$("#on_radio").click()
			report 'introwWork4'
		}
	}
}