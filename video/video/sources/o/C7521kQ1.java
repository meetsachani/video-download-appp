package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;
import o.InterfaceC7278jQ1;

/* renamed from: o.kQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7521kQ1 {

    /* renamed from: o.kQ1$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static final b a;

        /* renamed from: o.kQ1$b$a */
        /* loaded from: classes3.dex */
        public class a extends b {
            public final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.b = method;
            }

            @Override // o.C7521kQ1.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* renamed from: o.kQ1$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0299b extends b {
            public C0299b() {
                super();
            }

            @Override // o.C7521kQ1.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        static {
            b aVar;
            if (IU0.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (aVar == null) {
                    aVar = new C0299b();
                }
                a = aVar;
            }
            aVar = null;
            if (aVar == null) {
            }
            a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.a.a(accessibleObject, obj);
    }

    public static InterfaceC7278jQ1.e b(List<InterfaceC7278jQ1> list, Class<?> cls) {
        for (InterfaceC7278jQ1 interfaceC7278jQ1 : list) {
            InterfaceC7278jQ1.e a2 = interfaceC7278jQ1.a(cls);
            if (a2 != InterfaceC7278jQ1.e.INDECISIVE) {
                return a2;
            }
        }
        return InterfaceC7278jQ1.e.ALLOW;
    }

    public static boolean c(Class<?> cls) {
        return d(cls.getName());
    }

    public static boolean d(String str) {
        if (!str.startsWith("android.") && !str.startsWith("androidx.") && !g(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        if (!d(name) && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static boolean f(Class<?> cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        if (!str.startsWith("java.") && !str.startsWith("javax.")) {
            return false;
        }
        return true;
    }
}
