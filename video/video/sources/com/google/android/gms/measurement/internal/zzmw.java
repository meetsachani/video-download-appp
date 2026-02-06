package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmw implements zznf {
    public final /* synthetic */ zzmp a;

    public zzmw(zzmp zzmpVar) {
        this.a = zzmpVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznf
    public final void b(String str, String str2, Bundle bundle) {
        zzhf zzhfVar;
        zzhf zzhfVar2;
        if (TextUtils.isEmpty(str)) {
            zzhfVar = this.a.l;
            if (zzhfVar != null) {
                zzhfVar2 = this.a.l;
                zzhfVar2.j().G().b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.a.l().D(new zzmv(this, str, str2, bundle));
    }
}
