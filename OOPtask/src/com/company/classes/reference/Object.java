package com.company.classes.reference;

import com.company.classes.Reference;

import java.util.ArrayList;
import java.util.List;

public class Object extends Reference {

    private List<String> fields = new ArrayList<>();
    private List<String> methods = new ArrayList<>();

    @Override
    protected void alloc_memory() {

    }

    public Object copy() {
        return this;
    }

    public String getField(int i){
        return fields.get(i);
    }

    public String useMethod(int i){
        return methods.get(i);
    }

    public void addField(String field){
        fields.add(field);
    }

    public void addMethod(String method){
        methods.add(method);
    }

    //...

}
