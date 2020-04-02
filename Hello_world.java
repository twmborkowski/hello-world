//============================
//=========LIBRARIES============
//============================
//import java.lang.*; //default
import java.util.*;

//============================
//=========PROGRAM============
public class Hello_world
{
  //========MAIN FUNCTION========
  public static void main(String[] args)
  {
    System.out.println("Witaj! Dzisiaj jest: ");
    System.out.println(new Date());
    System.getProperties().list(System.out);
    //informacje o środowisku wykonania programu
    System.out.println(System.getProperty("user.name"));
    //dostęp do nazwy użytkownika
    System.out.println(System.getProperty("java.library.path"));
    //dostęp do zmiennej środowiskowej PATH
  }
}
