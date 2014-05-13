package practiceWork.pages

import geb.Page;

class ReserveConfirmPage extends Page{
	static at = {title == "Reservation"}
	
	def getPrice(){
		return $('#price').text()
	}

	def getDateFrom() {
		return $('#datefrom').text()
	}

	def getDateTo() {
		return $('#dateto').text()
	}

	def getDaysCount() {
		return $('#dayscount').text()
	}

	def getHeadCount() {
		return $('#hc').text()
	}

	def getBreakfast() {
		return $('#bf_order').text()
	};

	def existsPlanA() {
		return $('#plan_a_order').size() != 0
	};

	def getPlanA() {

		return $('#plan_a_order').text()
	};

	def existsPlanB() {
		return $('#plan_b_order').size() != 0
	};

	def getPlanB() {
		return $('#plan_b_order').text()
	};

	def getGuestName() {

		return $('#gname').text()
	};

	def commit() {
		$('#commit').click()
	};
}
