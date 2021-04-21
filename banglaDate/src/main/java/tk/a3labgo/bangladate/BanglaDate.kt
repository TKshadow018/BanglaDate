package tk.a3labgo.bangladate
import java.util.*

class BanglaDate {
    companion object {
        private val banglaNumbers = arrayOf("০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯")
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
        )
        private val banglaDays = arrayOf(
            "রবিবার",
            "সোমবার",
            "মঙ্গলবার",
            "বুধবার",
            "বৃহস্পতিবার",
            "শুক্রবার",
            "শনিবার"
        )

        fun getBanglaDayOfWeek():String{
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
        fun getBanglaNumber(inputedNumber: Long): String? {
            return getBanglaNumberPrivate(inputedNumber)
        }
        fun getEnglishNumber(inputedNumber: String): Long? {
            val banglaNumbers = arrayOf("০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯");
            var numberInSting = ""
            try {
                for (i in inputedNumber.indices) {
                    val temp = banglaNumbers.indexOf(inputedNumber[i].toString())
                    numberInSting += banglaNumbers[temp]
                }
                return numberInSting.toLong()
            } catch (e: Exception){
                return null
            }
        }
        fun addBanglaNumbers(inputedNumbers: List<String>): String?{
            var totalNumber: Long = 0
            try {
                for (i in inputedNumbers.indices) {
                    val temp = getEnglishNumber(inputedNumbers[i])
                    if(temp != null){
                        totalNumber += temp
                    } else{
                        return null
                    }
                }
                return getBanglaNumber(totalNumber)
            } catch (e: Exception){
                return null
            }
        }
        fun addBanglaNumbers(inputedNumbers: Array<String>): String?{
            var totalNumber: Long = 0
            var totalNumberBangla: String? = ""
            try {
                for (i in inputedNumbers.indices) {
                    val temp = getEnglishNumber(inputedNumbers[i])
                    if(temp != null){
                        totalNumber += temp
                    } else{
                        return null
                    }
                }
                totalNumberBangla = getBanglaNumber(totalNumber)
                return totalNumberBangla
            } catch (e: Exception){
                return null
            }
        }
        fun addBanglaNumbers(num1: String, num2: String): String?{
            try {
                val n1 = getEnglishNumber(num1)
                val n2 = getEnglishNumber(num2)
                if (n1!=null && n2 !=null){
                    val total = n1.plus(n2)
                    return getBanglaNumber(total)
                } else{
                    return null
                }
            } catch (e: Exception){
                return null
            }
        }
        fun substractBanglaNumbers(num1: String, num2: String): String?{
            try {
                val n1 = getEnglishNumber(num1)
                val n2 = getEnglishNumber(num2)
                if (n1!=null && n2 !=null){
                    val total = n1.minus(n2)
                    return getBanglaNumber(total)
                } else{
                    return null
                }
            } catch (e: Exception){
                return null
            }
        }
        fun multiplyBanglaNumbers(num1: String, num2: String): String?{
            try {
                val n1 = getEnglishNumber(num1)
                val n2 = getEnglishNumber(num2)
                if (n1!=null && n2 !=null){
                    val total = n1*n2
                    return getBanglaNumber(total)
                } else{
                    return null
                }
            } catch (e: Exception){
                return null
            }
        }
        fun divideBanglaNumbers(dividend: String, divisor: String): String?{
            try {
                val n1 = getEnglishNumber(dividend)
                val n2 = getEnglishNumber(divisor)
                return if (n1!=null && n2 !=null){
                    val total = n1/n2
                    getBanglaNumber(total)
                } else{
                    null
                }
            } catch (e: Exception){
                return null
            }
        }
        fun getBanglaDay(): String {
            val x= Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
            return banglaDays[x-1]
        }
        fun getBanglaDate(): String {
            val currentDate = Calendar.getInstance().get(Calendar.DAY_OF_MONTH).toString();
            var banglaSting = ""
            for (i in currentDate.indices) {
                val temp = (currentDate.get(i))
                val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }
        fun getBanglaYear(): String {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR).toString();
            var banglaSting = ""
            for (i in currentYear.indices) {
                val temp = (currentYear.get(i))
                val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }
        fun getBanglaMonth(): String {
            var banglaSting = ""
            val currentMonth = Calendar.getInstance().get(Calendar.MONTH).toString();
            for (i in currentMonth.indices) {
                val temp = (currentMonth.get(i))
                val bangleChar = banglaMonths[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }
            return banglaSting
        }
        fun getFullDate(format: String) :String{
            return banglaDateFormater(format)
        }
        fun getFullDate() :String{
            return banglaDateFormater("dd MMMM yyyy E hh:mm:ss.SSS")
        }
    }
}
    private fun banglaDateFormater(format: String) :String{
    var banglaDay = ""
    var banglaDayTwoChar = ""

    var banglaDateSingleDigit = ""
    var banglaDateDoubleDigit = ""

    var banglaMonthDoubleDigitNumber = ""
    var banglaMonthFullString = ""
    var banglaMonthTwoCharString = ""

    var banglaYearFourDigit = ""
    var banglaYearLastTwoDigit = ""


    var finalDate = ""

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
    )
    val banglaDays = arrayOf(
        "শনিবার",
        "সোমবার",
        "রবিবার",
        "মঙ্গলবার",
        "বুধবার",
        "বৃহস্পতিবার",
        "শুক্রবার"
    )
    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR).toString()
    val currentDate = calendar.get(Calendar.DAY_OF_MONTH).toString()
    val currentMonth = calendar.get(Calendar.MONTH).toString()
    val currentDay = calendar.get(Calendar.DAY_OF_WEEK)
    val hour24hrs = getBanglaNumberPrivate(calendar[Calendar.HOUR_OF_DAY].toLong())
    val hour12hrs = getBanglaNumberPrivate(calendar[Calendar.HOUR].toLong())
    val hour24hrsPlusOne = getBanglaNumberPrivate(calendar[Calendar.HOUR_OF_DAY].toLong() + 1)
    val hour12hrsPlusOne = getBanglaNumberPrivate(calendar[Calendar.HOUR].toLong() + 1)
    val minutes = getBanglaNumberPrivate(calendar[Calendar.MINUTE].toLong())
    val seconds = getBanglaNumberPrivate(calendar[Calendar.SECOND].toLong())
    val miliSeconds = getBanglaNumberPrivate(calendar[Calendar.MILLISECOND].toLong())

