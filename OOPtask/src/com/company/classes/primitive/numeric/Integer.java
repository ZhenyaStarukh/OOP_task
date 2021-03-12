package com.company.classes.primitive.numeric;

import com.company.classes.Capacity;
import com.company.classes.primitive.Numeric;

public final class Integer extends Numeric {

    @Override
    protected void alloc_memory() {
        capacity = Capacity.DEFAULT;
        memory_in_bits = capacity.getCapacity();
    }

    @Override
    public boolean[] getValue() {
        return value;
    }

    @Override
    public void setValue(boolean[] val) {

    }

    @Override
    public void add() {

    }

    @Override
    public void subtract() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void divide() {

    }
}
