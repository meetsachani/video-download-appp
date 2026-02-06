package o;

@Deprecated
/* renamed from: o.Wg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4604Wg1 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C4604Wg1(Object obj) {
        this(obj, -1L);
    }

    public C4604Wg1 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new C4604Wg1(obj, this.b, this.c, this.d, this.e);
    }

    public C4604Wg1 b(long j) {
        if (this.d == j) {
            return this;
        }
        return new C4604Wg1(this.a, this.b, this.c, j, this.e);
    }

    public boolean c() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4604Wg1)) {
            return false;
        }
        C4604Wg1 c4604Wg1 = (C4604Wg1) obj;
        if (this.a.equals(c4604Wg1.a) && this.b == c4604Wg1.b && this.c == c4604Wg1.c && this.d == c4604Wg1.d && this.e == c4604Wg1.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public C4604Wg1(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C4604Wg1(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C4604Wg1(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C4604Wg1(C4604Wg1 c4604Wg1) {
        this.a = c4604Wg1.a;
        this.b = c4604Wg1.b;
        this.c = c4604Wg1.c;
        this.d = c4604Wg1.d;
        this.e = c4604Wg1.e;
    }

    public C4604Wg1(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
