package o;

/* renamed from: o.e82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5982e82 extends AbstractC4447Up2 {
    public final short c;
    public final short d;

    public C5982e82(AbstractC4447Up2 abstractC4447Up2, int i, int i2) {
        super(abstractC4447Up2);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // o.AbstractC4447Up2
    public void c(C10792xn c10792xn, byte[] bArr) {
        c10792xn.d(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.d)).substring(1) + '>';
    }
}
