package o;

/* renamed from: o.b32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5235b32 implements InterfaceC6776hM {
    public final String a;
    public final int b;
    public final C10881y9 c;
    public final boolean d;

    public C5235b32(String str, int i, C10881y9 c10881y9, boolean z) {
        this.a = str;
        this.b = i;
        this.c = c10881y9;
        this.d = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new Q22(c8431o61, abstractC8588ol, this);
    }

    public String b() {
        return this.a;
    }

    public C10881y9 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
