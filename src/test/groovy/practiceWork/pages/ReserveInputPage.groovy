package practiceWork.pages

import geb.Page

class ReserveInputPage extends Page{
	static url = "file:///Users/itagakishintarou/git/StarHandsOnGeb/reserveApp/index.html"
	
	static content = {
        reserveYear { $("#reserve_year") }
        reserveMonth { $("#reserve_month") }
        reserveDay  { $("#reserve_day") }
        reserveTerm { $("#reserve_term") }
        headCount { $("#headcount") }
        breakfastOn { $("#breakfast_on") }
        breakfastOff { $("#breakfast_off") }
        planA { $("#plan_a") }
        planB { $("#plan_b") }
        guestName { $("#guestname") }
        //goToNext(to: ReserveConfirmPage) { $("#goto_next").click() }
    }
	
	def setReserveDate(year, month, day) {
		reserveYear = year
		reserveMonth = month 
		reserveDay = day
	}
	
	def setBreakfast(on) {
		if (on) {
			breakfastOn.click()
		} else {
			breakfastOff.click()
		}
	}

	def setPlanA(checked) {
		if (planA.value() != checked) {
			planA.click()
		}
	}

	def setPlanB(checked) {
		if (planB.value() != checked) {
			planB.click()
		}
	}
	
	def ReserveConfirmPage goToNext() {
		$("#goto_next").click()
		return new ReserveConfirmPage()
	}
}
