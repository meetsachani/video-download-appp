package o;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: o.iK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7014iK2 {
    public static final String a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    public static final String b = "createWebViewProviderFactory";

    /* renamed from: o.iK2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final C9953uK2 a = new C9953uK2(C7014iK2.d().getWebkitToCompatConverter());
    }

    /* renamed from: o.iK2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final InterfaceC7741lK2 a = C7014iK2.a();
    }

    public static InterfaceC7741lK2 a() {
        try {
            return new C8002mK2((WebViewProviderFactoryBoundaryInterface) C7128ip.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new C5078aP0();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(a, false, e()).getDeclaredMethod(b, null).invoke(null, null);
    }

    public static C9953uK2 c() {
        return a.a;
    }

    public static InterfaceC7741lK2 d() {
        return b.a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C8304nb.b();
        }
        return f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
