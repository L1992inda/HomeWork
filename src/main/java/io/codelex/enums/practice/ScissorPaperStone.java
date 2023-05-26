package io.codelex.enums.practice;

public enum ScissorPaperStone {

    SCISSOR("Scissor"),
    PAPER("Paper"),
    ROCK("Rock");

    String name;

    ScissorPaperStone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
