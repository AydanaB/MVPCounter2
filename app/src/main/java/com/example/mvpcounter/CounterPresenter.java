package com.example.mvpcounter;

import android.content.Context;
import android.widget.Toast;

public class CounterPresenter implements PresenterContracts.CounterPresenter{
    PresenterContracts.CounterView counterView;
    CounterModel counterModel;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
        if (counterModel.count == 10){
            counterView.showToast();
        }else if (counterModel.count == 15){
            counterView.changeTvColor();
        }
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
        if (counterModel.count == 10){
            counterView.showToast();
        }else if (counterModel.count == 15){
            counterView.changeTvColor();
        }
    }

    @Override
    public void attachView(PresenterContracts.CounterView counterView) {
        this.counterView = counterView;
    }
}
