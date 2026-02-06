package o;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: o.zk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11268zk1 {
    @NotNull
    public static final C11268zk1 a = new C11268zk1();
    @NotNull
    public static final a b = new a(null, null, null);
    @Nullable
    public static a c;

    /* renamed from: o.zk1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC7058iW0
        @Nullable
        public final Method a;
        @InterfaceC7058iW0
        @Nullable
        public final Method b;
        @InterfaceC7058iW0
        @Nullable
        public final Method c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(AbstractC5644cl abstractC5644cl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC5644cl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC5644cl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    public final String b(@NotNull AbstractC5644cl abstractC5644cl) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        C6562gT0.p(abstractC5644cl, "continuation");
        a aVar = c;
        if (aVar == null) {
            aVar = a(abstractC5644cl);
        }
        if (aVar != b && (method = aVar.a) != null && (invoke = method.invoke(abstractC5644cl.getClass(), null)) != null && (method2 = aVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar.c;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }
}
