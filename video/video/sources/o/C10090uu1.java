package o;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.uu1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C10090uu1 {
    @InterfaceC8046mW0(name = "blackhole")
    @NotNull
    public static final J82 a() {
        return new C7852lo();
    }

    @NotNull
    public static final InterfaceC2579Bq b(@NotNull J82 j82) {
        C6562gT0.p(j82, "<this>");
        return new LO1(j82);
    }

    @NotNull
    public static final InterfaceC2677Cq c(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        return new MO1(interfaceC7072ia2);
    }

    public static final <T extends Closeable, R> R d(T t, @NotNull HA0<? super T, ? extends R> ha0) {
        R r;
        C6562gT0.p(ha0, "block");
        Throwable th = null;
        try {
            r = ha0.invoke(t);
            UP0.d(1);
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            UP0.c(1);
        } catch (Throwable th3) {
            UP0.d(1);
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th4) {
                    C3917Pf0.a(th3, th4);
                }
            }
            UP0.c(1);
            th = th3;
            r = null;
        }
        if (th == null) {
            C6562gT0.m(r);
            return r;
        }
        throw th;
    }
}
