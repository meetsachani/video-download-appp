package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;
import o.QB;

@ShowFirstParty
@QB
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GoogleSignatureVerifier {
    @InterfaceC10571ws1
    public static GoogleSignatureVerifier c;
    @InterfaceC10571ws1
    public static volatile Set d;
    public final Context a;
    public volatile String b;

    public GoogleSignatureVerifier(@InterfaceC5670cr1 Context context) {
        this.a = context.getApplicationContext();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GoogleSignatureVerifier a(@InterfaceC5670cr1 Context context) {
        Preconditions.r(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (c == null) {
                    zzn.e(context);
                    c = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @InterfaceC10571ws1
    public static final zzj e(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(@InterfaceC5670cr1 PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        zzj e;
        if (z) {
            if (packageInfo != null) {
                if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            } else {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if (!z) {
                        e = e(packageInfo2, zzm.a);
                    } else {
                        e = e(packageInfo2, zzm.a[0]);
                    }
                    if (e == null) {
                        return true;
                    }
                }
                return false;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if (!z) {
            }
            if (e == null) {
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean b(@InterfaceC5670cr1 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.k(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean c(@InterfaceC10571ws1 String str) {
        zzx g = g(str, false, false);
        g.e();
        return g.a;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean d(int i) {
        zzx c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c2 = g(packagesForUid[i2], false, false);
                    if (c2.a) {
                        break;
                    }
                    i2++;
                } else {
                    Preconditions.r(c2);
                    break;
                }
            }
        } else {
            c2 = zzx.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final zzx g(@InterfaceC10571ws1 String str, boolean z, boolean z2) {
        zzx c2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzx.c("null pkg");
        }
        if (!str.equals(this.b)) {
            if (zzn.g()) {
                c2 = zzn.b(str, GooglePlayServicesUtilLight.k(this.a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                    boolean k = GooglePlayServicesUtilLight.k(this.a);
                    if (packageInfo == null) {
                        c2 = zzx.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzx a = zzn.a(str2, zzkVar, k, false);
                            if (a.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && zzn.a(str2, zzkVar, false, true).a) {
                                c2 = zzx.c("debuggable release cert app rejected");
                            } else {
                                c2 = a;
                            }
                        } else {
                            c2 = zzx.c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return zzx.d("no pkg ".concat(str), e);
                }
            }
            if (c2.a) {
                this.b = str;
            }
            return c2;
        }
        return zzx.b();
    }
}
