package o;

@InterfaceC7542kW0
/* renamed from: o.kv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7638kv0 {
    public final long a;

    public /* synthetic */ C7638kv0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C7638kv0 a(long j) {
        return new C7638kv0(j);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static long d(float f, float f2) {
        return e((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof C7638kv0) || j != ((C7638kv0) obj).m()) {
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

    public static final float h(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int k(long j) {
        return Long.hashCode(j);
    }

    public static String l(long j) {
        return '(' + Float.intBitsToFloat((int) (j >> 32)) + C6566gU0.h + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
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
