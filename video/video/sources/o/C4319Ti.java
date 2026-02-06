package o;

import androidx.camera.core.f;
import o.C8286nV0;

/* renamed from: o.Ti  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4319Ti extends C8286nV0.a {
    public final AbstractC3401Jx1<byte[]> a;
    public final f.l b;

    public C4319Ti(AbstractC3401Jx1<byte[]> abstractC3401Jx1, f.l lVar) {
        if (abstractC3401Jx1 != null) {
            this.a = abstractC3401Jx1;
            if (lVar != null) {
                this.b = lVar;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }

    @Override // o.C8286nV0.a
    public f.l a() {
        return this.b;
    }

    @Override // o.C8286nV0.a
    public AbstractC3401Jx1<byte[]> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8286nV0.a) {
            C8286nV0.a aVar = (C8286nV0.a) obj;
            if (this.a.equals(aVar.b()) && this.b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.a + ", outputFileOptions=" + this.b + "}";
    }
}
