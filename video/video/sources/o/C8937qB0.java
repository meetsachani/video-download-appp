package o;

import java.io.Serializable;

@InterfaceC4238Sm
@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.qB0 */
/* loaded from: classes3.dex */
public final class C8937qB0<F, T> extends AbstractC6843he0<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final YA0<? super F, ? extends T> X;
    public final AbstractC6843he0<T> Y;

    public C8937qB0(YA0<? super F, ? extends T> ya0, AbstractC6843he0<T> abstractC6843he0) {
        this.X = (YA0) C10664xF1.E(ya0);
        this.Y = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
    }

    @Override // o.AbstractC6843he0
    public boolean a(F f, F f2) {
        return this.Y.d(this.X.apply(f), this.X.apply(f2));
    }

    @Override // o.AbstractC6843he0
    public int b(F f) {
        return this.Y.f(this.X.apply(f));
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8937qB0) {
            C8937qB0 c8937qB0 = (C8937qB0) obj;
            if (this.X.equals(c8937qB0.X) && this.Y.equals(c8937qB0.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2593Bt1.b(this.X, this.Y);
    }

    public String toString() {
        String valueOf = String.valueOf(this.Y);
        String valueOf2 = String.valueOf(this.X);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
