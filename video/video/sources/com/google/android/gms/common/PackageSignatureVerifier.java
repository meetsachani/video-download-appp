package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.QB;

@ShowFirstParty
@QB
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class PackageSignatureVerifier {
    @InterfaceC11300zs1
    public static zzad a;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static volatile zzac b;

    public static zzad c(Context context) {
        zzad zzadVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (a == null) {
                    a = new zzad(context);
                }
                zzadVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadVar;
    }

    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public PackageVerificationResult a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        String str2;
        PackageVerificationResult packageVerificationResult;
        String str3;
        PackageVerificationResult packageVerificationResult2;
        boolean k = GooglePlayServicesUtilLight.k(context);
        c(context);
        if (zzn.f()) {
            if (true != k) {
                str2 = "-0";
            } else {
                str2 = "-1";
            }
            String concat = String.valueOf(str).concat(str2);
            if (b != null) {
                str3 = b.a;
                if (str3.equals(concat)) {
                    packageVerificationResult2 = b.b;
                    return packageVerificationResult2;
                }
            }
            c(context);
            zzx c = zzn.c(str, k, false, false);
            if (c.a) {
                b = new zzac(concat, PackageVerificationResult.d(str, c.d));
                packageVerificationResult = b.b;
                return packageVerificationResult;
            }
            Preconditions.r(c.b);
            return PackageVerificationResult.a(str, c.b, c.c);
        }
        throw new zzae();
    }

    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public PackageVerificationResult b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        try {
            PackageVerificationResult a2 = a(context, str);
            a2.b();
            return a2;
        } catch (SecurityException e) {
            PackageVerificationResult a3 = a(context, str);
            if (a3.c()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            }
            return a3;
        }
    }
}
