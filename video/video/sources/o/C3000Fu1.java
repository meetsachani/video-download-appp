package o;

/* renamed from: o.Fu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3000Fu1 extends AbstractC4636Wo1 {
    public final AbstractC2891Eu1 a;
    public final KZ0 b;

    public C3000Fu1(AbstractC2891Eu1 abstractC2891Eu1, KZ0 kz0) {
        C6562gT0.p(abstractC2891Eu1, "callback");
        this.a = abstractC2891Eu1;
        this.b = kz0;
    }

    public static /* synthetic */ C3000Fu1 d(C3000Fu1 c3000Fu1, AbstractC2891Eu1 abstractC2891Eu1, KZ0 kz0, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC2891Eu1 = c3000Fu1.a;
        }
        if ((i & 2) != 0) {
            kz0 = c3000Fu1.b;
        }
        return c3000Fu1.c(abstractC2891Eu1, kz0);
    }

    public final AbstractC2891Eu1 a() {
        return this.a;
    }

    public final KZ0 b() {
        return this.b;
    }

    public final C3000Fu1 c(AbstractC2891Eu1 abstractC2891Eu1, KZ0 kz0) {
        C6562gT0.p(abstractC2891Eu1, "callback");
        return new C3000Fu1(abstractC2891Eu1, kz0);
    }

    public final AbstractC2891Eu1 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3000Fu1)) {
            return false;
        }
        C3000Fu1 c3000Fu1 = (C3000Fu1) obj;
        if (C6562gT0.g(this.a, c3000Fu1.a) && C6562gT0.g(this.b, c3000Fu1.b)) {
            return true;
        }
        return false;
    }

    public final KZ0 f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        KZ0 kz0 = this.b;
        if (kz0 == null) {
            hashCode = 0;
        } else {
            hashCode = kz0.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }

    public /* synthetic */ C3000Fu1(AbstractC2891Eu1 abstractC2891Eu1, KZ0 kz0, int i, C9516sY c9516sY) {
        this(abstractC2891Eu1, (i & 2) != 0 ? null : kz0);
    }
}
