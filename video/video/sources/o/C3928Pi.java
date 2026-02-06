package o;

import o.C6777hM0;

/* renamed from: o.Pi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3928Pi extends C6777hM0.a {
    public final AbstractC3401Jx1<androidx.camera.core.g> a;
    public final int b;

    public C3928Pi(AbstractC3401Jx1<androidx.camera.core.g> abstractC3401Jx1, int i) {
        if (abstractC3401Jx1 != null) {
            this.a = abstractC3401Jx1;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // o.C6777hM0.a
    public int a() {
        return this.b;
    }

    @Override // o.C6777hM0.a
    public AbstractC3401Jx1<androidx.camera.core.g> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6777hM0.a) {
            C6777hM0.a aVar = (C6777hM0.a) obj;
            if (this.a.equals(aVar.b()) && this.b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "In{packet=" + this.a + ", jpegQuality=" + this.b + "}";
    }
}
