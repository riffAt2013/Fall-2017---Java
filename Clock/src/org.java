
public class org {
    private int[] data;
    
    org (int size) {
        data = new int[size]; 
    }
    
    public void inserttoField (int index, int value) {
        data[index] = value;
    }
    
    public int getFieldItem (int index) {
        return data[index];
    }
    
    public int[] getAllData (){
        return data;
    } 
            
    


public static void main (String[] args )
{
  org array1 = new org (5);
  array1.inserttoField(0, 1);
  array1.inserttoField(1, 2);
  array1.inserttoField(2, 3);
  array1.inserttoField(3, 4);
  array1.inserttoField(4, 5);
  
    System.out.println(array1.getAllData());
    
}
}
