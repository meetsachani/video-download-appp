package o;

/* renamed from: o.nt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8379nt2 {
    public String e;
    public String f;
    public String g;
    public C7396jv1 a = null;
    public final int b = -1;
    public final int c = 400;
    public final float d = 0.0f;
    public int h = 0;
    public String i = null;
    public int j = -1;
    public int k = 400;
    public float l = 0.0f;
    public C10489wX0 m = new C10489wX0();

    public C8379nt2(String str, String str2) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.e = JT.d;
        this.g = str;
        this.f = str2;
    }

    public String a() {
        return this.e;
    }

    public void b(int i) {
        this.k = i;
    }

    public void c(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.e = str;
    }

    public void e(PX0 px0) {
        this.m.a(px0);
    }

    public void f(C7396jv1 c7396jv1) {
        this.a = c7396jv1;
    }

    public void g(float f) {
        this.l = f;
    }

    public void h(String str) {
        this.f = str;
    }

    public String i() {
        return toString();
    }

    public String toString() {
        String str = this.e + ":{\nfrom:'" + this.g + "',\nto:'" + this.f + "',\n";
        if (this.k != 400) {
            str = str + "duration:" + this.k + ",\n";
        }
        if (this.l != 0.0f) {
            str = str + "stagger:" + this.l + ",\n";
        }
        if (this.a != null) {
            str = str + this.a.toString();
        }
        return (str + this.m.toString()) + "},\n";
    }

    public C8379nt2(String str, String str2, String str3) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.e = str;
        this.g = str2;
        this.f = str3;
    }
}
