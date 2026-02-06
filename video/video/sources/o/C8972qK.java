package o;

import java.util.Objects;

/* renamed from: o.qK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8972qK<T> implements InterfaceC9217rJ<T> {
    public static final String b = "ConstantInitializer@%d [ object = %s ]";
    public final T a;

    public C8972qK(T t) {
        this.a = t;
    }

    public final T a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8972qK)) {
            return false;
        }
        return Objects.equals(a(), ((C8972qK) obj).a());
    }

    @Override // o.InterfaceC9217rJ
    public T get() throws C8725pJ {
        return a();
    }

    public int hashCode() {
        if (a() != null) {
            return a().hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format(b, Integer.valueOf(System.identityHashCode(this)), String.valueOf(a()));
    }
}
