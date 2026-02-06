package o;

/* renamed from: o.Ei  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2841Ei extends T20 {
    public final String a;
    public final String b;
    public final int c;

    public C2841Ei(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null model");
        }
        throw new NullPointerException("Null manufacturer");
    }

    @Override // o.T20
    public String c() {
        return this.a;
    }

    @Override // o.T20
    public String d() {
        return this.b;
    }

    @Override // o.T20
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T20) {
            T20 t20 = (T20) obj;
            if (this.a.equals(t20.c()) && this.b.equals(t20.d()) && this.c == t20.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.a + ", model=" + this.b + ", sdkVersion=" + this.c + "}";
    }
}
