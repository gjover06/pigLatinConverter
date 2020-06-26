/**
 Name: George Samu
 Purpose: The purpose is to create a program that converts a string to pig latin
 6/26/2020
 */
import java.util.Scanner;

 public class pigLatin
  {

    public static void main(String[]args)
     {
      String latin="ay";
      Scanner keyboard=new Scanner(System.in);
     System.out.println("What is the word you would like to convert in piglatin? ");
     String pigLatinWord=keyboard.nextLine();

     String wordTruncated=pigLatinWord.substring(0,1);
     
      String wordTruncated1=pigLatinWord.substring(1);
      
    //  System.out.println(wordTruncated);
    //  System.out.println(wordTruncated1);

    System.out.println(wordTruncated1+wordTruncated+latin);



    }//end main
  }//end 
