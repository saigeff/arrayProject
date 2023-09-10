//import java.util.ArrayList;
//import java.util.Arrays;

public class arrayLists <E> {

  Object [] list;
  int size;


  public arrayLists(){

    list = new Object[0];
    size = 0;

  }

  public void add (E val){
    //loop thorugh the real list and replace the empty temp values with the ones that are in the real list
    Object[] temp = new Object[ size + 1 ];
    for(int i = 0; i < size; i++){
      temp[i] = list[i];
    }
    //add the parameter to the end of the array
    temp[size] = val;
    size++;

    //set the list equal to the temp
    list = temp;


  }

  public void addWSpot (int val, int spot){
    Object[] temp = new Object[ size + 1 ];
    for(int i = 0; i < size; i++){
      if (i == spot){
        temp[i] = val;
        i++;
      }

      temp[i] = list[i];
    }

    list = temp;

    


  }

  public void set (int spot, E val){
    for(int i = 0; i < size; i++){
      //the the idex is equal to the spot inputted... skip over it
      if (i == spot){
        list[i] = val;
        i++;
      }
     }
    


  }

  public int size (int val){
    return list.length;
    


  }

  public void remove (int spot){
     //loop thorugh the real list and replace the empty temp values with the ones that are in the real list
     Object[] temp = new Object[ size - 1 ];
     for(int i = 0; i < size; i++){
      //the the idex is equal to the spot inputted... skip over it
      if (i == spot){
        temp[i] = list[i+1];
        i++;
      } else{
        temp[i] = list[i];
      }
     }
    
 
     //set the list equal to the temp
     list = temp;
     size--;
 


  }

  public Object get (int val){
    return list[val];

  }

  public Object print(){
    return list;

  }





  }


  




  