package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.C11069yv1;
import o.EnumC3763Np1;
import o.InterfaceC5670cr1;
import o.XK;
import o.YM2;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbq {
    private static void W7(Context context) {
        try {
            YM2.A(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        W7(context);
        try {
            YM2 p = YM2.p(context);
            p.f("offline_ping_sender_work");
            p.k(new C11069yv1.a(OfflinePingSender.class).i(new XK.a().c(EnumC3763Np1.CONNECTED).b()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        W7(context);
        XK b = new XK.a().c(EnumC3763Np1.CONNECTED).b();
        try {
            YM2.p(context).k(new C11069yv1.a(OfflineNotificationPoster.class).i(b).o(new b.a().q("uri", zzaVar.X).q("gws_query_id", zzaVar.Y).q("image_url", zzaVar.Z).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
