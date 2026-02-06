package o;

import android.graphics.PointF;

/* renamed from: o.xE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10660xE1 implements InterfaceC6776hM {
    public final String a;
    public final a b;
    public final C9177r9 c;
    public final H9<PointF, PointF> d;
    public final C9177r9 e;
    public final C9177r9 f;
    public final C9177r9 g;
    public final C9177r9 h;
    public final C9177r9 i;
    public final boolean j;
    public final boolean k;

    /* renamed from: o.xE1$a */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        public final int X;

        a(int i) {
            this.X = i;
        }

        public static a g(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.X == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C10660xE1(String str, a aVar, C9177r9 c9177r9, H9<PointF, PointF> h9, C9177r9 c9177r92, C9177r9 c9177r93, C9177r9 c9177r94, C9177r9 c9177r95, C9177r9 c9177r96, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = c9177r9;
        this.d = h9;
        this.e = c9177r92;
        this.f = c9177r93;
        this.g = c9177r94;
        this.h = c9177r95;
        this.i = c9177r96;
        this.j = z;
        this.k = z2;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C10417wE1(c8431o61, abstractC8588ol, this);
    }

    public C9177r9 b() {
        return this.f;
    }

    public C9177r9 c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public C9177r9 e() {
        return this.g;
    }

    public C9177r9 f() {
        return this.i;
    }

    public C9177r9 g() {
        return this.c;
    }

    public H9<PointF, PointF> h() {
        return this.d;
    }

    public C9177r9 i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}
