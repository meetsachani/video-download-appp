package o;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* renamed from: o.qD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8946qD1 {

    @InterfaceC8303na2({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    /* renamed from: o.qD1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();
        @InterfaceC7058iW0
        @Nullable
        public static final Method b;
        @InterfaceC7058iW0
        @Nullable
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            C6562gT0.m(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 < length) {
                    method2 = methods[i2];
                    if (C6562gT0.g(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        C6562gT0.o(parameterTypes, "getParameterTypes(...)");
                        if (C6562gT0.g(C7330jf.Lt(parameterTypes), Throwable.class)) {
                            break;
                        }
                    }
                    i2++;
                } else {
                    method2 = null;
                    break;
                }
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (C6562gT0.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }
    }

    public void a(@NotNull Throwable th, @NotNull Throwable th2) {
        C6562gT0.p(th, "cause");
        C6562gT0.p(th2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @NotNull
    public AbstractC10696xN1 b() {
        return new C7121in0();
    }

    @Nullable
    public M81 c(@NotNull MatchResult matchResult, @NotNull String str) {
        C6562gT0.p(matchResult, "matchResult");
        C6562gT0.p(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List<Throwable> d(@NotNull Throwable th) {
        Object invoke;
        List<Throwable> t;
        C6562gT0.p(th, "exception");
        Method method = a.c;
        if (method != null && (invoke = method.invoke(th, null)) != null && (t = C4788Ye.t((Throwable[]) invoke)) != null) {
            return t;
        }
        return C8222nF.H();
    }

    @InterfaceC5395bj0
    @NotNull
    public MD e() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
