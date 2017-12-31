package com.spring.bean;

import com.spring.interfaces.Bean;

/**
 * Created by JC on 2017/12/24.
 */
public class TestBean implements Bean {
    @Override
    public void perform() {
        System.out.println("I'm TestBean");
    }
}