    var banglaMonthSingleCharNumber = getBanglaNumberPrivate(
        Calendar.getInstance().get(Calendar.MONTH).toLong() + 1
    )

    for (i in currentDate.indices) {
        val temp = (currentDate[i])
        val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
        banglaDateSingleDigit += bangleChar
    }
    for (i in currentMonth.indices) {
        val temp = (currentMonth[i])
        banglaMonthFullString += banglaMonths[Integer.valueOf(temp.toString())]
    }
    for (i in currentYear.indices) {
        val temp = (currentYear[i])
        val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
        banglaYearFourDigit += bangleChar
    }
    banglaMonthDoubleDigitNumber = getBanglaNumberPrivate(currentMonth.toLong())!!
    banglaDay = banglaDays[currentDay - 1]
    if(banglaDateSingleDigit.length==1){
        banglaDateDoubleDigit = banglaNumbers[0]+banglaDateSingleDigit
    }else{
        banglaDateDoubleDigit = banglaDateSingleDigit
    }
    if(banglaMonthSingleCharNumber?.length==1){
        banglaMonthTwoCharString = banglaNumbers[0]+banglaMonthSingleCharNumber
    }else if(banglaMonthSingleCharNumber?.length==2){
        banglaMonthTwoCharString = banglaMonthSingleCharNumber
    }

