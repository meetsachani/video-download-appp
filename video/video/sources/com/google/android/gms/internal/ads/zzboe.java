package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzboe {
    public final Object a = new Object();
    public final Object b = new Object();
    public zzbon c;
    public zzbon d;

    public static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public final zzbon a(Context context, VersionInfoParcel versionInfoParcel, @InterfaceC11300zs1 zzfhq zzfhqVar) {
        zzbon zzbonVar;
        String str;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    if (((Boolean) zzbfb.f.e()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b);
                    }
                    this.c = new zzbon(c(context), versionInfoParcel, str, zzfhqVar);
                }
                zzbonVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbonVar;
    }

    public final zzbon b(Context context, VersionInfoParcel versionInfoParcel, zzfhq zzfhqVar) {
        zzbon zzbonVar;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    this.d = new zzbon(c(context), versionInfoParcel, (String) zzbff.a.e(), zzfhqVar);
                }
                zzbonVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbonVar;
    }
}
