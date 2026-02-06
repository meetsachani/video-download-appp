package o;

import o.InterfaceC8148mw2;

/* renamed from: o.nX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8292nX0 extends C7302jX0 {
    public static final String w = "KeyCycle";
    public a s;
    public float t;
    public float u;
    public float v;

    /* renamed from: o.nX0$a */
    /* loaded from: classes.dex */
    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public C8292nX0(int i, String str) {
        super(i, str);
        this.s = null;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.a = "KeyCycle";
    }

    public float N() {
        return this.u;
    }

    public float O() {
        return this.t;
    }

    public float P() {
        return this.v;
    }

    public a Q() {
        return this.s;
    }

    public void R(float f) {
        this.u = f;
    }

    public void S(float f) {
        this.t = f;
    }

    public void T(float f) {
        this.v = f;
    }

    public void U(a aVar) {
        this.s = aVar;
    }

    @Override // o.C7302jX0
    public void g(StringBuilder sb) {
        super.g(sb);
        if (this.s != null) {
            sb.append("shape:'");
            sb.append(this.s);
            sb.append("',\n");
        }
        a(sb, InterfaceC8148mw2.c.Q, this.t);
        a(sb, InterfaceC8148mw2.c.R, this.u);
        a(sb, InterfaceC8148mw2.c.S, this.v);
    }
}
