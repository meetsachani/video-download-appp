package o;

import android.util.Size;
import o.C4281Sy;

/* renamed from: o.yi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11015yi extends C4281Sy.b {
    public final Size c;
    public final int d;
    public final int e;
    public final boolean f;
    public final InterfaceC8742pN0 g;
    public final C7695l90<C9944uI1> h;
    public final C7695l90<DM0> i;

    public C11015yi(Size size, int i, int i2, boolean z, InterfaceC8742pN0 interfaceC8742pN0, C7695l90<C9944uI1> c7695l90, C7695l90<DM0> c7695l902) {
        if (size != null) {
            this.c = size;
            this.d = i;
            this.e = i2;
            this.f = z;
            this.g = interfaceC8742pN0;
            if (c7695l90 != null) {
                this.h = c7695l90;
                if (c7695l902 != null) {
                    this.i = c7695l902;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }

    @Override // o.C4281Sy.b
    public C7695l90<DM0> b() {
        return this.i;
    }

    @Override // o.C4281Sy.b
    public InterfaceC8742pN0 c() {
        return this.g;
    }

    @Override // o.C4281Sy.b
    public int d() {
        return this.d;
    }

    @Override // o.C4281Sy.b
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        InterfaceC8742pN0 interfaceC8742pN0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4281Sy.b) {
            C4281Sy.b bVar = (C4281Sy.b) obj;
            if (this.c.equals(bVar.g()) && this.d == bVar.d() && this.e == bVar.e() && this.f == bVar.i() && ((interfaceC8742pN0 = this.g) != null ? interfaceC8742pN0.equals(bVar.c()) : bVar.c() == null) && this.h.equals(bVar.f()) && this.i.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C4281Sy.b
    public C7695l90<C9944uI1> f() {
        return this.h;
    }

    @Override // o.C4281Sy.b
    public Size g() {
        return this.c;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = (((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        InterfaceC8742pN0 interfaceC8742pN0 = this.g;
        if (interfaceC8742pN0 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC8742pN0.hashCode();
        }
        return ((((i2 ^ hashCode) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // o.C4281Sy.b
    public boolean i() {
        return this.f;
    }

    public String toString() {
        return "In{size=" + this.c + ", inputFormat=" + this.d + ", outputFormat=" + this.e + ", virtualCamera=" + this.f + ", imageReaderProxyProvider=" + this.g + ", requestEdge=" + this.h + ", errorEdge=" + this.i + "}";
    }
}
