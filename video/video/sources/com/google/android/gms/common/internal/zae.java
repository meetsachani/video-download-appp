package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zae extends zag {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ Fragment Y;
    public final /* synthetic */ int Z;

    public zae(Intent intent, Fragment fragment, int i) {
        this.X = intent;
        this.Y = fragment;
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
