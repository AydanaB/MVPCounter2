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
        if (counterModel.getCount() == 5){
            counterView.showToast("Ура");
        }
        if (counterModel.getCount() == 10){
            counterView.changeTvColor(R.color.green);
        }else {
            counterView.changeTvColor(R.color.black);
        }
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
        if (counterModel.getCount() == 5){
            counterView.showToast("Ура");
        }
        if (counterModel.getCount() == 10){
            counterView.changeTvColor(R.color.green);
        }else {
            counterView.changeTvColor(R.color.black);
        }
    }

    @Override
    public void attachView(PresenterContracts.CounterView counterView) {
        this.counterView = counterView;
    }
}
