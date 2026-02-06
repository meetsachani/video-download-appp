package o;

/* renamed from: o.t7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9655t7 extends AbstractC3697My1 {
    public final String[] b;
    public final String[] c;
    public final String d;
    public final String[] e;
    public final String[] f;
    public final String[] g;
    public final String[] h;
    public final String i;
    public final String j;
    public final String[] k;
    public final String[] l;
    public final String m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final String f868o;
    public final String[] p;
    public final String[] q;

    public C9655t7(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC3697My1.d(this.b, sb);
        AbstractC3697My1.d(this.c, sb);
        AbstractC3697My1.c(this.d, sb);
        AbstractC3697My1.c(this.f868o, sb);
        AbstractC3697My1.c(this.m, sb);
        AbstractC3697My1.d(this.k, sb);
        AbstractC3697My1.d(this.e, sb);
        AbstractC3697My1.d(this.g, sb);
        AbstractC3697My1.c(this.i, sb);
        AbstractC3697My1.d(this.p, sb);
        AbstractC3697My1.c(this.n, sb);
        AbstractC3697My1.d(this.q, sb);
        AbstractC3697My1.c(this.j, sb);
        return sb.toString();
    }

    public String[] e() {
        return this.l;
    }

    public String[] f() {
        return this.k;
    }

    public String g() {
        return this.n;
    }

    public String[] h() {
        return this.h;
    }

    public String[] i() {
        return this.g;
    }

    public String[] j() {
        return this.q;
    }

    public String k() {
        return this.i;
    }

    public String[] l() {
        return this.b;
    }

    public String[] m() {
        return this.c;
    }

    public String n() {
        return this.j;
    }

    public String o() {
        return this.m;
    }

    public String[] p() {
        return this.e;
    }

    public String[] q() {
        return this.f;
    }

    public String r() {
        return this.d;
    }

    public String s() {
        return this.f868o;
    }

    public String[] t() {
        return this.p;
    }

    public C9655t7(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(EnumC3795Ny1.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
        this.b = strArr;
        this.c = strArr2;
        this.d = str;
        this.e = strArr3;
        this.f = strArr4;
        this.g = strArr5;
        this.h = strArr6;
        this.i = str2;
        this.j = str3;
        this.k = strArr7;
        this.l = strArr8;
        this.m = str4;
        this.n = str5;
        this.f868o = str6;
        this.p = strArr9;
        this.q = strArr10;
    }
}
