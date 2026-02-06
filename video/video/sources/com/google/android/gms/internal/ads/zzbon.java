package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC10571ws1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbon {
    @InterfaceC5056aJ2
    public static final com.google.android.gms.ads.internal.util.zzbd b = new zzbol();
    @InterfaceC5056aJ2
    public static final com.google.android.gms.ads.internal.util.zzbd c = new zzbom();
    public final zzbnz a;

    public zzbon(Context context, VersionInfoParcel versionInfoParcel, String str, @InterfaceC10571ws1 zzfhq zzfhqVar) {
        this.a = new zzbnz(context, versionInfoParcel, str, b, c, zzfhqVar);
    }

    public final zzbod a(String str, zzbog zzbogVar, zzbof zzbofVar) {
        return new zzbor(this.a, str, zzbogVar, zzbofVar);
    }

    public final zzbow b() {
        return new zzbow(this.a);
    }
}
