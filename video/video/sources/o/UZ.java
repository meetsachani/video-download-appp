package o;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes4.dex */
public final class UZ {
    @InterfaceC10571ws1
    public static Constructor<MethodHandles.Lookup> a;

    @InterfaceC10571ws1
    @IgnoreJRERequirement
    public static Object a(Method method, Class<?> cls, Object obj, @InterfaceC10571ws1 Object[] objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = a;
        if (constructor == null) {
            constructor = PZ.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            a = constructor;
        }
        unreflectSpecial = QZ.a(constructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
