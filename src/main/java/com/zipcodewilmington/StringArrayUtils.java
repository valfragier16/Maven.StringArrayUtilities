package com.zipcodewilmington;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String last = array[array.length - 1];

        return last;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondLast = array[array.length - 2];

        return secondLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s: array){

            if(s.equals(value))
                return true;
        }
        return false;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        // create open array to take in new Array elements
        String[] temp = new String[array.length];

        for(int i = 0; i < array.length; i++){
            // lopping from right to left on origin array - i
            temp[i] = array[array.length - 1 - i];
        }

        return temp;

    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for(int i = 0; i < array.length/ 2; i++){
            // array[index from the end] is not equal to array[index]
            if(array[array.length - 1 - i] != array[i]){
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        boolean[] letterMap = new boolean[26];

        String output = "";

        for(String s : array){
            //Filling with array parameter
            output += s.toLowerCase();
        }

        //check the string (every letter in output)
        for(int i = 0; i < output.length(); i++){
            // checks through the alphabet array - checks against current letter in string
            for(int j = 0; j < alphabet.length;  j++) {

                if(output.charAt(i) == alphabet[j]) {
                    // if current letter in output is equal to alphabet letter at location j  = true
                    letterMap[j] = true;
                }
            }
        }


        for(boolean b : letterMap){
            if(b == false){
                return false;
            }
        }


        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        // loop through the array
        for(int i = 0; i < array.length; i++) {
            // check the value against the array
            if(value == array[i])
                // count through the array
                count++;
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {


        for(int i = 0; i < array.length; i++){
            if(){

            }

        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
