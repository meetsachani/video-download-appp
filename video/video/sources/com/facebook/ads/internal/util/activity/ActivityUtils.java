package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.AbstractC1085Td;
import com.facebook.ads.redexgen.X.AbstractC1176Wt;
import com.facebook.ads.redexgen.X.C1086Te;
import com.facebook.ads.redexgen.X.C1123Up;
import com.facebook.ads.redexgen.X.C1669ge;
import com.facebook.ads.redexgen.X.C1673gi;
import com.facebook.ads.redexgen.X.InterfaceC1179Ww;
import com.facebook.ads.redexgen.X.RunnableC1178Wv;
import com.facebook.ads.redexgen.X.X0;
import com.facebook.ads.redexgen.X.Y4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.Xu2;

/* loaded from: assets/audience_network/classes2.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1669ge A02;
    public static byte[] A03;
    public static String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final X0 A05;
    public static final List<InterfaceC1179Ww> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {C8077mf.p, 2, 35, 69, 86, 75, 88, 75, 86, 91, 28, 2, -90, -102, -20, -33, -32, -76, -102, 6, 40, 57, C3307Iz.f0, 59, C3307Iz.f0, 57, 62, -27, C3307Iz.a0, C3307Iz.f0, 56, 40, 55, 42, 53, C3307Iz.Y, 51, 40, C3307Iz.f0, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, 92, 111, 107, C8077mf.A, 96, 106, C8077mf.A, 101, 102, 107, C8077mf.A, 56, 103, 103, 99, 96, 90, 88, 107, 96, 102, 101, C3307Iz.X, -3, C3307Iz.a0, 40, C8077mf.G, 47, C3307Iz.d0, C3307Iz.d0, 31, 40, C3307Iz.f0, C2638Cg0.B7, C3307Iz.Z, C3307Iz.a0, C8077mf.H, 35, 32, 35, C8077mf.G, C8077mf.E, C3307Iz.f0, 35, C3307Iz.a0, 40, C2638Cg0.B7, 31, 50, C8077mf.G, 31, 42, C3307Iz.f0, 35, C3307Iz.a0, 40, C2638Cg0.B7, C3307Iz.f0, 34, C3307Iz.d0, C3307Iz.a0, 49, 40, C8077mf.H, 47, C3307Iz.d0, 35, 40, C3307Iz.V, C2638Cg0.B7, C3307Iz.d0, 31, C3307Iz.V, 35, C3307Iz.e0, C3307Iz.f0, 31, C3307Iz.d0, -5, C8077mf.G, C3307Iz.f0, 35, 48, 35, C3307Iz.f0, 51, -3, C8077mf.E, C3307Iz.Y, C3307Iz.Y, 28, C8077mf.E, C8077mf.G, C3307Iz.X, C3307Iz.e0, 6, 35, C3307Iz.e0, C3307Iz.f0, 31, 40, 31, C3307Iz.d0, C3307Iz.e0, 74, 66, -2, ED2.a, 65, 82, 71, 84, 71, 82, 87, -2, 81, 82, ED2.a, 82, 67, C8077mf.B, -2, C8077mf.B, C3307Iz.a0, C4715Xk.i, 59, C3307Iz.e0, C3307Iz.d0, -24, C3307Iz.a0, C3307Iz.c0, 60, 49, 62, 49, 60, 65, -24, 49, 59, -24, 54, 55, 60, -24, 58, C3307Iz.e0, 59, C4715Xk.i, 53, C3307Iz.e0, C3307Iz.d0, -10, C3307Iz.d0, ED2.a, 77, C8077mf.x, -6, C8077mf.A, C8077mf.C, 42, C8077mf.y, C3307Iz.c0, 42, 31, 34, -35, -20, -27, 58, 57, C8077mf.n, C3307Iz.f0, ED2.a, 52, 65, 52, ED2.a, 68, C8077mf.p, C4715Xk.i, 48, C3307Iz.d0, ED2.a, 48, 47};
        if (A04[0].charAt(5) != 'm') {
            throw new RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized void A04(C1669ge c1669ge, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c1669ge;
            A01 = c1669ge.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c1669ge.A08().ABC(A01(208, 8, 61), AbstractC1085Td.A02, new C1086Te(A01(72, 80, 65)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1669ge);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c1669ge.A08().ABC(A01(216, 3, 3), AbstractC1085Td.A0d, new C1086Te(A01(42, 30, 126)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = X0.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:10:0x0027, B:13:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized Activity A00() {
        boolean z;
        synchronized (ActivityUtils.class) {
            Activity activity = null;
            Iterator<Map.Entry<Activity, Integer>> it = A08.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Activity, Integer> next = it.next();
                if (next.getValue().intValue() == 3) {
                    activity = next.getKey();
                    break;
                }
            }
            Activity activity2 = null;
            if (activity != null && Build.VERSION.SDK_INT >= 28) {
                z = false;
                if (z) {
                    activity2 = AbstractC1176Wt.A00();
                }
                if (A02 != null && z && activity != activity2) {
                    C1086Te c1086Te = new C1086Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                    c1086Te.A05(1);
                    A02.A08().ABC(A01(208, 8, 61), AbstractC1085Td.A03, c1086Te);
                }
                return activity == null ? activity : activity2;
            }
            z = true;
            if (z) {
            }
            if (A02 != null) {
                C1086Te c1086Te2 = new C1086Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                c1086Te2.A05(1);
                A02.A08().ABC(A01(208, 8, 61), AbstractC1085Td.A03, c1086Te2);
            }
            if (activity == null) {
            }
        }
    }

    public static void A03(C1673gi c1673gi) {
        if (!C1123Up.A1p(c1673gi) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        RunnableC1178Wv runnableC1178Wv = new RunnableC1178Wv(c1673gi);
        synchronized (A07) {
            A07.add(runnableC1178Wv);
        }
        Y4.A01.A01().postDelayed(runnableC1178Wv, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<InterfaceC1179Ww> it = A06.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A01(219, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C1086Te c1086Te = new C1086Te(A01(Xu2.K, 31, 79), A01(C3503Kz.l0, 20, 101) + num + A01(0, 12, 105) + activity);
            c1086Te.A05(0);
            A02.A08().ABC(A01(208, 8, 61), AbstractC1085Td.A03, c1086Te);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Y4.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
