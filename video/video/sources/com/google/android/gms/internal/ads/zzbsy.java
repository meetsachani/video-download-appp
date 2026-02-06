package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzbsy {
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener a;
    @InterfaceC11300zs1
    public final NativeCustomFormatAd.OnCustomClickListener b;
    @InterfaceC8710pF0("this")
    @InterfaceC11300zs1
    public NativeCustomFormatAd c;

    public zzbsy(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @InterfaceC11300zs1 NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomFormatAdLoadedListener;
        this.b = onCustomClickListener;
    }

    @InterfaceC11300zs1
    public final zzbhk a() {
        if (this.b == null) {
            return null;
        }
        return new zzbsv(this, null);
    }

    public final zzbhn b() {
        return new zzbsw(this, null);
    }

    public final synchronized NativeCustomFormatAd f(zzbha zzbhaVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbsz zzbszVar = new zzbsz(zzbhaVar);
        this.c = zzbszVar;
        return zzbszVar;
    }
}
