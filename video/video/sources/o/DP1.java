package o;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class DP1 implements InterfaceC6776hM {
    public final String a;
    public final H9<PointF, PointF> b;
    public final H9<PointF, PointF> c;
    public final C9177r9 d;
    public final boolean e;

    public DP1(String str, H9<PointF, PointF> h9, H9<PointF, PointF> h92, C9177r9 c9177r9, boolean z) {
        this.a = str;
        this.b = h9;
        this.c = h92;
        this.d = c9177r9;
        this.e = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new CP1(c8431o61, abstractC8588ol, this);
    }

    public C9177r9 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public H9<PointF, PointF> d() {
        return this.b;
    }

    public H9<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
