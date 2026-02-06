package o;

import java.util.Set;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public abstract class R0<N> extends Q<N> implements DE0<N> {
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean c(AbstractC4099Rc0 abstractC4099Rc0) {
        return super.c(abstractC4099Rc0);
    }

    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // o.DE0
    public final boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DE0)) {
            return false;
        }
        DE0 de0 = (DE0) obj;
        if (f() == de0.f() && m().equals(de0.m()) && d().equals(de0.d())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // o.DE0
    public final int hashCode() {
        return d().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Y90 p() {
        return super.p();
    }

    public String toString() {
        boolean f = f();
        boolean j = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(d());
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(f);
        sb.append(", allowsSelfLoops: ");
        sb.append(j);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
