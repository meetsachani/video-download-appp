package o;

import o.C9701tI1;

/* renamed from: o.gj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6619gj extends C9701tI1.b {
    public final C9944uI1 a;
    public final androidx.camera.core.g b;

    public C6619gj(C9944uI1 c9944uI1, androidx.camera.core.g gVar) {
        if (c9944uI1 != null) {
            this.a = c9944uI1;
            if (gVar != null) {
                this.b = gVar;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    @Override // o.C9701tI1.b
    public androidx.camera.core.g a() {
        return this.b;
    }

    @Override // o.C9701tI1.b
    public C9944uI1 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9701tI1.b) {
            C9701tI1.b bVar = (C9701tI1.b) obj;
            if (this.a.equals(bVar.b()) && this.b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
