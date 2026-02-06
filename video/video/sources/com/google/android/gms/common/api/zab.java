package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zab implements PendingResult.StatusListener {
    public final /* synthetic */ Batch a;

    public zab(Batch batch) {
        this.a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        Object obj;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Status status2;
        PendingResult[] pendingResultArr;
        obj = this.a.v;
        synchronized (obj) {
            try {
                if (this.a.g()) {
                    return;
                }
                if (status.I0()) {
                    this.a.t = true;
                } else if (!status.S0()) {
                    this.a.s = true;
                }
                Batch batch = this.a;
                i = batch.r;
                batch.r = i - 1;
                Batch batch2 = this.a;
                i2 = batch2.r;
                if (i2 == 0) {
                    z = batch2.t;
                    if (z) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.f();
                    } else {
                        z2 = batch2.s;
                        if (z2) {
                            status2 = new Status(13);
                        } else {
                            status2 = Status.a1;
                        }
                        Batch batch3 = this.a;
                        pendingResultArr = batch3.u;
                        batch3.o(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
