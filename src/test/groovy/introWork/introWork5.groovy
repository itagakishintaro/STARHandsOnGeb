package introWork

import org.junit.Test
import geb.Browser

class introWork5{
	@Test
	def void "入門課題その5 「チェックボックスを選択してみよう」"(){
		Browser.drive {
			go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork5.html"
			if(!$("#allowed_check").value()){
				$("#allowed_check").click()
			}
			report 'introwWork5'
		}
	}
}