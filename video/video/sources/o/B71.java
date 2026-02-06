package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class B71 {
    public static final String b = "ManifestParser";
    public static final String c = "GlideModule";
    public final Context a;

    public B71(Context context) {
        this.a = context;
    }

    public static WD0 c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                d(cls, e);
            } catch (InstantiationException e2) {
                d(cls, e2);
            } catch (NoSuchMethodException e3) {
                d(cls, e3);
            } catch (InvocationTargetException e4) {
                d(cls, e4);
            }
            if (obj instanceof WD0) {
                return (WD0) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
    }

    public List<WD0> b() {
        ApplicationInfo a;
        if (Log.isLoggable(b, 3)) {
            Log.d(b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            a = a();
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable(b, 6)) {
                Log.e(b, "Failed to parse glide modules", e);
            }
        }
        if (a != null && a.metaData != null) {
            if (Log.isLoggable(b, 2)) {
                Log.v(b, "Got app info metadata: " + a.metaData);
            }
            for (String str : a.metaData.keySet()) {
                if (c.equals(a.metaData.get(str))) {
                    arrayList.add(c(str));
                    if (Log.isLoggable(b, 3)) {
                        Log.d(b, "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable(b, 3)) {
                Log.d(b, "Finished loading Glide modules");
                return arrayList;
            }
            return arrayList;
        }
        if (Log.isLoggable(b, 3)) {
            Log.d(b, "Got null app info metadata");
            return arrayList;
        }
        return arrayList;
    }
}
