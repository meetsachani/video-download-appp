package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import o.WS0;

/* loaded from: classes4.dex */
public class WS0<T> implements InterfaceC8919q62<US0> {
    public final Function<CharSequence, Collection<T>> a;

    /* loaded from: classes4.dex */
    public static final class b {
        public static final b b = new b();
        public int a;

        public b() {
            this.a = 0;
        }
    }

    /* loaded from: classes4.dex */
    public class c {
        public final Map<T, b> a;

        public c(int i) {
            WS0.this = r1;
            this.a = new HashMap(i);
        }

        public static /* synthetic */ b a(Object obj) {
            return new b();
        }

        public void b(T t) {
            this.a.computeIfAbsent(t, new Function() { // from class: o.XS0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return WS0.c.a(obj);
                }
            }).a++;
        }

        public Set<Map.Entry<T, b>> c() {
            return this.a.entrySet();
        }

        public int d(Object obj) {
            return this.a.getOrDefault(obj, b.b).a;
        }

        public int e() {
            return this.a.size();
        }
    }

    public WS0(Function<CharSequence, Collection<T>> function) {
        if (function != null) {
            this.a = function;
            return;
        }
        throw new IllegalArgumentException("Converter must not be null");
    }

    public static <T> int c(Set<T> set, Set<T> set2) {
        int i = 0;
        for (T t : set) {
            if (set2.contains(t)) {
                i++;
            }
        }
        return i;
    }

    @Override // o.InterfaceC8919q62
    /* renamed from: b */
    public US0 a(CharSequence charSequence, CharSequence charSequence2) {
        int d;
        if (charSequence != null && charSequence2 != null) {
            Collection<T> apply = this.a.apply(charSequence);
            Collection<T> apply2 = this.a.apply(charSequence2);
            int size = apply.size();
            int size2 = apply2.size();
            if (Math.min(size, size2) == 0) {
                return new US0(size, size2, 0);
            }
            if ((apply instanceof Set) && (apply2 instanceof Set)) {
                if (size < size2) {
                    d = c((Set) apply, (Set) apply2);
                } else {
                    d = c((Set) apply2, (Set) apply);
                }
            } else {
                WS0<T>.c e = e(apply);
                WS0<T>.c e2 = e(apply2);
                if (e.e() < e2.e()) {
                    d = d(e, e2);
                } else {
                    d = d(e2, e);
                }
            }
            return new US0(size, size2, d);
        }
        throw new IllegalArgumentException("Input cannot be null");
    }

    public final int d(WS0<T>.c cVar, WS0<T>.c cVar2) {
        int i = 0;
        for (Map.Entry<T, b> entry : cVar.c()) {
            i += Math.min(entry.getValue().a, cVar2.d(entry.getKey()));
        }
        return i;
    }

    public final WS0<T>.c e(Collection<T> collection) {
        final WS0<T>.c cVar = new c(collection.size());
        collection.forEach(new Consumer() { // from class: o.VS0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                WS0.c.this.b(obj);
            }
        });
        return cVar;
    }
}
