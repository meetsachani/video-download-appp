package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcmb implements zzcld {
    public final zzdvc a;

    public zzcmb(zzdvc zzdvcVar) {
        this.a = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.p(str.equals("true"));
    }
}
