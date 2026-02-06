package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzclv implements zzcld {
    public final zzfbt a;

    public zzclv(zzfbt zzfbtVar) {
        this.a = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.a.b(Boolean.parseBoolean(str));
            } catch (Exception e) {
                throw new IllegalStateException("Invalid render_in_browser state", e);
            }
        }
    }
}
