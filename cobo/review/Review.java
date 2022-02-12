import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import java.lang.reflect.Array;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  public static void main(String[] args) {
    // System.out.println(starRating("SimpleReview.txt"));
    // String pos = "";
    // String neg = "";
    // for (String key : sentiment.keySet()) {
    //   if (sentiment.get(key) > 0) {
    //     pos+=key+"\n";
    //   }
    //   else {
    //     neg += key + "\n";
    //   }
    // }
    // System.out.println(pos);
    // System.out.println(neg);

    System.out.println(fakeReview("SimpleReview.txt", "positive"));

    
  }
  

  public static double totalSentiment(String fileName) {
    double sentiment = 0;
    String[] words = textToString(fileName).split(SPACE);
    for (String word : words) {
      sentiment += sentimentVal(removePunctuation(word));
    }
    return sentiment;
  }

  public static int starRating(String fileName) {
    double sentiment = totalSentiment(fileName);

    if(sentiment < 0) {
      return 1;
    }
    if(sentiment < 10) {
      return 2;
    }
    if(sentiment < 20) {
      return 3;
    }
    if(sentiment < 30) {
      return 4;
    }
    return 5;
  }

  public static String fakeReview(String fileName, String posneg) {
  //   String file = textToString(fileName);
  //   String out = "";
  //   for (String s : splice(file, SPACE)) {
  //     if(s.indexOf("*") != -1) {
  //       int choice = (int) (Math.random()*sentiment.size());
  //       int counter = 0;
  //       for (String key : sentiment.keySet()) {
  //         if (counter == choice) {
  //           out += key + " ";
  //         }
  //         counter++;
  //       }
  //     }
  //     else {
  //       out += s + " ";
  //     }
  //   }
  //   return out.trim();

    String file = textToString(fileName);
    String out = "";
    for (String s : splice(file, SPACE)) {
      if(s.indexOf("*") != -1) {
        String word = s.substring(1);
        boolean bias = sentimentVal(word) >= 0;

        if(posneg.equals("positive") && bias || posneg.equals("negative") && !bias) {
          out+=word+" ";
          continue;
        }

        ArrayList<String> workingList;
        if (bias) {
          workingList = posAdjectives;
        }
        else {
          workingList = negAdjectives;
        }

        int choice = (int) (Math.random()*workingList.size());
        int counter = 0;
        for (String key : workingList) {
          if (counter == choice) {
            out += key + " ";
          }
          counter++;
        }
      }
      else {
        out += s + " ";
      }
    }
    return out.trim();
  }

  private static ArrayList<String> splice(String text, String key) {
    int indexOfKey = text.indexOf(key);
    ArrayList<String> strs = new ArrayList<String>();

    if (indexOfKey == -1) {
      strs.add(text);
    }
    else {

      strs.add(text.substring(0,indexOfKey));
      for (String s : splice(text.substring(indexOfKey+1), key)) {
        strs.add(s);
      }
    }
    return strs;
  }

  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
}