package com.google.android.gms.common;

import android.content.Intent;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {
    public final Intent X;

    public UserRecoverableException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Intent intent) {
        super(str);
        this.X = intent;
    }

    @InterfaceC5670cr1
    public Intent a() {
        return new Intent(this.X);
    }
}
