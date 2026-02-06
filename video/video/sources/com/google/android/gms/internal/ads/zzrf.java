package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrf extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ zzrg a;

    public zzrf(zzrg zzrgVar) {
        this.a = zzrgVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        audioTrack2 = this.a.c.p;
        audioTrack.equals(audioTrack2);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzri zzriVar = this.a.c;
        audioTrack2 = zzriVar.p;
        if (audioTrack.equals(audioTrack2)) {
            zzriVar.M = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.a.c.p;
        audioTrack.equals(audioTrack2);
    }
}
