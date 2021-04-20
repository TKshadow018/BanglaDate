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
      
        `returns ২০,এপ্রিল ২০২১`
       
     * getFullDate("dmy",",")
      
       `returns ২০,এপ্রিল,২০২১`
       
     * getFullDate("dmy",","," ")
      
       `returns ২০,এপ্রিল ২০২১`
       
     * getFullDate("dmy","/","/")
      
       `returns ২০/এপ্রিল/২০২১`
       
     * getFullDate("dmy"," "," ")
      
       `returns ২০ এপ্রিল ২০২১`
       
     * getFullDate("ydm",", "," ")
      
       `returns ২০২১, ২০এপ্রিল`
    
      
## Contribution :collision:

Pull requests are welcome! :clap:

You can improve/fix most part of it . 
      
## License
```
   © Copyright 2018 Md Al-Amin Tusar

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
