package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.n22  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8173n22<T> {
    public static final String b = "Set contributions cannot be null";
    public final List<T> a;

    public C8173n22(int i) {
        this.a = new ArrayList(i);
    }

    public static <T> C8173n22<T> d(int i) {
        return new C8173n22<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8173n22<T> a(T t) {
        this.a.add(C10421wF1.c(t, b));
        return this;
    }

    public C8173n22<T> b(Collection<? extends T> collection) {
        for (T t : collection) {
            C10421wF1.c(t, b);
        }
        this.a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        int size = this.a.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableSet(new HashSet(this.a));
            }
            return Collections.singleton(this.a.get(0));
        }
        return Collections.EMPTY_SET;
    }
}
