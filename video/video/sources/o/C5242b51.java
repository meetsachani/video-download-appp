package o;

/* renamed from: o.b51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5242b51 {
    public static final C9333rn1 a = new C9333rn1(0);
    public static final long[] b = new long[0];

    public static final AbstractC4999a51 a() {
        return a;
    }

    public static final long[] b() {
        return b;
    }

    public static final int c(long j) {
        int hashCode = Long.hashCode(j) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    public static final AbstractC4999a51 d() {
        return a;
    }

    public static final AbstractC4999a51 e(long j) {
        return j(j);
    }

    public static final AbstractC4999a51 f(long j, long j2) {
        return k(j, j2);
    }

    public static final AbstractC4999a51 g(long j, long j2, long j3) {
        return l(j, j2, j3);
    }

    public static final AbstractC4999a51 h(long... jArr) {
        C6562gT0.p(jArr, "elements");
        C9333rn1 c9333rn1 = new C9333rn1(jArr.length);
        c9333rn1.V(jArr);
        return c9333rn1;
    }

    public static final C9333rn1 i() {
        return new C9333rn1(0, 1, null);
    }

    public static final C9333rn1 j(long j) {
        C9333rn1 c9333rn1 = new C9333rn1(1);
        c9333rn1.T(j);
        return c9333rn1;
    }

    public static final C9333rn1 k(long j, long j2) {
        C9333rn1 c9333rn1 = new C9333rn1(2);
        c9333rn1.T(j);
        c9333rn1.T(j2);
        return c9333rn1;
    }

    public static final C9333rn1 l(long j, long j2, long j3) {
        C9333rn1 c9333rn1 = new C9333rn1(3);
        c9333rn1.T(j);
        c9333rn1.T(j2);
        c9333rn1.T(j3);
        return c9333rn1;
    }

    public static final C9333rn1 m(long... jArr) {
        C6562gT0.p(jArr, "elements");
        C9333rn1 c9333rn1 = new C9333rn1(jArr.length);
        c9333rn1.V(jArr);
        return c9333rn1;
    }
}
