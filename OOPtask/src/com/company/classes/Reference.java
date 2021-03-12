package com.company.classes;

public abstract class Reference extends Type {

    protected String memory_address;

    protected String reference;

    public String getMemory_address() {
        return memory_address;
    }

    protected void setMemory_address(String memory_address) {
        this.memory_address = memory_address;
    }

    public String getReference() {
        return reference;
    }

    protected void setReference(String reference) {
        this.reference = reference;
    }

    public boolean equal(){
        return true;
    }
}
