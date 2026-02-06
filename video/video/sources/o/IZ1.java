package o;

import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class IZ1 implements Yu2 {
    public static final int j = 3;
    public static final int k = 32;
    public static final int l = 4098;
    public final HZ1 d;
    public final C3012Fy1 e = new C3012Fy1(32);
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    public IZ1(HZ1 hz1) {
        this.d = hz1;
    }

    @Override // o.Yu2
    public void a(C3012Fy1 c3012Fy1, int i) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = c3012Fy1.f() + c3012Fy1.L();
        } else {
            i2 = -1;
        }
        if (this.i) {
            if (z) {
                this.i = false;
                c3012Fy1.Y(i2);
                this.g = 0;
            } else {
                return;
            }
        }
        while (c3012Fy1.a() > 0) {
            int i3 = this.g;
            if (i3 < 3) {
                if (i3 == 0) {
                    int L = c3012Fy1.L();
                    c3012Fy1.Y(c3012Fy1.f() - 1);
                    if (L == 255) {
                        this.i = true;
                        return;
                    }
                }
                int min = Math.min(c3012Fy1.a(), 3 - this.g);
                c3012Fy1.n(this.e.e(), this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 == 3) {
                    this.e.Y(0);
                    this.e.X(3);
                    this.e.Z(1);
                    int L2 = this.e.L();
                    int L3 = this.e.L();
                    if ((L2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.h = z2;
                    this.f = (((L2 & 15) << 8) | L3) + 3;
                    int b = this.e.b();
                    int i5 = this.f;
                    if (b < i5) {
                        this.e.c(Math.min(4098, Math.max(i5, this.e.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c3012Fy1.a(), this.f - this.g);
                c3012Fy1.n(this.e.e(), this.g, min2);
                int i6 = this.g + min2;
                this.g = i6;
                int i7 = this.f;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.h) {
                        if (TD2.z(this.e.e(), 0, this.f, -1) != 0) {
                            this.i = true;
                            return;
                        }
                        this.e.X(this.f - 4);
                    } else {
                        this.e.X(i7);
                    }
                    this.e.Y(0);
                    this.d.a(this.e);
                    this.g = 0;
                }
            }
        }
    }

    @Override // o.Yu2
    public void b() {
        this.i = true;
    }

    @Override // o.Yu2
    public void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        this.d.c(c10071up2, interfaceC4518Vj0, eVar);
        this.i = true;
    }
}
