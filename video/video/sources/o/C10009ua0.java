package o;

/* renamed from: o.ua0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10009ua0 extends AbstractC3697My1 {
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String e;
    public final String f;

    public C10009ua0(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC3697My1.d(this.b, sb);
        AbstractC3697My1.d(this.c, sb);
        AbstractC3697My1.d(this.d, sb);
        AbstractC3697My1.c(this.e, sb);
        AbstractC3697My1.c(this.f, sb);
        return sb.toString();
    }

    public String[] e() {
        return this.d;
    }

    public String f() {
        return this.f;
    }

    public String[] g() {
        return this.c;
    }

    @Deprecated
    public String h() {
        String[] strArr = this.b;
        if (strArr != null && strArr.length != 0) {
            return strArr[0];
        }
        return null;
    }

    @Deprecated
    public String i() {
        return C8192n71.b;
    }

    public String j() {
        return this.e;
    }

    public String[] k() {
        return this.b;
    }

    public C10009ua0(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(EnumC3795Ny1.EMAIL_ADDRESS);
        this.b = strArr;
        this.c = strArr2;
        this.d = strArr3;
        this.e = str;
        this.f = str2;
    }
}
