# BanglaDate
Get Number or Date in Bangla and also do basic math operation in Bangla using this library

`implementation 'com.github.TKshadow018:BanglaDate:0.1)`

1. getBanglaNumber(long):String?
    Example-> 
      getBanglaNumber(5) 

      `returns ৫`


2. getEnglishNumber(String):Long?
    Example-> 
      getEnglishNumber("৫") 

      `returns 5`


3. addBanglaNumbers(List<Sting> or Array<String> or String,String)
    Example-> 
      addBanglaNumbers("৫","৬") or
      addBanglaNumbers(arrayOf("৫","৬")) or
      addBanglaNumbers(arrayListOf("৫","৬"))

      `returns "১১"`
  
4. substractBanglaNumbers(String,String)
    Example-> 
       substractBanglaNumbers("৬","৫")

       `returns "১১"`

5. multiplyBanglaNumbers(String,String)
    Example-> 
      multiplyBanglaNumbers("৫","২")

      `returns "১০"`

6. divideBanglaNumbers(String,String)
    Example-> 
      divideBanglaNumbers("৬","২")

      `returns "৩"`
      
