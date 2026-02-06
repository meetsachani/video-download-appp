package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzclj implements zzcld {
    public final zzdvc a;

    public zzclj(zzdvc zzdvcVar) {
        this.a = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                this.a.n(zzduy.NONE);
                return;
            } else {
                this.a.n(zzduy.FLICK);
                return;
            }
        }
        this.a.n(zzduy.SHAKE);
    }
}
