package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.bb0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5363bb0 implements Map, Serializable, GW0 {
    @NotNull
    public static final C5363bb0 X = new C5363bb0();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return X;
    }

    public boolean a(@NotNull Void r2) {
        C6562gT0.p(r2, "value");
        return false;
    }

    @Override // java.util.Map
    @Nullable
    /* renamed from: b */
    public Void get(@Nullable Object obj) {
        return null;
    }

    @NotNull
    public Set<Map.Entry> c() {
        return C8305nb0.X;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    @NotNull
    public Set<Object> d() {
        return C8305nb0.X;
    }

    public int e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @NotNull
    public Collection f() {
        return C4773Ya0.X;
    }

    public Void g(Object obj, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    /* renamed from: i */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @NotNull
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
