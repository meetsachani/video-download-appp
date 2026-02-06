package com.google.android.gms.common;

import android.content.Intent;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    public final int Y;

    public GooglePlayServicesRepairableException(int i, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Intent intent) {
        super(str, intent);
        this.Y = i;
    }

    public int b() {
        return this.Y;
    }
}
