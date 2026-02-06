package o;

import android.net.Uri;

@Deprecated
/* renamed from: o.fM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6278fM {
    public static final String a = "custom_";
    public static final String b = "exo_redir";
    public static final String c = "exo_len";

    @InterfaceC11300zs1
    static Uri d(InterfaceC6278fM interfaceC6278fM) {
        String c2 = interfaceC6278fM.c(b, null);
        if (c2 == null) {
            return null;
        }
        return Uri.parse(c2);
    }

    static long g(InterfaceC6278fM interfaceC6278fM) {
        return interfaceC6278fM.e(c, -1L);
    }

    @InterfaceC11300zs1
    String c(String str, @InterfaceC11300zs1 String str2);

    boolean contains(String str);

    long e(String str, long j);

    @InterfaceC11300zs1
    byte[] f(String str, @InterfaceC11300zs1 byte[] bArr);
}
