public class UpOneLetterApp {

 
  static public String firstLetterCaps ( String data )
  {
      String firstLetter = data.substring(0,1).toUpperCase();
      String restLetters = data.substring(1).toLowerCase();
      return firstLetter + restLetters;
  }
}