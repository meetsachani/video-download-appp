package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdkWithMembers
/* loaded from: classes2.dex */
public class MobileAdsInitProvider extends ContentProvider {
    public final zzeu X = new zzeu();

    @Override // android.content.ContentProvider
    public void attachInfo(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ProviderInfo providerInfo) {
        this.X.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String[] strArr) {
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
        return false;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Cursor query(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String[] strArr2, @InterfaceC5670cr1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 ContentValues contentValues, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String[] strArr) {
        return 0;
    }
}
