package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbub extends zzbyr {
    public final /* synthetic */ QueryInfoGenerationCallback X;

    public zzbub(zzbuc zzbucVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.X = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void I(String str) {
        this.X.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void h2(String str, String str2, Bundle bundle) {
        this.X.b(new QueryInfo(new com.google.android.gms.ads.internal.client.zzew(str, bundle, str2)));
    }
}
