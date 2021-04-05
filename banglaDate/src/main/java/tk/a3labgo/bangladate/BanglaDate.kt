package tk.a3labgo.bangladate
import java.util.*

class BanglaDate {
    companion object {
        private val banglaNumbers = arrayOf("০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯");
        private val banglaMonths = arrayOf(
            "জানুয়ারী",
            "ফেব্রুয়ারী",
            "মার্চ",
            "এপ্রিল",
            "মে",
            "জুন",
            "জুলাই",
            "আগস্ট",
            "সেপ্টেম্বর",
            "অক্টোবর",
            "নভেম্বর",
            "ডিসেম্বর"
        );
        private val banglaDays = arrayOf(
            "রবিবার",
            "সোমবার",
            "মঙ্গলবার",
            "বুধবার",
            "বৃহস্পতিবার",
            "শুক্রবার",
            "শনিবার"
        )
        public fun getBanglaDayOfWeek():String{
            val dayOfTheWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
            var day = ""
            when(dayOfTheWeek){
                Calendar.SUNDAY -> day = banglaDays[0]
                Calendar.MONDAY -> day = banglaDays[1]
                Calendar.TUESDAY -> day = banglaDays[2]
                Calendar.WEDNESDAY -> day = banglaDays[3]
                Calendar.THURSDAY -> day = banglaDays[4]
                Calendar.FRIDAY -> day = banglaDays[5]
                Calendar.SATURDAY -> day = banglaDays[6]
            }
            return day
        }

        public fun getBanglaDate(): String {
            val currentDate = Calendar.getInstance().get(Calendar.DAY_OF_MONTH).toString();
            var banglaSting = ""
            for (i in currentDate.indices) {
                val temp = (currentDate.get(i))
                val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }
        public fun getBanglaYear(): String {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR).toString();
            var banglaSting = ""
            for (i in currentYear.indices) {
                val temp = (currentYear.get(i))
                val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }
        public fun getBanglaMonth(): String {
            var banglaSting = ""
            val currentMonth = Calendar.getInstance().get(Calendar.MONTH).toString();
            for (i in currentMonth.indices) {
                val temp = (currentMonth.get(i))
                val bangleChar = banglaMonths[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }

        public fun getFullDate() :String{
            return banglaDateFormater("dmy", ",", "/")
        }
        public fun getFullDate(format: String) :String{
            return banglaDateFormater(format, ",", "/")
        }
        public fun getFullDate(format: String, divider: String) :String{
            return banglaDateFormater(format, divider, divider)
        }
        public fun getFullDate(format: String, dividerOne: String, dividerTwo: String) :String{
            return banglaDateFormater(format, dividerOne, dividerTwo)
        }
    }
}
private fun banglaDateFormater(format: String, divider1: String, divider2: String) :String{
    val banglaNumbers = arrayOf("০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯");
    val banglaMonths = arrayOf(
        "জানুয়ারী",
        "ফেব্রুয়ারী",
        "মার্চ",
        "এপ্রিল",
        "মে",
        "জুন",
        "জুলাই",
        "আগস্ট",
        "সেপ্টেম্বর",
        "অক্টোবর",
        "নভেম্বর",
        "ডিসেম্বর"
    );
    var banglaDays = arrayOf(
        "শনিবার",
        "সোমবার",
        "রবিবার",
        "মঙ্গলবার",
        "বুধবার",
        "বৃহস্পতিবার",
        "শুক্রবার"
    )

    val currentYear = Calendar.getInstance().get(Calendar.YEAR).toString();
    val currentDate = Calendar.getInstance().get(Calendar.DAY_OF_MONTH).toString();
    val currentMonth = Calendar.getInstance().get(Calendar.MONTH).toString();
    var banglaDate = ""
    var banglaMonth = ""
    var banglaYear = ""
    var finalDate = ""
    for (i in currentDate.indices) {
        val temp = (currentDate.get(i))
        val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
        banglaDate += bangleChar
    }
    for (i in currentMonth.indices) {
        val temp = (currentMonth.get(i))
        val bangleChar = banglaMonths[Integer.valueOf(temp.toString())]
        banglaMonth += bangleChar
    }
    for (i in currentYear.indices) {
        val temp = (currentYear.get(i))
        val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
        banglaYear += bangleChar
    }
    when(format){
        "ymd" -> finalDate = banglaYear + divider1 + banglaMonth + divider2 + banglaDate
        "ydm" -> finalDate = banglaYear + divider1 + banglaDate + divider2 + banglaMonth
        "dmy" -> finalDate = banglaDate + divider1 + banglaMonth + divider2 + banglaYear
        "dym" -> finalDate = banglaDate + divider1 + banglaYear + divider2 + banglaMonth
        "mdy" -> finalDate = banglaMonth + divider1 + banglaDate + divider2 + banglaYear
        "myd" -> finalDate = banglaMonth + divider1 + banglaYear + divider2 + banglaDate
    }
    return finalDate
}