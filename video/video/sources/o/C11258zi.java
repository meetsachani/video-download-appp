package o;

import o.C4281Sy;

/* renamed from: o.zi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11258zi extends C4281Sy.c {
    public final C7695l90<androidx.camera.core.g> a;
    public final C7695l90<C9944uI1> b;
    public final int c;
    public final int d;

    public C11258zi(C7695l90<androidx.camera.core.g> c7695l90, C7695l90<C9944uI1> c7695l902, int i, int i2) {
        if (c7695l90 != null) {
            this.a = c7695l90;
            if (c7695l902 != null) {
                this.b = c7695l902;
                this.c = i;
                this.d = i2;
                return;
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null imageEdge");
    }

    @Override // o.C4281Sy.c
    public C7695l90<androidx.camera.core.g> a() {
        return this.a;
    }

    @Override // o.C4281Sy.c
    public int b() {
        return this.c;
    }

    @Override // o.C4281Sy.c
    public int c() {
        return this.d;
    }

    @Override // o.C4281Sy.c
    public C7695l90<C9944uI1> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4281Sy.c) {
            C4281Sy.c cVar = (C4281Sy.c) obj;
            if (this.a.equals(cVar.a()) && this.b.equals(cVar.d()) && this.c == cVar.b() && this.d == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.a + ", requestEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormat=" + this.d + "}";
    }
}
