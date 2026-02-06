package com.google.android.gms.internal.ads;

import com.facebook.appevents.C2326p;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.EI1;

/* loaded from: classes2.dex */
public final class zzcaa {
    public static final zzgdj a;
    public static final zzgdj b;
    public static final zzgdj c;
    public static final ScheduledExecutorService d;
    public static final zzgdk e;
    public static final zzgdj f;
    public static final zzgdj g;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (ClientLibraryUtils.c()) {
            zzfrk.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzw(EI1.a)));
        } else {
            zzbcm zzbcmVar = zzbcv.Cb;
            if (com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar)).booleanValue()) {
                zzbcm zzbcmVar2 = zzbcv.Db;
                if (com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar2) != null) {
                    zzbcm zzbcmVar3 = zzbcv.Eb;
                    if (com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzw(EI1.a));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().c(zzbcmVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzw(EI1.a));
        }
        a = new zzbzy(threadPoolExecutor, null);
        if (ClientLibraryUtils.c()) {
            executorService = zzfrk.a().b(5, new zzbzw("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzw("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        b = new zzbzy(executorService, null);
        if (ClientLibraryUtils.c()) {
            executorService2 = zzfrk.a().a(new zzbzw("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzw("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        c = new zzbzy(executorService2, null);
        zzbzv zzbzvVar = new zzbzv(3, new zzbzw(C2326p.x));
        d = zzbzvVar;
        e = zzgdq.b(zzbzvVar);
        f = new zzbzy(new zzbzx(), null);
        g = new zzbzy(zzgdq.c(), null);
    }
}
