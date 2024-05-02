package Sorting_pack_main;

import java.util.ArrayList;





/**
 * Generate_ID
 */
public class Generate_ID {

    private static final String Cap_letters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Numbers ="1234567890";
    public static enum Day {MON, TUE, WED,THU,FRI,SAT,SUN }; // To seperate the amount of productions each day.
    public static ArrayList <String> IDlist_DAY = new ArrayList<String>();
    public static ArrayList <ArrayList<String>> IDlist_WEEK = new ArrayList<ArrayList<String>>();
    
    public static void ID_Generation(int Amount){
        IDlist_DAY = new ArrayList<String>();
        for(int i =0; i< Amount; i++){



        
        StringBuilder SB_ID = new StringBuilder(5); // Create a set of ID'S with the structure of AA000
        SB_ID.append(Insert_From_Index(true,2));
        SB_ID.append(Insert_From_Index(false,3));
       IDlist_DAY.add(SB_ID.toString());
        }
        
        IDlist_WEEK.add(IDlist_DAY);
    }


    public static String Insert_From_Index(boolean IS_String , int times){
        StringBuilder ID= new StringBuilder(times);
       for(int i =0; i< times; i++){
        if (IS_String) {
            int Index_Letters = (int)(Cap_letters.length()*Math.random());
            ID.append(Cap_letters.charAt(Index_Letters)) ;
        }else{
            int Index_Numbers = ((int)(Numbers.length()*Math.random()));
            ID.append(Numbers.charAt(Index_Numbers)) ;
        }
        
       }

        return ID.toString();
    }
    public static void ProductionID(Day day){
        
       try{
        switch (day) {
            case MON:
            ID_Generation(1000) ;
                break;
            case TUE:
            ID_Generation(5000) ;
                break;
            case WED:
            ID_Generation(100000) ;
                break;
                case THU:
                ID_Generation(500000) ;
                break;
            case FRI:
            ID_Generation(75000) ;
                break;
            case SAT:
            ID_Generation(100000) ;
                break;
            case SUN:
            ID_Generation(500000) ;
                break;
       }
        
       } catch (Exception e) {
        System.out.println("Can't find the days of the week");
       }
        
            
        }
            
        
        
    

       
/*public static void main (String[] args){
    ProductionID(Day.SUN);
   ArrayList <String> Testing = new ArrayList<String>();
   Testing.add("EG531");
   Testing.add("II345");
   Testing.add("KK475");
   Testing.add("AB342");
   Testing.add("OI821");
   Testing.add("MM876");
   Testing.add("LP352");
   Testing.add("ZF832");
   Testing.add("SG715");
   Testing.add("NQ191");
  Testing.add("LV491");
   Testing.add("AF445");
   ArrayList <String> Testing2 = new ArrayList<String>();
   writetocsv.write_Serial(Testing);
    long Start1,start2,end,end2;
    
    Start1= System.nanoTime();
     Testing2 = IDlist_WEEK.get(0) ;

   sorting.Quick_Sort(Testing2, 0, Testing2.size()-1);
   
  end =  System.nanoTime();
start2 = System.nanoTime();
  sorting_Improved.Quick_Sort(Testing2, 0, Testing2.size()-1);
  end2 =  System.nanoTime();
  System.out.println(Testing);
  System.out.println("It takes " + ((end-Start1)/1000000 )+" mili seconds");
  System.out.println("It takes " + ((end2-start2)/1000000 )+" mili seconds for improved");

  


}
*/
}