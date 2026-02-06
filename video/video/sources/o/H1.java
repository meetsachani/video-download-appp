package o;

import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class H1<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC8170n2<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public final boolean e(@NotNull E e) {
        C6562gT0.p(e, "element");
        return f(e);
    }

    public abstract boolean f(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean h(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return h((Map.Entry) obj);
    }
}
