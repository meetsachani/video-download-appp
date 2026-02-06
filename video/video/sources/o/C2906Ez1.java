package o;

import android.graphics.PointF;

/* renamed from: o.Ez1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2906Ez1 {
    public final PointF a;
    public final float b;
    public final PointF c;
    public final float d;

    public C2906Ez1(PointF pointF, float f, PointF pointF2, float f2) {
        this.a = (PointF) C10907yF1.m(pointF, "start == null");
        this.b = f;
        this.c = (PointF) C10907yF1.m(pointF2, "end == null");
        this.d = f2;
    }

    public PointF a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public PointF c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2906Ez1)) {
            return false;
        }
        C2906Ez1 c2906Ez1 = (C2906Ez1) obj;
        if (Float.compare(this.b, c2906Ez1.b) == 0 && Float.compare(this.d, c2906Ez1.d) == 0 && this.a.equals(c2906Ez1.a) && this.c.equals(c2906Ez1.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        int i2 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.c.hashCode()) * 31;
        float f2 = this.d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.a + ", startFraction=" + this.b + ", end=" + this.c + ", endFraction=" + this.d + '}';
    }
}
