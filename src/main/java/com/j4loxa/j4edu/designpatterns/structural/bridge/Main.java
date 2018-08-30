package com.j4loxa.j4edu.designpatterns.structural.bridge;

import com.j4loxa.j4edu.designpatterns.structural.bridge.pages.About;
import com.j4loxa.j4edu.designpatterns.structural.bridge.pages.Careers;
import com.j4loxa.j4edu.designpatterns.structural.bridge.themes.DarkTheme;
import com.j4loxa.j4edu.designpatterns.structural.bridge.themes.LightTheme;

public class Main {
    public static void main(String[] args) {
        var darkTheme = new DarkTheme();
        var lightTheme = new LightTheme();

        var about = new About(darkTheme);
        var careers = new Careers(lightTheme);

        System.out.print(about.getContent());
        System.out.print(careers.getContent());
    }
}
