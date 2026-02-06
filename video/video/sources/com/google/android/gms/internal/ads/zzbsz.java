package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbsz implements NativeCustomFormatAd {
    public final zzbha b;
    public NativeCustomFormatAd.DisplayOpenMeasurement c;

    @InterfaceC5056aJ2
    public zzbsz(zzbha zzbhaVar) {
        this.b = zzbhaVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @InterfaceC11300zs1
    public final String a() {
        try {
            return this.b.i();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @InterfaceC11300zs1
    public final List<String> b() {
        try {
            return this.b.k();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void c() {
        try {
            this.b.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @InterfaceC11300zs1
    public final CharSequence d(String str) {
        try {
            return this.b.p1(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.b.l();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @InterfaceC11300zs1
    public final NativeAd.Image e(String str) {
        try {
            zzbgg f0 = this.b.f0(str);
            if (f0 != null) {
                return new zzbst(f0);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void f(String str) {
        try {
            this.b.e0(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement g() {
        try {
            if (this.c == null) {
                zzbha zzbhaVar = this.b;
                if (zzbhaVar.r()) {
                    this.c = new zzbss(zzbhaVar);
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
        return this.c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @InterfaceC11300zs1
    public final MediaContent h() {
        try {
            zzbha zzbhaVar = this.b;
            if (zzbhaVar.e() != null) {
                return new com.google.android.gms.ads.internal.client.zzez(zzbhaVar.e(), zzbhaVar);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }
}
