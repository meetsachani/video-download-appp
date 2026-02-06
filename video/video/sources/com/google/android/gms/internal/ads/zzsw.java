package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzsw {
    public final zztc a;
    public final MediaFormat b;
    public final zzz c;
    @InterfaceC11300zs1
    public final Surface d;
    @InterfaceC11300zs1
    public final MediaCrypto e = null;
    @InterfaceC11300zs1
    public final zzsv f;

    public zzsw(zztc zztcVar, MediaFormat mediaFormat, zzz zzzVar, @InterfaceC11300zs1 Surface surface, @InterfaceC11300zs1 MediaCrypto mediaCrypto, @InterfaceC11300zs1 zzsv zzsvVar) {
        this.a = zztcVar;
        this.b = mediaFormat;
        this.c = zzzVar;
        this.d = surface;
        this.f = zzsvVar;
    }

    public static zzsw a(zztc zztcVar, MediaFormat mediaFormat, zzz zzzVar, @InterfaceC11300zs1 MediaCrypto mediaCrypto, @InterfaceC11300zs1 zzsv zzsvVar) {
        return new zzsw(zztcVar, mediaFormat, zzzVar, null, null, zzsvVar);
    }

    public static zzsw b(zztc zztcVar, MediaFormat mediaFormat, zzz zzzVar, @InterfaceC11300zs1 Surface surface, @InterfaceC11300zs1 MediaCrypto mediaCrypto) {
        return new zzsw(zztcVar, mediaFormat, zzzVar, surface, null, null);
    }
}
