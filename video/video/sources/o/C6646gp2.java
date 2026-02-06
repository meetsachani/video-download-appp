package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* renamed from: o.gp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6646gp2<T> {
    public final T a;
    public final long b;

    public /* synthetic */ C6646gp2(Object obj, long j, C9516sY c9516sY) {
        this(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C6646gp2 d(C6646gp2 c6646gp2, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c6646gp2.a;
        }
        if ((i & 2) != 0) {
            j = c6646gp2.b;
        }
        return c6646gp2.c(obj, j);
    }

    public final T a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @NotNull
    public final C6646gp2<T> c(T t, long j) {
        return new C6646gp2<>(t, j, null);
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6646gp2)) {
            return false;
        }
        C6646gp2 c6646gp2 = (C6646gp2) obj;
        if (C6562gT0.g(this.a, c6646gp2.a) && Y70.t(this.b, c6646gp2.b)) {
            return true;
        }
        return false;
    }

    public final T f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        T t = this.a;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return (hashCode * 31) + Y70.N(this.b);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) Y70.h0(this.b)) + ')';
    }

    public C6646gp2(T t, long j) {
        this.a = t;
        this.b = j;
    }
}
