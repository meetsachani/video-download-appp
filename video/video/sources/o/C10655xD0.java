package o;

import o.C10898yD0;

@Deprecated
/* renamed from: o.xD0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10655xD0 {
    public static final C10655xD0 g = new C10655xD0(-1, -1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;

    public C10655xD0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public int a() {
        C9542sf.i(!this.f);
        return this.b;
    }

    public int b() {
        C9542sf.i(!this.f);
        return this.e;
    }

    public int c() {
        C9542sf.i(!this.f);
        return this.c;
    }

    public int d() {
        C9542sf.i(!this.f);
        return this.a;
    }

    public int e() {
        C9542sf.i(!this.f);
        return this.d;
    }

    public void f() throws C10898yD0.b {
        this.f = true;
        int i = this.a;
        if (i != -1) {
            C10898yD0.x(i);
        }
        int i2 = this.b;
        if (i2 != -1) {
            C10898yD0.v(i2);
        }
        int i3 = this.c;
        if (i3 != -1) {
            C10898yD0.w(i3);
        }
    }
}
