package o;

/* renamed from: o.ut0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10085ut0 extends UT1 {
    public final float c;
    public final int d;

    public C10085ut0(float f, float f2, float f3) {
        this(f, f2, f3, 1);
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

    public C10085ut0 g(float f, float f2, float f3) {
        int i = this.d;
        int i2 = i + 1;
        float c = (i * c()) + f2;
        float f4 = i2;
        return new C10085ut0(c / f4, ((this.d * d()) + f) / f4, ((this.d * this.c) + f3) / f4, i2);
    }

    public int h() {
        return this.d;
    }

    public float i() {
        return this.c;
    }

    public C10085ut0(float f, float f2, float f3, int i) {
        super(f, f2);
        this.c = f3;
        this.d = i;
    }
}
