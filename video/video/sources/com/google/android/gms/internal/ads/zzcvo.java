package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcvo {
    @InterfaceC11300zs1
    public static final zzbxv a(Context context, VersionInfoParcel versionInfoParcel, zzfbu zzfbuVar, zzbxr zzbxrVar) {
        zzbxs zzbxsVar = zzfbuVar.A;
        String str = null;
        if (zzbxsVar == null) {
            return null;
        }
        zzfbz zzfbzVar = zzfbuVar.s;
        if (zzfbzVar != null) {
            str = zzfbzVar.b;
        }
        return new zzbxq(context, versionInfoParcel, zzbxsVar, str, zzbxrVar);
    }
}
