package o;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: o.Ul1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4430Ul1<K> implements Serializable {
    private static final long serialVersionUID = 4465448607415788805L;
    public final K[] X;
    public transient int Y;

    public C4430Ul1(K k, K k2) {
        this(new Object[]{k, k2}, false);
    }

    public final void a(Object[] objArr) {
        int i = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                i ^= obj.hashCode();
            }
        }
        this.Y = i;
    }

    public K b(int i) {
        return this.X[i];
    }

    public K[] c() {
        return (K[]) ((Object[]) this.X.clone());
    }

    public int d() {
        return this.X.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4430Ul1) {
            return Arrays.equals(this.X, ((C4430Ul1) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return this.Y;
    }

    public Object readResolve() {
        a(this.X);
        return this;
    }

    public String toString() {
        return "MultiKey" + Arrays.toString(this.X);
    }

    public C4430Ul1(K k, K k2, K k3) {
        this(new Object[]{k, k2, k3}, false);
    }

    public C4430Ul1(K k, K k2, K k3, K k4) {
        this(new Object[]{k, k2, k3, k4}, false);
    }

    public C4430Ul1(K k, K k2, K k3, K k4, K k5) {
        this(new Object[]{k, k2, k3, k4, k5}, false);
    }

    public C4430Ul1(K[] kArr) {
        this((Object[]) kArr, true);
    }

    public C4430Ul1(K[] kArr, boolean z) {
        if (kArr != null) {
            if (z) {
                this.X = (K[]) ((Object[]) kArr.clone());
            } else {
                this.X = kArr;
            }
            a(kArr);
            return;
        }
        throw new IllegalArgumentException("The array of keys must not be null");
    }
}
