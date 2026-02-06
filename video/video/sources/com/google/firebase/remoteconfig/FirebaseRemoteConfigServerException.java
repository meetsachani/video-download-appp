package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC7866lr1;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int Y;

    public FirebaseRemoteConfigServerException(int i, @InterfaceC5670cr1 String str) {
        super(str);
        this.Y = i;
    }

    public int b() {
        return this.Y;
    }

    public FirebaseRemoteConfigServerException(int i, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th) {
        super(str, th);
        this.Y = i;
    }

    public FirebaseRemoteConfigServerException(@InterfaceC5670cr1 String str, @InterfaceC7866lr1 FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.Y = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @InterfaceC5670cr1 String str, @InterfaceC7866lr1 FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.Y = i;
    }

    public FirebaseRemoteConfigServerException(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th, @InterfaceC5670cr1 FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.Y = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th, @InterfaceC5670cr1 FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.Y = i;
    }
}
