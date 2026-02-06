package o;

/* renamed from: o.q8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8924q8 extends UT1 {
    public final float c;

    public C8924q8(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
    }

    public boolean f(float f, float f2, float f3) {
        if (Math.abs(f2 - d()) > f || Math.abs(f3 - c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.c);
        if (abs > 1.0f && abs > this.c) {
            return false;
        }
        return true;
    }

    public C8924q8 g(float f, float f2, float f3) {
        return new C8924q8((c() + f2) / 2.0f, (d() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
