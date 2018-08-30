package com.j4loxa.j4edu.designpatterns.behavioral.state;

public class TextEditor {
    private WritingState state;

    public TextEditor() {
        state = new DefaultText();
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void type(String words) {
        state.write(words);
    }
}
