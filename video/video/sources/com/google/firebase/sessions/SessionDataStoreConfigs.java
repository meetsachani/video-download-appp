package com.google.firebase.sessions;

import android.util.Base64;
import o.C7033iP1;
import o.C9545sf2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionDataStoreConfigs {
    @NotNull
    public static final SessionDataStoreConfigs a = new SessionDataStoreConfigs();
    public static final String b;
    @NotNull
    public static final String c;
    @NotNull
    public static final String d;

    static {
        String encodeToString = Base64.encodeToString(C9545sf2.X1(ProcessDetailsProvider.a.e()), 10);
        b = encodeToString;
        c = "firebase_session_" + encodeToString + C7033iP1.m0;
        d = "firebase_session_" + encodeToString + "_settings";
    }

    private SessionDataStoreConfigs() {
    }

    @NotNull
    public final String a() {
        return c;
    }

    @NotNull
    public final String b() {
        return d;
    }
}
