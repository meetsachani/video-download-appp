package o;

/* loaded from: classes3.dex */
public final class YK2 extends AbstractC3697My1 {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public YK2(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(80);
        AbstractC3697My1.c(this.b, sb);
        AbstractC3697My1.c(this.c, sb);
        AbstractC3697My1.c(this.d, sb);
        AbstractC3697My1.c(Boolean.toString(this.e), sb);
        return sb.toString();
    }

    public String e() {
        return this.g;
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.d;
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return this.b;
    }

    public boolean l() {
        return this.e;
    }

    public YK2(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, null, null, null, null);
    }

    public YK2(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(EnumC3795Ny1.WIFI);
        this.b = str2;
        this.c = str;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }
}
