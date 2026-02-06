package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbga extends NativeAd.AdChoicesInfo {
    public final zzbfz a;
    public final List b = new ArrayList();
    public String c;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        r4.b.add(new com.google.android.gms.internal.ads.zzbgh(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbga(zzbfz zzbfzVar) {
        IBinder iBinder;
        this.a = zzbfzVar;
        try {
            this.c = zzbfzVar.g();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            this.c = "";
        }
        try {
            for (Object obj : zzbfzVar.h()) {
                zzbgg zzbggVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbggVar = queryLocalInterface instanceof zzbgg ? (zzbgg) queryLocalInterface : new zzbge(iBinder);
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> a() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence b() {
        return this.c;
    }
}
