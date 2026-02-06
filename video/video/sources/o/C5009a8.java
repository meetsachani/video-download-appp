package o;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import o.PT1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@SuppressLint({"all"})
@IgnoreJRERequirement
/* renamed from: o.a8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5009a8 {
    @NotNull
    public static final C5009a8 a = new C5009a8();
    public static final boolean b;

    /* renamed from: o.a8$a */
    /* loaded from: classes3.dex */
    public static final class a implements ClassFileTransformer {
        @NotNull
        public static final a a = new a();

        @Nullable
        public byte[] a(@Nullable ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (classLoader != null && C6562gT0.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                Y7.a.b(true);
                return C8372ns.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object b2;
        boolean x;
        Boolean bool;
        Boolean bool2 = null;
        try {
            PT1.a aVar = PT1.Y;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            b2 = PT1.b(bool);
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th));
        }
        if (!PT1.i(b2)) {
            bool2 = b2;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            x = bool3.booleanValue();
        } else {
            x = JV.a.x();
        }
        b = x;
    }

    public static final void c(Signal signal) {
        JV jv = JV.a;
        if (jv.D()) {
            jv.g(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @InterfaceC9511sW0
    public static final void d(@Nullable String str, @NotNull Instrumentation instrumentation) {
        Y7.a.b(true);
        instrumentation.addTransformer(a.a);
        JV jv = JV.a;
        jv.O(b);
        jv.B();
        a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: o.Z7
                public final void a(Signal signal) {
                    C5009a8.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
