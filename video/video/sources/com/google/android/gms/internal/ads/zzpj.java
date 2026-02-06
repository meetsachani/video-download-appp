package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzpj {
    public final Context a;
    public final Handler b;
    @InterfaceC11300zs1
    public final zzpf c;
    public final BroadcastReceiver d;
    @InterfaceC11300zs1
    public final zzpg e;
    @InterfaceC11300zs1
    public zzpe f;
    @InterfaceC11300zs1
    public zzpk g;
    public zze h;
    public boolean i;
    public final zzqs j;

    public zzpj(Context context, zzqs zzqsVar, zze zzeVar, @InterfaceC11300zs1 zzpk zzpkVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = zzqsVar;
        this.h = zzeVar;
        this.g = zzpkVar;
        Handler handler = new Handler(zzeu.U(), null);
        this.b = handler;
        this.c = new zzpf(this, null);
        this.d = new zzph(this, null);
        Uri a = zzpe.a();
        this.e = a != null ? new zzpg(this, handler, applicationContext.getContentResolver(), a) : null;
    }

    public final zzpe c() {
        if (this.i) {
            zzpe zzpeVar = this.f;
            zzpeVar.getClass();
            return zzpeVar;
        }
        this.i = true;
        zzpg zzpgVar = this.e;
        if (zzpgVar != null) {
            zzpgVar.a();
        }
        zzpf zzpfVar = this.c;
        if (zzpfVar != null) {
            Context context = this.a;
            zzcj.c(context).registerAudioDeviceCallback(zzpfVar, this.b);
        }
        Context context2 = this.a;
        zzpe d = zzpe.d(context2, context2.registerReceiver(this.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.b), this.h, this.g);
        this.f = d;
        return d;
    }

    public final void g(zze zzeVar) {
        this.h = zzeVar;
        j(zzpe.c(this.a, zzeVar, this.g));
    }

    @ES1(23)
    public final void h(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzpk zzpkVar = this.g;
        zzpk zzpkVar2 = null;
        if (zzpkVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzpkVar.a;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzpkVar2 = new zzpk(audioDeviceInfo);
        }
        this.g = zzpkVar2;
        j(zzpe.c(this.a, this.h, zzpkVar2));
    }

    public final void i() {
        if (!this.i) {
            return;
        }
        this.f = null;
        zzpf zzpfVar = this.c;
        if (zzpfVar != null) {
            zzcj.c(this.a).unregisterAudioDeviceCallback(zzpfVar);
        }
        this.a.unregisterReceiver(this.d);
        zzpg zzpgVar = this.e;
        if (zzpgVar != null) {
            zzpgVar.b();
        }
        this.i = false;
    }

    public final void j(zzpe zzpeVar) {
        if (this.i && !zzpeVar.equals(this.f)) {
            this.f = zzpeVar;
            this.j.a.H(zzpeVar);
        }
    }
}
