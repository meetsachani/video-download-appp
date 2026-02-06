package o;

import java.util.Arrays;
import o.InterfaceC10877y8;

@Deprecated
/* loaded from: classes2.dex */
public final class CW implements InterfaceC10877y8 {
    public static final int h = 100;
    public final boolean a;
    public final int b;
    @InterfaceC11300zs1
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public C10634x8[] g;

    public CW(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // o.InterfaceC10877y8
    public synchronized void a(@InterfaceC11300zs1 InterfaceC10877y8.a aVar) {
        while (aVar != null) {
            try {
                C10634x8[] c10634x8Arr = this.g;
                int i = this.f;
                this.f = i + 1;
                c10634x8Arr[i] = aVar.a();
                this.e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // o.InterfaceC10877y8
    public synchronized C10634x8 b() {
        C10634x8 c10634x8;
        try {
            this.e++;
            int i = this.f;
            if (i > 0) {
                C10634x8[] c10634x8Arr = this.g;
                int i2 = i - 1;
                this.f = i2;
                c10634x8 = (C10634x8) C9542sf.g(c10634x8Arr[i2]);
                this.g[this.f] = null;
            } else {
                c10634x8 = new C10634x8(new byte[this.b], 0);
                int i3 = this.e;
                C10634x8[] c10634x8Arr2 = this.g;
                if (i3 > c10634x8Arr2.length) {
                    this.g = (C10634x8[]) Arrays.copyOf(c10634x8Arr2, c10634x8Arr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c10634x8;
    }

    @Override // o.InterfaceC10877y8
    public synchronized void c(C10634x8 c10634x8) {
        C10634x8[] c10634x8Arr = this.g;
        int i = this.f;
        this.f = i + 1;
        c10634x8Arr[i] = c10634x8;
        this.e--;
        notifyAll();
    }

    @Override // o.InterfaceC10877y8
    public synchronized int d() {
        return this.e * this.b;
    }

    @Override // o.InterfaceC10877y8
    public synchronized void e() {
        try {
            int i = 0;
            int max = Math.max(0, TD2.q(this.d, this.b) - this.e);
            int i2 = this.f;
            if (max >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C10634x8 c10634x8 = (C10634x8) C9542sf.g(this.g[i]);
                    if (c10634x8.a == this.c) {
                        i++;
                    } else {
                        C10634x8 c10634x82 = (C10634x8) C9542sf.g(this.g[i3]);
                        if (c10634x82.a != this.c) {
                            i3--;
                        } else {
                            C10634x8[] c10634x8Arr = this.g;
                            c10634x8Arr[i] = c10634x82;
                            c10634x8Arr[i3] = c10634x8;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, max, this.f, (Object) null);
            this.f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC10877y8
    public int f() {
        return this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z;
        if (i < this.d) {
            z = true;
        } else {
            z = false;
        }
        this.d = i;
        if (z) {
            e();
        }
    }

    public CW(boolean z, int i, int i2) {
        C9542sf.a(i > 0);
        C9542sf.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.f = i2;
        this.g = new C10634x8[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.g[i3] = new C10634x8(this.c, i3 * i);
            }
            return;
        }
        this.c = null;
    }
}
