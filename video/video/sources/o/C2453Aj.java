package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.C3051Gi2;

/* renamed from: o.Aj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2453Aj extends C3051Gi2.h {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public C2453Aj(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect != null) {
            this.a = rect;
            this.b = i;
            this.c = i2;
            this.d = z;
            if (matrix != null) {
                this.e = matrix;
                this.f = z2;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    @Override // o.C3051Gi2.h
    public Rect a() {
        return this.a;
    }

    @Override // o.C3051Gi2.h
    public boolean b() {
        return this.f;
    }

    @Override // o.C3051Gi2.h
    public int c() {
        return this.b;
    }

    @Override // o.C3051Gi2.h
    public Matrix d() {
        return this.e;
    }

    @Override // o.C3051Gi2.h
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3051Gi2.h) {
            C3051Gi2.h hVar = (C3051Gi2.h) obj;
            if (this.a.equals(hVar.a()) && this.b == hVar.c() && this.c == hVar.e() && this.d == hVar.f() && this.e.equals(hVar.d()) && this.f == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C3051Gi2.h
    public boolean f() {
        return this.d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i2 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (this.f) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.c + ", hasCameraTransform=" + this.d + ", getSensorToBufferTransform=" + this.e + ", getMirroring=" + this.f + "}";
    }
}
