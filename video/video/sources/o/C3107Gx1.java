package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: o.Gx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3107Gx1 {
    public static final String a = AbstractC6949i41.f("PackageManagerHelper");

    public static boolean a(Context context, Class<?> klazz) {
        return b(context, klazz.getName());
    }

    public static boolean b(Context context, String className) {
        if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1) {
            return true;
        }
        return false;
    }

    public static void c(Context context, Class<?> klazz, boolean enabled) {
        int i;
        Object obj;
        String str = "disabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, klazz.getName());
            if (enabled) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            AbstractC6949i41 c = AbstractC6949i41.c();
            String str2 = a;
            String name = klazz.getName();
            if (!enabled) {
                obj = "disabled";
            } else {
                obj = "enabled";
            }
            c.a(str2, String.format("%s %s", name, obj), new Throwable[0]);
        } catch (Exception e) {
            AbstractC6949i41 c2 = AbstractC6949i41.c();
            String str3 = a;
            String name2 = klazz.getName();
            if (enabled) {
                str = "enabled";
            }
            c2.a(str3, String.format("%s could not be %s", name2, str), e);
        }
    }
}
