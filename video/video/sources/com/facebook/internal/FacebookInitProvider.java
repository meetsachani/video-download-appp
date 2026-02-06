package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class FacebookInitProvider extends ContentProvider {
    @NotNull
    public static final a X = new a(null);
    public static final String Y = FacebookInitProvider.class.getSimpleName();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        C6562gT0.p(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        C6562gT0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        C6562gT0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                com.facebook.M m = com.facebook.M.a;
                com.facebook.M.V(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            Log.i(Y, "Failed to auto initialize the Facebook SDK", e);
            return false;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        C6562gT0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        C6562gT0.p(uri, "uri");
        return 0;
    }
}
