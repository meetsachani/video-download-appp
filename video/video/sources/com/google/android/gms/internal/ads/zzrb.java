package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import o.ES1;
import o.InterfaceC11300zs1;

@ES1(24)
/* loaded from: classes2.dex */
public final class zzrb {
    public final AudioTrack a;
    public final zzpj b;
    @InterfaceC11300zs1
    public AudioRouting.OnRoutingChangedListener c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzra
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzrb.a(zzrb.this, audioRouting);
        }
    };

    public zzrb(AudioTrack audioTrack, zzpj zzpjVar) {
        this.a = audioTrack;
        this.b = zzpjVar;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void a(zzrb zzrbVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zzrbVar.c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zzrbVar.b.h(routedDevice);
        }
    }

    public final void b() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.c;
        onRoutingChangedListener.getClass();
        this.a.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.c = null;
    }
}
