package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* loaded from: classes.dex */
    public static final class b {
        public final Context a;

        public InstallReferrerClient a() {
            Context context = this.a;
            if (context != null) {
                return new com.android.installreferrer.api.a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public b(Context context) {
            this.a = context;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
        public static final int a = -1;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
    }

    public static b d(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract ReferrerDetails b() throws RemoteException;

    public abstract boolean c();

    public abstract void e(InstallReferrerStateListener installReferrerStateListener);
}
