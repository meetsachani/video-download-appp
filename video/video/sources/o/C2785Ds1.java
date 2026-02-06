package o;

import java.io.Serializable;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.Ds1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2785Ds1<T> extends AbstractC10587ww1<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final AbstractC10587ww1<? super T> Z;

    public C2785Ds1(AbstractC10587ww1<? super T> abstractC10587ww1) {
        this.Z = abstractC10587ww1;
    }

    @Override // o.AbstractC10587ww1
    public <S extends T> AbstractC10587ww1<S> B() {
        return this.Z.B();
    }

    @Override // o.AbstractC10587ww1
    public <S extends T> AbstractC10587ww1<S> E() {
        return this.Z.E().B();
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@MB T t, @MB T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.Z.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2785Ds1) {
            return this.Z.equals(((C2785Ds1) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return this.Z.hashCode() ^ 957692532;
    }

    public String toString() {
        String valueOf = String.valueOf(this.Z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append(valueOf);
        sb.append(".nullsFirst()");
        return sb.toString();
    }

    @Override // o.AbstractC10587ww1
    public <S extends T> AbstractC10587ww1<S> A() {
        return this;
    }
}
