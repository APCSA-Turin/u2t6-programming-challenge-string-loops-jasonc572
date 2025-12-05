package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
        String strdupe = str;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String remove = str.substring(i,i+1);
            if (remove.equals("a")) {
                strdupe = strdupe.substring(0,i - count) + str.substring(i+1);
                count++;
            }
        }
       return strdupe;
   }
   


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
    String strdupe = str;
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            String remove = str.substring(i,i+1);
            if (remove.equals("a")) {
                strdupe = strdupe.substring(0,i - count) + str.substring(i+1);
                count++;
            }
            i++;
        }
       return strdupe;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
    String reverse = "";
        for (int i = str.length(); i > 0; i--) {
            reverse = reverse + str.substring(i-1,i);
        }
       return reverse;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
    String reverse = "";
       for (int i = 0; i < str.length(); i++) {
            reverse = reverse + str.substring(str.length()-(1+i),str.length()-(i));
       }
       return reverse;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        String strdupe = origStr;
        int count = 0;
        for (int i = 0; i < origStr.length(); i++) {
            String remove = origStr.substring(i,i+1);
            if (remove.equals(searchChar)) {
                if (replaceChar.equals("")) {
                    strdupe = strdupe.substring(0,i - count) + origStr.substring(i+1);
                    count++;
                } else {
                    strdupe = strdupe.substring(0,i) + replaceChar + origStr.substring(i+1);
                }
            }
        }
       return strdupe;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        String strdupe = origStr;
        int i = 0;
        int count = 0;
        while (i < origStr.length()) {
            String remove = origStr.substring(i,i+1);
            if (remove.equals(searchChar)) {
                if (replaceChar.equals("")) {
                    strdupe = strdupe.substring(0,i - count) + origStr.substring(i+1);
                    count ++;
                } else {
                    strdupe = strdupe.substring(0,i) + replaceChar + origStr.substring(i+1);
                }
            }
            i++;
        }
       return strdupe;
   }

   public int countString(String searchString, String origString) {
    int count = 0;
       while (origString.indexOf(searchString) > -1) {
        int index = origString.indexOf(searchString);
        int length = searchString.length();
        if (length > 2) {
            origString = origString.substring(0 , index) + origString.substring(index + (length - length / 2));
        } else {
            origString = origString.substring(0 , index) + origString.substring(index + length);
        }
        count ++;
       }
       return count;
   }

   public String removeString(String searchString, String origString) {
       while (origString.indexOf(searchString) > -1) {
            int index = origString.indexOf(searchString);
            int length = searchString.length();
            origString = origString.substring(0 , index) + origString.substring(index + length);
       }
       return origString;
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
        String combined = "";
        if (fromNum > toNum) {
            for (int i = fromNum; i > toNum; i--) {
            combined = combined + i + ", ";
        }
        combined = combined + toNum;
        } else {
            for (int i = fromNum; i < toNum; i++) {
            combined = combined + i + ", ";
        }
        combined = combined + toNum;
        }
       System.out.println(combined);
   }



   public boolean isPalindrome(String myString) {
        String reverse = "";
        for (int i = myString.length(); i > 0; i--) {
            reverse = reverse + myString.substring(i-1,i);
        } 
       if (reverse.replaceAll(" ", "").equals(myString.replaceAll(" ", ""))) {
        return true;
       }
       return false;
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
        String thing = "";
        for (int i = 1; i < num; i++) {
            thing = thing + toPrint + " ";
        }
        thing = "[" + thing + toPrint + "]";
        if (num <= 0) {
            thing = "[]";
        }
       System.out.println(thing);
   }
}
