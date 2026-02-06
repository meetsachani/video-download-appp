package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzqo {
    @InterfaceC11300zs1
    public final Context a;
    public Boolean b;

    public zzqo() {
        this(null);
    }

    public final zzpn a(zzz zzzVar, zze zzeVar) {
        int i;
        boolean booleanValue;
        boolean z;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        zzzVar.getClass();
        zzeVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (i = zzzVar.F) != -1) {
            Context context = this.a;
            Boolean bool = this.b;
            boolean z2 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = zzcj.c(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.b = Boolean.valueOf(z);
                } else {
                    this.b = Boolean.FALSE;
                }
                booleanValue = this.b.booleanValue();
            }
            String str = zzzVar.f301o;
            str.getClass();
            int a = zzay.a(str, zzzVar.k);
            if (a != 0 && i2 >= zzeu.C(a)) {
                int D = zzeu.D(zzzVar.E);
                if (D != 0) {
                    try {
                        AudioFormat S = zzeu.S(i, D, a);
                        if (i2 >= 31) {
                            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(S, zzeVar.a().a);
                            if (playbackOffloadSupport == 0) {
                                return zzpn.d;
                            }
                            zzpl zzplVar = new zzpl();
                            if (i2 > 32 && playbackOffloadSupport == 2) {
                                z2 = true;
                            }
                            zzplVar.a(true);
                            zzplVar.b(z2);
                            zzplVar.c(booleanValue);
                            return zzplVar.d();
                        }
                        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(S, zzeVar.a().a);
                        if (!isOffloadedPlaybackSupported) {
                            return zzpn.d;
                        }
                        zzpl zzplVar2 = new zzpl();
                        zzplVar2.a(true);
                        zzplVar2.c(booleanValue);
                        return zzplVar2.d();
                    } catch (IllegalArgumentException unused) {
                        return zzpn.d;
                    }
                }
                return zzpn.d;
            }
            return zzpn.d;
        }
        return zzpn.d;
    }

    public zzqo(@InterfaceC11300zs1 Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }
}
