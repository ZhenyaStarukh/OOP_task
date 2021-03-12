package com.company.classes;

public enum Capacity {
    BOOL(1),TINY(8), SHORT(16), DEFAULT(32), LONG(64);

    private final long capacity;

    Capacity(long capacity) {
        this.capacity = capacity;
    }

    public long getCapacity() { return capacity; }
}
