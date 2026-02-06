package com.facebook.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
/* loaded from: classes2.dex */
public class AudienceNetworkContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Uri insert(Uri uri, @InterfaceC11300zs1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            DynamicLoaderFactory.initialize(context, null, null, true);
            return false;
        }
        return false;
    }

    @Override // android.content.ContentProvider
    @InterfaceC11300zs1
    public Cursor query(Uri uri, @InterfaceC11300zs1 String[] strArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr2, @InterfaceC11300zs1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, @InterfaceC11300zs1 ContentValues contentValues, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr) {
        return 0;
    }
}
