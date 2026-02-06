package o;

/* loaded from: classes.dex */
public class DR1 implements InterfaceC6776hM {
    public final String a;
    public final C9177r9 b;
    public final C9177r9 c;
    public final F9 d;
    public final boolean e;

    public DR1(String str, C9177r9 c9177r9, C9177r9 c9177r92, F9 f9, boolean z) {
        this.a = str;
        this.b = c9177r9;
        this.c = c9177r92;
        this.d = f9;
        this.e = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new ER1(c8431o61, abstractC8588ol, this);
    }

    public C9177r9 b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public C9177r9 d() {
        return this.c;
    }

    public F9 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
