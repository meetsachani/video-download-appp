package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzdmz implements zzbfu {
    public final /* synthetic */ String a = NativeCustomFormatAd.a;
    public final /* synthetic */ zzdna b;

    public zzdmz(zzdna zzdnaVar, String str) {
        this.b = zzdnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final JSONObject a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final JSONObject b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void c() {
        zzdij zzdijVar;
        zzdij zzdijVar2;
        zzdna zzdnaVar = this.b;
        zzdijVar = zzdnaVar.Y0;
        if (zzdijVar != null) {
            String str = this.a;
            zzdijVar2 = zzdnaVar.Y0;
            zzdijVar2.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void d(MotionEvent motionEvent) {
    }
}
