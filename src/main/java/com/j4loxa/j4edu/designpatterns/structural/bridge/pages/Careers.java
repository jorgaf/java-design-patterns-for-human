package com.j4loxa.j4edu.designpatterns.structural.bridge.pages;

import com.j4loxa.j4edu.designpatterns.structural.bridge.themes.Theme;

public class Careers implements WebPage {
    private Theme theme;

    public Careers(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return String.format("Careers page in %s\n", theme.getColor());
    }
}
