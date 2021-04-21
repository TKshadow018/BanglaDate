# BanglaDate
Get Number or Date in Bangla and also do basic math operation in Bangla using this library

## Installation

maven:
```xml
<repositories>
   <repository>
     <id>jitpack.io</id>
     <url>https://jitpack.io</url>
   </repository>
</repositories>
```
 
Step 2. Add the dependency
```xml
<dependency>
    <groupId>com.github.TKshadow018</groupId>
    <artifactId>BanglaDate</artifactId>
    <version>1.1.1</version>
</dependency>
```
gradle:
	
Add it in your root build.gradle at the end of repositories:
	
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }


Step 2. Add the dependency

    dependencies {
         'com.github.TKshadow018:ShowCaseView:1.1.1'
    }

## How To Use

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
      
7. getBanglaDate()

      `returns "৩"` if todays date is 3
      
8. getBanglaMonth()

      `returns "৩"` if current month is march
      
9. getBanglaYear()

      `returns "২০২২"` if current year is 2022
      
10. getFullDate() or getFullDate(formatString)  or getFullDate(formatString, commonSeparatorString)  or getFullDate(formatString, SeparatorString1, SeparatorString2)  
    Example-> 
     * getFullDate()
      
        `returns ২১ এপ্রিল ২০২১ ইং ১৬:৪০:৫৮.০৯৭৩`
	
     * getFullDate(dd MMMM yyyy E hh:mm:ss)
      
        `returns ২১ এপ্রিল ২০২১ ইং ১৬:৪০:৫৮`

     * getFullDate(dd/MM/yyyy G)
      
        `returns ২১/৩/২০২১ খ্রিষ্টাব্দ`
	
    * getFullDate("dd/MM/yy hh:mm")
      
        `returns ২১/০৩/২১ ০৫:৫৯`
       
     
      
## Contribution :collision:

Pull requests are welcome! :clap:

You can improve/fix most part of it . 
      
## License
```
   © Copyright 2018 Md Al-Amin Tusar

   Licensed under the Creative Commons Legal Code CC0 , 1.0 Universal;
   No trademark or patent rights available for others except copyright holder but can be used for free to any commercial project.
   Change and modification is also allowed but must give credit to the original Copyright holder
