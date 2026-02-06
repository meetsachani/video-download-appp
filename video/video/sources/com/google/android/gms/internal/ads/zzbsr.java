package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbsr extends NativeAd.AdChoicesInfo {
    public final List a = new ArrayList();
    public String b;

    public zzbsr(zzbfz zzbfzVar) {
        zzbgg zzbggVar;
        try {
            this.b = zzbfzVar.g();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            this.b = "";
        }
        try {
            for (Object obj : zzbfzVar.h()) {
                if (obj instanceof IBinder) {
                    zzbggVar = zzbgf.W7((IBinder) obj);
                } else {
                    zzbggVar = null;
                }
                if (zzbggVar != null) {
                    this.a.add(new zzbst(zzbggVar));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence b() {
        return this.b;
    }
}
