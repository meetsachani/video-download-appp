package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ParseErrorList extends ArrayList<ParseError> {
    public static final int Z = 16;
    public final int X;
    public final int Y;

    public ParseErrorList(int i, int i2) {
        super(i);
        this.X = i;
        this.Y = i2;
    }

    public static ParseErrorList f() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList h(int i) {
        return new ParseErrorList(16, i);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    public boolean d() {
        if (size() < this.Y) {
            return true;
        }
        return false;
    }

    public int e() {
        return this.Y;
    }

    public ParseErrorList(ParseErrorList parseErrorList) {
        this(parseErrorList.X, parseErrorList.Y);
    }
}
