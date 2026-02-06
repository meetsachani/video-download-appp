package o;

import java.nio.charset.Charset;

/* renamed from: o.Yk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4812Yk {
    @InterfaceC3147Hi0
    @XP0
    @InterfaceC6480g82(version = "1.8")
    public static final byte[] a(C4715Xk c4715Xk, CharSequence charSequence, int i, int i2) {
        C6562gT0.p(c4715Xk, "<this>");
        C6562gT0.p(charSequence, "source");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            c4715Xk.h(str.length(), i, i2);
            String substring = str.substring(i, i2);
            C6562gT0.o(substring, "substring(...)");
            Charset charset = HB.g;
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            C6562gT0.o(bytes, "getBytes(...)");
            return bytes;
        }
        return c4715Xk.e(charSequence, i, i2);
    }

    @InterfaceC3147Hi0
    @XP0
    @InterfaceC6480g82(version = "1.8")
    public static final int b(C4715Xk c4715Xk, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C6562gT0.p(c4715Xk, "<this>");
        C6562gT0.p(bArr, "source");
        C6562gT0.p(bArr2, "destination");
        return c4715Xk.w(bArr, bArr2, i, i2, i3);
    }

    @InterfaceC3147Hi0
    @XP0
    @InterfaceC6480g82(version = "1.8")
    public static final byte[] c(C4715Xk c4715Xk, byte[] bArr, int i, int i2) {
        C6562gT0.p(c4715Xk, "<this>");
        C6562gT0.p(bArr, "source");
        return c4715Xk.C(bArr, i, i2);
    }

    @InterfaceC3147Hi0
    @XP0
    @InterfaceC6480g82(version = "1.8")
    public static final String d(C4715Xk c4715Xk, byte[] bArr, int i, int i2) {
        C6562gT0.p(c4715Xk, "<this>");
        C6562gT0.p(bArr, "source");
        return new String(c4715Xk.C(bArr, i, i2), HB.g);
    }
}
