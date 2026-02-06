package o;

import android.graphics.PointF;

/* renamed from: o.tC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9675tC implements InterfaceC6776hM {
    public final String a;
    public final H9<PointF, PointF> b;
    public final C10395w9 c;
    public final boolean d;
    public final boolean e;

    public C9675tC(String str, H9<PointF, PointF> h9, C10395w9 c10395w9, boolean z, boolean z2) {
        this.a = str;
        this.b = h9;
        this.c = c10395w9;
        this.d = z;
        this.e = z2;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C9766ta0(c8431o61, abstractC8588ol, this);
    }

    public String b() {
        return this.a;
    }

    public H9<PointF, PointF> c() {
        return this.b;
    }

    public C10395w9 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
