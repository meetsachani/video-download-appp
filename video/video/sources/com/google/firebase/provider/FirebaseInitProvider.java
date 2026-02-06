package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final String X = "FirebaseInitProvider";
    @InterfaceC5056aJ2
    public static final String Y0 = "com.google.firebase.firebaseinitprovider";
    @InterfaceC11300zs1
    public static StartupTime Y = StartupTime.e();
    @InterfaceC5670cr1
    public static AtomicBoolean Z = new AtomicBoolean(false);

    public static void a(@InterfaceC5670cr1 ProviderInfo providerInfo) {
        Preconditions.s(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!Y0.equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    @InterfaceC11300zs1
    public static StartupTime b() {
        return Y;
    }

    public static boolean c() {
        return Z.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public String getType(@InterfaceC5670cr1 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Uri insert(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Z.set(true);
            if (FirebaseApp.x(getContext()) == null) {
                Log.i(X, "FirebaseApp initialization unsuccessful");
            } else {
                Log.i(X, "FirebaseApp initialization successful");
            }
            Z.set(false);
            return false;
        } catch (Throwable th) {
            Z.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Cursor query(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 String[] strArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr2, @InterfaceC11300zs1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 ContentValues contentValues, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr) {
        return 0;
    }
}
