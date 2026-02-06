package o;

import android.util.Base64;
import java.util.List;
import o.AbstractC4253Sp2;

/* renamed from: o.Xw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4761Xw0 {
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;

    public C4761Xw0(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = (String) C10907yF1.l(str);
        this.b = (String) C10907yF1.l(str2);
        this.c = (String) C10907yF1.l(str3);
        this.d = (List) C10907yF1.l(list);
        this.e = 0;
        this.f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    @Deprecated
    public String e() {
        return this.f;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append(AbstractC4253Sp2.b.x1);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }

    public C4761Xw0(String str, String str2, String str3, int i) {
        this.a = (String) C10907yF1.l(str);
        this.b = (String) C10907yF1.l(str2);
        this.c = (String) C10907yF1.l(str3);
        this.d = null;
        C10907yF1.a(i != 0);
        this.e = i;
        this.f = a(str, str2, str3);
    }
}
