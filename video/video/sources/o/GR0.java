package o;

/* loaded from: classes.dex */
public final class GR0 {
    public static final C7122in1 a = new C7122in1(0);
    public static final int[] b = new int[0];

    public static final FR0 a() {
        return a;
    }

    public static final int[] b() {
        return b;
    }

    public static final int c(int i) {
        int hashCode = Integer.hashCode(i) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    public static final FR0 d() {
        return a;
    }

    public static final FR0 e(int i) {
        return j(i);
    }

    public static final FR0 f(int i, int i2) {
        return k(i, i2);
    }

    public static final FR0 g(int i, int i2, int i3) {
        return l(i, i2, i3);
    }

    public static final FR0 h(int... iArr) {
        C6562gT0.p(iArr, "elements");
        C7122in1 c7122in1 = new C7122in1(iArr.length);
        c7122in1.V(iArr);
        return c7122in1;
    }

    public static final C7122in1 i() {
        return new C7122in1(0, 1, null);
    }

    public static final C7122in1 j(int i) {
        C7122in1 c7122in1 = new C7122in1(1);
        c7122in1.T(i);
        return c7122in1;
    }

    public static final C7122in1 k(int i, int i2) {
        C7122in1 c7122in1 = new C7122in1(2);
        c7122in1.T(i);
        c7122in1.T(i2);
        return c7122in1;
    }

    public static final C7122in1 l(int i, int i2, int i3) {
        C7122in1 c7122in1 = new C7122in1(3);
        c7122in1.T(i);
        c7122in1.T(i2);
        c7122in1.T(i3);
        return c7122in1;
    }

    public static final C7122in1 m(int... iArr) {
        C6562gT0.p(iArr, "elements");
        C7122in1 c7122in1 = new C7122in1(iArr.length);
        c7122in1.V(iArr);
        return c7122in1;
    }
}
