package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcj {
    @InterfaceC11300zs1
    public static AudioManager a;

    public static int a(AudioManager audioManager, zzch zzchVar) {
        int abandonAudioFocusRequest;
        if (Build.VERSION.SDK_INT >= 26) {
            abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(zzchVar.a());
            return abandonAudioFocusRequest;
        }
        return audioManager.abandonAudioFocus(zzchVar.b());
    }

    public static int b(AudioManager audioManager, zzch zzchVar) {
        int requestAudioFocus;
        if (Build.VERSION.SDK_INT >= 26) {
            requestAudioFocus = audioManager.requestAudioFocus(zzchVar.a());
            return requestAudioFocus;
        }
        AudioManager.OnAudioFocusChangeListener b = zzchVar.b();
        zzchVar.c();
        return audioManager.requestAudioFocus(b, 3, 1);
    }

    public static synchronized AudioManager c(Context context) {
        synchronized (zzcj.class) {
            try {
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final zzdj zzdjVar = new zzdj(zzdg.a);
                    zzdd.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcj.d(applicationContext, zzdjVar);
                        }
                    });
                    zzdjVar.b();
                    AudioManager audioManager2 = a;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void d(Context context, zzdj zzdjVar) {
        a = (AudioManager) context.getSystemService("audio");
        zzdjVar.f();
    }
}
