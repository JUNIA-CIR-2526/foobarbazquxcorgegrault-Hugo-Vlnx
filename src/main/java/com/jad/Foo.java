package com.jad;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public List<Grault> getGraults() {
        return this.graults;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }


    public Bar getBar() {
        return bar;

    }

    public Qux getQux() {
        return qux;
    }
}
