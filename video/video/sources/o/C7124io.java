package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import o.F60;

/* renamed from: o.io  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7124io extends AbstractC10819xt2<C7124io, Bitmap> {
    public static C7124io n(InterfaceC9109qt2<Bitmap> interfaceC9109qt2) {
        return new C7124io().g(interfaceC9109qt2);
    }

    public static C7124io o() {
        return new C7124io().i();
    }

    public static C7124io p(int i) {
        return new C7124io().j(i);
    }

    public static C7124io q(F60.a aVar) {
        return new C7124io().k(aVar);
    }

    public static C7124io r(F60 f60) {
        return new C7124io().l(f60);
    }

    public static C7124io s(InterfaceC9109qt2<Drawable> interfaceC9109qt2) {
        return new C7124io().m(interfaceC9109qt2);
    }

    @Override // o.AbstractC10819xt2
    public boolean equals(Object obj) {
        if ((obj instanceof C7124io) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10819xt2
    public int hashCode() {
        return super.hashCode();
    }

    public C7124io i() {
        return k(new F60.a());
    }

    public C7124io j(int i) {
        return k(new F60.a(i));
    }

    public C7124io k(F60.a aVar) {
        return m(aVar.a());
    }

    public C7124io l(F60 f60) {
        return m(f60);
    }

    public C7124io m(InterfaceC9109qt2<Drawable> interfaceC9109qt2) {
        return g(new C6882ho(interfaceC9109qt2));
    }
}
