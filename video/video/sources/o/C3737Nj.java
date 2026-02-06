package o;

@Deprecated
/* renamed from: o.Nj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3737Nj {
    public static final int c = 0;
    public final int a;
    public final float b;

    public C3737Nj(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3737Nj.class == obj.getClass()) {
            C3737Nj c3737Nj = (C3737Nj) obj;
            if (this.a == c3737Nj.a && Float.compare(c3737Nj.b, this.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
