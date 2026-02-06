package com.google.android.gms.common;

import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;
import o.QB;

@QB
/* loaded from: classes2.dex */
public class PackageVerificationResult {
    public final String a;
    public final boolean b;
    @InterfaceC10571ws1
    public final String c;
    @InterfaceC10571ws1
    public final Throwable d;

    public PackageVerificationResult(String str, int i, boolean z, @InterfaceC10571ws1 String str2, @InterfaceC10571ws1 Throwable th) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = th;
    }

    @InterfaceC5670cr1
    public static PackageVerificationResult a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC10571ws1 Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    @InterfaceC5670cr1
    public static PackageVerificationResult d(@InterfaceC5670cr1 String str, int i) {
        return new PackageVerificationResult(str, i, true, null, null);
    }

    public final void b() {
        if (!this.b) {
            String str = this.c;
            Throwable th = this.d;
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(str));
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean c() {
        return this.b;
    }
}
