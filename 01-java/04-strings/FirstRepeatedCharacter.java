public class FirstRepeatedCharacter
 {
  public static void main(String[] args)
    {
     char ch = firstRepeated("swiss");
     System.out.println(ch);       
  }

    
    public static char firstRepeated(String word)
       {
        int len = word.length();
        for(int i=0; i<len; i++)
         { 
          char current = word.charAt(i);
          int count = countCharacter(word, current);
          if (count>1)
           {
            return current; 
           }
          }
            return '\0';
       }
 
    public static int countCharacter(String word, char target)
    {
     int len = word.length();
     int count=0;
     for(int i=0; i<len; i++)
        {
         if(word.charAt(i) == target)
          {
           count++;
          }
        }
     return count;
   }
}
