package o;

import android.graphics.Path;

/* renamed from: o.tE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9684tE0 implements InterfaceC6776hM {
    public final AE0 a;
    public final Path.FillType b;
    public final C9420s9 c;
    public final C9663t9 d;
    public final C10395w9 e;
    public final C10395w9 f;
    public final String g;
    public final C9177r9 h;
    public final C9177r9 i;
    public final boolean j;

    public C9684tE0(String str, AE0 ae0, Path.FillType fillType, C9420s9 c9420s9, C9663t9 c9663t9, C10395w9 c10395w9, C10395w9 c10395w92, C9177r9 c9177r9, C9177r9 c9177r92, boolean z) {
        this.a = ae0;
        this.b = fillType;
        this.c = c9420s9;
        this.d = c9663t9;
        this.e = c10395w9;
        this.f = c10395w92;
        this.g = str;
        this.h = c9177r9;
        this.i = c9177r92;
        this.j = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C9927uE0(c8431o61, c10624x51, abstractC8588ol, this);
    }

    public C10395w9 b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public C9420s9 d() {
        return this.c;
    }

    public AE0 e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public C9663t9 g() {
        return this.d;
    }

    public C10395w9 h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
