package o;

/* renamed from: o.jX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7302jX0 extends PX0 {
    public String b;
    public int c;
    public String d;
    public String a = "KeyAttributes";
    public a e = null;
    public b f = null;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f776o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;

    /* renamed from: o.jX0$a */
    /* loaded from: classes.dex */
    public enum a {
        SPLINE,
        LINEAR
    }

    /* renamed from: o.jX0$b */
    /* loaded from: classes.dex */
    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public C7302jX0(int i, String str) {
        this.b = str;
        this.c = i;
    }

    public void A(float f) {
        this.l = f;
    }

    public void B(float f) {
        this.h = f;
    }

    public void C(float f) {
        this.i = f;
    }

    public void D(float f) {
        this.j = f;
    }

    public void E(float f) {
        this.n = f;
    }

    public void F(float f) {
        this.f776o = f;
    }

    public void G(String str) {
        this.b = str;
    }

    public void H(String str) {
        this.d = str;
    }

    public void I(float f) {
        this.m = f;
    }

    public void J(float f) {
        this.p = f;
    }

    public void K(float f) {
        this.q = f;
    }

    public void L(float f) {
        this.r = f;
    }

    public void M(b bVar) {
        this.f = bVar;
    }

    public void g(StringBuilder sb) {
        c(sb, "target", this.b);
        sb.append("frame:");
        sb.append(this.c);
        sb.append(",\n");
        c(sb, "easing", this.d);
        if (this.e != null) {
            sb.append("fit:'");
            sb.append(this.e);
            sb.append("',\n");
        }
        if (this.f != null) {
            sb.append("visibility:'");
            sb.append(this.f);
            sb.append("',\n");
        }
        a(sb, "alpha", this.g);
        a(sb, "rotationX", this.i);
        a(sb, "rotationY", this.j);
        a(sb, "rotationZ", this.h);
        a(sb, "pivotX", this.k);
        a(sb, "pivotY", this.l);
        a(sb, "pathRotate", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.f776o);
        a(sb, "translationX", this.p);
        a(sb, "translationY", this.q);
        a(sb, "translationZ", this.r);
    }

    public float h() {
        return this.g;
    }

    public a i() {
        return this.e;
    }

    public float j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.h;
    }

    public float m() {
        return this.i;
    }

    public float n() {
        return this.j;
    }

    public float o() {
        return this.n;
    }

    public float p() {
        return this.f776o;
    }

    public String q() {
        return this.b;
    }

    public String r() {
        return this.d;
    }

    public float s() {
        return this.m;
    }

    public float t() {
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

    public float u() {
        return this.q;
    }

    public float v() {
        return this.r;
    }

    public b w() {
        return this.f;
    }

    public void x(float f) {
        this.g = f;
    }

    public void y(a aVar) {
        this.e = aVar;
    }

    public void z(float f) {
        this.k = f;
    }
}
