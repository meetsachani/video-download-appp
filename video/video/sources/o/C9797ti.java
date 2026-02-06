package o;

import android.util.Size;
import o.C4851Yu;

/* renamed from: o.ti  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9797ti extends C4851Yu.i {
    public final String a;
    public final Class<?> b;
    public final T12 c;
    public final InterfaceC6743hD2<?> d;
    public final Size e;

    public C9797ti(String str, Class<?> cls, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2, Size size) {
        if (str != null) {
            this.a = str;
            if (cls != null) {
                this.b = cls;
                if (t12 != null) {
                    this.c = t12;
                    if (interfaceC6743hD2 != null) {
                        this.d = interfaceC6743hD2;
                        this.e = size;
                        return;
                    }
                    throw new NullPointerException("Null useCaseConfig");
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }

    @Override // o.C4851Yu.i
    public T12 c() {
        return this.c;
    }

    @Override // o.C4851Yu.i
    public Size d() {
        return this.e;
    }

    @Override // o.C4851Yu.i
    public InterfaceC6743hD2<?> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4851Yu.i) {
            C4851Yu.i iVar = (C4851Yu.i) obj;
            if (this.a.equals(iVar.f()) && this.b.equals(iVar.g()) && this.c.equals(iVar.c()) && this.d.equals(iVar.e()) && ((size = this.e) != null ? size.equals(iVar.d()) : iVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C4851Yu.i
    public String f() {
        return this.a;
    }

    @Override // o.C4851Yu.i
    public Class<?> g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + "}";
    }
}
