import java.util.Scanner;

public class Strings2
{
  public static void main(String [] args)
  {
    // Get input
    Scanner input = new Scanner(System.in);
    String name = input.nextLine().trim();
    
    String firstWord, secondWord, lastWord;
    
    // Check for semi-colon, and extract first word, second word and last word.
    int indexSemicolon = name.indexOf(';');
    int lastSemicolon = name.lastIndexOf(';');
   
     // Extract first word, second word and last word
     firstWord = name.substring(0, indexSemicolon).trim();
     secondWord = name.substring((indexSemicolon + 1), (lastSemicolon )).trim();
     lastWord =  name.substring( lastSemicolon + 1).trim();
    
   
     // Normalize capitalization of names.
     firstWord = Character.toUpperCase(firstWord.charAt(0)) +
     firstWord.substring(1).toLowerCase();
     secondWord = Character.toUpperCase(secondWord.charAt(0)) +
     secondWord.substring(1).toLowerCase(); 
     lastWord = Character.toUpperCase(lastWord.charAt(0)) +
     lastWord.substring(1).toLowerCase(); 
      
     // Order Strings in lexicographic order
     String firstLexiWord;
     String secondLexiWord;
     String lastLexiWord;

      if (firstWord.compareTo(secondWord) < 0 && firstWord.compareTo(lastWord) < 0)
      {
        if (secondWord.compareTo(lastWord) < 0) {
      
          
       firstLexiWord = firstWord;
       secondLexiWord = secondWord;
       lastLexiWord = lastWord;
        }
       else
        {
          firstLexiWord = firstWord;
          secondLexiWord = lastWord;
          lastLexiWord = secondWord;
        }
      }
      else if ((firstWord.compareTo(secondWord) < 0) && (firstWord.compareTo(lastWord) > 0))

      {
        firstLexiWord = lastWord;
        secondLexiWord = firstWord;
        lastLexiWord = secondWord;
      }
      else if ((firstWord.compareTo(secondWord) > 0) && (firstWord.compareTo(lastWord) < 0))
      {
         firstLexiWord = secondWord;
         secondLexiWord = firstWord;
         lastLexiWord = lastWord;
       }
      
       else if ((secondWord.compareTo(lastWord) < 0) && (lastWord.compareTo(firstWord) < 0)) 
       {
         firstLexiWord = secondWord;
         secondLexiWord = lastWord;
         lastLexiWord = firstWord;
       }
       else 
       {
         firstLexiWord = lastWord;
         secondLexiWord = secondWord;
         lastLexiWord = firstWord; 
       }
       
       
          // Print the individual Strings in lexicographic order, one per line.
          System.out.println(firstLexiWord);
          System.out.println(secondLexiWord);
          System.out.println(lastLexiWord);
          
        
    
  }
}