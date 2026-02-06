package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H61<V> {
    public final V a;
    public final Throwable b;

    public H61(V v) {
        this.a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H61)) {
            return false;
        }
        H61 h61 = (H61) obj;
        if (b() != null && b().equals(h61.b())) {
            return true;
        }
        if (a() == null || h61.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public H61(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
