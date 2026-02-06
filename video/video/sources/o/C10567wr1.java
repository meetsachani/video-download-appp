package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.wr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10567wr1<T> implements BO1<Object, T> {
    @Nullable
    public T a;

    @Override // o.BO1, o.InterfaceC11186zO1
    @NotNull
    public T a(@Nullable Object obj, @NotNull TW0<?> tw0) {
        C6562gT0.p(tw0, "property");
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + tw0.getName() + " should be initialized before get.");
    }

    @Override // o.BO1
    public void b(@Nullable Object obj, @NotNull TW0<?> tw0, @NotNull T t) {
        C6562gT0.p(tw0, "property");
        C6562gT0.p(t, "value");
        this.a = t;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
