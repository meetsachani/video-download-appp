package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzib implements Callable<List<zzmh>> {
    public final /* synthetic */ zzo a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ zzhj c;

    public zzib(zzhj zzhjVar, zzo zzoVar, Bundle bundle) {
        this.c = zzhjVar;
        this.a = zzoVar;
        this.b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzmh> call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.c.Y;
        zzmpVar.o0();
        zzmpVar2 = this.c.Y;
        zzo zzoVar = this.a;
        Bundle bundle = this.b;
        zzmpVar2.l().n();
        if (zzpg.a() && zzmpVar2.c0().B(zzoVar.X, zzbi.L0) && zzoVar.X != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i = 0; i < intArray.length; i++) {
                            zzao e0 = zzmpVar2.e0();
                            String str = zzoVar.X;
                            int i2 = intArray[i];
                            long j = longArray[i];
                            Preconditions.l(str);
                            e0.n();
                            e0.u();
                            try {
                                int delete = e0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                zzft K = e0.j().K();
                                K.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e0.j().G().c("Error pruning trigger URIs. appId", zzfr.v(str), e);
                            }
                        }
                    } else {
                        zzmpVar2.j().G().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return zzmpVar2.e0().K0(zzoVar.X);
        }
        return new ArrayList();
    }
}
