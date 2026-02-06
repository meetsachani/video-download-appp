package o;

/* renamed from: o.tm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9815tm1 extends FP1 {
    private static final long serialVersionUID = 1;
    public static final int y1 = 2;
    public int x1 = 2;

    public C9815tm1() {
        l1();
    }

    @Override // o.FP1, o.AbstractC4253Sp2
    public void D(StringBuffer stringBuffer, String str, Object obj) {
        if (!C8457oD.V(obj.getClass()) && !String.class.equals(obj.getClass()) && k1(obj.getClass())) {
            this.x1 += 2;
            l1();
            stringBuffer.append(C8755pQ1.z0(obj, this));
            this.x1 -= 2;
            l1();
            return;
        }
        super.D(stringBuffer, str, obj);
    }

    @Override // o.AbstractC4253Sp2
    public void I(StringBuffer stringBuffer, String str, byte[] bArr) {
        this.x1 += 2;
        l1();
        super.I(stringBuffer, str, bArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void J(StringBuffer stringBuffer, String str, char[] cArr) {
        this.x1 += 2;
        l1();
        super.J(stringBuffer, str, cArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void K(StringBuffer stringBuffer, String str, double[] dArr) {
        this.x1 += 2;
        l1();
        super.K(stringBuffer, str, dArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void K0(StringBuffer stringBuffer, String str, Object obj) {
        this.x1 += 2;
        l1();
        super.K0(stringBuffer, str, obj);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void L(StringBuffer stringBuffer, String str, float[] fArr) {
        this.x1 += 2;
        l1();
        super.L(stringBuffer, str, fArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void M(StringBuffer stringBuffer, String str, int[] iArr) {
        this.x1 += 2;
        l1();
        super.M(stringBuffer, str, iArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void N(StringBuffer stringBuffer, String str, long[] jArr) {
        this.x1 += 2;
        l1();
        super.N(stringBuffer, str, jArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void O(StringBuffer stringBuffer, String str, Object[] objArr) {
        this.x1 += 2;
        l1();
        super.O(stringBuffer, str, objArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void P(StringBuffer stringBuffer, String str, short[] sArr) {
        this.x1 += 2;
        l1();
        super.P(stringBuffer, str, sArr);
        this.x1 -= 2;
        l1();
    }

    @Override // o.AbstractC4253Sp2
    public void Q(StringBuffer stringBuffer, String str, boolean[] zArr) {
        this.x1 += 2;
        l1();
        super.Q(stringBuffer, str, zArr);
        this.x1 -= 2;
        l1();
    }

    public final void l1() {
        Q0("{" + System.lineSeparator() + ((Object) m1(this.x1)));
        P0("," + System.lineSeparator() + ((Object) m1(this.x1)));
        O0(System.lineSeparator() + ((Object) m1(this.x1 + (-2))) + "}");
        T0(C6566gU0.f + System.lineSeparator() + ((Object) m1(this.x1)));
        X0("," + System.lineSeparator() + ((Object) m1(this.x1)));
        R0(System.lineSeparator() + ((Object) m1(this.x1 + (-2))) + C6566gU0.g);
    }

    public final StringBuilder m1(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(C4500Ve2.b);
        }
        return sb;
    }
}
