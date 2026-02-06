package o;

/* renamed from: o.cm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5651cm2 extends AbstractC3697My1 {
    public final String b;
    public final String c;
    public final String d;

    public C5651cm2(String str, String str2, String str3) {
        super(EnumC3795Ny1.TEL);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        AbstractC3697My1.c(this.b, sb);
        AbstractC3697My1.c(this.d, sb);
        return sb.toString();
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }
}
