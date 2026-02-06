package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import o.C6269fJ2;

/* loaded from: classes2.dex */
final class zzara implements zzaqp {
    public File a = null;
    public final /* synthetic */ Context b;

    public zzara(Context context) {
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final File a() {
        if (this.a == null) {
            this.a = new File(this.b.getCacheDir(), C6269fJ2.a);
        }
        return this.a;
    }
}
