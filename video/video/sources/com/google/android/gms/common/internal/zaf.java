package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes2.dex */
final class zaf extends zag {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ LifecycleFragment Y;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.X = intent;
        this.Y = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.X;
        if (intent != null) {
            this.Y.startActivityForResult(intent, 2);
        }
    }
}
