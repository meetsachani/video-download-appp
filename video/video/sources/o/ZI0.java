package o;

/* loaded from: classes4.dex */
public final class ZI0 {
    public final Object a;
    public final int b;

    public ZI0(Object obj) {
        this.b = System.identityHashCode(obj);
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZI0)) {
            return false;
        }
        ZI0 zi0 = (ZI0) obj;
        if (this.b != zi0.b || this.a != zi0.a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b;
    }
}
