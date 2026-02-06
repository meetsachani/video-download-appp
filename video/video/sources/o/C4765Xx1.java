package o;

import java.io.Serializable;
import java.util.Iterator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC8301na0
/* renamed from: o.Xx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4765Xx1<E, T extends E> extends AbstractC6843he0<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    public final AbstractC6843he0<E> X;

    public C4765Xx1(AbstractC6843he0<E> abstractC6843he0) {
        this.X = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof C4765Xx1) {
            return this.X.equals(((C4765Xx1) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return this.X.hashCode() ^ 1185147655;
    }

    @Override // o.AbstractC6843he0
    /* renamed from: k */
    public boolean a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.X.d(it.next(), it2.next())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC6843he0
    /* renamed from: l */
    public int b(Iterable<T> iterable) {
        int i = 78721;
        for (T t : iterable) {
            i = (i * 24943) + this.X.f(t);
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.X);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append(valueOf);
        sb.append(".pairwise()");
        return sb.toString();
    }
}
