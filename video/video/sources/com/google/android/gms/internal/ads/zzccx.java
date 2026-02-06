package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzccx implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        float parseFloat;
        zzcbw zzcbwVar = (zzcbw) obj;
        zzcgd r = zzcbwVar.r();
        if (r == null) {
            try {
                zzcgd zzcgdVar = new zzcgd(zzcbwVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbwVar.A(zzcgdVar);
                r = zzcgdVar;
            } catch (NullPointerException e) {
                e = e;
                Throwable th = e;
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to parse videoMeta message.", th);
                com.google.android.gms.ads.internal.zzv.t().x(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                Throwable th2 = e;
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzv.t().x(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i3 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i3 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.j(3)) {
            com.google.android.gms.ads.internal.util.client.zzo.b("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + i3 + " , aspectRatio : " + str);
        }
        r.Z7(parseFloat3, parseFloat2, i3, equals, parseFloat);
    }
}
