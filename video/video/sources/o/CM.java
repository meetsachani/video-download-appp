package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* loaded from: classes.dex */
public final class CM {

    /* loaded from: classes.dex */
    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context a(Context context) {
        String b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (b = a.b(context)) != null) {
            return a.a(applicationContext, b);
        }
        return applicationContext;
    }

    public static Application b(Context context) {
        for (Context a2 = a(context); a2 instanceof ContextWrapper; a2 = c((ContextWrapper) a2)) {
            if (a2 instanceof Application) {
                return (Application) a2;
            }
        }
        return null;
    }

    public static Context c(ContextWrapper contextWrapper) {
        String b;
        Context baseContext = contextWrapper.getBaseContext();
        if (Build.VERSION.SDK_INT >= 30 && (b = a.b(contextWrapper)) != null) {
            return a.a(baseContext, b);
        }
        return baseContext;
    }
}
