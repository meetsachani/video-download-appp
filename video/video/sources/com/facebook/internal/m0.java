package com.facebook.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.C2416z;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.C5445bv2;
import o.C6562gT0;
import o.C8319ne2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class m0 {
    @NotNull
    public static final m0 a = new m0();
    public static final String b = m0.class.getName();
    @NotNull
    public static final String c = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    @NotNull
    public static final String d = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    @NotNull
    public static final String e = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    @NotNull
    public static final String f = "com.facebook.app.FacebookContentProvider";
    @NotNull
    public static final String g = "fbconnect://cct.";

    @InterfaceC9511sW0
    public static final void a(@NotNull Collection<String> collection, @NotNull String str) {
        boolean z;
        C6562gT0.p(collection, C5445bv2.W);
        C6562gT0.p(str, "name");
        for (String str2 : collection) {
            if (str2 != null) {
                if (str2.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Container '" + str + "' cannot contain empty values").toString());
                }
            } else {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    @InterfaceC9511sW0
    public static final <T> void b(@NotNull Collection<? extends T> collection, @NotNull String str) {
        C6562gT0.p(collection, C5445bv2.W);
        C6562gT0.p(str, "name");
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String c() {
        com.facebook.M m = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        if (o2 != null) {
            return o2;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    @InterfaceC9511sW0
    public static final boolean d(@NotNull Context context) {
        C6562gT0.p(context, "context");
        if (n(context, "android.permission.BLUETOOTH") && n(context, "android.permission.BLUETOOTH_ADMIN")) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean e(@NotNull Context context) {
        C6562gT0.p(context, "context");
        return n(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String f() {
        com.facebook.M m = com.facebook.M.a;
        String v = com.facebook.M.v();
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
    }

    @InterfaceC9511sW0
    public static final void g(@NotNull Context context) {
        C6562gT0.p(context, "context");
        String c2 = c();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String C = C6562gT0.C(f, c2);
            if (packageManager.resolveContentProvider(C, 0) == null) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format(e, Arrays.copyOf(new Object[]{C}, 1));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
    }

    @InterfaceC9511sW0
    public static final boolean h(@NotNull Context context, @NotNull String str) {
        List<ResolveInfo> list;
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!C6562gT0.g(activityInfo.name, "com.facebook.CustomTabActivity") || !C6562gT0.g(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull Context context) {
        C6562gT0.p(context, "context");
        j(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @InterfaceC9511sW0
    @SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(@NotNull Context context, boolean z) {
        ActivityInfo activityInfo;
        C6562gT0.p(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                if (!z) {
                    Log.w(b, d);
                    return;
                }
                throw new IllegalStateException(d);
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    @InterfaceC9511sW0
    public static final void k(@NotNull Context context) {
        C6562gT0.p(context, "context");
        l(context, true);
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull Context context, boolean z) {
        C6562gT0.p(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z) {
                Log.w(b, c);
                return;
            }
            throw new IllegalStateException(c);
        }
    }

    @InterfaceC9511sW0
    public static final boolean m(@NotNull Context context) {
        C6562gT0.p(context, "context");
        if (!n(context, "android.permission.ACCESS_COARSE_LOCATION") && !n(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final boolean n(@NotNull Context context, @NotNull String str) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "permission");
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean o(@NotNull Context context) {
        C6562gT0.p(context, "context");
        return n(context, "android.permission.ACCESS_WIFI_STATE");
    }

    @InterfaceC9511sW0
    public static final void p(@NotNull String str, @NotNull String str2) {
        boolean z;
        C6562gT0.p(str, "arg");
        C6562gT0.p(str2, "name");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    @InterfaceC9511sW0
    public static final <T> void q(@NotNull Collection<? extends T> collection, @NotNull String str) {
        C6562gT0.p(collection, C5445bv2.W);
        C6562gT0.p(str, "name");
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
    }

    @InterfaceC9511sW0
    public static final <T> void r(@NotNull Collection<? extends T> collection, @NotNull String str) {
        C6562gT0.p(collection, C5445bv2.W);
        C6562gT0.p(str, "name");
        b(collection, str);
        q(collection, str);
    }

    @InterfaceC9511sW0
    public static final void s(@Nullable Object obj, @NotNull String str) {
        C6562gT0.p(str, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String t(@Nullable String str, @NotNull String str2) {
        boolean z;
        C6562gT0.p(str2, "name");
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    @InterfaceC9511sW0
    public static final void u(@Nullable Object obj, @NotNull String str, @NotNull Object... objArr) {
        C6562gT0.p(str, "name");
        C6562gT0.p(objArr, androidx.lifecycle.p.g);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            i++;
            if (C6562gT0.g(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + str + "' was not one of the allowed values");
    }

    @InterfaceC9511sW0
    public static final void v() {
        if (C6562gT0.g(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        throw new C2416z("This method should be called from the UI thread");
    }

    @InterfaceC9511sW0
    public static final void w() {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.N()) {
            return;
        }
        throw new com.facebook.N("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}
