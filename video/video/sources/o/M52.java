package o;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.AbstractC8428o52;
import o.U42;

/* loaded from: classes.dex */
public class M52 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final String e = "com.android.launcher.action.INSTALL_SHORTCUT";
    public static final String f = "com.android.launcher.permission.INSTALL_SHORTCUT";
    public static final int g = 96;
    public static final int h = 48;
    public static final String i = "android.intent.extra.shortcut.ID";
    public static volatile AbstractC8428o52<?> j = null;
    public static volatile List<B42> k = null;
    public static final String l = "androidx.core.content.pm.SHORTCUT_LISTENER";
    public static final String m = "androidx.core.content.pm.shortcut_listener_impl";

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public final /* synthetic */ IntentSender a;

        public a(IntentSender intentSender) {
            this.a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static String a(List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static void A(List<B42> list) {
        k = list;
    }

    public static void B(AbstractC8428o52<Void> abstractC8428o52) {
        j = abstractC8428o52;
    }

    public static boolean C(Context context, List<U42> list) {
        boolean updateShortcuts;
        List<U42> w = w(list, 1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 29) {
            c(context, w);
        }
        if (i2 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (U42 u42 : w) {
                arrayList.add(u42.H());
            }
            updateShortcuts = A52.a(context.getSystemService(C8672p52.a())).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        o(context).a(w);
        for (B42 b42 : n(context)) {
            b42.d(list);
        }
        return true;
    }

    public static boolean a(Context context, List<U42> list) {
        boolean addDynamicShortcuts;
        List<U42> w = w(list, 1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 29) {
            c(context, w);
        }
        if (i2 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (U42 u42 : w) {
                arrayList.add(u42.H());
            }
            addDynamicShortcuts = A52.a(context.getSystemService(C8672p52.a())).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        o(context).a(w);
        for (B42 b42 : n(context)) {
            b42.b(list);
        }
        return true;
    }

    public static boolean b(Context context, U42 u42) {
        Bitmap decodeStream;
        IconCompat r;
        IconCompat iconCompat = u42.i;
        if (iconCompat == null) {
            return false;
        }
        int i2 = iconCompat.a;
        if (i2 != 6 && i2 != 4) {
            return true;
        }
        InputStream D = iconCompat.D(context);
        if (D == null || (decodeStream = BitmapFactory.decodeStream(D)) == null) {
            return false;
        }
        if (i2 == 6) {
            r = IconCompat.o(decodeStream);
        } else {
            r = IconCompat.r(decodeStream);
        }
        u42.i = r;
        return true;
    }

    public static void c(Context context, List<U42> list) {
        for (U42 u42 : new ArrayList(list)) {
            if (!b(context, u42)) {
                list.remove(u42);
            }
        }
    }

    public static Intent d(Context context, U42 u42) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = A52.a(context.getSystemService(C8672p52.a())).createShortcutResultIntent(u42.H());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return u42.a(intent);
    }

    public static void e(Context context, List<String> list, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            A52.a(context.getSystemService(C8672p52.a())).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        for (B42 b42 : n(context)) {
            b42.c(list);
        }
    }

    public static void f(Context context, List<U42> list) {
        List<U42> w = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (U42 u42 : w) {
                arrayList.add(u42.b);
            }
            A52.a(context.getSystemService(C8672p52.a())).enableShortcuts(arrayList);
        }
        o(context).a(w);
        for (B42 b42 : n(context)) {
            b42.b(list);
        }
    }

    public static List<U42> g(Context context) {
        List<Object> dynamicShortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            dynamicShortcuts = A52.a(context.getSystemService(C8672p52.a())).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (Object obj : dynamicShortcuts) {
                arrayList.add(new U42.b(context, G42.a(obj)).c());
            }
            return arrayList;
        }
        try {
            return o(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int h(Context context, boolean z) {
        boolean z2;
        int i2;
        float f2;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r);
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = 48;
        } else {
            i2 = 96;
        }
        int max = Math.max(1, i2);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            f2 = displayMetrics.xdpi;
        } else {
            f2 = displayMetrics.ydpi;
        }
        return (int) (max * (f2 / 160.0f));
    }

    public static int i(Context context) {
        int iconMaxHeight;
        C10907yF1.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            iconMaxHeight = A52.a(context.getSystemService(C8672p52.a())).getIconMaxHeight();
            return iconMaxHeight;
        }
        return h(context, false);
    }

    public static int j(Context context) {
        int iconMaxWidth;
        C10907yF1.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            iconMaxWidth = A52.a(context.getSystemService(C8672p52.a())).getIconMaxWidth();
            return iconMaxWidth;
        }
        return h(context, true);
    }

    public static int k(Context context) {
        int maxShortcutCountPerActivity;
        C10907yF1.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            maxShortcutCountPerActivity = A52.a(context.getSystemService(C8672p52.a())).getMaxShortcutCountPerActivity();
            return maxShortcutCountPerActivity;
        }
        return 5;
    }

    public static List<B42> l() {
        return k;
    }

    public static String m(List<U42> list) {
        int i2 = -1;
        String str = null;
        for (U42 u42 : list) {
            if (u42.v() > i2) {
                str = u42.k();
                i2 = u42.v();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<B42> n(Context context) {
        Bundle bundle;
        if (k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(l);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                    String string = bundle.getString(m);
                    if (string != null) {
                        try {
                            arrayList.add((B42) Class.forName(string, false, M52.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                        } catch (Exception unused) {
                        }
                    }
                    while (r1.hasNext()) {
                    }
                }
            }
            if (k == null) {
                k = arrayList;
            }
        }
        return k;
    }

    public static AbstractC8428o52<?> o(Context context) {
        if (j == null) {
            try {
                j = (AbstractC8428o52) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, M52.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (j == null) {
                j = new AbstractC8428o52.a();
            }
        }
        return j;
    }

    public static List<U42> p(Context context, int i2) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            shortcuts = A52.a(context.getSystemService(C8672p52.a())).getShortcuts(i2);
            return U42.c(context, shortcuts);
        } else if (i3 >= 25) {
            ShortcutManager a2 = A52.a(context.getSystemService(C8672p52.a()));
            ArrayList arrayList = new ArrayList();
            if ((i2 & 1) != 0) {
                manifestShortcuts = a2.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i2 & 2) != 0) {
                dynamicShortcuts = a2.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i2 & 4) != 0) {
                pinnedShortcuts = a2.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return U42.c(context, arrayList);
        } else {
            if ((i2 & 2) != 0) {
                try {
                    return o(context).b();
                } catch (Exception unused) {
                }
            }
            return Collections.EMPTY_LIST;
        }
    }

    public static boolean q(Context context) {
        boolean isRateLimitingActive;
        C10907yF1.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            isRateLimitingActive = A52.a(context.getSystemService(C8672p52.a())).isRateLimitingActive();
            return isRateLimitingActive;
        } else if (p(context, 3).size() == k(context)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r(Context context) {
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            isRequestPinShortcutSupported = A52.a(context.getSystemService(C8672p52.a())).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        } else if (C10201vM.a(context, f) != 0) {
            return false;
        } else {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent(e), 0)) {
                String str = resolveInfo.activityInfo.permission;
                if (TextUtils.isEmpty(str) || f.equals(str)) {
                    return true;
                }
                while (r4.hasNext()) {
                }
            }
            return false;
        }
    }

    public static boolean s(Context context, U42 u42) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        C10907yF1.l(context);
        C10907yF1.l(u42);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 32 && u42.E(1)) {
            for (B42 b42 : n(context)) {
                b42.b(Collections.singletonList(u42));
            }
            return true;
        }
        int k2 = k(context);
        if (k2 == 0) {
            return false;
        }
        if (i2 <= 29) {
            b(context, u42);
        }
        if (i2 >= 30) {
            A52.a(context.getSystemService(C8672p52.a())).pushDynamicShortcut(u42.H());
        } else if (i2 >= 25) {
            ShortcutManager a2 = A52.a(context.getSystemService(C8672p52.a()));
            isRateLimitingActive = a2.isRateLimitingActive();
            if (!isRateLimitingActive) {
                dynamicShortcuts = a2.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= k2) {
                    a2.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
                }
                a2.addDynamicShortcuts(Arrays.asList(u42.H()));
            } else {
                return false;
            }
        }
        AbstractC8428o52<?> o2 = o(context);
        try {
            List<U42> b2 = o2.b();
            if (b2.size() >= k2) {
                o2.d(Arrays.asList(m(b2)));
            }
            o2.a(Arrays.asList(u42));
            for (B42 b422 : n(context)) {
                b422.b(Collections.singletonList(u42));
            }
            x(context, u42.k());
            return true;
        } catch (Exception unused) {
            for (B42 b423 : n(context)) {
                b423.b(Collections.singletonList(u42));
            }
            x(context, u42.k());
            return false;
        } catch (Throwable th) {
            for (B42 b424 : n(context)) {
                b424.b(Collections.singletonList(u42));
            }
            x(context, u42.k());
            throw th;
        }
    }

    public static void t(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            A52.a(context.getSystemService(C8672p52.a())).removeAllDynamicShortcuts();
        }
        o(context).c();
        for (B42 b42 : n(context)) {
            b42.a();
        }
    }

    public static void u(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            A52.a(context.getSystemService(C8672p52.a())).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        for (B42 b42 : n(context)) {
            b42.c(list);
        }
    }

    public static void v(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 30) {
            A52.a(context.getSystemService(C8672p52.a())).removeLongLivedShortcuts(list);
            o(context).d(list);
            for (B42 b42 : n(context)) {
                b42.c(list);
            }
            return;
        }
        u(context, list);
    }

    public static List<U42> w(List<U42> list, int i2) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (U42 u42 : list) {
            if (u42.E(i2)) {
                arrayList.remove(u42);
            }
        }
        return arrayList;
    }

    public static void x(Context context, String str) {
        C10907yF1.l(context);
        C10907yF1.l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            A52.a(context.getSystemService(C8672p52.a())).reportShortcutUsed(str);
        }
        for (B42 b42 : n(context)) {
            b42.e(Collections.singletonList(str));
        }
    }

    public static boolean y(Context context, U42 u42, IntentSender intentSender) {
        boolean requestPinShortcut;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 32 && u42.E(1)) {
            return false;
        }
        if (i2 >= 26) {
            requestPinShortcut = A52.a(context.getSystemService(C8672p52.a())).requestPinShortcut(u42.H(), intentSender);
            return requestPinShortcut;
        } else if (!r(context)) {
            return false;
        } else {
            Intent a2 = u42.a(new Intent(e));
            if (intentSender == null) {
                context.sendBroadcast(a2);
                return true;
            }
            context.sendOrderedBroadcast(a2, null, new a(intentSender), null, -1, null, null);
            return true;
        }
    }

    public static boolean z(Context context, List<U42> list) {
        boolean dynamicShortcuts;
        C10907yF1.l(context);
        C10907yF1.l(list);
        List<U42> w = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w.size());
            for (U42 u42 : w) {
                arrayList.add(u42.H());
            }
            dynamicShortcuts = A52.a(context.getSystemService(C8672p52.a())).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        o(context).c();
        o(context).a(w);
        for (B42 b42 : n(context)) {
            b42.a();
            b42.b(list);
        }
        return true;
    }
}
