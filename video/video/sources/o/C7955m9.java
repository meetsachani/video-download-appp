package o;

/* renamed from: o.m9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7955m9 implements InterfaceC10269ve1 {
    public final float a;
    public final float b;

    public C7955m9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final float d(C6302fS c6302fS, C7955m9 c7955m9, float f, float f2, float f3) {
        C6562gT0.p(c6302fS, "$c");
        C6562gT0.p(c7955m9, "this$0");
        long p = c6302fS.p(f3);
        return Math.abs(C5764dE2.m(C5764dE2.a(UD1.j(p) - c7955m9.a, UD1.k(p) - c7955m9.b) - f, C5764dE2.j()) - f2);
    }

    @Override // o.InterfaceC10269ve1
    public float a(C6302fS c6302fS) {
        C6562gT0.p(c6302fS, "c");
        float m = C5764dE2.m(C5764dE2.a(c6302fS.h() - this.a, c6302fS.i() - this.b) - C5764dE2.a(c6302fS.f() - this.a, c6302fS.g() - this.b), C5764dE2.j());
        if (m > C5764dE2.j() - 1.0E-4f) {
            return 0.0f;
        }
        return m;
    }

    @Override // o.InterfaceC10269ve1
    public float b(final C6302fS c6302fS, final float f) {
        C6562gT0.p(c6302fS, "c");
        final float a = C5764dE2.a(c6302fS.f() - this.a, c6302fS.g() - this.b);
        return C5764dE2.g(0.0f, 1.0f, 1.0E-5f, new InterfaceC9842tt0() { // from class: o.l9
            @Override // o.InterfaceC9842tt0
            public final float a(float f2) {
                float d;
                d = C7955m9.d(C6302fS.this, this, a, f, f2);
                return d;
            }
        });
    }

    public final float e() {
        return this.a;
    }

    public final float f() {
        return this.b;
    }
}
