package o;

import java.util.List;

/* renamed from: o.vS2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10228vS2 extends IS2 {
    public String a1;
    public String b1;
    public String c1;

    public C10228vS2(boolean z, String str, List<AS2> list, String str2, String str3) {
        super(z, str, list, str2, str3);
    }

    public String o() {
        return this.a1;
    }

    public String q() {
        return this.b1;
    }

    public String s() {
        return this.c1;
    }

    public void t(String str) {
        this.a1 = str;
    }

    public void u(String str) {
        this.b1 = str;
    }

    public void v(String str) {
        this.c1 = str;
    }

    public C10228vS2(String str, String str2, String str3, IS2 is2) {
        super(is2.f(), is2.e(), is2.b(), is2.c(), is2.d());
        this.a1 = str;
        this.b1 = str2;
        this.c1 = str3;
    }

    public C10228vS2(IS2 is2) {
        super(is2.f(), is2.e(), is2.b(), is2.c(), is2.d());
    }
}
