package o;

import java.lang.Comparable;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class L0<I, K extends Comparable<K>, T> implements VH<I, K, T> {
    public final InterfaceC8348nm<T, K> X;
    public Locale Y;

    public L0(InterfaceC8348nm<T, K> interfaceC8348nm, Locale locale) {
        this.X = interfaceC8348nm;
        this.Y = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // o.VH
    public void d(Locale locale) {
        this.Y = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // o.VH
    public InterfaceC8348nm<T, K> f() {
        return this.X;
    }
}
