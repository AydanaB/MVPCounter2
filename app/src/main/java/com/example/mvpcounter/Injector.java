package com.example.mvpcounter;

public class Injector {

    public static CounterPresenter getPresenter(){
        return new CounterPresenter();
    }
}
