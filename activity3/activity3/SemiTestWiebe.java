
/**
 * Write a description of class SemiTestWiebe here.
 * Just a litte quiz from Wiebe
 * 
 * @author Kong 
 * @version 10.9.17
 */
public class SemiTestWiebe
{
    public class Exercise{
        String str;
        public Exercise(){
            str = "Welcome to class";
        }	


    }
    public int howLong(){
        return str.length();
    }

    public void printLetters(){
       for (in i = 0; i < str.length(); i++){
           
           System.out.println(str.substring(i, i+1));
        }
    }
}
