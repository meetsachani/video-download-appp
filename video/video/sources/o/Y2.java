package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.1")
/* loaded from: classes3.dex */
public abstract class Y2<E> extends AbstractC7901m0<E> implements Set<E>, GW0 {
    @NotNull
    public static final a X = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final boolean a(@NotNull Set<?> set, @NotNull Set<?> set2) {
            C6562gT0.p(set, "c");
            C6562gT0.p(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(@NotNull Collection<?> collection) {
            int i;
            C6562gT0.p(collection, "c");
            int i2 = 0;
            for (Object obj : collection) {
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return X.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return X.b(this);
    }

    @Override // o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
