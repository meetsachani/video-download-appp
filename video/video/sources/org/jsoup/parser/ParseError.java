package org.jsoup.parser;

/* loaded from: classes4.dex */
public class ParseError {
    public final int a;
    public final String b;
    public final String c;

    public ParseError(CharacterReader characterReader, String str) {
        this.a = characterReader.p0();
        this.b = characterReader.q0();
        this.c = str;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public String toString() {
        return "<" + this.b + ">: " + this.c;
    }

    public ParseError(CharacterReader characterReader, String str, Object... objArr) {
        this.a = characterReader.p0();
        this.b = characterReader.q0();
        this.c = String.format(str, objArr);
    }

    public ParseError(int i, String str) {
        this.a = i;
        this.b = String.valueOf(i);
        this.c = str;
    }

    public ParseError(int i, String str, Object... objArr) {
        this.a = i;
        this.b = String.valueOf(i);
        this.c = String.format(str, objArr);
    }
}
