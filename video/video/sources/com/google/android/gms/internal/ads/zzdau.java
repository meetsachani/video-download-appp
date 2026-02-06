package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdau extends zzdbo implements zzbio {
    public zzdau(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void u(final String str, final String str2) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdat
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((AppEventListener) obj).u(str, str2);
            }
        });
    }
}
