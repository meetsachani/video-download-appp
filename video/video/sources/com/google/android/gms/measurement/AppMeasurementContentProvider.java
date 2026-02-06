package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhf;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes3.dex */
public class AppMeasurementContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!"com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    @Override // android.content.ContentProvider
    public int delete(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public String getType(@InterfaceC5670cr1 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Uri insert(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Preconditions.r(context);
        zzhf.c(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Cursor query(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 String[] strArr, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 String[] strArr2, @InterfaceC11300zs1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 ContentValues contentValues, @InterfaceC11300zs1 String str, @InterfaceC5670cr1 String[] strArr) {
        return 0;
    }
}
