package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzenx implements zzetv {
    public final zzgdj a;
    public final Context b;

    public zzenx(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    public static /* synthetic */ zzeny c(zzenx zzenxVar) {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) zzenxVar.b.getSystemService("audio");
        float a = com.google.android.gms.ads.internal.zzv.x().a();
        boolean e = com.google.android.gms.ads.internal.zzv.x().e();
        if (audioManager == null) {
            return new zzeny(-1, false, false, -1, -1, -1, -1, -1, a, e, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nb)).booleanValue()) {
            int i3 = com.google.android.gms.ads.internal.zzv.w().i(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
            i = i3;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzeny(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a, e, false);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenx.c(zzenx.this);
            }
        });
    }
}
