package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabp implements BaseGmsClient.SignOutCallbacks {
    public final /* synthetic */ zabq a;

    public zabp(zabq zabqVar) {
        this.a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void a() {
        Handler handler;
        handler = this.a.h1.k1;
        handler.post(new zabo(this));
    }
}
