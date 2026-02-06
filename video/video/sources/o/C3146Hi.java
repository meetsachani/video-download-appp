package o;

import o.InterfaceC2426Ac0;

/* renamed from: o.Hi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3146Hi extends InterfaceC2426Ac0.c {
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public C3146Hi(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.d = i;
        if (str != null) {
            this.e = str;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = i6;
            this.k = i7;
            this.l = i8;
            this.m = i9;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    @Override // o.InterfaceC2426Ac0.c
    public int b() {
        return this.k;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int c() {
        return this.f;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int d() {
        return this.l;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2426Ac0.c) {
            InterfaceC2426Ac0.c cVar = (InterfaceC2426Ac0.c) obj;
            if (this.d == cVar.e() && this.e.equals(cVar.i()) && this.f == cVar.c() && this.g == cVar.f() && this.h == cVar.k() && this.i == cVar.h() && this.j == cVar.j() && this.k == cVar.b() && this.l == cVar.d() && this.m == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int f() {
        return this.g;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int g() {
        return this.m;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int h() {
        return this.i;
    }

    public int hashCode() {
        return ((((((((((((((((((this.d ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m;
    }

    @Override // o.InterfaceC2426Ac0.c
    public String i() {
        return this.e;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int j() {
        return this.j;
    }

    @Override // o.InterfaceC2426Ac0.c
    public int k() {
        return this.h;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.d + ", mediaType=" + this.e + ", bitrate=" + this.f + ", frameRate=" + this.g + ", width=" + this.h + ", height=" + this.i + ", profile=" + this.j + ", bitDepth=" + this.k + ", chromaSubsampling=" + this.l + ", hdrFormat=" + this.m + "}";
    }
}
