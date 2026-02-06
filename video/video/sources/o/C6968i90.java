package o;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.C5240b5;
import o.HC1;

/* renamed from: o.i90  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6968i90 {
    public static final String a = "EasyPermissions";

    /* renamed from: o.i90$a */
    /* loaded from: classes4.dex */
    public interface a extends C5240b5.i {
        void W(int i, @InterfaceC5670cr1 List<String> list);

        void q(int i, @InterfaceC5670cr1 List<String> list);
    }

    /* renamed from: o.i90$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i);

        void b(int i);
    }

    public static boolean a(@InterfaceC5670cr1 Context context, @M82(min = 1) @InterfaceC5670cr1 String... strArr) {
        if (context != null) {
            for (String str : strArr) {
                if (C10201vM.a(context, str) != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Can't check permissions for null context");
    }

    public static boolean b(@InterfaceC5670cr1 Object obj) {
        if (!obj.getClass().getSimpleName().endsWith(CrashlyticsReportPersistence.m)) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void c(@InterfaceC5670cr1 Object obj, int i, @InterfaceC5670cr1 String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        d(i, strArr, iArr, obj);
    }

    public static void d(int i, @InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof a)) {
                ((a) obj).W(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof a)) {
                ((a) obj).q(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                j(obj, i);
            }
        }
    }

    public static boolean e(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 String str) {
        return FC1.d(activity).f(str);
    }

    public static boolean f(@InterfaceC5670cr1 Fragment fragment, @InterfaceC5670cr1 String str) {
        return FC1.e(fragment).f(str);
    }

    public static void g(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 String str, int i, @M82(min = 1) @InterfaceC5670cr1 String... strArr) {
        i(new HC1.b(activity, i, strArr).g(str).a());
    }

    public static void h(@InterfaceC5670cr1 Fragment fragment, @InterfaceC5670cr1 String str, int i, @M82(min = 1) @InterfaceC5670cr1 String... strArr) {
        i(new HC1.b(fragment, i, strArr).g(str).a());
    }

    public static void i(HC1 hc1) {
        if (a(hc1.a().b(), hc1.c())) {
            c(hc1.a().c(), hc1.f(), hc1.c());
        } else {
            hc1.a().g(hc1.e(), hc1.d(), hc1.b(), hc1.g(), hc1.f(), hc1.c());
        }
    }

    public static void j(@InterfaceC5670cr1 Object obj, int i) {
        Method[] declaredMethods;
        Class<?> cls = obj.getClass();
        if (b(obj)) {
            cls = cls.getSuperclass();
        }
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                U7 u7 = (U7) method.getAnnotation(U7.class);
                if (u7 != null && u7.value() == i) {
                    if (method.getParameterTypes().length <= 0) {
                        try {
                            if (!method.isAccessible()) {
                                method.setAccessible(true);
                            }
                            method.invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("EasyPermissions", "runDefaultMethod:IllegalAccessException", e);
                        } catch (InvocationTargetException e2) {
                            Log.e("EasyPermissions", "runDefaultMethod:InvocationTargetException", e2);
                        }
                    } else {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static boolean k(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 String... strArr) {
        return FC1.d(activity).k(strArr);
    }

    public static boolean l(@InterfaceC5670cr1 Fragment fragment, @InterfaceC5670cr1 String... strArr) {
        return FC1.e(fragment).k(strArr);
    }

    public static boolean m(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 List<String> list) {
        return FC1.d(activity).l(list);
    }

    public static boolean n(@InterfaceC5670cr1 Fragment fragment, @InterfaceC5670cr1 List<String> list) {
        return FC1.e(fragment).l(list);
    }
}
