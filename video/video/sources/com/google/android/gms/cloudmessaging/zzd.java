package com.google.android.gms.cloudmessaging;

import android.util.Log;

/* loaded from: classes2.dex */
public final class zzd extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str != "com.google.android.gms.iid.MessengerCompat" && (str == null || !str.equals("com.google.android.gms.iid.MessengerCompat"))) {
            return super.loadClass(str, z);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3)) {
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return zze.class;
        }
        return zze.class;
    }
}
