package o;

/* renamed from: o.jQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7278jQ1 {
    public static final InterfaceC7278jQ1 a = new a();
    public static final InterfaceC7278jQ1 b = new b();
    public static final InterfaceC7278jQ1 c = new c();
    public static final InterfaceC7278jQ1 d = new d();

    /* renamed from: o.jQ1$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC7278jQ1 {
        @Override // o.InterfaceC7278jQ1
        public e a(Class<?> cls) {
            if (C7521kQ1.f(cls)) {
                return e.BLOCK_INACCESSIBLE;
            }
            return e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    }

    /* renamed from: o.jQ1$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC7278jQ1 {
        @Override // o.InterfaceC7278jQ1
        public e a(Class<?> cls) {
            if (C7521kQ1.f(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    }

    /* renamed from: o.jQ1$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC7278jQ1 {
        @Override // o.InterfaceC7278jQ1
        public e a(Class<?> cls) {
            if (C7521kQ1.c(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    }

    /* renamed from: o.jQ1$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC7278jQ1 {
        @Override // o.InterfaceC7278jQ1
        public e a(Class<?> cls) {
            if (C7521kQ1.e(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    }

    /* renamed from: o.jQ1$e */
    /* loaded from: classes3.dex */
    public enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    e a(Class<?> cls);
}
