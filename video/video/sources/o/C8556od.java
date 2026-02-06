package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* renamed from: o.od  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8556od {
    public static final String a = "android.support.AppLaunchChecker";
    public static final String b = "startedFromLauncher";

    public static boolean a(Context context) {
        return context.getSharedPreferences(a, 0).getBoolean(b, false);
    }

    public static void b(Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(a, 0);
        if (!sharedPreferences.getBoolean(b, false) && (intent = activity.getIntent()) != null && "android.intent.action.MAIN".equals(intent.getAction())) {
            if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(UR0.e)) {
                sharedPreferences.edit().putBoolean(b, true).apply();
            }
        }
    }
}
