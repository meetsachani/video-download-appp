package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(@InterfaceC5670cr1 String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th) {
        super(str, th);
    }

    public FirebaseRemoteConfigClientException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 FirebaseRemoteConfigException.Code code) {
        super(str, code);
    }

    public FirebaseRemoteConfigClientException(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th, @InterfaceC5670cr1 FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
    }
}
