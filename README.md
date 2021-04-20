# BanglaDate
Get Number or Date in Bangla and also do basic math operation in Bangla using this library

```groovy
implementation 'com.github.TKshadow018:BanglaDate:0.1)`
```

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
      
