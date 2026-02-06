package o;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.C5240b5;
import o.U32;

/* renamed from: o.b5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5240b5 extends C10201vM {
    public static j g;

    /* renamed from: o.b5$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String[] X;
        public final /* synthetic */ Activity Y;
        public final /* synthetic */ int Z;

        public a(String[] strArr, Activity activity, int i) {
            this.X = strArr;
            this.Y = activity;
            this.Z = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.X.length];
            PackageManager packageManager = this.Y.getPackageManager();
            String packageName = this.Y.getPackageName();
            int length = this.X.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.X[i], packageName);
            }
            ((i) this.Y).onRequestPermissionsResult(this.Z, this.X, iArr);
        }
    }

    /* renamed from: o.b5$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: o.b5$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* renamed from: o.b5$d */
    /* loaded from: classes.dex */
    public static class d {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: o.b5$e */
    /* loaded from: classes.dex */
    public static class e {
        public static <T> T a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* renamed from: o.b5$f */
    /* loaded from: classes.dex */
    public static class f {
        public static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        public static void b(Activity activity, H31 h31, Bundle bundle) {
            LocusId c;
            if (h31 == null) {
                c = null;
            } else {
                c = h31.c();
            }
            activity.setLocusContext(c, bundle);
        }
    }

    /* renamed from: o.b5$g */
    /* loaded from: classes.dex */
    public static class g {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: o.b5$h */
    /* loaded from: classes.dex */
    public static class h {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: o.b5$i */
    /* loaded from: classes.dex */
    public interface i {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: o.b5$j */
    /* loaded from: classes.dex */
    public interface j {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean b(Activity activity, String[] strArr, int i);
    }

    /* renamed from: o.b5$k */
    /* loaded from: classes.dex */
    public interface k {
        void Q(int i);
    }

    /* renamed from: o.b5$l */
    /* loaded from: classes.dex */
    public static class l extends SharedElementCallback {
        public final U32 a;

        public l(U32 u32) {
            this.a = u32;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.h(list, list2, new U32.a() { // from class: o.c5
                @Override // o.U32.a
                public final void onSharedElementsReady() {
                    C5240b5.d.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static /* synthetic */ void C(Activity activity) {
        if (!activity.isFinishing() && !D5.i(activity)) {
            activity.recreate();
        }
    }

    public static void D(Activity activity) {
        activity.finishAffinity();
    }

    public static void E(Activity activity) {
        b.a(activity);
    }

    public static j F() {
        return g;
    }

    public static Uri G(Activity activity) {
        return c.a(activity);
    }

    @Deprecated
    public static boolean H(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean I(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return g.a(activity);
        }
        if (i2 == 30) {
            if (f.a(activity) != null && f.a(activity).getDisplayId() != 0) {
                return true;
            }
            return false;
        } else if (i2 == 29 && activity.getWindowManager().getDefaultDisplay() != null && activity.getWindowManager().getDefaultDisplay().getDisplayId() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void J(Activity activity) {
        b.b(activity);
    }

    public static void K(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: o.a5
                @Override // java.lang.Runnable
                public final void run() {
                    C5240b5.C(activity);
                }
            });
        }
    }

    public static C10627x60 L(Activity activity, DragEvent dragEvent) {
        return C10627x60.b(activity, dragEvent);
    }

    public static void M(Activity activity, String[] strArr, int i2) {
        String[] strArr2;
        j jVar = g;
        if (jVar == null || !jVar.b(activity, strArr, i2)) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (!TextUtils.isEmpty(strArr[i3])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr2 = new String[strArr.length - size];
            } else {
                strArr2 = strArr;
            }
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr2[i4] = strArr[i5];
                        i4++;
                    }
                }
            }
            if (activity instanceof k) {
                ((k) activity).Q(i2);
            }
            d.b(activity, strArr, i2);
        }
    }

    public static <T extends View> T N(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e.a(activity, i2);
        }
        T t = (T) activity.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void O(Activity activity, U32 u32) {
        l lVar;
        if (u32 != null) {
            lVar = new l(u32);
        } else {
            lVar = null;
        }
        b.c(activity, lVar);
    }

    public static void P(Activity activity, U32 u32) {
        l lVar;
        if (u32 != null) {
            lVar = new l(u32);
        } else {
            lVar = null;
        }
        b.d(activity, lVar);
    }

    public static void Q(Activity activity, H31 h31, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            f.b(activity, h31, bundle);
        }
    }

    public static void R(j jVar) {
        g = jVar;
    }

    public static boolean S(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 >= 32) {
            return h.a(activity, str);
        }
        if (i2 == 31) {
            return g.b(activity, str);
        }
        return d.c(activity, str);
    }

    public static void T(Activity activity, Intent intent, int i2, Bundle bundle) {
        activity.startActivityForResult(intent, i2, bundle);
    }

    public static void U(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public static void V(Activity activity) {
        b.e(activity);
    }
}
