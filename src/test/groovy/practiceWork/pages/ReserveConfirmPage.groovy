package practiceWork.pages

import geb.Page;

class ReserveConfirmPage extends Page{
	static at = {title == "Reservation"}
	
	static content = {
        priceText { $("#price").text() }
        dateFromText { $("#datefrom").text() }
        dateToText { $("#dateto").text() }
        daysCountText { $("#dayscount").text() }
        headCountText { $("#hc").text() }
        breakfastText { $("#bf_order").text() }
        planAText { $("#plan_a_order").text() }
        planBText { $("#plan_b_order").text() }
        guestNameText { $("#gname").text() }
        commit { $("#commit").click() }
    }

    def existsPlanA() {
        $("#plan_a_order").size() > 0;
    }

    def existsPlanB() {
        $("#plan_b_order").size() > 0;
    }

}
