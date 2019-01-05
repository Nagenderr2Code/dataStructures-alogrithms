package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {

    private static final int INITIAL_SIZE = 3;

    private Object data[];
    private int size;
    private int index;

    MyArray() {
        this.data = new Object[INITIAL_SIZE];
        this.size = INITIAL_SIZE;
    }

    //TimeComplexity : 0(1)
    void add(Object itemToAdd) {
        System.out.println("Size::" + this.size + "Index:: "+ this.index
        + "Length::" + this.data.length);
        if(this.index == this.size-1){
            this.size = this.size+INITIAL_SIZE;
            //this.data=Arrays.copyOf(this.data,this.size);
            increaseSizeAndReallocate();
        }
        this.data[this.index] = itemToAdd;
        this.index++;
    }

    // TimeComplexity: O(n)
    void remove(int index){
        if(index>this.size-1){
            throw new ArrayIndexOutOfBoundsException();
        }

        if(index<0){
            throw new RuntimeException("Negitive Index");
        }
        //[1 2 3 4 5]
        for(int i=index; i<this.data.length-1; i++){
            data[i]= data[i+1];
        }
        this.index--;
    }

    //TimeComplexity: O(1)
    Object get(int index){

        if(index>=this.index){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index<0){
            throw new RuntimeException("Negitive Index");
        }
        return this.data[index];
    }

    void increaseSizeAndReallocate(){
        this.size = this.size+ INITIAL_SIZE;
        Object[] newObject = new Object[this.size];

        for(int i=0; i<this.data.length; i++){
            newObject[i] = this.data[i];
        }
        this.data= newObject;
    }

    public static void main(String[] args) {

        MyArray arr = new MyArray();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.remove(2);

        arr.add(5);

        System.out.println("Data In Array.." + arr.get(2));
    }

}
