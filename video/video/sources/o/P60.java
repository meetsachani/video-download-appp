package o;

import android.graphics.drawable.Drawable;
import o.F60;

/* loaded from: classes.dex */
public final class P60 extends AbstractC10819xt2<P60, Drawable> {
    public static P60 m(InterfaceC9109qt2<Drawable> interfaceC9109qt2) {
        return new P60().g(interfaceC9109qt2);
    }

    public static P60 n() {
        return new P60().i();
    }

    public static P60 o(int i) {
        return new P60().j(i);
    }

    public static P60 p(F60.a aVar) {
        return new P60().k(aVar);
    }

    public static P60 q(F60 f60) {
        return new P60().l(f60);
    }

    @Override // o.AbstractC10819xt2
    public boolean equals(Object obj) {
        if ((obj instanceof P60) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10819xt2
    public int hashCode() {
        return super.hashCode();
    }

    public P60 i() {
        return k(new F60.a());
    }

    public P60 j(int i) {
        return k(new F60.a(i));
    }

    public P60 k(F60.a aVar) {
        return l(aVar.a());
    }

    public P60 l(F60 f60) {
        return g(f60);
    }
}
