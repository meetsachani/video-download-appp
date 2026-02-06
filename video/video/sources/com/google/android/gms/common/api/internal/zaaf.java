package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zaaf {
    public final ApiKey<?> a;
    public final TaskCompletionSource<Boolean> b = new TaskCompletionSource<>();

    public zaaf(ApiKey<?> apiKey) {
        this.a = apiKey;
    }

    public final ApiKey<?> a() {
        return this.a;
    }

    public final TaskCompletionSource<Boolean> b() {
        return this.b;
    }
}
