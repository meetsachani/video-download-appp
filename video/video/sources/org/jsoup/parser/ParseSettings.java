package org.jsoup.parser;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

/* loaded from: classes4.dex */
public class ParseSettings {
    public static final ParseSettings c = new ParseSettings(false, false);
    public static final ParseSettings d = new ParseSettings(true, true);
    public final boolean a;
    public final boolean b;

    public ParseSettings(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static String a(String str) {
        return Normalizer.b(str);
    }

    public String b(String str) {
        String trim = str.trim();
        if (!this.b) {
            return Normalizer.a(trim);
        }
        return trim;
    }

    public void c(Attributes attributes) {
        if (!this.b) {
            attributes.f0();
        }
    }

    public String d(String str) {
        String trim = str.trim();
        if (!this.a) {
            return Normalizer.a(trim);
        }
        return trim;
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return this.a;
    }

    public ParseSettings(ParseSettings parseSettings) {
        this(parseSettings.a, parseSettings.b);
    }
}
