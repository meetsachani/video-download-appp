package o;

/* renamed from: o.in  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7120in {
    public final AbstractC6878hn a;
    public C2469An b;

    public C7120in(AbstractC6878hn abstractC6878hn) {
        if (abstractC6878hn != null) {
            this.a = abstractC6878hn;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public C7120in a(int i, int i2, int i3, int i4) {
        return new C7120in(this.a.a(this.a.e().a(i, i2, i3, i4)));
    }

    public C2469An b() throws C9349rr1 {
        if (this.b == null) {
            this.b = this.a.b();
        }
        return this.b;
    }

    public C10792xn c(int i, C10792xn c10792xn) throws C9349rr1 {
        return this.a.c(i, c10792xn);
    }

    public int d() {
        return this.a.d();
    }

    public int e() {
        return this.a.f();
    }

    public boolean f() {
        return this.a.e().g();
    }

    public boolean g() {
        return this.a.e().h();
    }

    public C7120in h() {
        return new C7120in(this.a.a(this.a.e().i()));
    }

    public C7120in i() {
        return new C7120in(this.a.a(this.a.e().j()));
    }

    public String toString() {
        try {
            return b().toString();
        } catch (C9349rr1 unused) {
            return "";
        }
    }
}
