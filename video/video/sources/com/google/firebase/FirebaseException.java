package com.google.firebase;

import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@InterfaceC5670cr1 String str) {
        super(str);
        Preconditions.m(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th) {
        super(str, th);
        Preconditions.m(str, "Detail message must not be empty");
    }
}
