package o;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class EV {
    @NotNull
    public static final String a = "kotlinx.coroutines.debug";
    @NotNull
    public static final String b = "kotlinx.coroutines.stacktrace.recovery";
    @NotNull
    public static final String c = "auto";
    @NotNull
    public static final String d = "on";
    @NotNull
    public static final String e = "off";
    public static final boolean f = false;
    public static final boolean g;
    public static final boolean h;
    @NotNull
    public static final AtomicLong i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r0.equals("on") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r0.equals("") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r0 = true;
     */
    static {
        boolean z;
        String d2 = C2852Ek2.d(a);
        boolean z2 = true;
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + d2 + '\'').toString());
            }
            g = z;
            if (z || !C2852Ek2.f(b, true)) {
                z2 = false;
            }
            h = z2;
            i = new AtomicLong(0L);
        }
        z = false;
        g = z;
        if (z) {
        }
        z2 = false;
        h = z2;
        i = new AtomicLong(0L);
    }

    public static final boolean b() {
        return f;
    }

    @NotNull
    public static final AtomicLong c() {
        return i;
    }

    public static final boolean d() {
        return g;
    }

    public static final boolean e() {
        return h;
    }

    public static final void g() {
        i.set(0L);
    }

    @HK1
    public static /* synthetic */ void f() {
    }

    @XP0
    public static final void a(FA0<Boolean> fa0) {
    }
}
