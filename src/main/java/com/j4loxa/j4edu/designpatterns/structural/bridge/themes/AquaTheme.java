package com.j4loxa.j4edu.designpatterns.structural.bridge.themes;

import com.j4loxa.j4edu.designpatterns.structural.bridge.themes.Theme;

public class AquaTheme implements Theme {
    @Override
    public String getColor() {
        return "Light blue";
    }
}
