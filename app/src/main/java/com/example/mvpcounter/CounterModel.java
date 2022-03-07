package com.example.mvpcounter;

public class CounterModel {
    int count = 0;

    public void increment(){
        ++count;
    }

    public void decrement(){
        --count;
    }

    public int getCount() {
        return count;
    }
}
