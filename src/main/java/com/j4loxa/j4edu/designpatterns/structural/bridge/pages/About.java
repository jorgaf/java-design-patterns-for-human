package com.j4loxa.j4edu.designpatterns.structural.bridge.pages;

import com.j4loxa.j4edu.designpatterns.structural.bridge.themes.Theme;

public class About implements WebPage {
    private Theme theme;

    public About(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return String.format("About page in %s\n", theme.getColor());
    }
}
