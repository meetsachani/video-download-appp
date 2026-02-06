package o;

/* renamed from: o.Oi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3831Oi extends SL0 {
    public final Object a;

    public C3831Oi(Object obj) {
        if (obj != null) {
            this.a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // o.SL0
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SL0) {
            return this.a.equals(((SL0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
