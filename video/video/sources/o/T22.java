package o;

import android.graphics.Path;

/* loaded from: classes.dex */
public class T22 implements InterfaceC6776hM {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final C8928q9 d;
    public final C9663t9 e;
    public final boolean f;

    public T22(String str, boolean z, Path.FillType fillType, C8928q9 c8928q9, C9663t9 c9663t9, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = c8928q9;
        this.e = c9663t9;
        this.f = z2;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C2991Fs0(c8431o61, abstractC8588ol, this);
    }

    public C8928q9 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public C9663t9 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
