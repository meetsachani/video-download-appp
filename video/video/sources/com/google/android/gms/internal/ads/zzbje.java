package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbje implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.W))) {
            com.google.android.gms.ads.internal.util.zze.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzftm l = zzftn.l();
        l.b((String) map.get(RemoteConfigConstants.RequestFieldKey.W));
        l.h(zzcfbVar.getWidth());
        l.g(zzcfbVar.U().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            l.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            l.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            l.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            l.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            l.a((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzv.o().j(zzcfbVar, l.i());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.k("Missing parameters for LMD Overlay show request");
        }
    }
}
