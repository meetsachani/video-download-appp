package o;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class HB {
    @NotNull
    public static final HB a = new HB();
    @InterfaceC7058iW0
    @NotNull
    public static final Charset b;
    @InterfaceC7058iW0
    @NotNull
    public static final Charset c;
    @InterfaceC7058iW0
    @NotNull
    public static final Charset d;
    @InterfaceC7058iW0
    @NotNull
    public static final Charset e;
    @InterfaceC7058iW0
    @NotNull
    public static final Charset f;
    @InterfaceC7058iW0
    @NotNull
    public static final Charset g;
    @Nullable
    public static volatile Charset h;
    @Nullable
    public static volatile Charset i;
    @Nullable
    public static volatile Charset j;

    static {
        Charset forName = Charset.forName("UTF-8");
        C6562gT0.o(forName, "forName(...)");
        b = forName;
        Charset forName2 = Charset.forName(OA.c);
        C6562gT0.o(forName2, "forName(...)");
        c = forName2;
        Charset forName3 = Charset.forName(OA.d);
        C6562gT0.o(forName3, "forName(...)");
        d = forName3;
        Charset forName4 = Charset.forName(OA.e);
        C6562gT0.o(forName4, "forName(...)");
        e = forName4;
        Charset forName5 = Charset.forName(OA.b);
        C6562gT0.o(forName5, "forName(...)");
        f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C6562gT0.o(forName6, "forName(...)");
        g = forName6;
    }

    @InterfaceC8046mW0(name = "UTF32")
    @NotNull
    public final Charset a() {
        Charset charset = h;
        if (charset == null) {
            Charset forName = Charset.forName(ZN2.f1);
            C6562gT0.o(forName, "forName(...)");
            h = forName;
            return forName;
        }
        return charset;
    }

    @InterfaceC8046mW0(name = "UTF32_BE")
    @NotNull
    public final Charset b() {
        Charset charset = j;
        if (charset == null) {
            Charset forName = Charset.forName(ZN2.c1);
            C6562gT0.o(forName, "forName(...)");
            j = forName;
            return forName;
        }
        return charset;
    }

    @InterfaceC8046mW0(name = "UTF32_LE")
    @NotNull
    public final Charset c() {
        Charset charset = i;
        if (charset == null) {
            Charset forName = Charset.forName(ZN2.d1);
            C6562gT0.o(forName, "forName(...)");
            i = forName;
            return forName;
        }
        return charset;
    }
}
