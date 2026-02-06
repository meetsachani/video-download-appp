package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbss implements NativeCustomFormatAd.DisplayOpenMeasurement {
    public final zzbha a;

    public zzbss(zzbha zzbhaVar) {
        this.a = zzbhaVar;
        try {
            zzbhaVar.m();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void a(View view) {
        try {
            this.a.E0(ObjectWrapper.V3(view));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }
}
