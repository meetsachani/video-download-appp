package o;

/* renamed from: o.vT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10230vT0 extends AbstractC6220f71 {
    public final AbstractC6220f71 c;

    public C10230vT0(AbstractC6220f71 abstractC6220f71) {
        super(abstractC6220f71.e(), abstractC6220f71.b());
        this.c = abstractC6220f71;
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 a(int i, int i2, int i3, int i4) {
        return new C10230vT0(this.c.a(i, i2, i3, i4));
    }

    @Override // o.AbstractC6220f71
    public byte[] c() {
        byte[] c = this.c.c();
        int e = e() * b();
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = (byte) (255 - (c[i] & 255));
        }
        return bArr;
    }

    @Override // o.AbstractC6220f71
    public byte[] d(int i, byte[] bArr) {
        byte[] d = this.c.d(i, bArr);
        int e = e();
        for (int i2 = 0; i2 < e; i2++) {
            d[i2] = (byte) (255 - (d[i2] & 255));
        }
        return d;
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 f() {
        return this.c;
    }

    @Override // o.AbstractC6220f71
    public boolean g() {
        return this.c.g();
    }

    @Override // o.AbstractC6220f71
    public boolean h() {
        return this.c.h();
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 i() {
        return new C10230vT0(this.c.i());
    }

    @Override // o.AbstractC6220f71
    public AbstractC6220f71 j() {
        return new C10230vT0(this.c.j());
    }
}
