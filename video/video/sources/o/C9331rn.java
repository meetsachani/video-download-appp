package o;

/* renamed from: o.rn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9331rn extends AbstractC4447Up2 {
    public final short c;
    public final short d;

    public C9331rn(AbstractC4447Up2 abstractC4447Up2, int i, int i2) {
        super(abstractC4447Up2);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // o.AbstractC4447Up2
    public void c(C10792xn c10792xn, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    c10792xn.d(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        c10792xn.d(s2 - 31, 16);
                    } else if (i == 0) {
                        c10792xn.d(Math.min((int) s2, 31), 5);
                    } else {
                        c10792xn.d(s2 - 31, 5);
                    }
                }
                c10792xn.d(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append(C10923yJ1.d);
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
