package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class ProviderInstaller {
    @InterfaceC5670cr1
    public static final String a = "GmsCore_OpenSSL";
    public static final GoogleApiAvailabilityLight b = GoogleApiAvailabilityLight.i();
    public static final Object c = new Object();
    @InterfaceC8710pF0("ProviderInstaller.lock")
    public static Method d = null;
    @InterfaceC8710pF0("ProviderInstaller.lock")
    public static Method e = null;

    /* loaded from: classes3.dex */
    public interface ProviderInstallListener {
        void a();

        void b(int i, @InterfaceC11300zs1 Intent intent);
    }

    public static void a(@InterfaceC5670cr1 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.s(context, "Context must not be null");
        b.p(context, 11925000);
        synchronized (c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.j, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.LoadingException e2) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e2.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context i = GooglePlayServicesUtilLight.i(context);
            if (i != null) {
                try {
                    if (e == null) {
                        Class cls = Long.TYPE;
                        e = d(i, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    e.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e3) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e3.getMessage())));
                }
            }
            if (i != null) {
                e(i, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ProviderInstallListener providerInstallListener) {
        Preconditions.s(context, "Context must not be null");
        Preconditions.s(providerInstallListener, "Listener must not be null");
        Preconditions.k("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    public static Method d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @InterfaceC8710pF0("ProviderInstaller.lock")
    public static void e(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        String message;
        try {
            if (d == null) {
                d = d(context, str, "insertProvider", new Class[]{Context.class});
            }
            d.invoke(null, context);
        } catch (Exception e2) {
            Throwable cause = e2.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e2.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
