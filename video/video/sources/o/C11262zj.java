package o;

import android.view.Surface;
import o.C3051Gi2;

/* renamed from: o.zj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11262zj extends C3051Gi2.g {
    public final int f;
    public final Surface g;

    public C11262zj(int i, Surface surface) {
        this.f = i;
        if (surface != null) {
            this.g = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    @Override // o.C3051Gi2.g
    public int a() {
        return this.f;
    }

    @Override // o.C3051Gi2.g
    public Surface b() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3051Gi2.g) {
            C3051Gi2.g gVar = (C3051Gi2.g) obj;
            if (this.f == gVar.a() && this.g.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f ^ 1000003) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f + ", surface=" + this.g + "}";
    }
}
