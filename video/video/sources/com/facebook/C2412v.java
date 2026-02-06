package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import o.C10763xf2;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2412v extends ContentProvider {
    @NotNull
    public static final a X = new a(null);
    public static final String Y = C2412v.class.getName();
    @NotNull
    public static final String Y0 = "..";
    @NotNull
    public static final String Z = "content://com.facebook.app.FacebookContentProvider";

    /* renamed from: com.facebook.v$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final String a(@Nullable String str, @NotNull UUID uuid, @Nullable String str2) {
            C6562gT0.p(uuid, "callId");
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{C2412v.Z, str, uuid.toString(), str2}, 4));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public a() {
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String a(@Nullable String str, @NotNull UUID uuid, @Nullable String str2) {
        return X.a(str, uuid, str2);
    }

    public final Pair<UUID, String> b(Uri uri) {
        try {
            String path = uri.getPath();
            if (path != null) {
                String substring = path.substring(1);
                C6562gT0.o(substring, "(this as java.lang.String).substring(startIndex)");
                Object[] array = C10763xf2.o5(substring, new String[]{RemoteSettings.i}, false, 0, 6, null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (!"..".contentEquals(str) && !"..".contentEquals(str2)) {
                        return new Pair<>(UUID.fromString(str), str2);
                    }
                    throw new Exception();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception unused) {
            return null;
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
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str) throws FileNotFoundException {
        C6562gT0.p(uri, "uri");
        C6562gT0.p(str, "mode");
        Pair<UUID, String> b = b(uri);
        if (b != null) {
            try {
                com.facebook.internal.X x = com.facebook.internal.X.a;
                File j = com.facebook.internal.X.j((UUID) b.first, (String) b.second);
                if (j != null) {
                    return ParcelFileDescriptor.open(j, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                Log.e(Y, C6562gT0.C("Got unexpected exception:", e));
                throw e;
            }
        }
        throw new FileNotFoundException();
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
