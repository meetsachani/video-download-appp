package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzavl;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzr extends AsyncTask {
    public final /* synthetic */ zzu a;

    public /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        this.a = zzuVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzu zzuVar = this.a;
            zzu.f8(zzuVar, (zzavl) zzu.e8(zzuVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("", e);
        } catch (ExecutionException e2) {
            e = e2;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("", e);
        } catch (TimeoutException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("", e3);
        }
        return this.a.o();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzu zzuVar = this.a;
        String str = (String) obj;
        if (zzu.Z7(zzuVar) != null && str != null) {
            zzu.Z7(zzuVar).loadUrl(str);
        }
    }
}
