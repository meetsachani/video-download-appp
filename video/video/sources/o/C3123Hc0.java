package o;

/* renamed from: o.Hc0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123Hc0 {
    public final String a;

    public C3123Hc0(@InterfaceC5670cr1 String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static C3123Hc0 b(@InterfaceC5670cr1 String str) {
        return new C3123Hc0(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123Hc0)) {
            return false;
        }
        return this.a.equals(((C3123Hc0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @InterfaceC5670cr1
    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
