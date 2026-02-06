package o;

/* renamed from: o.sk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9565sk2 {
    public final String a;
    public final int b;

    public C9565sk2(String workSpecId, int systemId) {
        this.a = workSpecId;
        this.b = systemId;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof C9565sk2)) {
            return false;
        }
        C9565sk2 c9565sk2 = (C9565sk2) o2;
        if (this.b != c9565sk2.b) {
            return false;
        }
        return this.a.equals(c9565sk2.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
