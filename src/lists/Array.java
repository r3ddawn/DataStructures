package lists;

public class Array implements List {
    private String[] array = new String[0];
    
    @Override
    public int size() {
        return array.length;
    }
    
    @Override
    public boolean isEmpty() {
        return array.length == 0;     
    }
    
    @Override
    public String get(int index){
        checkBounds(index);
        return array[index];
    }
    
    @Override
    public void add(String value, int index){
        if (array.length == 0 && index == 0) {
            array = new String[1];
            array[index] = value;
            return;
        }
        checkBounds(index);
        // New array to move values
        String[] temp = array;
        
        array = new String[array.length + 1];

        for (int x = 0; x < index; x++) {
            array[x] = temp[x];
        }
        array[index] = value;
        for (int x = index + 1; x < array.length; x++) {
            // Have to subtract 1 from temp index because of the new value added
            array[x] = temp[x - 1];
        }
    }
    
    @Override
    public void add(String value){
        if (array.length == 0) {
            array = new String[1];
            array[0] = value;
            return;
        }
        // New array to move values
        String[] temp = array;  
        // Resizing my class array
        array = new String[array.length + 1];
        // Moving values back
        for (int x = 0; x < temp.length; x++) {
            array[x] = temp[x];
        }
        // Adding new value to the array
        array[array.length - 1] = value;
    }
    
    @Override
    public void delete(int index){
        checkBounds(index);
        // New array to move values
        String[] temp = array;
        // Resizing array to avoid memory issues
        array = new String[array.length - 1];
        
        for (int x = 0; x < index; x++) {
            array[x] = temp[x];
        }
        for (int x = index; x < array.length; x++) {
            array[x] = temp[x + 1];
        }
    }
    
    @Override
    public void clear() {
        this.array = null;
    }
    
    public void print() {
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }
    
    private void checkBounds(int index) {
        if ( array.length == 0 || index > array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
