package org.jsoup.parser;

import java.util.Objects;

/* loaded from: classes4.dex */
public class Tag implements Cloneable {
    public static int Z0 = 1;
    public static int a1 = 2;
    public static int b1 = 4;
    public static int c1 = 8;
    public static int d1 = 16;
    public static int e1 = 32;
    public static int f1 = 64;
    public static int g1 = 128;
    public static int h1 = 256;
    public static int i1 = 512;
    public String X;
    public String Y;
    public int Y0;
    public String Z;

    public Tag(String str, String str2) {
        this(str, ParseSettings.a(str), str2);
    }

    public static Tag A(String str, ParseSettings parseSettings) {
        return z(str, Parser.b1, parseSettings);
    }

    public static boolean l(String str) {
        if (TagSet.d.r(str, Parser.b1) != null) {
            return true;
        }
        return false;
    }

    public static Tag y(String str) {
        return z(str, Parser.b1, ParseSettings.d);
    }

    public static Tag z(String str, String str2, ParseSettings parseSettings) {
        return TagSet.o().w(str, null, str2, parseSettings.f());
    }

    public Tag b(int i) {
        int i2 = this.Y0 & (~i);
        this.Y0 = i2;
        int i3 = Z0;
        if (i != i3) {
            this.Y0 = i2 | i3;
        }
        return this;
    }

    /* renamed from: c */
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public boolean d() {
        if ((this.Y0 & c1) != 0) {
            return true;
        }
        return false;
    }

    public String e() {
        return this.Y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (Objects.equals(this.Y, tag.Y) && Objects.equals(this.X, tag.X) && Objects.equals(this.Z, tag.Z) && this.Y0 == tag.Y0) {
            return true;
        }
        return false;
    }

    public boolean f(int i) {
        if ((i & this.Y0) != 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if ((this.Y0 & b1) != 0) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if ((this.Y0 & a1) != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.Y, this.X);
    }

    public boolean i() {
        if ((this.Y0 & i1) != 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if ((this.Y0 & b1) == 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if ((this.Y0 & Z0) != 0) {
            return true;
        }
        return false;
    }

    public boolean m() {
        int i = this.Y0;
        if ((d1 & i) == 0 && (i & a1) == 0) {
            return false;
        }
        return true;
    }

    public String n() {
        int indexOf = this.Y.indexOf(58);
        if (indexOf == -1) {
            return this.Y;
        }
        return this.Y.substring(indexOf + 1);
    }

    public String o() {
        return this.Y;
    }

    public Tag p(String str) {
        this.Y = str;
        this.Z = ParseSettings.a(str);
        return this;
    }

    public String q() {
        return this.X;
    }

    public Tag r(String str) {
        this.X = str;
        return this;
    }

    public String s() {
        return this.Z;
    }

    public String t() {
        int indexOf = this.Y.indexOf(58);
        if (indexOf == -1) {
            return "";
        }
        return this.Y.substring(0, indexOf);
    }

    public String toString() {
        return this.Y;
    }

    public boolean u() {
        if ((this.Y0 & f1) != 0) {
            return true;
        }
        return false;
    }

    public Tag v(int i) {
        this.Y0 = i | this.Y0 | Z0;
        return this;
    }

    public void w() {
        this.Y0 |= e1;
    }

    public TokeniserState x() {
        if (f(g1)) {
            return TokeniserState.Rcdata;
        }
        if (f(h1)) {
            return TokeniserState.Rawtext;
        }
        return null;
    }

    public Tag(String str) {
        this(str, ParseSettings.a(str), Parser.b1);
    }

    public Tag(String str, String str2, String str3) {
        this.Y0 = 0;
        this.Y = str;
        this.Z = str2;
        this.X = str3;
    }
}
