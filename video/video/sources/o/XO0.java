package o;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class XO0 {
    @NotNull
    public static final XO0 a = new XO0();

    @InterfaceC9511sW0
    @Nullable
    public static final Class<?> a(@NotNull String str) {
        if (SQ.e(XO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, XO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Class<?> b(@NotNull Context context, @NotNull String str) {
        if (SQ.e(XO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "className");
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, XO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Method c(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) {
        if (SQ.e(XO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(cls, "clazz");
            C6562gT0.p(str, "methodName");
            C6562gT0.p(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, XO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Method d(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) {
        if (SQ.e(XO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(cls, "clazz");
            C6562gT0.p(str, "methodName");
            C6562gT0.p(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, XO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Object e(@NotNull Class<?> cls, @NotNull Method method, @Nullable Object obj, @NotNull Object... objArr) {
        if (SQ.e(XO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(cls, "clazz");
            C6562gT0.p(method, "method");
            C6562gT0.p(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, XO0.class);
            return null;
        }
    }
}
