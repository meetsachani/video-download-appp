package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzftk extends zzfsd {
    public final zzftq X;
    public final /* synthetic */ zzftl Y;

    public zzftk(zzftl zzftlVar, zzftq zzftqVar) {
        this.Y = zzftlVar;
        this.X = zzftqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void U6(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfto c = zzftp.c();
        c.b(i);
        if (string != null) {
            c.a(string);
        }
        this.X.a(c.c());
        if (i == 8157) {
            this.Y.d();
        }
    }
}
