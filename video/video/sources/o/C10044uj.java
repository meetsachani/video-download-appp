package o;

import o.C3243Ih2;

/* renamed from: o.uj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10044uj extends C3243Ih2.b {
    public final int a;
    public final int b;

    public C10044uj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // o.C3243Ih2.b
    public int a() {
        return this.a;
    }

    @Override // o.C3243Ih2.b
    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3243Ih2.b) {
            C3243Ih2.b bVar = (C3243Ih2.b) obj;
            if (this.a == bVar.a() && this.b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.a + ", requiredMaxBitDepth=" + this.b + "}";
    }
}
