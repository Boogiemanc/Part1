package Sorting_pack_main;

import java.util.ArrayList;
public class sorting{
    
    
public static int partition(ArrayList<String> list , int Right, int Left){
    int l = Left;
    int r = Right;
    int P = (int)(Left+Right)/2;
    String Piviot_string_value = list.get(P);
                       while (l<=r ) {
        //prevent overlap
    String Left_string_value = list.get(l);
   String Right_string_value = list.get(r);
   
   
     
  
   
   while ((list.get(r).compareTo(Piviot_string_value)>0)) {
    r--; 
Right_string_value = list.get(r); //if the left most digital is larger than move the pointer on the left
}
while( (list.get(l).compareTo(Piviot_string_value))<0 ) {
    l++; 
    Left_string_value = list.get(l);       //Piviot in middle so no need to compare left,right values agaian
                       //if the rightmost digital is larger than move the pointer on the left
    }


if (l<=r) {
     
    list.set(r, Left_string_value) ;
    list.set(l, Right_string_value) ;
    l++;
    r--;
    

}






}

return l;
}



public static void Quick_Sort(ArrayList<String> list,int left, int right){


int Left_Most_Index = left;
int Right_Most_Index =right;


//  if (right-left <10) {
//    insertion(list, Right_Most_Index, Left_Most_Index);
    
// }

// else{

if (left< right) {

int piviot =  partition(list, Right_Most_Index,Left_Most_Index);
   if (left < piviot-1) {
    Quick_Sort(list, left, piviot-1);
   }
    if (piviot<right) {
        Quick_Sort(list,piviot,right);
    }
    






}}





}














