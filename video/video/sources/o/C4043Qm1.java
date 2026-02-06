package o;

/* renamed from: o.Qm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4043Qm1 extends C6302fS {
    public C4043Qm1() {
        super(null, 1, null);
    }

    public final void A(YD1 yd1, int i) {
        int i2 = i + 1;
        long a = yd1.a(n()[i], n()[i2]);
        n()[i] = Float.intBitsToFloat((int) (a >> 32));
        n()[i2] = Float.intBitsToFloat((int) (a & 4294967295L));
    }

    public final void y(C6302fS c6302fS, C6302fS c6302fS2, float f) {
        C6562gT0.p(c6302fS, "c1");
        C6562gT0.p(c6302fS2, "c2");
        for (int i = 0; i < 8; i++) {
            n()[i] = C5764dE2.l(c6302fS.n()[i], c6302fS2.n()[i], f);
        }
    }

    public final void z(YD1 yd1) {
        C6562gT0.p(yd1, "f");
        A(yd1, 0);
        A(yd1, 2);
        A(yd1, 4);
        A(yd1, 6);
    }
}
