package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C4128Rj1;
import o.ES1;
import o.InterfaceC11300zs1;
import o.MT2;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(32)
/* loaded from: classes2.dex */
public final class zzyg {
    @InterfaceC11300zs1
    public final Spatializer a;
    public final boolean b;
    @InterfaceC11300zs1
    public final Handler c;
    @InterfaceC11300zs1
    public final Spatializer$OnSpatializerStateChangedListener d;

    public zzyg(@InterfaceC11300zs1 Context context, zzyo zzyoVar) {
        AudioManager c;
        Spatializer spatializer;
        int immersiveAudioLevel;
        if (context == null) {
            c = null;
        } else {
            c = zzcj.c(context);
        }
        if (c != null && !zzeu.n(context)) {
            spatializer = c.getSpatializer();
            this.a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.b = immersiveAudioLevel != 0;
            zzyf zzyfVar = new zzyf(this, zzyoVar);
            this.d = zzyfVar;
            Looper myLooper = Looper.myLooper();
            zzdc.b(myLooper);
            final Handler handler = new Handler(myLooper);
            this.c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzye
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, zzyfVar);
            return;
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public final void a() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = this.d) != null && (handler = this.c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final boolean b(zze zzeVar, zzz zzzVar) {
        int i;
        boolean canBeSpatialized;
        String str = zzzVar.f301o;
        if (Objects.equals(str, C4128Rj1.S)) {
            i = zzzVar.E;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzzVar.E;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, C4128Rj1.T)) {
            i = zzzVar.E;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzzVar.E;
        }
        int D = zzeu.D(i);
        if (D == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(D);
        int i2 = zzzVar.F;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        canBeSpatialized = MT2.a(spatializer).canBeSpatialized(zzeVar.a().a, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean c() {
        boolean isAvailable;
        Spatializer spatializer = this.a;
        spatializer.getClass();
        isAvailable = MT2.a(spatializer).isAvailable();
        return isAvailable;
    }

    public final boolean d() {
        boolean isEnabled;
        Spatializer spatializer = this.a;
        spatializer.getClass();
        isEnabled = MT2.a(spatializer).isEnabled();
        return isEnabled;
    }

    public final boolean e() {
        return this.b;
    }
}
