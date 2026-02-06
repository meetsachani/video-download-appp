package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Kt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3486Kt1<V> implements BO1<Object, V> {
    public V a;

    public AbstractC3486Kt1(V v) {
        this.a = v;
    }

    @Override // o.BO1, o.InterfaceC11186zO1
    public V a(@Nullable Object obj, @NotNull TW0<?> tw0) {
        C6562gT0.p(tw0, "property");
        return this.a;
    }

    @Override // o.BO1
    public void b(@Nullable Object obj, @NotNull TW0<?> tw0, V v) {
        C6562gT0.p(tw0, "property");
        V v2 = this.a;
        if (!d(tw0, v2, v)) {
            return;
        }
        this.a = v;
        c(tw0, v2, v);
    }

    public void c(@NotNull TW0<?> tw0, V v, V v2) {
        C6562gT0.p(tw0, "property");
    }

    public boolean d(@NotNull TW0<?> tw0, V v, V v2) {
        C6562gT0.p(tw0, "property");
        return true;
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
