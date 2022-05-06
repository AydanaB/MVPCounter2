package com.example.mvpcounter;

import android.content.Context;

public class PresenterContracts {

    interface CounterView{
        void updateCounter(int counter);
        void showToast();
        void changeTvColor();
    }

    interface CounterPresenter{
        void increment();
        void decrement();
        void attachView(CounterView counterView);
    }
}
