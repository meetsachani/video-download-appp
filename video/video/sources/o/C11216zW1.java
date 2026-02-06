package o;

/* renamed from: o.zW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11216zW1 extends AbstractC3697My1 {
    public final String[] b;
    public final String[] c;
    public final String d;
    public final String e;

    public C11216zW1(String str, String str2, String str3, String str4) {
        super(EnumC3795Ny1.SMS);
        this.b = new String[]{str};
        this.c = new String[]{str2};
        this.d = str3;
        this.e = str4;
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC3697My1.d(this.b, sb);
        AbstractC3697My1.c(this.d, sb);
        AbstractC3697My1.c(this.e, sb);
        return sb.toString();
    }

    public String e() {
        return this.e;
    }

    public String[] f() {
        return this.b;
    }

    public String g() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z2 = true;
        boolean z3 = true;
        for (int i = 0; i < this.b.length; i++) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.b[i]);
            String[] strArr = this.c;
            if (strArr != null && strArr[i] != null) {
                sb.append(";via=");
                sb.append(this.c[i]);
            }
        }
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.d == null) {
            z2 = false;
        }
        if (z || z2) {
            sb.append('?');
            if (z) {
                sb.append("body=");
                sb.append(this.e);
            }
            if (z2) {
                if (z) {
                    sb.append('&');
                }
                sb.append("subject=");
                sb.append(this.d);
            }
        }
        return sb.toString();
    }

    public String h() {
        return this.d;
    }

    public String[] i() {
        return this.c;
    }

    public C11216zW1(String[] strArr, String[] strArr2, String str, String str2) {
        super(EnumC3795Ny1.SMS);
        this.b = strArr;
        this.c = strArr2;
        this.d = str;
        this.e = str2;
    }
}
