package com.bvrith.CustomCollections;

import java.util.*;

public class List<E>  {
    private int size = 0;
    private static final int INIT_CAPACITY = 10;
    private Object listElements[];
 
    public List() {
        listElements = new Object[INIT_CAPACITY];
    }
 
    public void add(E e) {
        if (size == listElements.length) {
            ensureCapacity();
        }
        listElements[size++] = e;
    }
     
    //Get method
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) listElements[i];
    }
     
    //Remove method
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = listElements[i];
        int numElts = listElements.length - ( i + 1 ) ;
        System.arraycopy( listElements, i + 1, listElements, i, numElts ) ;
        size--;
        return (E) item;
    }
     
    public int getSize() {
        return size;
    }
     
   
    public String toString() {
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < size ;i++) {
             sb.append(listElements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = listElements.length * 2;
        listElements = Arrays.copyOf(listElements, newSize);
    }
}