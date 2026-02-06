package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener;
import com.facebook.ads.redexgen.X.N0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class N0 {
    public static byte[] A09;
    public static String[] A0A = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public static final String A0B;
    public Application A02;
    public InterfaceC0924Ms A04;
    public UserReturnTracker$UserReturnListener A05;
    public final VA A08;
    public long A01 = 0;
    public long A00 = 0;
    public String A06 = null;
    public EnumC0922Mq A03 = null;
    public boolean A07 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{104, 83, 92, 95, 81, 88, C8077mf.G, 73, 82, C8077mf.G, 113, 82, 90, C8077mf.G, 104, 78, 88, 79, C8077mf.G, 111, 88, 73, 72, 79, 83, C8077mf.G, 74, 85, 88, 83, C8077mf.G, 73, 82, 86, 88, 83, C8077mf.G, 84, 78, C8077mf.G, 83, 72, 81, 81, 19, 2, 1, 3, C8077mf.m, ED2.a, C8077mf.x, 9, 13, 5, C8077mf.u, C8077mf.E, 31, 8, C8077mf.E, C3307Iz.V, 10, C8077mf.A, 19, C8077mf.E, 60, C3307Iz.Y, C3307Iz.Z, 48, 60, 62, 54, 118, 97, 116, 107, 118, 112, 109, 106, 99};
    }

    static {
        A03();
        A0B = N0.class.getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public N0(VA va, final Activity activity, int i) {
        this.A08 = va;
        this.A02 = activity.getApplication();
        this.A05 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public N0 A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static N0 A00(VA va, Activity activity) {
        return A01(va, activity, Build.VERSION.SDK_INT);
    }

    public static N0 A01(VA va, Activity activity, int i) {
        if (activity != null && i >= 14) {
            return new N0(va, activity, i);
        }
        return null;
    }

    private void A04(String str, long j, long j2, EnumC0922Mq enumC0922Mq) {
        HashMap hashMap = new HashMap();
        hashMap.put(A02(54, 10, 111), Long.toString(j));
        hashMap.put(A02(45, 9, 113), Long.toString(j2));
        if (enumC0922Mq != null) {
            hashMap.put(A02(64, 7, 66), enumC0922Mq.name());
        }
        this.A08.AC9(str, hashMap);
    }

    public final void A05() {
        this.A00 = System.currentTimeMillis();
        if (this.A00 - this.A01 < 2000 && this.A04 != null) {
            InterfaceC0924Ms interfaceC0924Ms = this.A04;
            if (A0A[2].length() != 10) {
                throw new RuntimeException();
            }
            A0A[1] = "";
            interfaceC0924Ms.AFa();
        }
        if (this.A06 != null) {
            A04(this.A06, this.A01, this.A00, this.A03);
        } else {
            Application application = this.A02;
            String A02 = A02(0, 45, 44);
            if (application != null && (this.A02.getBaseContext() instanceof C1673gi)) {
                ((C1673gi) this.A02.getBaseContext()).A08().ABC(A02(71, 9, 21), AbstractC1085Td.A22, new C1086Te(A02));
            }
            Log.w(A0B, A02);
        }
        if (this.A02 != null && this.A05 != null) {
            this.A02.unregisterActivityLifecycleCallbacks(this.A05);
            this.A07 = false;
        }
    }

    public final void A06(EnumC0922Mq enumC0922Mq) {
        this.A03 = enumC0922Mq;
    }

    public final void A07(InterfaceC0924Ms interfaceC0924Ms) {
        this.A04 = interfaceC0924Ms;
    }

    public final void A08(String str) {
        this.A06 = str;
        this.A01 = System.currentTimeMillis();
        if (this.A05 == null || this.A02 == null || this.A07) {
            A04(str, -1L, -1L, EnumC0922Mq.A05);
            return;
        }
        this.A07 = true;
        this.A02.registerActivityLifecycleCallbacks(this.A05);
    }
}
