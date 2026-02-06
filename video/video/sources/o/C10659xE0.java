package o;

import java.util.List;
import o.C5962e32;

/* renamed from: o.xE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10659xE0 implements InterfaceC6776hM {
    public final String a;
    public final AE0 b;
    public final C9420s9 c;
    public final C9663t9 d;
    public final C10395w9 e;
    public final C10395w9 f;
    public final C9177r9 g;
    public final C5962e32.b h;
    public final C5962e32.c i;
    public final float j;
    public final List<C9177r9> k;
    public final C9177r9 l;
    public final boolean m;

    public C10659xE0(String str, AE0 ae0, C9420s9 c9420s9, C9663t9 c9663t9, C10395w9 c10395w9, C10395w9 c10395w92, C9177r9 c9177r9, C5962e32.b bVar, C5962e32.c cVar, float f, List<C9177r9> list, C9177r9 c9177r92, boolean z) {
        this.a = str;
        this.b = ae0;
        this.c = c9420s9;
        this.d = c9663t9;
        this.e = c10395w9;
        this.f = c10395w92;
        this.g = c9177r9;
        this.h = bVar;
        this.i = cVar;
        this.j = f;
        this.k = list;
        this.l = c9177r92;
        this.m = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C10902yE0(c8431o61, abstractC8588ol, this);
    }

    public C5962e32.b b() {
        return this.h;
    }

    public C9177r9 c() {
        return this.l;
    }

    public C10395w9 d() {
        return this.f;
    }

    public C9420s9 e() {
        return this.c;
    }

    public AE0 f() {
        return this.b;
    }

    public C5962e32.c g() {
        return this.i;
    }

    public List<C9177r9> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public C9663t9 k() {
        return this.d;
    }

    public C10395w9 l() {
        return this.e;
    }

    public C9177r9 m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
