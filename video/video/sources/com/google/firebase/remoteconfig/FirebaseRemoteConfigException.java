package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    public final Code X;

    /* loaded from: classes3.dex */
    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        public final int X;

        Code(int i) {
            this.X = i;
        }

        public int e() {
            return this.X;
        }
    }

    public FirebaseRemoteConfigException(@InterfaceC5670cr1 String str) {
        super(str);
        this.X = Code.UNKNOWN;
    }

    @InterfaceC5670cr1
    public Code a() {
        return this.X;
    }

    public FirebaseRemoteConfigException(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th) {
        super(str, th);
        this.X = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Code code) {
        super(str);
        this.X = code;
    }

    public FirebaseRemoteConfigException(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Throwable th, @InterfaceC5670cr1 Code code) {
        super(str, th);
        this.X = code;
    }
}
