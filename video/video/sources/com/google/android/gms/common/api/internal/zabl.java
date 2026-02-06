package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes2.dex */
final class zabl implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ GoogleApiManager a;

    public zabl(GoogleApiManager googleApiManager) {
        this.a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.a;
        handler = googleApiManager.k1;
        handler2 = googleApiManager.k1;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
