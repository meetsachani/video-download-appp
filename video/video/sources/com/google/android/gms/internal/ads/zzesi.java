package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzesi implements zzetv {
    public final ApplicationInfo a;
    @InterfaceC11300zs1
    public final PackageInfo b;
    public final Context c;

    public zzesi(ApplicationInfo applicationInfo, @InterfaceC11300zs1 PackageInfo packageInfo, Context context) {
        this.a = applicationInfo;
        this.b = packageInfo;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String str5 = this.a.packageName;
        PackageInfo packageInfo = this.b;
        String str6 = null;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        if (packageInfo == null) {
            str = null;
        } else {
            str = packageInfo.versionName;
        }
        try {
            Context context = this.c;
            zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
            str2 = String.valueOf(Wrappers.a(context).d(str5));
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Zc)).booleanValue()) {
                try {
                    installSourceInfo = this.c.getPackageManager().getInstallSourceInfo(str5);
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    str3 = null;
                }
                if (installSourceInfo != null) {
                    str3 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            com.google.android.gms.ads.internal.util.zze.k("No installing package name found");
                            str3 = null;
                        }
                        str4 = installSourceInfo.getInitiatingPackageName();
                        try {
                        } catch (PackageManager.NameNotFoundException e2) {
                            e = e2;
                            str6 = str4;
                            com.google.android.gms.ads.internal.zzv.t().x(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            str4 = str6;
                            return zzgcy.h(new zzesj(str5, valueOf, str, str2, str3, str4));
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        com.google.android.gms.ads.internal.util.zze.k("No initiating package name found");
                        str4 = str6;
                    }
                    return zzgcy.h(new zzesj(str5, valueOf, str, str2, str3, str4));
                }
            }
        }
        str3 = null;
        str4 = null;
        return zzgcy.h(new zzesj(str5, valueOf, str, str2, str3, str4));
    }
}
