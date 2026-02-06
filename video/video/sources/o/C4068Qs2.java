package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.Qs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4068Qs2<I, O> implements Comparator<I>, Serializable {
    private static final long serialVersionUID = 3456940356043606220L;
    public final Comparator<O> X;
    public final InterfaceC3287Is2<? super I, ? extends O> Y;

    public C4068Qs2(InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        this(interfaceC3287Is2, C7726lH.a);
    }

    @Override // java.util.Comparator
    public int compare(I i, I i2) {
        return this.X.compare(this.Y.a(i), this.Y.a(i2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            C4068Qs2 c4068Qs2 = (C4068Qs2) obj;
            Comparator<O> comparator = this.X;
            if (comparator != null ? comparator.equals(c4068Qs2.X) : c4068Qs2.X == null) {
                InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2 = this.Y;
                InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is22 = c4068Qs2.Y;
                if (interfaceC3287Is2 != null ? interfaceC3287Is2.equals(interfaceC3287Is22) : interfaceC3287Is22 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Comparator<O> comparator = this.X;
        int i = 0;
        if (comparator == null) {
            hashCode = 0;
        } else {
            hashCode = comparator.hashCode();
        }
        int i2 = (629 + hashCode) * 37;
        InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2 = this.Y;
        if (interfaceC3287Is2 != null) {
            i = interfaceC3287Is2.hashCode();
        }
        return i2 + i;
    }

    public C4068Qs2(InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, Comparator<O> comparator) {
        this.X = comparator;
        this.Y = interfaceC3287Is2;
    }
}
