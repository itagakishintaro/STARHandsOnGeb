package practiceWork.pages

import geb.Page

class ReserveInputPage extends Page{
	static url = "file:///Users/itagakishintarou/git/StarHandsOnGeb/reserveApp/index.html"
	
	def setReserveYear(year) {
		$("#reserve_year").value(year)
    }

    def setReserveMonth(month) {
		$("#reserve_month").value(month)
    }
    
    def setReserveDay(day) {
		$("#reserve_day").value(day)
    }

    def setReserveDate(year, month, day) {
        setReserveYear(year)
        setReserveMonth(month)
        setReserveDay(day)
    }

	def setReserveTerm(reserveTerm) {
		$("#reserve_term").value(reserveTerm)
	}

	def setHeadCount(headCount) {
		$("#headcount").value(headCount)
	}

	def setBreakfast(on) {
		if (on) {
			$("#breakfast_on").click()
		} else {
			$("#breakfast_off").click()
		}
	}

	def setPlanA(checked) {
		if ($("#plan_a").value() != checked) {
			$("#plan_a").click()
		}
	}

	def setPlanB(checked) {
		if ($("#plan_b").value() != checked) {
			$("#plan_b").click()
		}
	}

	def setGuestName(guestName) {
		$("#guestname").value(guestName)
	}

	public ReserveConfirmPage goToNext() {
		$("#goto_next").click()
		return new ReserveConfirmPage()
	}
}
