package com.j4loxa.j4edu.designpatterns.behavioral.memento;

public class Editor {
    private String content = "";
    private EditorMemento memento;

    public Editor() {
        memento = new EditorMemento("");
    }

    public void type(String words) {
        content += " " + words;
    }

    public String getContent() {
        return content;
    }

    public void save() {
        memento = new EditorMemento(content);
    }

    public void restore() {
        content = memento.getContent();
    }
}
