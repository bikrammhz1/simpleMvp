package com.i.simplemvp.presenter;

import com.i.simplemvp.model.MainInterface;

public class MainPresenter implements MainInterface.presenter {
    MainInterface.view  view;

    public MainPresenter(MainInterface.view view) {
        this.view = view;
    }

    @Override
    public void sum(int a, int b) {
        view.answer(String.valueOf(a+b));
    }
}