    val arreyedFormat = formatExtractor(format)
    if (arreyedFormat != null) {
        for (i in arreyedFormat){
            when(i.substring(0, 1)){
                "y" -> {
                    when (i) {
                        "yy" -> finalDate += banglaYearFourDigit.substring(2, 2)
                        "yyyy" -> finalDate += banglaYearFourDigit
                    }
                }
                "M", "L" -> {
                    when (i) {
                        "M", "L" -> finalDate += banglaMonthDoubleDigitNumber
                        "MM", "LL" -> finalDate += banglaMonthDoubleDigitNumber
                        "MMM", "LLL" -> finalDate += banglaMonthFullString.substring(0, 2)
                        "MMMM", "LLLL" -> finalDate += banglaMonthFullString
                    }
                }
                "d" -> {
                    when (i) {
                        "d" -> finalDate += banglaDateSingleDigit
                        "dd" -> finalDate += banglaDateDoubleDigit
                    }
                }
                "G" -> finalDate += "খ্রিষ্টাব্দ"
                "E" -> finalDate += "ইং"
                "EE" -> finalDate += "ইংরেজী"
                "H", "K", "h", "k" -> {
                    var hour24hrsLong:String?
                    var hour12hrsLong:String?
                    var hour24hrsLongPlusOne:String?
                    var hour12hrsLongPlusOne:String?
                    if (hour24hrs?.length == 1) {
                        hour24hrsLong = banglaNumbers[0] + hour24hrs
                    }else{
                        hour24hrsLong = hour24hrs
                    }
                    if (hour12hrs?.length == 1) {
                        hour12hrsLong = banglaNumbers[0] + hour12hrs
                    }else{
                        hour12hrsLong = hour12hrs
                    }
                    if (hour24hrsPlusOne?.length == 1) {
                        hour24hrsLongPlusOne = banglaNumbers[0] + hour24hrsPlusOne
                    }else{
                        hour24hrsLongPlusOne = hour24hrsPlusOne
                    }
                    if (hour12hrsPlusOne?.length == 1) {
                        hour12hrsLongPlusOne = banglaNumbers[0] + hour12hrsPlusOne
                    }else{
                        hour12hrsLongPlusOne = hour12hrsPlusOne
                    }
                    when (i) {
                        "H" -> finalDate += hour24hrs
                        "k" -> finalDate += hour24hrsPlusOne
                        "K" -> finalDate += hour12hrs
                        "h" -> finalDate += hour12hrsPlusOne
                        "HH" -> finalDate += hour24hrsLong
                        "kk" -> finalDate += hour24hrsLongPlusOne
                        "KK" -> finalDate += hour12hrsLong
                        "hh" -> finalDate += hour12hrsLongPlusOne
                    }
                }
                "m" -> {
                    when (i) {
                        "m" -> finalDate += minutes
                        "mm" -> {
                            if (minutes?.length == 1) {
                                finalDate += banglaNumbers[0] + minutes
                            } else {
                                finalDate += minutes
                            }
                        }
                    }
                }
                "s" -> {
                    when (i) {
                        "s" -> finalDate += seconds
                        "ss" -> {
                            if (seconds?.length == 1) {
                                finalDate += banglaNumbers[0] + seconds
                            } else {
                                finalDate += seconds
                            }
                        }
                    }
                }
                "S" -> {
                    when (i) {
                        "S" -> finalDate += miliSeconds?.substring(0, 1)
                        "SS" -> {
                            if (seconds?.length == 3) {
                                finalDate += miliSeconds?.substring(0, 2)
                            } else if (seconds?.length == 1) {
                                finalDate += banglaNumbers[0] + miliSeconds
                            } else {
                                finalDate += miliSeconds
                            }
                        }
                        "SSS" -> {
                            if (seconds?.length == 1) {
                                finalDate += banglaNumbers[0] + banglaNumbers[0] + miliSeconds
                            } else if (seconds?.length == 2) {
                                finalDate += banglaNumbers[0] + miliSeconds
                            } else {
                                finalDate += miliSeconds
                            }
                        }
                    }
                }
                else ->finalDate += i
            }
        }
    }
    return finalDate
}
    private fun getBanglaNumberPrivate(inputedNumber: Long): String? {
        var banglaSting = ""
        try {
            val banglaNumbers = arrayOf("০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯")
            val stringedInputedNumber = inputedNumber.toString()
            for (i in stringedInputedNumber.indices) {
                val temp = (stringedInputedNumber.get(i))
                val bangleChar = banglaNumbers[Integer.valueOf(temp.toString())]
                banglaSting += bangleChar
            }

        }
        catch (e: Exception){
            return null
        }
        return banglaSting
    }
    private fun formatExtractor(format: String): ArrayList<String>? { return ArrayList<String>() }