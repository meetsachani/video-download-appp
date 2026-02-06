package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbha;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzez implements MediaContent {
    public final zzbgd a;
    public final VideoController b = new VideoController();
    @InterfaceC11300zs1
    public final zzbha c;

    public zzez(zzbgd zzbgdVar, @InterfaceC11300zs1 zzbha zzbhaVar) {
        this.a = zzbgdVar;
        this.c = zzbhaVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    @InterfaceC11300zs1
    public final zzbha a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean b() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean c() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @InterfaceC11300zs1
    public final Drawable d() {
        try {
            IObjectWrapper i = this.a.i();
            if (i != null) {
                return (Drawable) ObjectWrapper.o1(i);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void e(@InterfaceC11300zs1 Drawable drawable) {
        try {
            this.a.s0(ObjectWrapper.V3(drawable));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float f() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return 0.0f;
        }
    }

    public final zzbgd g() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            zzbgd zzbgdVar = this.a;
            if (zzbgdVar.h() != null) {
                this.b.m(zzbgdVar.h());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception occurred while getting video controller", e);
        }
        return this.b;
    }
}
