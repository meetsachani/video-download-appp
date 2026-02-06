package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* loaded from: classes2.dex */
final class zaq implements PendingResultUtil.ResultConverter {
    public final /* synthetic */ Response a;

    public zaq(Response response) {
        this.a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object a(Result result) {
        this.a.f(result);
        return this.a;
    }
}
