package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public class GX0 extends PX0 {
    public String[] a;
    public int[] d;
    public String b = null;
    public a c = null;
    public float[] e = null;
    public float[] f = null;
    public float[] g = null;
    public float[] h = null;

    /* loaded from: classes.dex */
    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public GX0(int i, String... strArr) {
        this.d = null;
        this.a = strArr;
        int[] iArr = new int[i];
        this.d = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i2 < iArr2.length) {
                iArr2[i2] = (int) ((i2 * length) + length);
                i2++;
            } else {
                return;
            }
        }
    }

    public int[] g() {
        return this.d;
    }

    public float[] h() {
        return this.f;
    }

    public float[] i() {
        return this.e;
    }

    public float[] j() {
        return this.g;
    }

    public float[] k() {
        return this.h;
    }

    public a l() {
        return this.c;
    }

    public String[] m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public void o(int... iArr) {
        this.d = iArr;
    }

    public void p(float... fArr) {
        this.f = fArr;
    }

    public void q(float... fArr) {
        this.e = fArr;
    }

    public void r(float... fArr) {
        this.g = fArr;
    }

    public void s(float... fArr) {
        this.h = fArr;
    }

    public void t(a aVar) {
        this.c = aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\n");
        e(sb, "target", this.a);
        sb.append("frame:");
        sb.append(Arrays.toString(this.d));
        sb.append(",\n");
        if (this.c != null) {
            sb.append("type:'");
            sb.append(this.c);
            sb.append("',\n");
        }
        c(sb, "easing", this.b);
        d(sb, "percentX", this.g);
        d(sb, "percentX", this.h);
        d(sb, "percentWidth", this.e);
        d(sb, "percentHeight", this.f);
        sb.append("},\n");
        return sb.toString();
    }

    public void u(String str) {
        this.b = str;
    }
}
