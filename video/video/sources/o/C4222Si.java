package o;

/* renamed from: o.Si  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4222Si extends HO0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C4222Si(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // o.HO0, o.InterfaceC9483sO2
    public float a() {
        return this.b;
    }

    @Override // o.HO0, o.InterfaceC9483sO2
    public float b() {
        return this.d;
    }

    @Override // o.HO0, o.InterfaceC9483sO2
    public float c() {
        return this.c;
    }

    @Override // o.HO0, o.InterfaceC9483sO2
    public float d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HO0) {
            HO0 ho0 = (HO0) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ho0.d()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ho0.a()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ho0.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(ho0.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
