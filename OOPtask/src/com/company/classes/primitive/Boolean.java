package com.company.classes.primitive;

import com.company.classes.Capacity;
import com.company.classes.Primitive;

public final class Boolean extends Primitive {

    @Override
    public void setValue(boolean[] val) {

    }

    @Override
    protected void alloc_memory() {
        capacity = Capacity.BOOL;
        memory_in_bits = capacity.getCapacity();
    }

    @Override
    public boolean[] getValue() {
        return value;
    }
}
