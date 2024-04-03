package AutomationScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArrayDifferentFunctions {
	
	ArrayDifferentFunctions(){
		String[] StrArray =  {"Squash","Football","VollyBall", "Cricekt","Rugby"};;
		String[] StrArray2 = null;
		StrArray2 = StrArray.clone();
		Integer[] IntArray3 =  {5,599,6,0,7,8,-79,-100,101,40};
		Integer[] IntArray4 = null;
		IntArray4 = IntArray3.clone();
		String[] StrArray5 = Arrays.copyOfRange(StrArray, 1, StrArray.length-1);
		
		System.out.println(Arrays.toString(StrArray5));
		 
		 for (int ArrEle : IntArray4) {
			 System.out.println(ArrEle);
		 }
		 
		 for (String ArrEle : StrArray) {
			 System.out.println("Array  contains VollyBall?? "  +ArrEle.contains("VollyBall"));
		 }
	}
	   static void TwoDimArray()
	   {
		      String[][] data = new String[2][5];
		      System.out.println("Dimension 1: " + data.length);
		      System.out.println("Dimension 2: " + data[0].length);
		   }
	   
	   static void FillTest() {
		      int array[] = new int[6];
		      Arrays.fill(array, 100);
		      
		      for (int i = 0, n = array.length; i < n; i++) {
		         System.out.println(array[i]);
		      }
		      System.out.println();
		      Arrays.fill(array, 3, 6, 50);
		      
		      for (int i = 0, n = array.length; i< n; i++) {
		         System.out.println(array[i]);
		      }
		   }
	   
	   static void minmax() {
		      Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
		      int min = (int) Collections.min(Arrays.asList(numbers));
		      int max = (int) Collections.max(Arrays.asList(numbers));
		      
		      System.out.println("Min number: " + min);
		      System.out.println("Max number: " + max);
		   }
	   
	   static void mergeArray() {
		      String a[] = { "A", "E", "I" };
		      String b[] = { "O", "U" };
		      List<String> list = new ArrayList<String>(Arrays.asList(a));
		      list.addAll(Arrays.asList(b));
		      Object[] c = list.toArray();
		      System.out.println("Merge Arrays is : " +Arrays.toString(c));
		   }
	   
	   static void RemoveArrayElements() {
		      ArrayList objArray = new ArrayList();
		      ArrayList objArray2 = new ArrayList();
		      objArray2.add(0,"common1");
		      objArray2.add(1,"common2");
		      objArray2.add(2,"notcommon");
		      objArray2.add(3,"notcommon1");
		      objArray.add(0,"common1");
		      objArray.add(1,"common2");
		      objArray.add(2,"notcommon2");
		      System.out.println("Array elements of array1" +objArray);
		      System.out.println("Array elements of array2" +objArray2);
		      objArray.removeAll(objArray2);
		      System.out.println("Array1 after removing array2 from array1"+objArray);
		   }
	   static void removeElement() {
		      ArrayList objArray = new ArrayList();
		      objArray.clear();
		      objArray.add(0,"0th element");
		      objArray.add(1,"1st element");
		      objArray.add(2,"2nd element");
		      System.out.println("Array before removing an element"+objArray);
		      objArray.remove(1);
		      objArray.remove("0th element");
		      System.out.println("Array after removing an element"+objArray);
		   }
	   
	   public static void reverseArrayElements() {
		      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		      System.out.println("Array before reverse:");
		      
		      for (int i = 0; i < numbers.length; i++) {
		         System.out.print(numbers[i] + " ");
		      } 
		      for (int i = 0; i < numbers.length / 2; i++) {
		         int temp = numbers[i];
		         numbers[i] = numbers[numbers.length - 1 - i];
		         numbers[numbers.length - 1 - i] = temp;
		      } 
		      System.out.println("\nArray after reverse:");
		      for (int i = 0; i < numbers.length; i++) {
		         System.out.print(numbers[i] + " ");
		      } 
		   }
	   
	   public static void Reverse() {

		   	  ArrayList arrayList = new ArrayList();
		      arrayList.add("A");
		      arrayList.add("B");
		      arrayList.add("C");
		      arrayList.add("D");
		      arrayList.add("E");
		      System.out.println("Before Reverse Order: " + arrayList);
		      Collections.reverse(arrayList);
		      System.out.println("After Reverse Order: " + arrayList);
		   }
	   
	   public static void printWords() {

		   String[] arr = {"advacned java programming by K R Rathi" };
		   
		     for(String s : arr) {
		         String[] s2 = s.split(" ");
		         for(String results : s2) {
		             System.out.println(results);
		         }
		     }
	   }
	   
      static void duplicateWords(String inputString)
	       {
	           //Splitting inputString into words
    	  
	           String[] words = inputString.split(" ");
	    
	           //Creating one HashMap with words as key and their count as value
	    
	           HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
	    
	           //Checking each word
	    
	           for (String word : words)
	           {
	               //whether it is present in wordCount
	    
	               if(wordCount.containsKey(word.toLowerCase()))
	               {
	                   //If it is present, incrementing it's count by 1
	    
	                   wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
	               }
	               else
	               {
	                   //If it is not present, put that word into wordCount with 1 as it's value
	    
	                   wordCount.put(word.toLowerCase(), 1);
	               }
	           }
	    
	           //Extracting all keys of wordCount
	    
	           Set<String> wordsInString = wordCount.keySet();
	    
	           //Iterating through all words in wordCount
	    
	           for (String word : wordsInString)
	           {
	               //if word count is greater than 1
	    
	               if(wordCount.get(word) > 1)
	               {
	                   //Printing that word and it's count
	    
	                   System.out.println(word+" : "+wordCount.get(word));
	               }
	           }
	       }
	   
      public static void CountTheWords()
      {
    	  	  System.out.println("Enter the string");
       
              Scanner sc = new Scanner(System.in);
       
              String s=sc.nextLine();
       
              String[] words = s.trim().split(" ");
       
              System.out.println("Number of words in the string = "+words.length);
      }
      
      public static void CountCharacterOccurence()
      {
              String s = "Java AAA is java again java a again ";
              
              // regular Expression for white space is \\s
              //regular Expression for decimal character is \\d
       
              int count = s.length() - s.toLowerCase().replace("a", "").length();
              
              System.out.println("Number of occurances of 'a' in "+s+" = "+count);
          }
      
      public static void RemoveWhiteSpaceFromString()
      {
              String s = "Java AAA is java again java a again ";
              
              // regular Expression for white space is \\s
              //regular Expression for decimal character is \\d
              
              String oldVal = "\\s";
              String newVal = "";
       
              s = s.replaceAll	(oldVal, newVal);
              
              System.out.println("String without WHite space is : "  +s);
          }
      
        public static void isAnagram(String s1, String s2)
          {
              //Removing all white spaces from s1 and s2
              String copyOfs1 = s1.replaceAll("\\s", "");      
              String copyOfs2 = s2.replaceAll("\\s", "");
       
              //Initially setting status as true
              boolean status = true;
       
              if(copyOfs1.length() != copyOfs2.length())
              {
                  //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
                  status = false;
              }
              else
              {
                  //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
       
                  char[] s1Array = copyOfs1.toLowerCase().toCharArray();
                  char[] s2Array = copyOfs2.toLowerCase().toCharArray();
                  //Sorting both s1Array and s2Array
                  Arrays.sort(s1Array);
                  Arrays.sort(s2Array);
                  //Checking whether s1Array and s2Array are equal
                  status = Arrays.equals(s1Array, s2Array);
              }
       
              //Output
       
              if(status)
              {
                  System.out.println(s1+" and "+s2+" are anagrams");
              }
              else
              {
                  System.out.println(s1+" and "+s2+" are not anagrams");
              }
          }
        
      static void reverseEachWordOfString(String inputString)
        {
            String[] words = inputString.split(" ");
             
            String reverseString = "";
             
            for (int i = 0; i < words.length; i++) 
            {
                String word = words[i];
                 
                String reverseWord = "";
                 
                for (int j = word.length()-1; j >= 0; j--) 
                {
                    reverseWord = reverseWord + word.charAt(j);
                }
                 
                reverseString = reverseString + reverseWord + " ";
            }
             
            System.out.println(inputString);
             
            System.out.println("-------------------------");
            
            System.out.println(reverseString);
             
            System.out.println("-------------------------");
            
            //Convert Character to Integer
            char s= '5';
            int j = (int)s;
            
          //Convert Integer to Character
            int i1 = 99;
            char dl = (char)i1;
            
            //Convert String to Integer
            String str = "1234";
            int val = Integer.valueOf(str);
            int val1 = Integer.parseInt(str);
            
            //Convert Integer to String
            int i = 2015;
            String s1 = Integer.toString(i);
            String s2 = String.valueOf(i);
        }
        
      public static void SwapTwoStrings() 
      {  
              Scanner sc = new Scanner(System.in);
               
              System.out.println("Enter First String :");
               
              String s1 = sc.next();
               
              System.out.println("Enter Second String :");
               
              String s2 = sc.next();
               
              System.out.println("Before Swapping :");
               
              System.out.println("s1 : "+s1);
               
              System.out.println("s2 : "+s2);
               
              //Swapping starts
               
              s1 = s1 + s2;
               
              s2 = s1.substring(0, s1.length()-s2.length());
               
              s1 = s1.substring(s2.length());
               
              //Swapping ends
               
              System.out.println("After Swapping :");
               
              System.out.println("s1 : "+s1);
               
              System.out.println("s2 : "+s2);
          }   
      
 
    public static void StringPermutation(String permutation, String input)
          {   
              if(input.length() == 0)
              {
                  System.out.println(permutation);
              }
              else
              {
                  for (int i = 0; i < input.length(); i++)
                  {   
                      StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
                  }
              }
          }
    
        public static void firstRepeatedNonRepeatedChar(String inputString)
        {
            //Creating a HashMap containing char as a key and occurrences as a value
             
            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
             
            //Converting inputString to char array
             
            char[] strArray = inputString.toCharArray();
             
            //Checking each char of strArray
             
            for (char c : strArray)
            {
                if(charCountMap.containsKey(c))
                {
                    //If char is present in charCountMap, incrementing it's count by 1
                     
                    charCountMap.put(c, charCountMap.get(c)+1);
                }
                else
                {
                    //If char is not present in charCountMap,
                    //adding this char in charCountMap with 1 as it's value
                     
                    charCountMap.put(c, 1);
                }
            }
             
            //checking for first non-repeated character
             
            for (char c : strArray)
            {
                if (charCountMap.get(c) == 1)
                {
                    System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                     
                    break;
                }
            }
             
            //checking for first repeated character
             
            for (char c : strArray)
            {
                if (charCountMap.get(c) > 1)
                {
                    System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
                     
                    break;
                }
            }
    }
        
    public static void FileWriterExample()
        {   
                FileWriter fileWriter = null;
                 
                BufferedWriter bufferedWriter = null;
                 
                PrintWriter printWriter = null;
                 
                try
                {
                    //Opening a file in append mode using FileWriter
                     
                    fileWriter = new FileWriter("C:\\Dilip\\sample.txt", true);
                     
                    //Wrapping FileWriter object in BufferedWriter
                     
                    bufferedWriter = new BufferedWriter(fileWriter);
                     
                    //Wrapping BufferedWriter object in PrintWriter
                     
                    printWriter = new PrintWriter(bufferedWriter);
                     
                    //Bringing cursor to next line
                     
                    printWriter.println();
                     
                    //Writing text to file
                     
                    printWriter.println("Venkatesh : 789546");
                     
                    printWriter.println("Daniel : 874566");
                     
                    printWriter.println("Shankar : 789546");
                     
                    System.out.println("Done, Sample.txt file appended");
                } 
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    //Closing the resources
                     
                    try
                    {
                        printWriter.close();
                        bufferedWriter.close();
                        fileWriter.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
        }
    
    public static void WordCountInFile() 
    {   
            BufferedReader reader = null;
            //Initializing charCount, wordCount and lineCount to 0
             
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
             
            try
            {
                //Creating BufferedReader object
                 
                reader = new BufferedReader(new FileReader("C:\\Dilip\\sample.txt"));
                 
                //Reading the first line into currentLine
                 
                String currentLine = reader.readLine();
                 
                while (currentLine != null)
                {
                    //Updating the lineCount
                     
                    lineCount++;
                     
                    //Getting number of words in currentLine
                     
                    String[] words = currentLine.split(" ");
                     
                    //Updating the wordCount
                     
                    wordCount = wordCount + words.length;
                     
                    //Iterating each word
                     
                    for (String word : words)
                    {
                        //Updating the charCount
                         
                        charCount = charCount + word.length();
                    }
                     
                    //Reading next line into currentLine
                     
                    currentLine = reader.readLine();
                }
                 
                //Printing charCount, wordCount and lineCount
                 
                System.out.println("Number Of Chars In A File : "+charCount);
                 
                System.out.println("Number Of Words In A File : "+wordCount);
                 
                System.out.println("Number Of Lines In A File : "+lineCount);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    reader.close();           //Closing the reader
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
        }   
    }
    
    public static void RepeatedWordInFile() 
    {   
            //Creating wordCountMap which holds words as keys and their occurrences as values
             
            HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
         
            BufferedReader reader = null;
             
            try
            {
                //Creating BufferedReader object
                 
                reader = new BufferedReader(new FileReader("C:\\Dilip\\sample.txt"));
                 
                //Reading the first line into currentLine
                 
                String currentLine = reader.readLine();
                 
                while (currentLine != null)
                {   
                    //splitting the currentLine into words
                     
                    String[] words = currentLine.toLowerCase().split(" ");
                     
                    //Iterating each word
                     
                    for (String word : words)
                    {
                        //if word is already present in wordCountMap, updating its count
                         
                        if(wordCountMap.containsKey(word))
                        {   
                            wordCountMap.put(word, wordCountMap.get(word)+1);
                        }
                         
                        //otherwise inserting the word as key and 1 as its value
                        else
                        {
                            wordCountMap.put(word, 1);
                        }
                    }
                     
                    //Reading next line into currentLine
                     
                    currentLine = reader.readLine();
                }
                 
                //Getting the most repeated word and its occurrence
                 
                String mostRepeatedWord = null;
                 
                int count = 0;
                 
                Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
                 
                for (Entry<String, Integer> entry : entrySet)
                {
                    if(entry.getValue() > count)
                    {
                        mostRepeatedWord = entry.getKey();
                         
                        count = entry.getValue();
                    }
                }
                 
                System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
                 
                System.out.println("Number Of Occurrences : "+count);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    reader.close();           //Closing the reader
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
        }   
    }
    public static String ReverseStringWordByWordProgram(String inputString) 
    {
            String[] words = inputString.split("\\s");
             
            String outputString = "";
             
            for (int i = words.length-1; i >= 0; i--)
            {
                outputString = outputString + words[i] + " ";
            }
             
            return outputString;
        }
    
    public static void RemvoeAllVowels(String inputString)
    {   
            String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
             
            System.out.println("The string without vowels...");
             
            System.out.println(newInputString);
             
    }
    
    public static void TextFileModificationProgram(String filePath, String oldString, String newString)
    {   
            File fileToBeModified = new File(filePath);
             
            String oldContent = "";
             
            BufferedReader reader = null;
             
            FileWriter writer = null;
             
            try
            {
                reader = new BufferedReader(new FileReader(fileToBeModified));
                 
                //Reading all the lines of input text file into oldContent
                 
                String line = reader.readLine();
                 
                while (line != null) 
                {
                    oldContent = oldContent + line + System.lineSeparator();
                     
                    line = reader.readLine();
                }
                 
                //Replacing oldString with newString in the oldContent
                 
                String newContent = oldContent.replaceAll(oldString, newString);
                 
                //Rewriting the input text file with newContent
                 
                writer = new FileWriter(fileToBeModified);
                writer.write(newContent);
                System.out.println("Text Replaced, Check Text File.. ");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    //Closing the resources
                    reader.close();
                    writer.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    
    public static void AllSubStringsOfStringProgram(String inputString)
    {
            System.out.println("All possible substrings of "+inputString+" are : ");
             
            for (int i = 0; i < inputString.length(); i++) 
            {
                for (int j = i+1; j <= inputString.length(); j++) 
                {
                    System.out.println(inputString.substring(i, j));
                }
            }
        }
    
    public static void CommonCharsOfTwoStrings(String firstString, String secondString) 
    {
            char[] firstStringToCharArray = firstString.replaceAll("\\s+", "").toCharArray();
             
            char[] secondStringToCharArray = secondString.replaceAll("\\s+", "").toCharArray();
             
            Set<Character> firstStringSet = new TreeSet<>();
             
            Set<Character> secondStringSet = new TreeSet<>();
             
            for (char c : firstStringToCharArray) 
            {
                firstStringSet.add(c);
            }
             
            for (char c : secondStringToCharArray)
            {
                secondStringSet.add(c);
            }
             
            firstStringSet.retainAll(secondStringSet);
             
            System.out.println("Common characters in alphabetical order : "+firstStringSet);
             
            System.out.println("Count : "+firstStringSet.size());
        }
    
    public static void MaximumOccurringCharProgram(String inputString)
    {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
             
            char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
             
            for (char c : charArray) 
            {
                if (charCountMap.containsKey(c))
                {
                    charCountMap.put(c, charCountMap.get(c)+1);
                }
                else
                {
                    charCountMap.put(c, 1);
                }
            }
             
            Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
             
            int maxCount = 0;
             
            char maxChar = 0;
             
            for (Entry<Character, Integer> entry : entrySet) 
            {
                if (entry.getValue() > maxCount)
                {
                    maxCount = entry.getValue();
                     
                    maxChar = entry.getKey();
                }
            }
             
            System.out.println("Input String : "+inputString);
             
            System.out.println("Maximum Occurring char and its count :");
             
            System.out.println(maxChar+" : "+maxCount);
        }
         
	public static void main(String args[]) {
		
					ArrayDifferentFunctions arrCp = new ArrayDifferentFunctions();
					TwoDimArray();
					FillTest();
					minmax();
					mergeArray();
					RemoveArrayElements();
					removeElement();
					reverseArrayElements();
					Reverse();
					printWords();
					duplicateWords("Bread butter and bread");
					duplicateWords("a b c b a");
					//CountTheWords();
					CountCharacterOccurence();
					RemoveWhiteSpaceFromString();
					isAnagram("SiLeNt CAT", "LisTen AcT");
					reverseEachWordOfString("Java Concept Of The Day");
					//SwapTwoStrings();
					StringPermutation("", "JSP");
					firstRepeatedNonRepeatedChar("Korean Java Kotlin Concept");
					FileWriterExample();
					WordCountInFile();
					RepeatedWordInFile();
					System.out.println(ReverseStringWordByWordProgram("Java Concept of the Day"));
					RemvoeAllVowels("City of Arabian Nights");
					TextFileModificationProgram("C://Dilip//Sample.txt", "789546", "78000");
					AllSubStringsOfStringProgram("Java");
					CommonCharsOfTwoStrings("thin sticks","thick bricks");
					MaximumOccurringCharProgram("Java J2ee Android Hibernate JSP");
					MaximumOccurringCharProgram("61223336444455555666666");
			}
}
