package o;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import o.C10433wI1;

/* renamed from: o.Td */
/* loaded from: classes4.dex */
public class C4299Td {
    public static final Map<String, C10433wI1> a = new HashMap();

    static {
        f();
    }

    public static /* synthetic */ void a(C10433wI1 c10433wI1, String str) {
        b(str, c10433wI1);
    }

    public static void b(String str, C10433wI1 c10433wI1) {
        Map<String, C10433wI1> map = a;
        if (!map.containsKey(str)) {
            map.put(str, c10433wI1);
            return;
        }
        throw new IllegalStateException("Key " + str + " already exists in processor map");
    }

    public static void c(final C10433wI1 c10433wI1, String... strArr) {
        Stream.of((Object[]) strArr).forEach(new Consumer() { // from class: o.Sd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4299Td.a(C10433wI1.this, (String) obj);
            }
        });
    }

    public static C10433wI1 d() {
        return e(C3451Kk2.N);
    }

    public static C10433wI1 e(String str) {
        return a.get(str);
    }

    public static void f() {
        k();
        l();
        g();
        h();
        i();
        j();
    }

    public static void g() {
        c(new C10433wI1(C10433wI1.a.BIT_32, C10433wI1.b.IA_64), "ia64_32", "ia64n");
    }

    public static void h() {
        c(new C10433wI1(C10433wI1.a.BIT_64, C10433wI1.b.IA_64), "ia64", "ia64w");
    }

    public static void i() {
        c(new C10433wI1(C10433wI1.a.BIT_32, C10433wI1.b.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    public static void j() {
        c(new C10433wI1(C10433wI1.a.BIT_64, C10433wI1.b.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    public static void k() {
        c(new C10433wI1(C10433wI1.a.BIT_32, C10433wI1.b.X86), "x86", "i386", "i486", "i586", "i686", "pentium");
    }

    public static void l() {
        c(new C10433wI1(C10433wI1.a.BIT_64, C10433wI1.b.X86), "x86_64", "amd64", "em64t", "universal");
    }
}
