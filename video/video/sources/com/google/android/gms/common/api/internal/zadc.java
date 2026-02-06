package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zadc {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    @VisibleForTesting
    public final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final zadb b = new zadb(this);

    public final void a(BasePendingResult<? extends Result> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.v(this.b);
    }

    public final void b() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.v(null);
            if (basePendingResult.u()) {
                this.a.remove(basePendingResult);
            }
        }
    }
}
