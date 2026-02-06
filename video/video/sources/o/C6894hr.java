package o;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: o.hr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6894hr {

    /* renamed from: o.hr$a */
    /* loaded from: classes.dex */
    public static class a {
        public static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        public static <T> T[] b(Bundle bundle, String str, Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        public static <T> ArrayList<T> c(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        public static <T extends Serializable> T d(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        public static <T> SparseArray<T> e(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    @JR1(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static <T> T b(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static Parcelable[] c(Bundle bundle, String str, Class<? extends Parcelable> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) a.b(bundle, str, cls);
        }
        return bundle.getParcelableArray(str);
    }

    public static <T> ArrayList<T> d(Bundle bundle, String str, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static <T extends Serializable> T e(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T> SparseArray<T> f(Bundle bundle, String str, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.e(bundle, str, cls);
        }
        return bundle.getSparseParcelableArray(str);
    }

    @JR1(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void g(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
