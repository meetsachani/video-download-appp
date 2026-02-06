package o;

/* renamed from: o.rE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9200rE2 extends AbstractC3697My1 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final char i;
    public final String j;

    public C9200rE2(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(EnumC3795Ny1.VIN);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = c;
        this.j = str7;
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.c);
        sb.append(' ');
        sb.append(this.d);
        sb.append(' ');
        sb.append(this.e);
        sb.append('\n');
        String str = this.f;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.h);
        sb.append(' ');
        sb.append(this.i);
        sb.append(' ');
        sb.append(this.j);
        sb.append('\n');
        return sb.toString();
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.h;
    }

    public char g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.g;
    }

    public String k() {
        return this.d;
    }

    public String l() {
        return this.e;
    }

    public String m() {
        return this.c;
    }
}
