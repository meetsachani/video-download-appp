package o;

import java.util.Arrays;

/* renamed from: o.kX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7545kX0 extends PX0 {
    public String[] b;
    public String c;
    public int[] e;
    public String a = "KeyAttributes";
    public a d = null;
    public b[] f = null;
    public float[] g = null;
    public float[] h = null;
    public float[] i = null;
    public float[] j = null;
    public float[] k = null;
    public float[] l = null;
    public float[] m = null;
    public float[] n = null;

    /* renamed from: o  reason: collision with root package name */
    public float[] f791o = null;
    public float[] p = null;
    public float[] q = null;
    public float[] r = null;

    /* renamed from: o.kX0$a */
    /* loaded from: classes.dex */
    public enum a {
        SPLINE,
        LINEAR
    }

    /* renamed from: o.kX0$b */
    /* loaded from: classes.dex */
    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public C7545kX0(int i, String... strArr) {
        this.e = null;
        this.b = strArr;
        int[] iArr = new int[i];
        this.e = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i2 < iArr2.length) {
                iArr2[i2] = (int) ((i2 * length) + length);
                i2++;
            } else {
                return;
            }
        }
    }

    public void A(float... fArr) {
        this.l = fArr;
    }

    public void B(float... fArr) {
        this.h = fArr;
    }

    public void C(float... fArr) {
        this.i = fArr;
    }

    public void D(float... fArr) {
        this.j = fArr;
    }

    public void E(float[] fArr) {
        this.n = fArr;
    }

    public void F(float[] fArr) {
        this.f791o = fArr;
    }

    public void G(String[] strArr) {
        this.b = strArr;
    }

    public void H(String str) {
        this.c = str;
    }

    public void I(float... fArr) {
        this.m = fArr;
    }

    public void J(float[] fArr) {
        this.p = fArr;
    }

    public void K(float[] fArr) {
        this.q = fArr;
    }

    public void L(float[] fArr) {
        this.r = fArr;
    }

    public void M(b... bVarArr) {
        this.f = bVarArr;
    }

    public void g(StringBuilder sb) {
        e(sb, "target", this.b);
        sb.append("frame:");
        sb.append(Arrays.toString(this.e));
        sb.append(",\n");
        c(sb, "easing", this.c);
        if (this.d != null) {
            sb.append("fit:'");
            sb.append(this.d);
            sb.append("',\n");
        }
        if (this.f != null) {
            sb.append("visibility:'");
            sb.append(Arrays.toString(this.f));
            sb.append("',\n");
        }
        d(sb, "alpha", this.g);
        d(sb, "rotationX", this.i);
        d(sb, "rotationY", this.j);
        d(sb, "rotationZ", this.h);
        d(sb, "pivotX", this.k);
        d(sb, "pivotY", this.l);
        d(sb, "pathRotate", this.m);
        d(sb, "scaleX", this.n);
        d(sb, "scaleY", this.f791o);
        d(sb, "translationX", this.p);
        d(sb, "translationY", this.q);
        d(sb, "translationZ", this.r);
    }

    public float[] h() {
        return this.g;
    }

    public a i() {
        return this.d;
    }

    public float[] j() {
        return this.k;
    }

    public float[] k() {
        return this.l;
    }

    public float[] l() {
        return this.h;
    }

    public float[] m() {
        return this.i;
    }

    public float[] n() {
        return this.j;
    }

    public float[] o() {
        return this.n;
    }

    public float[] p() {
        return this.f791o;
    }

    public String[] q() {
        return this.b;
    }

    public String r() {
        return this.c;
    }

    public float[] s() {
        return this.m;
    }

    public float[] t() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":{\n");
        g(sb);
        sb.append("},\n");
        return sb.toString();
    }

    public float[] u() {
        return this.q;
    }

    public float[] v() {
        return this.r;
    }

    public b[] w() {
        return this.f;
    }

    public void x(float... fArr) {
        this.g = fArr;
    }

    public void y(a aVar) {
        this.d = aVar;
    }

    public void z(float... fArr) {
        this.k = fArr;
    }
}
