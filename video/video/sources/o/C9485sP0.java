package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9485sP0<T> {
    public final int a;
    public final T b;

    public C9485sP0(int i, T t) {
        this.a = i;
        this.b = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9485sP0 d(C9485sP0 c9485sP0, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = c9485sP0.a;
        }
        if ((i2 & 2) != 0) {
            obj = c9485sP0.b;
        }
        return c9485sP0.c(i, obj);
    }

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    @NotNull
    public final C9485sP0<T> c(int i, T t) {
        return new C9485sP0<>(i, t);
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9485sP0)) {
            return false;
        }
        C9485sP0 c9485sP0 = (C9485sP0) obj;
        if (this.a == c9485sP0.a && C6562gT0.g(this.b, c9485sP0.b)) {
            return true;
        }
        return false;
    }

    public final T f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        T t = this.b;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
