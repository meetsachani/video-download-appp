package o;

/* renamed from: o.Fj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2954Fj extends MF2 {
    public final int h;
    public final int i;
    public final int j;

    public C2954Fj(int i, int i2, int i3) {
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // o.MF2
    public int b() {
        return this.j;
    }

    @Override // o.MF2
    public int c() {
        return this.h;
    }

    @Override // o.MF2
    public int d() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MF2) {
            MF2 mf2 = (MF2) obj;
            if (this.h == mf2.c() && this.i == mf2.d() && this.j == mf2.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.h ^ 1000003) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.h + ", transfer=" + this.i + ", range=" + this.j + "}";
    }
}
