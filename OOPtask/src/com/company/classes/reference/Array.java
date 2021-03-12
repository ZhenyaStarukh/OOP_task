package com.company.classes.reference;

import com.company.classes.Reference;

import java.util.ArrayList;
import java.util.List;

public class Array extends Reference {

    private List<Object> array = new ArrayList<>();

    @Override
    protected void alloc_memory() {

    }

    public List<Object> getArray(){
        return array;
    }

    public void add(){

    }

    public void remove(){

    }

    public Object get(int i){
        return array.get(i);
    }
}
