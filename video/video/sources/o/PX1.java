package o;

import android.app.Application;
import com.facebook.C2381j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class PX1 {
    public static final List<Class<?>> a = C8222nF.O(Application.class, androidx.lifecycle.p.class);
    public static final List<Class<?>> b = C7979mF.k(androidx.lifecycle.p.class);

    public static final /* synthetic */ List a() {
        return a;
    }

    public static final /* synthetic */ List b() {
        return b;
    }

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        C6562gT0.p(cls, "modelClass");
        C6562gT0.p(list, C2381j.g1);
        Constructor<?>[] constructors = cls.getConstructors();
        C6562gT0.o(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            C6562gT0.o(parameterTypes, "constructor.parameterTypes");
            List Uy = C7330jf.Uy(parameterTypes);
            if (C6562gT0.g(list, Uy)) {
                C6562gT0.n(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (list.size() == Uy.size() && Uy.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends CH2> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        C6562gT0.p(cls, "modelClass");
        C6562gT0.p(constructor, "constructor");
        C6562gT0.p(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
