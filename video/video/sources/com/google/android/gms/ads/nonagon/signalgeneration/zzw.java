package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzdrx;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzw implements zzdek {
    public final zzdrx X;
    public final zzv Y;
    public final int Y0;
    public final String Z;

    @InterfaceC5056aJ2
    public zzw(zzdrx zzdrxVar, zzv zzvVar, String str, int i) {
        this.X = zzdrxVar;
        this.Y = zzvVar;
        this.Z = str;
        this.Y0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void a(@InterfaceC11300zs1 zzbk zzbkVar) {
        String str;
        if (zzbkVar != null && this.Y0 != 2) {
            if (!TextUtils.isEmpty(zzbkVar.c)) {
                try {
                    str = new JSONObject(zzbkVar.c).optString(C9755tW1.f875o);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "RenderSignals.getRequestId");
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.Y.e(str, zzbkVar.c, this.X);
                    return;
                }
                return;
            }
            this.Y.e(this.Z, zzbkVar.b, this.X);
        }
    }
}
