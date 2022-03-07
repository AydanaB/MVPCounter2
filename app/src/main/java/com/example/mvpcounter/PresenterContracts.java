package com.example.mvpcounter;

import android.content.Context;

public class PresenterContracts {

    interface CounterView{
        void updateCounter(int counter);
        void showToast(String message);
        void changeTvColor(int color);
    }

    interface CounterPresenter{
        void increment();
        void decrement();
        void attachView(CounterView counterView);
    }
}
