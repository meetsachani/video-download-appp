package o;

import java.io.Serializable;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.vr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10319vr<F, T> extends AbstractC10587ww1<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final AbstractC10587ww1<T> Y0;
    public final YA0<F, ? extends T> Z;

    public C10319vr(YA0<F, ? extends T> ya0, AbstractC10587ww1<T> abstractC10587ww1) {
        this.Z = (YA0) C10664xF1.E(ya0);
        this.Y0 = (AbstractC10587ww1) C10664xF1.E(abstractC10587ww1);
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@InterfaceC7894ly1 F f, @InterfaceC7894ly1 F f2) {
        return this.Y0.compare(this.Z.apply(f), this.Z.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10319vr) {
            C10319vr c10319vr = (C10319vr) obj;
            if (this.Z.equals(c10319vr.Z) && this.Y0.equals(c10319vr.Y0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2593Bt1.b(this.Z, this.Y0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.Y0);
        String valueOf2 = String.valueOf(this.Z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
