package o;

import java.io.Serializable;

/* renamed from: o.uK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9950uK<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    public static final InterfaceC3287Is2 Y = new C9950uK(null);
    private static final long serialVersionUID = 6374440726369055124L;
    public final O X;

    public C9950uK(O o2) {
        this.X = o2;
    }

    public static <I, O> InterfaceC3287Is2<I, O> b(O o2) {
        if (o2 == null) {
            return d();
        }
        return new C9950uK(o2);
    }

    public static <I, O> InterfaceC3287Is2<I, O> d() {
        return Y;
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        return this.X;
    }

    public O c() {
        return this.X;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9950uK)) {
            return false;
        }
        Object c = ((C9950uK) obj).c();
        if (c == c() || (c != null && c.equals(c()))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (c() == null) {
            return -144463148;
        }
        return c().hashCode() | (-144463148);
    }
}
