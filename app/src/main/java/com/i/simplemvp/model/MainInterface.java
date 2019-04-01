package com.i.simplemvp.model;

public interface MainInterface  {

    interface view{
        void answer(String msg);

    }

    interface presenter{
        void sum(int a,int b);
    }
}
