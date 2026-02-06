package o;

import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import o.HT1;
import o.SQ0;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* renamed from: o.pn2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8842pn2 {
    @NotNull
    public static final C8842pn2 a = new C8842pn2();
    public static final String b = C8842pn2.class.getCanonicalName();
    public static boolean c;

    @InterfaceC9511sW0
    public static final void a() {
        c = true;
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull Class<?> cls, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(cls, "clazz");
        C6562gT0.p(str, "methodName");
        C6562gT0.p(str2, "methodDesc");
        a.b("@UiThread", cls, str, str2);
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull Class<?> cls, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(cls, "clazz");
        C6562gT0.p(str, "methodName");
        C6562gT0.p(str2, "methodDesc");
        a.b("@WorkerThread", cls, str, str2);
    }

    public final void b(String str, Class<?> cls, String str2, String str3) {
        if (!c) {
            return;
        }
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6));
        C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
        Exception exc = new Exception();
        Log.e(b, format, exc);
        SQ0.a aVar = SQ0.a.a;
        SQ0.a.b(exc, SQ0.c.ThreadCheck).g();
    }
}
