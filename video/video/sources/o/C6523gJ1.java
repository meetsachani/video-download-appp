package o;

/* renamed from: o.gJ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6523gJ1 {
    public final float a;
    public final AbstractC3069Gn0 b;

    public C6523gJ1(float f, AbstractC3069Gn0 abstractC3069Gn0) {
        C6562gT0.p(abstractC3069Gn0, XE2.g);
        this.a = f;
        this.b = abstractC3069Gn0;
    }

    public static /* synthetic */ C6523gJ1 d(C6523gJ1 c6523gJ1, float f, AbstractC3069Gn0 abstractC3069Gn0, int i, Object obj) {
        if ((i & 1) != 0) {
            f = c6523gJ1.a;
        }
        if ((i & 2) != 0) {
            abstractC3069Gn0 = c6523gJ1.b;
        }
        return c6523gJ1.c(f, abstractC3069Gn0);
    }

    public final float a() {
        return this.a;
    }

    public final AbstractC3069Gn0 b() {
        return this.b;
    }

    public final C6523gJ1 c(float f, AbstractC3069Gn0 abstractC3069Gn0) {
        C6562gT0.p(abstractC3069Gn0, XE2.g);
        return new C6523gJ1(f, abstractC3069Gn0);
    }

    public final AbstractC3069Gn0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6523gJ1)) {
            return false;
        }
        C6523gJ1 c6523gJ1 = (C6523gJ1) obj;
        if (Float.compare(this.a, c6523gJ1.a) == 0 && C6562gT0.g(this.b, c6523gJ1.b)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.a;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
