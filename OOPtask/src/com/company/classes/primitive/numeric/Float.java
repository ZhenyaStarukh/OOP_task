package com.company.classes.primitive.numeric;

import com.company.classes.Capacity;
import com.company.classes.primitive.Numeric;

public final class Float extends Numeric {

    @Override
    public void setValue(boolean[] val) {

    }

    @Override
    public boolean[] getValue() {
        return value;
    }

    @Override
    protected void alloc_memory() {
        capacity = Capacity.DEFAULT;
        memory_in_bits = capacity.getCapacity();
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
