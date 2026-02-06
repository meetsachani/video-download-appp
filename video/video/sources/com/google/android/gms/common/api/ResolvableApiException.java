package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@InterfaceC5670cr1 Status status) {
        super(status);
    }

    @InterfaceC5670cr1
    public PendingIntent d() {
        return a().B0();
    }

    public void e(@InterfaceC5670cr1 Activity activity, int i) throws IntentSender.SendIntentException {
        a().U0(activity, i);
    }
}
