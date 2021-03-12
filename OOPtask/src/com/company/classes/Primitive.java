package com.company.classes;

public abstract class Primitive extends Type {

    protected Capacity capacity;
    protected boolean[] value;

    public abstract void setValue(boolean[] val);

    public abstract boolean[] getValue();


}
