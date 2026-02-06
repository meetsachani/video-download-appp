package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;
import o.ES1;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(23)
/* loaded from: classes2.dex */
public final class zzpf extends AudioDeviceCallback {
    public final /* synthetic */ zzpj a;

    public /* synthetic */ zzpf(zzpj zzpjVar, zzpi zzpiVar) {
        this.a = zzpjVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zze zzeVar;
        zzpk zzpkVar;
        zzpj zzpjVar = this.a;
        context = zzpjVar.a;
        zzeVar = zzpjVar.h;
        zzpkVar = zzpjVar.g;
        zzpjVar.j(zzpe.c(context, zzeVar, zzpkVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpk zzpkVar;
        Context context;
        zze zzeVar;
        zzpk zzpkVar2;
        zzpj zzpjVar = this.a;
        zzpkVar = zzpjVar.g;
        String str = zzeu.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Objects.equals(audioDeviceInfoArr[i], zzpkVar)) {
                zzpjVar.g = null;
                break;
            } else {
                i++;
            }
        }
        context = zzpjVar.a;
        zzeVar = zzpjVar.h;
        zzpkVar2 = zzpjVar.g;
        zzpjVar.j(zzpe.c(context, zzeVar, zzpkVar2));
    }
}
