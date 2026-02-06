package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zad extends zag {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ Activity Y;
    public final /* synthetic */ int Z;

    public zad(Intent intent, Activity activity, int i) {
        this.X = intent;
        this.Y = activity;
        this.Z = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.X;
        if (intent != null) {
            this.Y.startActivityForResult(intent, this.Z);
        }
    }
}
