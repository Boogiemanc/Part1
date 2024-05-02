package Sorting_pack_main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.CSVWriter;
public class writetocsv {

    public static void write_Serial(ArrayList<String> Target,String fileName) {
       
        String FileLocation = "D:/big programming folder/algos and structure/ass2/Part1/";
        File file = new File(fileName);
        
//set file path
        try{

            FileWriter output = new FileWriter(file);

            CSVWriter writer = new CSVWriter(output);

            //header{
            String[] header = { "Serial_Number"};
            writer.writeNext(header);
            Target.forEach(Se_Num ->{
                String[] holder = { Se_Num } ;
                writer.writeNext(holder);


            });

            writer.close();




        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}