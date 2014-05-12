package introWork

import org.junit.Test
import static spock.util.matcher.HamcrestSupport.*
import geb.Browser
import geb.spock.GebSpec

class introWork7 extends GebSpec{
	@Test
	def "入門課題その7 「表示された値のチェックをしてみよう」"(){
		when:
		go "file:///Users/itagakishintarou/git/StarHandsOnGeb/introWork/introWork7.html"
		report 'introwWork7'
		then:
		$("#total").text() == "9000"
	}
}