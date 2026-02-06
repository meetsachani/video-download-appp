package o;

@InterfaceC7542kW0
/* renamed from: o.nR0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8271nR0 {
    public final long a;

    public /* synthetic */ C8271nR0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C8271nR0 a(long j) {
        return new C8271nR0(j);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static final int c(long j) {
        return (int) (j & 4294967295L);
    }

    public static long d(int i, int i2) {
        return e((i2 & 4294967295L) | (i << 32));
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof C8271nR0) || j != ((C8271nR0) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int h(long j) {
        return (int) (j >> 32);
    }

    public static final int j(long j) {
        return (int) (j & 4294967295L);
    }

    public static int k(long j) {
        return Long.hashCode(j);
    }

    public static String l(long j) {
        return '(' + h(j) + C6566gU0.h + j(j) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static /* synthetic */ void i() {
    }

    public static long e(long j) {
        return j;
    }
}
