package com.company.classes.primitive;

import com.company.classes.Primitive;

public abstract class Numeric extends Primitive {

    protected boolean signed;

    public void makeSigned() {
        signed = true;
    }

    public void makeUnsigned() {
        signed = false;
    }

    public abstract void add();
    public abstract void subtract();
    public abstract void multiply();
    public abstract void divide();

}
