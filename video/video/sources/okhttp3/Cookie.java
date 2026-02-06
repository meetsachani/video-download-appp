package okhttp3;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AI0;
import o.C10219vQ1;
import o.C10763xf2;
import o.C10928yK2;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import o.C9545sf2;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.UE;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Cookie {
    @NotNull
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    @NotNull
    private final String name;
    @NotNull
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    @NotNull
    private final String value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @InterfaceC8303na2({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        @Nullable
        private String name;
        private boolean persistent;
        private boolean secure;
        @Nullable
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        @NotNull
        private String path = RemoteSettings.i;

        @NotNull
        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        @NotNull
        public final Builder domain(@NotNull String str) {
            C6562gT0.p(str, "domain");
            return domain(str, false);
        }

        @NotNull
        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DatesKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String str) {
            C6562gT0.p(str, "domain");
            return domain(str, true);
        }

        @NotNull
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String str) {
            C6562gT0.p(str, "name");
            if (C6562gT0.g(C10763xf2.b6(str).toString(), str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        @NotNull
        public final Builder path(@NotNull String str) {
            C6562gT0.p(str, "path");
            if (C9545sf2.J2(str, RemoteSettings.i, false, 2, null)) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        @NotNull
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String str) {
            C6562gT0.p(str, "value");
            if (C6562gT0.g(C10763xf2.b6(str).toString(), str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            boolean z2;
            while (i < i2) {
                char charAt = str.charAt(i);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (C6562gT0.g(str, str2)) {
                return true;
            }
            if (C9545sf2.b2(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str)) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String str) {
            if (!C9545sf2.b2(str, UE.h, false, 2, null)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(C10763xf2.x4(str, UE.h));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseExpires(String str, int i, int i2) {
            int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (dateCharacterOffset < i2) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i4 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    C6562gT0.o(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C6562gT0.o(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C6562gT0.o(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    C6562gT0.o(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    C6562gT0.o(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C6562gT0.o(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    C6562gT0.o(pattern, "MONTH_PATTERN.pattern()");
                    i6 = C10763xf2.J3(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    C6562gT0.o(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 <= i5 && i5 < 32) {
                        if (i4 >= 0 && i4 < 24) {
                            if (i7 >= 0 && i7 < 60) {
                                if (i8 >= 0 && i8 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new C10219vQ1("-?\\d+").m(str)) {
                    if (C9545sf2.J2(str, "-", false, 2, null)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (C6562gT0.g(encodedPath, str)) {
                return true;
            }
            if (C9545sf2.J2(encodedPath, str, false, 2, null) && (C9545sf2.b2(str, RemoteSettings.i, false, 2, null) || encodedPath.charAt(str.length()) == '/')) {
                return true;
            }
            return false;
        }

        @InterfaceC9511sW0
        @Nullable
        public final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
            C6562gT0.p(httpUrl, "url");
            C6562gT0.p(str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        @Nullable
        public final Cookie parse$okhttp(long j, @NotNull HttpUrl httpUrl, @NotNull String str) {
            long j2;
            long j3;
            String str2;
            C6562gT0.p(httpUrl, "url");
            C6562gT0.p(str, "setCookie");
            int delimiterOffset$default = Util.delimiterOffset$default(str, (char) C10928yK2.l, 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = Util.delimiterOffset$default(str, '=', 0, delimiterOffset$default, 2, (Object) null);
            Cookie cookie = null;
            if (delimiterOffset$default2 == delimiterOffset$default) {
                return null;
            }
            String trimSubstring$default = Util.trimSubstring$default(str, 0, delimiterOffset$default2, 1, null);
            if (trimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(trimSubstring$default) != -1) {
                return null;
            }
            String trimSubstring = Util.trimSubstring(str, delimiterOffset$default2 + 1, delimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(trimSubstring) != -1) {
                return null;
            }
            int i = delimiterOffset$default + 1;
            int length = str.length();
            String str3 = null;
            String str4 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long j4 = -1;
            long j5 = DatesKt.MAX_DATE;
            while (i < length) {
                int delimiterOffset = Util.delimiterOffset(str, (char) C10928yK2.l, i, length);
                int delimiterOffset2 = Util.delimiterOffset(str, '=', i, delimiterOffset);
                String trimSubstring2 = Util.trimSubstring(str, i, delimiterOffset2);
                if (delimiterOffset2 < delimiterOffset) {
                    str2 = Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset);
                } else {
                    str2 = "";
                }
                Cookie cookie2 = cookie;
                if (C9545sf2.c2(trimSubstring2, "expires", true)) {
                    try {
                        j5 = parseExpires(str2, 0, str2.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (C9545sf2.c2(trimSubstring2, "max-age", true)) {
                    j4 = parseMaxAge(str2);
                } else {
                    if (C9545sf2.c2(trimSubstring2, "domain", true)) {
                        str3 = parseDomain(str2);
                        z4 = false;
                    } else if (C9545sf2.c2(trimSubstring2, "path", true)) {
                        str4 = str2;
                    } else if (C9545sf2.c2(trimSubstring2, "secure", true)) {
                        z3 = true;
                    } else if (C9545sf2.c2(trimSubstring2, "httponly", true)) {
                        z = true;
                    }
                    i = delimiterOffset + 1;
                    cookie = cookie2;
                }
                z2 = true;
                i = delimiterOffset + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (j4 == Long.MIN_VALUE) {
                j2 = Long.MIN_VALUE;
            } else if (j4 != -1) {
                if (j4 <= 9223372036854775L) {
                    j3 = j4 * 1000;
                } else {
                    j3 = Long.MAX_VALUE;
                }
                long j6 = j + j3;
                if (j6 >= j && j6 <= DatesKt.MAX_DATE) {
                    j2 = j6;
                } else {
                    j2 = 253402300799999L;
                }
            } else {
                j2 = j5;
            }
            String host = httpUrl.host();
            if (str3 == null) {
                str3 = host;
            } else if (!domainMatch(host, str3)) {
                return cookie3;
            }
            if (host.length() != str3.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str3) == null) {
                return cookie3;
            }
            String str5 = RemoteSettings.i;
            if (str4 == null || !C9545sf2.J2(str4, RemoteSettings.i, false, 2, cookie3)) {
                String encodedPath = httpUrl.encodedPath();
                int X3 = C10763xf2.X3(encodedPath, '/', 0, false, 6, null);
                if (X3 != 0) {
                    str5 = encodedPath.substring(0, X3);
                    C6562gT0.o(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str4 = str5;
            }
            return new Cookie(trimSubstring$default, trimSubstring, j2, str3, str4, z3, z, z2, z4, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
            C6562gT0.p(httpUrl, "url");
            C6562gT0.p(headers, "headers");
            List<String> values = headers.values(AI0.E0);
            int size = values.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                C6562gT0.o(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
                return unmodifiableList;
            }
            return C8222nF.H();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C9516sY c9516sY) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return Companion.parse(httpUrl, str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @InterfaceC8046mW0(name = "-deprecated_domain")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "domain", imports = {}))
    @NotNull
    /* renamed from: -deprecated_domain  reason: not valid java name */
    public final String m48deprecated_domain() {
        return this.domain;
    }

    @InterfaceC8046mW0(name = "-deprecated_expiresAt")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "expiresAt", imports = {}))
    /* renamed from: -deprecated_expiresAt  reason: not valid java name */
    public final long m49deprecated_expiresAt() {
        return this.expiresAt;
    }

    @InterfaceC8046mW0(name = "-deprecated_hostOnly")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "hostOnly", imports = {}))
    /* renamed from: -deprecated_hostOnly  reason: not valid java name */
    public final boolean m50deprecated_hostOnly() {
        return this.hostOnly;
    }

    @InterfaceC8046mW0(name = "-deprecated_httpOnly")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "httpOnly", imports = {}))
    /* renamed from: -deprecated_httpOnly  reason: not valid java name */
    public final boolean m51deprecated_httpOnly() {
        return this.httpOnly;
    }

    @InterfaceC8046mW0(name = "-deprecated_name")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "name", imports = {}))
    @NotNull
    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m52deprecated_name() {
        return this.name;
    }

    @InterfaceC8046mW0(name = "-deprecated_path")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "path", imports = {}))
    @NotNull
    /* renamed from: -deprecated_path  reason: not valid java name */
    public final String m53deprecated_path() {
        return this.path;
    }

    @InterfaceC8046mW0(name = "-deprecated_persistent")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "persistent", imports = {}))
    /* renamed from: -deprecated_persistent  reason: not valid java name */
    public final boolean m54deprecated_persistent() {
        return this.persistent;
    }

    @InterfaceC8046mW0(name = "-deprecated_secure")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "secure", imports = {}))
    /* renamed from: -deprecated_secure  reason: not valid java name */
    public final boolean m55deprecated_secure() {
        return this.secure;
    }

    @InterfaceC8046mW0(name = "-deprecated_value")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "value", imports = {}))
    @NotNull
    /* renamed from: -deprecated_value  reason: not valid java name */
    public final String m56deprecated_value() {
        return this.value;
    }

    @InterfaceC8046mW0(name = "domain")
    @NotNull
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (C6562gT0.g(cookie.name, this.name) && C6562gT0.g(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && C6562gT0.g(cookie.domain, this.domain) && C6562gT0.g(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC8046mW0(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    @InterfaceC8046mW0(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @InterfaceC8046mW0(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull HttpUrl httpUrl) {
        boolean domainMatch;
        C6562gT0.p(httpUrl, "url");
        if (!this.hostOnly) {
            domainMatch = Companion.domainMatch(httpUrl.host(), this.domain);
        } else {
            domainMatch = C6562gT0.g(httpUrl.host(), this.domain);
        }
        if (!domainMatch || !Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (this.secure && !httpUrl.isHttps()) {
            return false;
        }
        return true;
    }

    @InterfaceC8046mW0(name = "name")
    @NotNull
    public final String name() {
        return this.name;
    }

    @InterfaceC8046mW0(name = "path")
    @NotNull
    public final String path() {
        return this.path;
    }

    @InterfaceC8046mW0(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @InterfaceC8046mW0(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(UE.h);
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString()");
        return sb2;
    }

    @InterfaceC8046mW0(name = "value")
    @NotNull
    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }
}
