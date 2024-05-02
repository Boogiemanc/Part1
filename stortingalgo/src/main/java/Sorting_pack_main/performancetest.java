package Sorting_pack_main;
import java.util.ArrayList;


public class performancetest{



public static void main (String[] args){
Generate_ID.ProductionID(Generate_ID.Day.SUN);
   ArrayList <String> Testing = new ArrayList<String>();
   
   ArrayList <String> Testing2 = new ArrayList<String>();
   
    long Start1,start2,end,end2;

    Testing2 =  Generate_ID.IDlist_WEEK.get(0) ;
    //output into csv
    writetocsv.write_Serial(Testing2,"WEEK_LIst_SUN.csv");
    //Original Sort
    Start1= System.nanoTime();  
   sorting.Quick_Sort(Testing2, 0, Testing2.size()-1);
   
  end =  System.nanoTime();
start2 = System.nanoTime();
  sorting_Improved.Quick_Sort(Testing2, 0, Testing2.size()-1);
  end2 =  System.nanoTime();
  writetocsv.write_Serial(Testing2,"WEEK_LIst_sorted_SUN.csv");
  System.out.println("It takes " + ((end-Start1)/1000000 )+" mili seconds");
  System.out.println("It takes " + ((end2-start2)/1000000 )+" mili seconds for improved");

  


}}
