package o;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import o.VH;

/* loaded from: classes3.dex */
public abstract class K0<I, K extends Comparable<K>, C extends VH<I, K, T>, T> implements InterfaceC6142eo0<I, K, C, T> {
    public Locale X;
    public final SortedMap<K, InterfaceC8348nm<T, K>> Y = new TreeMap();
    public final List<C> Z = new ArrayList();

    public K0(Locale locale) {
        this.X = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // o.InterfaceC6142eo0
    public void d(Locale locale) {
        this.X = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.Z.forEach(new Consumer() { // from class: o.G0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((VH) obj).d(K0.this.X);
            }
        });
    }

    @Override // o.InterfaceC6142eo0
    public InterfaceC8348nm<T, K> h(final K k) {
        InterfaceC8348nm<T, K> interfaceC8348nm = this.Y.get(k);
        if (interfaceC8348nm == null) {
            return (InterfaceC8348nm) this.Z.stream().filter(new Predicate() { // from class: o.H0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = ((VH) obj).e(k);
                    return e;
                }
            }).map(new Function() { // from class: o.I0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((VH) obj).f();
                }
            }).findAny().orElse(null);
        }
        return interfaceC8348nm;
    }

    @Override // o.InterfaceC6142eo0
    public InterfaceC8348nm<T, K> j(K k, InterfaceC8348nm<T, K> interfaceC8348nm) {
        return this.Y.put(k, interfaceC8348nm);
    }

    @Override // o.InterfaceC6142eo0
    public Collection<InterfaceC8348nm<T, K>> values() {
        final ArrayList arrayList = new ArrayList(this.Y.size() + this.Z.size());
        arrayList.addAll(this.Y.values());
        this.Z.forEach(new Consumer() { // from class: o.J0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(((VH) obj).f());
            }
        });
        return arrayList;
    }
}
