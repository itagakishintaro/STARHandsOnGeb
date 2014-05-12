package introWork

import org.junit.Test
import geb.Browser

class introWork6{
	@Test
	def void "入門課題その6 「プルダウンを選択してみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork6.html"
			$("#head_count").value("5")
			report 'introwWork6'
		}
	}
}