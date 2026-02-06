package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbte;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    public final zzbte b1;

    public OfflineNotificationPoster(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b1 = zzbb.a().o(context, new zzbph());
    }

    @Override // androidx.work.Worker
    @InterfaceC5670cr1
    public final ListenableWorker.a doWork() {
        try {
            this.b1.G7(ObjectWrapper.V3(getApplicationContext()), new zza(getInputData().A("uri"), getInputData().A("gws_query_id"), getInputData().A("image_url")));
            return ListenableWorker.a.e();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
