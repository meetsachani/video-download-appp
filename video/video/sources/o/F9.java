package o;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class F9 implements InterfaceC10782xk1, InterfaceC6776hM {
    public final C9906u9 a;
    public final H9<PointF, PointF> b;
    public final C10638x9 c;
    public final C9177r9 d;
    public final C9663t9 e;
    public final C9177r9 f;
    public final C9177r9 g;
    public final C9177r9 h;
    public final C9177r9 i;
    public final C9177r9 j;
    public final C9177r9 k;
    public final C9177r9 l;
    public boolean m;

    public F9() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return null;
    }

    public C5190as2 b() {
        return new C5190as2(this);
    }

    public C9906u9 c() {
        return this.a;
    }

    public C9177r9 d() {
        return this.l;
    }

    public C9663t9 e() {
        return this.e;
    }

    public H9<PointF, PointF> f() {
        return this.b;
    }

    public C9177r9 g() {
        return this.d;
    }

    public C9177r9 h() {
        return this.h;
    }

    public C9177r9 i() {
        return this.i;
    }

    public C9177r9 j() {
        return this.j;
    }

    public C10638x9 k() {
        return this.c;
    }

    public C9177r9 l() {
        return this.f;
    }

    public C9177r9 m() {
        return this.g;
    }

    public C9177r9 n() {
        return this.k;
    }

    public boolean o() {
        if (this.h == null && this.i == null && this.j == null) {
            return false;
        }
        return true;
    }

    public boolean p() {
        return this.m;
    }

    public void q(boolean z) {
        this.m = z;
    }

    public F9(C9906u9 c9906u9, H9<PointF, PointF> h9, C10638x9 c10638x9, C9177r9 c9177r9, C9663t9 c9663t9, C9177r9 c9177r92, C9177r9 c9177r93, C9177r9 c9177r94, C9177r9 c9177r95) {
        this(c9906u9, h9, c10638x9, c9177r9, c9663t9, c9177r92, c9177r93, c9177r94, c9177r95, null, null, null);
    }

    public F9(C9906u9 c9906u9, H9<PointF, PointF> h9, C10638x9 c10638x9, C9177r9 c9177r9, C9663t9 c9663t9, C9177r9 c9177r92, C9177r9 c9177r93, C9177r9 c9177r94, C9177r9 c9177r95, C9177r9 c9177r96, C9177r9 c9177r97, C9177r9 c9177r98) {
        this.m = false;
        this.a = c9906u9;
        this.b = h9;
        this.c = c10638x9;
        this.d = c9177r9;
        this.e = c9663t9;
        this.k = c9177r92;
        this.l = c9177r93;
        this.f = c9177r94;
        this.g = c9177r95;
        this.h = c9177r96;
        this.i = c9177r97;
        this.j = c9177r98;
    }
}
