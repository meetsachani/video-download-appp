package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseInstallationsException extends FirebaseException {
    @InterfaceC5670cr1
    public final Status X;

    /* loaded from: classes3.dex */
    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@InterfaceC5670cr1 Status status) {
        this.X = status;
    }

    @InterfaceC5670cr1
    public Status a() {
        return this.X;
    }

    public FirebaseInstallationsException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Status status) {
        super(str);
        this.X = status;
    }

    public FirebaseInstallationsException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Status status, @InterfaceC5670cr1 Throwable th) {
        super(str, th);
        this.X = status;
    }
}
