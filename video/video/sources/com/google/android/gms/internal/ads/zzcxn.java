package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxn extends zzdbo implements zzbim {
    public final Bundle Y;

    public zzcxn(Set set) {
        super(set);
        this.Y = new Bundle();
    }

    public final synchronized Bundle n1() {
        return new Bundle(this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void x0(String str, Bundle bundle) {
        this.Y.putAll(bundle);
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcxm
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((OnAdMetadataChangedListener) obj).q();
            }
        });
    }
}
