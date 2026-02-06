package o;

/* renamed from: o.Lp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3568Lp1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public C3568Lp1(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.a = isConnected;
        this.b = isValidated;
        this.c = isMetered;
        this.d = isNotRoaming;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof C3568Lp1)) {
            return false;
        }
        C3568Lp1 c3568Lp1 = (C3568Lp1) o2;
        if (this.a == c3568Lp1.a && this.b == c3568Lp1.b && this.c == c3568Lp1.c && this.d == c3568Lp1.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        if (this.d) {
            return i2 + 4096;
        }
        return i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
