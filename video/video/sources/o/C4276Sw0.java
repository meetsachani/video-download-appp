package o;

import java.util.List;

/* renamed from: o.Sw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4276Sw0 {
    public final List<V22> a;
    public final char b;
    public final double c;
    public final double d;
    public final String e;
    public final String f;

    public C4276Sw0(List<V22> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public static int c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<V22> a() {
        return this.a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return c(this.b, this.f, this.e);
    }
}
