package o;

import o.InterfaceC8148mw2;

/* renamed from: o.qX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9022qX0 extends C7545kX0 {
    public a s;
    public float[] t;
    public float[] u;
    public float[] v;

    /* renamed from: o.qX0$a */
    /* loaded from: classes.dex */
    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public C9022qX0(int i, String... strArr) {
        super(i, strArr);
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.a = "KeyCycle";
    }

    public float[] N() {
        return this.u;
    }

    public float[] O() {
        return this.t;
    }

    public float[] P() {
        return this.v;
    }

    public a Q() {
        return this.s;
    }

    public void R(float... fArr) {
        this.u = fArr;
    }

    public void S(float... fArr) {
        this.t = fArr;
    }

    public void T(float... fArr) {
        this.v = fArr;
    }

    public void U(a aVar) {
        this.s = aVar;
    }

    @Override // o.C7545kX0
    public void g(StringBuilder sb) {
        super.g(sb);
        if (this.s != null) {
            sb.append("shape:'");
            sb.append(this.s);
            sb.append("',\n");
        }
        d(sb, InterfaceC8148mw2.c.Q, this.t);
        d(sb, InterfaceC8148mw2.c.R, this.u);
        d(sb, InterfaceC8148mw2.c.S, this.v);
    }
}
