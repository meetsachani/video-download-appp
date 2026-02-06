package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.mU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8040mU0 extends C8946qD1 {

    @InterfaceC8303na2({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: o.mU0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();
        @InterfaceC7058iW0
        @Nullable
        public static final Integer b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            b = num2;
        }
    }

    private final boolean f(int i) {
        Integer num = a.b;
        if (num != null && num.intValue() < i) {
            return false;
        }
        return true;
    }

    @Override // o.C8946qD1
    public void a(@NotNull Throwable th, @NotNull Throwable th2) {
        C6562gT0.p(th, "cause");
        C6562gT0.p(th2, "exception");
        if (f(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // o.C8946qD1
    @NotNull
    public List<Throwable> d(@NotNull Throwable th) {
        C6562gT0.p(th, "exception");
        if (f(19)) {
            Throwable[] suppressed = th.getSuppressed();
            C6562gT0.o(suppressed, "getSuppressed(...)");
            return C4788Ye.t(suppressed);
        }
        return super.d(th);
    }
}
