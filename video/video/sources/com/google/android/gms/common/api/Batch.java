package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class Batch extends BasePendingResult<BatchResult> {
    public int r;
    public boolean s;
    public boolean t;
    public final PendingResult<?>[] u;
    public final Object v;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public List<PendingResult<?>> a = new ArrayList();
        public GoogleApiClient b;

        public Builder(@InterfaceC5670cr1 GoogleApiClient googleApiClient) {
            this.b = googleApiClient;
        }

        @InterfaceC5670cr1
        public <R extends Result> BatchResultToken<R> a(@InterfaceC5670cr1 PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.a.size());
            this.a.add(pendingResult);
            return batchResultToken;
        }

        @InterfaceC5670cr1
        public Batch b() {
            return new Batch(this.a, this.b, null);
        }
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zac zacVar) {
        super(googleApiClient);
        this.v = new Object();
        int size = list.size();
        this.r = size;
        PendingResult<?>[] pendingResultArr = new PendingResult[size];
        this.u = pendingResultArr;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                PendingResult<?> pendingResult = (PendingResult) list.get(i);
                this.u[i] = pendingResult;
                pendingResult.c(new zab(this));
            }
            return;
        }
        o(new BatchResult(Status.a1, pendingResultArr));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void f() {
        super.f();
        for (PendingResult<?> pendingResult : this.u) {
            pendingResult.f();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @InterfaceC5670cr1
    /* renamed from: w */
    public BatchResult k(@InterfaceC5670cr1 Status status) {
        return new BatchResult(status, this.u);
    }
}
