package o;

import java.util.Arrays;

@Deprecated
/* renamed from: o.hp2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6889hp2<V> {
    public static final int e = 10;
    public long[] a;
    public V[] b;
    public int c;
    public int d;

    public C6889hp2() {
        this(10);
    }

    public static <V> V[] f(int i) {
        return (V[]) new Object[i];
    }

    public synchronized void a(long j, V v) {
        d(j);
        e();
        b(j, v);
    }

    public final void b(long j, V v) {
        int i = this.c;
        int i2 = this.d;
        V[] vArr = this.b;
        int length = (i + i2) % vArr.length;
        this.a[length] = j;
        vArr[length] = v;
        this.d = i2 + 1;
    }

    public synchronized void c() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final void d(long j) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) f(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    @InterfaceC11300zs1
    public synchronized V g(long j) {
        return h(j, false);
    }

    @InterfaceC11300zs1
    public final V h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = k();
            j2 = j3;
        }
        return v;
    }

    @InterfaceC11300zs1
    public synchronized V i() {
        V k;
        if (this.d == 0) {
            k = null;
        } else {
            k = k();
        }
        return k;
    }

    @InterfaceC11300zs1
    public synchronized V j(long j) {
        return h(j, true);
    }

    @InterfaceC11300zs1
    public final V k() {
        boolean z;
        if (this.d > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public synchronized int l() {
        return this.d;
    }

    public C6889hp2(int i) {
        this.a = new long[i];
        this.b = (V[]) f(i);
    }
}
