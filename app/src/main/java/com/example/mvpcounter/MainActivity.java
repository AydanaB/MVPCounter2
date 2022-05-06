package com.example.mvpcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvpcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements PresenterContracts.CounterView{
    ActivityMainBinding binding;
    CounterPresenter counterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterPresenter = Injector.getPresenter();
        counterPresenter.attachView(this);
        initClickers();
    }

    private void initClickers() {
        binding.btnDecrement.setOnClickListener(v -> counterPresenter.decrement());
        binding.btnIncrement.setOnClickListener(v -> counterPresenter.increment());
    }

    @Override
    public void updateCounter(int counter) {
        binding.tvCounter.setText(String.valueOf(counter));
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Поздравляю!", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void changeTvColor() {
        binding.tvCounter.setTextColor(R.color.green);
    }
}