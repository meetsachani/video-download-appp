package o;

/* renamed from: o.pS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8761pS {
    public int a = 0;
    public a b = a.NUMERIC;

    /* renamed from: o.pS$a */
    /* loaded from: classes3.dex */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.a;
    }

    public void b(int i) {
        this.a += i;
    }

    public boolean c() {
        if (this.b == a.ALPHA) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.b == a.ISO_IEC_646) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.b == a.NUMERIC) {
            return true;
        }
        return false;
    }

    public void f() {
        this.b = a.ALPHA;
    }

    public void g() {
        this.b = a.ISO_IEC_646;
    }

    public void h() {
        this.b = a.NUMERIC;
    }

    public void i(int i) {
        this.a = i;
    }
}
