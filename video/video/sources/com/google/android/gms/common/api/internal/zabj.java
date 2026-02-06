package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zabj {
    public static final ExecutorService a = com.google.android.gms.internal.base.zap.a().a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService a() {
        return a;
    }
}
