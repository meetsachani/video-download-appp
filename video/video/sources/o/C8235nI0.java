package o;

import java.net.InetAddress;
import java.text.ParseException;

@Z90
@InterfaceC11149zF0
/* renamed from: o.nI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8235nI0 {
    public final String a;

    public C8235nI0(String str) {
        this.a = str;
    }

    @InterfaceC6181ey
    public static C8235nI0 a(String str) throws ParseException {
        String str2;
        try {
            return b(str);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Invalid host specifier: ".concat(valueOf);
            } else {
                str2 = new String("Invalid host specifier: ");
            }
            ParseException parseException = new ParseException(str2, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static C8235nI0 b(String str) {
        InetAddress inetAddress;
        String str2;
        C7992mI0 c = C7992mI0.c(str);
        C10664xF1.d(!c.h());
        String d = c.d();
        try {
            inetAddress = C10946yP0.g(d);
        } catch (IllegalArgumentException unused) {
            inetAddress = null;
        }
        if (inetAddress != null) {
            return new C8235nI0(C10946yP0.O(inetAddress));
        }
        KS0 d2 = KS0.d(d);
        if (d2.f()) {
            return new C8235nI0(d2.toString());
        }
        String valueOf = String.valueOf(d);
        if (valueOf.length() != 0) {
            str2 = "Domain name does not have a recognized public suffix: ".concat(valueOf);
        } else {
            str2 = new String("Domain name does not have a recognized public suffix: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public static boolean c(String str) {
        try {
            b(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@MB Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8235nI0) {
            return this.a.equals(((C8235nI0) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
