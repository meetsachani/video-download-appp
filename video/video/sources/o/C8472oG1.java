package o;

/* renamed from: o.oG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8472oG1 {
    public String a;
    public Long b;

    public C8472oG1(String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof C8472oG1)) {
            return false;
        }
        C8472oG1 c8472oG1 = (C8472oG1) o2;
        if (!this.a.equals(c8472oG1.a)) {
            return false;
        }
        Long l = this.b;
        Long l2 = c8472oG1.b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public C8472oG1(String key, long value) {
        this.a = key;
        this.b = Long.valueOf(value);
    }
}
