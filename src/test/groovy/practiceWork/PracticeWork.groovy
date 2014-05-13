package practiceWork

import org.junit.Test;

import geb.spock.GebSpec;
import practiceWork.pages.*

class PracticeWork  extends GebSpec{
	@Test
	def "実践課題 「ページオブジェクトデザインパターン」"(){
		given:
		to ReserveInputPage

		when:
		report 'PracticeWork1'
		setReserveDate("2014", "7", "1")
		reserveTerm = "3"
		headCount = "1"
		breakfast = false
		planA = false
		planB = false
		guestName = "abcd"
		report 'PracticeWork2'

		and:
		goToNext()
		report 'PracticeWork3'

		then:
		waitFor {at ReserveConfirmPage}
		assert priceText == "21000"
		assert dateFromText == "2014年7月1日"
		assert dateToText == "2014年7月4日"
		assert daysCountText == "3"
		assert headCountText == "1"
		assert breakfastText == "なし"
		assert existsPlanA() == false
		assert existsPlanB() == false
		assert guestNameText == "abcd"
	}
}
