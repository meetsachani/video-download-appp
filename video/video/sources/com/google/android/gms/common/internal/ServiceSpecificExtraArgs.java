package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ServiceSpecificExtraArgs {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface CastExtraArgs {
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String a = "listener";
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface GamesExtraArgs {
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String a = "com.google.android.gms.games.key.gamePackageName";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String b = "com.google.android.gms.games.key.desiredLocale";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String c = "com.google.android.gms.games.key.popupWindowToken";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String d = "com.google.android.gms.games.key.signInOptions";
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface PlusExtraArgs {
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String a = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
    }
}
