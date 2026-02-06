package o;

import java.io.IOException;
import java.util.Arrays;

@Deprecated
/* renamed from: o.lu1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7878lu1 {
    public final C8139mu1 a = new C8139mu1();
    public final C3012Fy1 b = new C3012Fy1(new byte[C8139mu1.n], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            C8139mu1 c8139mu1 = this.a;
            if (i5 >= c8139mu1.g) {
                break;
            }
            int[] iArr = c8139mu1.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public C8139mu1 b() {
        return this.a;
    }

    public C3012Fy1 c() {
        return this.b;
    }

    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        boolean z2;
        int i;
        if (interfaceC4421Uj0 != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.e) {
            this.e = false;
            this.b.U(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(interfaceC4421Uj0) || !this.a.a(interfaceC4421Uj0, true)) {
                    return false;
                }
                C8139mu1 c8139mu1 = this.a;
                int i2 = c8139mu1.h;
                if ((c8139mu1.b & 1) == 1 && this.b.g() == 0) {
                    i2 += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!C4615Wj0.e(interfaceC4421Uj0, i2)) {
                    return false;
                }
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                C3012Fy1 c3012Fy1 = this.b;
                c3012Fy1.c(c3012Fy1.g() + a);
                if (!C4615Wj0.d(interfaceC4421Uj0, this.b.e(), this.b.g(), a)) {
                    return false;
                }
                C3012Fy1 c3012Fy12 = this.b;
                c3012Fy12.X(c3012Fy12.g() + a);
                if (this.a.j[i3 - 1] != 255) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.e = z2;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.U(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.b.e().length == 65025) {
            return;
        }
        C3012Fy1 c3012Fy1 = this.b;
        c3012Fy1.W(Arrays.copyOf(c3012Fy1.e(), Math.max((int) C8139mu1.n, this.b.g())), this.b.g());
    }
}
