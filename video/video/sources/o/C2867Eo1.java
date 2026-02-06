package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: o.Eo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2867Eo1 {
    public static final String a = "NavUtils";
    public static final String b = "android.support.PARENT_ACTIVITY";

    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String d = d(activity);
        if (d == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d);
        try {
            if (e(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(a, "getParentActivityIntent: bad parentActivityName '" + d + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e = e(context, componentName);
        if (e == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e);
        if (e(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static Intent c(Context context, Class<?> cls) throws PackageManager.NameNotFoundException {
        String e = e(context, new ComponentName(context, cls));
        if (e == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e);
        if (e(context, componentName) == null) {
            return Intent.makeMainActivity(componentName);
        }
        return new Intent().setComponent(componentName);
    }

    public static String d(Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String e(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(b)) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void f(Activity activity) {
        Intent a2 = a(activity);
        if (a2 != null) {
            g(activity, a2);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    @JR1(expression = "sourceActivity.navigateUpTo(upIntent)")
    @Deprecated
    public static void g(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    @JR1(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @Deprecated
    public static boolean h(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
