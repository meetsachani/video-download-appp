package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import o.C4317Th1;
import o.C6562gT0;
import o.C8926q81;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Challenge {
    @NotNull
    private final Map<String, String> authParams;
    @NotNull
    private final String scheme;

    public Challenge(@NotNull String str, @NotNull Map<String, String> map) {
        String str2;
        C6562gT0.p(str, "scheme");
        C6562gT0.p(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                C6562gT0.o(locale, "US");
                str2 = key.toLowerCase(locale);
                C6562gT0.o(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6562gT0.o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @InterfaceC8046mW0(name = "-deprecated_authParams")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "authParams", imports = {}))
    @NotNull
    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m40deprecated_authParams() {
        return this.authParams;
    }

    @InterfaceC8046mW0(name = "-deprecated_charset")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = C4317Th1.g, imports = {}))
    @NotNull
    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m41deprecated_charset() {
        return charset();
    }

    @InterfaceC8046mW0(name = "-deprecated_realm")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "realm", imports = {}))
    @Nullable
    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m42deprecated_realm() {
        return realm();
    }

    @InterfaceC8046mW0(name = "-deprecated_scheme")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "scheme", imports = {}))
    @NotNull
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m43deprecated_scheme() {
        return this.scheme;
    }

    @InterfaceC8046mW0(name = "authParams")
    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @InterfaceC8046mW0(name = C4317Th1.g)
    @NotNull
    public final Charset charset() {
        String str = this.authParams.get(C4317Th1.g);
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C6562gT0.o(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C6562gT0.o(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (C6562gT0.g(challenge.scheme, this.scheme) && C6562gT0.g(challenge.authParams, this.authParams)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @InterfaceC8046mW0(name = "realm")
    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @InterfaceC8046mW0(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        Map J0 = C8926q81.J0(this.authParams);
        String name = charset.name();
        C6562gT0.o(name, "charset.name()");
        J0.put(C4317Th1.g, name);
        return new Challenge(this.scheme, J0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Challenge(@NotNull String str, @NotNull String str2) {
        this(str, r3);
        C6562gT0.p(str, "scheme");
        C6562gT0.p(str2, "realm");
        Map singletonMap = Collections.singletonMap("realm", str2);
        C6562gT0.o(singletonMap, "singletonMap(\"realm\", realm)");
    }
}
