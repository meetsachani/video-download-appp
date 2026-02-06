package o;

import android.graphics.Matrix;

/* renamed from: o.Ri  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4122Ri extends ZN0 {
    public final C4133Rk2 a;
    public final long b;
    public final int c;
    public final Matrix d;

    public C4122Ri(C4133Rk2 c4133Rk2, long j, int i, Matrix matrix) {
        if (c4133Rk2 != null) {
            this.a = c4133Rk2;
            this.b = j;
            this.c = i;
            if (matrix != null) {
                this.d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // o.ZN0, o.YM0
    public C4133Rk2 a() {
        return this.a;
    }

    @Override // o.ZN0, o.YM0
    public long c() {
        return this.b;
    }

    @Override // o.ZN0, o.YM0
    public Matrix d() {
        return this.d;
    }

    @Override // o.ZN0, o.YM0
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZN0) {
            ZN0 zn0 = (ZN0) obj;
            if (this.a.equals(zn0.a()) && this.b == zn0.c() && this.c == zn0.e() && this.d.equals(zn0.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
