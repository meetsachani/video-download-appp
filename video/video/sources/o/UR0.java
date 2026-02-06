package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class UR0 {
    public static final String a = "android.intent.action.CREATE_REMINDER";
    public static final String b = "android.intent.extra.HTML_TEXT";
    public static final String c = "android.intent.extra.START_PLAYBACK";
    public static final String d = "android.intent.extra.TIME";
    public static final String e = "android.intent.category.LEANBACK_LAUNCHER";

    /* loaded from: classes.dex */
    public static class a {
        public static <T> T[] a(Intent intent, String str, Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        public static <T> ArrayList<T> b(Intent intent, String str, Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        public static <T> T c(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        public static <T extends Serializable> T d(Intent intent, String str, Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    public static Intent a(Context context, String str) {
        if (C3009Fx1.a(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(C3009Fx1.b).setData(Uri.fromParts("package", str, null));
            if (i >= 30) {
                return data;
            }
            return data.setPackage((String) C10907yF1.l(C3009Fx1.b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    public static Parcelable[] b(Intent intent, String str, Class<? extends Parcelable> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) a.a(intent, str, cls);
        }
        return intent.getParcelableArrayExtra(str);
    }

    public static <T> ArrayList<T> c(Intent intent, String str, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    public static <T> T d(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.c(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T extends Serializable> T e(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static Intent f(String str, String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
