package com.epam.hw7;

public class Validator{
  public static void validYear(int newYear) throws Exception{
      if (newYear < 1000|| newYear > 2019)
          throw new Exception("Please, enter year from 1000 to 2019");
  }
  public static void validAuthor(String newAuthor) throws Exception{
      if (newAuthor.isEmpty()){
          throw new Exception("Please, enter author");
      }

  }
  public static void validPrice(double newPrice) throws Exception{
      if (newPrice <=0){
          throw new Exception("Please, enter number more than 0 ");
      }
  }
}

