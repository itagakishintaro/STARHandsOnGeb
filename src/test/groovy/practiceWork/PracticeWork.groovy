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
		setReserveTerm("3")
		setHeadCount("1")
		setBreakfast(false)
		setPlanA(false)
		setPlanB(false)
		setGuestName("abcd")
		report 'PracticeWork2'

		and:
		goToNext();
		report 'PracticeWork3'

		then:
		waitFor {at ReserveConfirmPage}
		assert getPrice() == "21000"
		assert getDateFrom() == "2014年7月1日"
		assert getDateTo() == "2014年7月4日"
		assert getDaysCount() == "3"
		assert getHeadCount() == "1"
		assert getBreakfast() == "なし"
		assert existsPlanA() == false
		assert existsPlanB() == false
		assert getGuestName() == "abcd"
	}
}
