package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.C10201vM;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    public static final int a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    @InterfaceC8710pF0("WorkSourceUtil.class")
    public static Boolean j;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|4|(22:55|56|7|8|9|10|11|12|13|(13:47|48|16|(10:42|43|19|(7:37|38|22|(7:28|29|30|31|32|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class cls = Integer.TYPE;
        a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        b = method;
        if (PlatformVersion.g()) {
            try {
                method2 = WorkSource.class.getMethod("add", cls, String.class);
            } catch (Exception unused2) {
            }
            c = method2;
            Method method7 = WorkSource.class.getMethod("size", null);
            d = method7;
            Method method8 = WorkSource.class.getMethod("get", cls);
            e = method8;
            if (PlatformVersion.g()) {
                try {
                    method3 = WorkSource.class.getMethod("getName", cls);
                } catch (Exception unused3) {
                }
                f = method3;
                if (PlatformVersion.o()) {
                    try {
                        method4 = WorkSource.class.getMethod("createWorkChain", null);
                    } catch (Exception e2) {
                        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
                    }
                    g = method4;
                    if (PlatformVersion.o()) {
                        try {
                            method5 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
                        } catch (Exception e3) {
                            Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
                        }
                        h = method5;
                        if (PlatformVersion.o()) {
                            try {
                                method6 = WorkSource.class.getMethod("isEmpty", null);
                                try {
                                    method6.setAccessible(true);
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                            }
                            i = method6;
                            j = null;
                        }
                        method6 = null;
                        i = method6;
                        j = null;
                    }
                    method5 = null;
                    h = method5;
                    if (PlatformVersion.o()) {
                    }
                    method6 = null;
                    i = method6;
                    j = null;
                }
                method4 = null;
                g = method4;
                if (PlatformVersion.o()) {
                }
                method5 = null;
                h = method5;
                if (PlatformVersion.o()) {
                }
                method6 = null;
                i = method6;
                j = null;
            }
            method3 = null;
            f = method3;
            if (PlatformVersion.o()) {
            }
            method4 = null;
            g = method4;
            if (PlatformVersion.o()) {
            }
            method5 = null;
            h = method5;
            if (PlatformVersion.o()) {
            }
            method6 = null;
            i = method6;
            j = null;
        }
        method2 = null;
        c = method2;
        Method method72 = WorkSource.class.getMethod("size", null);
        d = method72;
        Method method82 = WorkSource.class.getMethod("get", cls);
        e = method82;
        if (PlatformVersion.g()) {
        }
        method3 = null;
        f = method3;
        if (PlatformVersion.o()) {
        }
        method4 = null;
        g = method4;
        if (PlatformVersion.o()) {
        }
        method5 = null;
        h = method5;
        if (PlatformVersion.o()) {
        }
        method6 = null;
        i = method6;
        j = null;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void a(@InterfaceC5670cr1 WorkSource workSource, int i2, @InterfaceC5670cr1 String str) {
        Method method = c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static WorkSource b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c2 = Wrappers.a(context).c(str, 0);
                if (c2 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i2 = c2.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static WorkSource c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i2 = -1;
            try {
                ApplicationInfo c2 = Wrappers.a(context).c(str, 0);
                if (c2 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i2 = c2.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i2 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = g;
            if (method2 != null && (method = h) != null) {
                try {
                    Object invoke = method2.invoke(workSource, null);
                    int i3 = a;
                    if (i2 != i3) {
                        method.invoke(invoke, Integer.valueOf(i2), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i3), str2);
                } catch (Exception e2) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e2);
                }
            } else {
                a(workSource, i2, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int d(@InterfaceC5670cr1 WorkSource workSource, int i2) {
        Method method = e;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i2));
                Preconditions.r(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return 0;
            }
        }
        return 0;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String e(@InterfaceC5670cr1 WorkSource workSource, int i2) {
        Method method = f;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return null;
            }
        }
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static List<String> f(@InterfaceC5670cr1 WorkSource workSource) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            i2 = 0;
        } else {
            i2 = i(workSource);
        }
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                String e2 = e(workSource, i3);
                if (!Strings.b(e2)) {
                    Preconditions.r(e2);
                    arrayList.add(e2);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean g(@InterfaceC5670cr1 Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = j;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C10201vM.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z = true;
            }
            j = Boolean.valueOf(z);
            return z;
        }
    }

    @KeepForSdk
    public static boolean h(@InterfaceC5670cr1 WorkSource workSource) {
        Method method = i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.r(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e2) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        if (i(workSource) == 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static int i(@InterfaceC5670cr1 WorkSource workSource) {
        Method method = d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.r(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return 0;
            }
        }
        return 0;
    }
}
