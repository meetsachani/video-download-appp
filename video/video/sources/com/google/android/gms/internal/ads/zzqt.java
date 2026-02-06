package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import o.ES1;
import o.InterfaceC11300zs1;

@ES1(23)
/* loaded from: classes2.dex */
final class zzqt {
    public static void a(AudioTrack audioTrack, @InterfaceC11300zs1 zzpk zzpkVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzpkVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzpkVar.a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
