package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzenu implements zzetu {
    @InterfaceC10571ws1
    public final Integer a;

    public zzenu(@InterfaceC10571ws1 Integer num) {
        this.a = num;
    }

    public static /* bridge */ /* synthetic */ zzenu a(VersionInfoParcel versionInfoParcel) {
        int i;
        int extensionVersion;
        int extensionVersion2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.v();
            int i2 = 0;
            try {
                i = Build.VERSION.SDK_INT;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.getAdServicesExtensionVersion");
            }
            if (i >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion2 > 3) {
                    i2 = SdkExtensions.getExtensionVersion(1000000);
                    return new zzenu(Integer.valueOf(i2));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ta)).booleanValue()) {
                if (versionInfoParcel.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.sa)).intValue() && i >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i2 = SdkExtensions.getExtensionVersion(31);
                    }
                }
            }
            return new zzenu(Integer.valueOf(i2));
        }
        return new zzenu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Integer num = this.a;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (num != null) {
            zzcuvVar.a.putInt("aos", num.intValue());
        }
    }
}
