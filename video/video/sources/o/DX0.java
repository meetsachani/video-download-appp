package o;

/* loaded from: classes.dex */
public class DX0 extends PX0 {
    public String a;
    public int c;
    public String b = null;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public a h = a.CARTESIAN;

    /* loaded from: classes.dex */
    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public DX0(String str, int i) {
        this.a = null;
        this.c = 0;
        this.a = str;
        this.c = i;
    }

    public int g() {
        return this.c;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.f;
    }

    public float k() {
        return this.g;
    }

    public a l() {
        return this.h;
    }

    public String m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public void o(int i) {
        this.c = i;
    }

    public void p(float f) {
        this.e = f;
    }

    public void q(float f) {
        this.d = f;
    }

    public void r(float f) {
        this.f = f;
    }

    public void s(float f) {
        this.g = f;
    }

    public void t(a aVar) {
        this.h = aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\n");
        c(sb, "target", this.a);
        sb.append("frame:");
        sb.append(this.c);
        sb.append(",\n");
        if (this.h != null) {
            sb.append("type:'");
            sb.append(this.h);
            sb.append("',\n");
        }
        c(sb, "easing", this.b);
        a(sb, "percentX", this.f);
        a(sb, "percentY", this.g);
        a(sb, "percentWidth", this.d);
        a(sb, "percentHeight", this.e);
        sb.append("},\n");
        return sb.toString();
    }

    public void u(String str) {
        this.a = str;
    }

    public void v(String str) {
        this.b = str;
    }
}
