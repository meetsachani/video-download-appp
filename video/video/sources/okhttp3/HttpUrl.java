package okhttp3;

import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.B22;
import o.C10219vQ1;
import o.C10711xR0;
import o.C10763xf2;
import o.C10997yd1;
import o.C11304zt1;
import o.C2555Bk;
import o.C2832Ef2;
import o.C3167Hn0;
import o.C3599Ly1;
import o.C5075aO1;
import o.C5422bq;
import o.C6562gT0;
import o.C6766hJ1;
import o.C8077mf;
import o.C8222nF;
import o.C8466oF;
import o.C9516sY;
import o.C9545sf2;
import o.CK1;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.UE;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class HttpUrl {
    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @Nullable
    private final String fragment;
    @NotNull
    private final String host;
    private final boolean isHttps;
    @NotNull
    private final String password;
    @NotNull
    private final List<String> pathSegments;
    private final int port;
    @Nullable
    private final List<String> queryNamesAndValues;
    @NotNull
    private final String scheme;
    @NotNull
    private final String url;
    @NotNull
    private final String username;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final char[] HEX_DIGITS = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F'};

    @InterfaceC8303na2({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";
        @Nullable
        private String encodedFragment;
        @NotNull
        private final List<String> encodedPathSegments;
        @Nullable
        private List<String> encodedQueryNamesAndValues;
        @Nullable
        private String host;
        @Nullable
        private String scheme;
        @NotNull
        private String encodedUsername = "";
        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C9516sY c9516sY) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C6562gT0.t(charAt, 97) >= 0 && C6562gT0.t(charAt, 122) <= 0) || (C6562gT0.t(charAt, 65) >= 0 && C6562gT0.t(charAt, 90) <= 0)) {
                    while (true) {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if ('a' > charAt2 || charAt2 >= '{') {
                            if ('A' > charAt2 || charAt2 >= '[') {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                        if (charAt2 == ':') {
                                            return i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            C6562gT0.m(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            if (C6562gT0.g(str, UE.h) || C9545sf2.c2(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String str) {
            if (C6562gT0.g(str, "..") || C9545sf2.c2(str, "%2e.", true) || C9545sf2.c2(str, ".%2e", true) || C9545sf2.c2(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.encodedPathSegments.add("");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, null, 240, null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            C6562gT0.m(list);
            int size = list.size() - 2;
            int c = C6766hJ1.c(size, 0, -2);
            if (c > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                C6562gT0.m(list2);
                if (C6562gT0.g(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    C6562gT0.m(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    C6562gT0.m(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    C6562gT0.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != c) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            boolean z;
            if (i != i2) {
                char charAt = str.charAt(i);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    i++;
                }
                int i3 = i;
                while (i3 < i2) {
                    int delimiterOffset = Util.delimiterOffset(str, "/\\", i3, i2);
                    if (delimiterOffset < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str2 = str;
                    push(str2, i3, delimiterOffset, z, true);
                    if (z) {
                        i3 = delimiterOffset + 1;
                        str = str2;
                    } else {
                        str = str2;
                        i3 = delimiterOffset;
                    }
                }
            }
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String str) {
            C6562gT0.p(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String str) {
            C6562gT0.p(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            String str3;
            C6562gT0.p(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C6562gT0.m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C6562gT0.m(list2);
            if (str2 != null) {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String str) {
            C6562gT0.p(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String str) {
            C6562gT0.p(str, "pathSegments");
            return addPathSegments(str, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String str, @Nullable String str2) {
            String str3;
            C6562gT0.p(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C6562gT0.m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C6562gT0.m(list2);
            if (str2 != null) {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(C8466oF.b0(list, 10));
                    for (String str4 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    String str5 = null;
                    if (list2 != null) {
                        List<String> list3 = list2;
                        ArrayList arrayList3 = new ArrayList(C8466oF.b0(list3, 10));
                        for (String str6 : list3) {
                            if (str6 != null) {
                                str = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str6, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList3.add(str);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.encodedFragment;
                    if (str7 != null) {
                        str5 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str7, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$okhttp$default, percentDecode$okhttp$default2, str3, effectivePort, arrayList2, arrayList, str5, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String str) {
            C6562gT0.p(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String str) {
            C6562gT0.p(str, "encodedPath");
            if (C9545sf2.J2(str, RemoteSettings.i, false, 2, null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String str) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (str != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String str) {
            C6562gT0.p(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, C10997yd1.l2, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String str) {
            C6562gT0.p(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String str) {
            String str2;
            int delimiterOffset;
            char c;
            int i;
            String str3;
            int i2;
            String str4;
            boolean z;
            char c2;
            int i3;
            int i4;
            char c3;
            int i5;
            String str5 = str;
            C6562gT0.p(str5, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str5, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str5, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str5, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str6 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z2 = true;
            char c4 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (C9545sf2.G2(str5, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (C9545sf2.G2(str5, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str5.substring(0, schemeDelimiterOffset);
                    C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str5.length() > 6) {
                    str2 = C2832Ef2.A9(str5, 6) + "...";
                } else {
                    str2 = str5;
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
            }
            int slashCount = companion.slashCount(str5, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c5 = '?';
            char c6 = '#';
            if (slashCount < 2 && httpUrl != null && C6562gT0.g(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str5.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i6 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str5, "@/\\?#", i6, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str5.charAt(delimiterOffset);
                    } else {
                        c = c4;
                    }
                    if (c == c4 || c == c6 || c == '/' || c == '\\' || c == c5) {
                        break;
                    } else if (c == '@') {
                        if (!z3) {
                            int delimiterOffset2 = Util.delimiterOffset(str5, ':', i6, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            str4 = str6;
                            c2 = c4;
                            i2 = indexOfLastNonAsciiWhitespace$default;
                            z = z2;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str5, i6, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z4) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i4 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = z;
                            } else {
                                i4 = delimiterOffset;
                            }
                            str5 = str;
                            i3 = i4;
                            z4 = z;
                        } else {
                            i2 = indexOfLastNonAsciiWhitespace$default;
                            str4 = str6;
                            z = z2;
                            c2 = c4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str5 = str;
                            i3 = delimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, i6, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        }
                        i6 = i3 + 1;
                        c4 = c2;
                        indexOfLastNonAsciiWhitespace$default = i2;
                        str6 = str4;
                        z2 = z;
                        c5 = '?';
                        c6 = '#';
                    }
                }
                i = indexOfLastNonAsciiWhitespace$default;
                String str7 = str6;
                char c7 = c4;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str5, i6, delimiterOffset);
                int i7 = portColonOffset + 1;
                if (i7 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, i6, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str5, i7, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != c7) {
                        str3 = str7;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = str5.substring(i7, delimiterOffset);
                        C6562gT0.o(substring2, str7);
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    str3 = str7;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str5, i6, portColonOffset, false, 4, null));
                    String str8 = this.scheme;
                    C6562gT0.m(str8);
                    this.port = companion4.defaultPort(str8);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = str5.substring(i6, portColonOffset);
                    C6562gT0.o(substring3, str3);
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
            int i8 = i;
            int delimiterOffset3 = Util.delimiterOffset(str5, "?#", indexOfFirstNonAsciiWhitespace$default, i8);
            resolvePath(str5, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i8 && str5.charAt(delimiterOffset3) == '?') {
                c3 = '#';
                int delimiterOffset4 = Util.delimiterOffset(str5, '#', delimiterOffset3, i8);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str5, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i5 = delimiterOffset4;
            } else {
                c3 = '#';
                i5 = delimiterOffset3;
            }
            if (i5 < i8 && str5.charAt(i5) == c3) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, i5 + 1, i8, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String str) {
            C6562gT0.p(str, C3167Hn0.c);
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, C10997yd1.w1, null);
            return this;
        }

        @NotNull
        public final Builder port(int i) {
            if (1 <= i && i < 65536) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        @NotNull
        public final Builder query(@Nullable String str) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (str != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                str = new C10219vQ1("[\"<>^`{|}]").o(str3, "");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, C10997yd1.o1, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String str) {
            C6562gT0.p(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String str) {
            C6562gT0.p(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String str) {
            C6562gT0.p(str, "scheme");
            if (C9545sf2.c2(str, "http", true)) {
                this.scheme = "http";
                return this;
            } else if (C9545sf2.c2(str, "https", true)) {
                this.scheme = "https";
                return this;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i, @NotNull String str) {
            C6562gT0.p(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            C6562gT0.p(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i, @NotNull String str) {
            C6562gT0.p(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, C10997yd1.w1, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String str, @Nullable String str2) {
            C6562gT0.p(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
            if (r1 != r4.defaultPort(r3)) goto L31;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append(C11304zt1.a);
            }
            String str2 = this.host;
            if (str2 != null) {
                C6562gT0.m(str2);
                if (C10763xf2.m3(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = HttpUrl.Companion;
                    C6562gT0.m(str3);
                }
                sb.append(':');
                sb.append(effectivePort);
            }
            Companion companion2 = HttpUrl.Companion;
            companion2.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                C6562gT0.m(list);
                companion2.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        @NotNull
        public final Builder username(@NotNull String str) {
            C6562gT0.p(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, C10997yd1.w1, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            boolean z2;
            Builder builder;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                if (delimiterOffset < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    builder = this;
                } else {
                    z2 = false;
                    builder = this;
                    str2 = str;
                    z3 = z;
                }
                builder.push(str2, i, delimiterOffset, z2, z3);
                i = delimiterOffset + 1;
                if (i > str2.length()) {
                    return builder;
                }
                str = str2;
                z = z3;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 8) != 0) {
                z = false;
            }
            if ((i3 & 16) != 0) {
                z2 = false;
            }
            if ((i3 & 32) != 0) {
                z3 = false;
            }
            if ((i3 & 64) != 0) {
                z4 = false;
            }
            if ((i3 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i, i2, str2, z, z2, z3, z4, charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        private final void writeCanonicalized(C5422bq c5422bq, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int i3 = i;
            C5422bq c5422bq2 = null;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        c5422bq.K1(z ? C2555Bk.p1 : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                            if (!C10763xf2.m3(str2, (char) codePointAt, false, 2, null) && (codePointAt != 37 || (z && (!z2 || isPercentEncoded(str, i3, i2))))) {
                                c5422bq.R0(codePointAt);
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                        if (c5422bq2 == null) {
                            c5422bq2 = new C5422bq();
                        }
                        if (charset != null && !C6562gT0.g(charset, StandardCharsets.UTF_8)) {
                            c5422bq2.N2(str, i3, Character.charCount(codePointAt) + i3, charset);
                        } else {
                            c5422bq2.R0(codePointAt);
                        }
                        while (!c5422bq2.M3()) {
                            byte readByte = c5422bq2.readByte();
                            c5422bq.writeByte(37);
                            c5422bq.writeByte(HttpUrl.HEX_DIGITS[((readByte & 255) >> 4) & 15]);
                            c5422bq.writeByte(HttpUrl.HEX_DIGITS[readByte & C8077mf.q]);
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                i3 += Character.charCount(codePointAt);
            }
        }

        private final void writePercentDecoded(C5422bq c5422bq, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        c5422bq.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    c5422bq.R0(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        c5422bq.writeByte(32);
                        i++;
                    }
                    c5422bq.R0(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        @InterfaceC8046mW0(name = "-deprecated_get")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @NotNull
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m88deprecated_get(@NotNull String str) {
            C6562gT0.p(str, "url");
            return get(str);
        }

        @InterfaceC8046mW0(name = "-deprecated_parse")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m91deprecated_parse(@NotNull String str) {
            C6562gT0.p(str, "url");
            return parse(str);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            C6562gT0.p(str, "<this>");
            C6562gT0.p(str2, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C10763xf2.m3(str2, (char) codePointAt, false, 2, null) && ((codePointAt != 37 || (z && (!z2 || isPercentEncoded(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                    i3 += Character.charCount(codePointAt);
                } else {
                    C5422bq c5422bq = new C5422bq();
                    c5422bq.Z1(str, i, i3);
                    writeCanonicalized(c5422bq, str, i3, i2, str2, z, z2, z3, z4, charset);
                    return c5422bq.Y4();
                }
            }
            String substring = str.substring(i, i2);
            C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        @InterfaceC9511sW0
        public final int defaultPort(@NotNull String str) {
            C6562gT0.p(str, "scheme");
            if (C6562gT0.g(str, "http")) {
                return 80;
            }
            if (C6562gT0.g(str, "https")) {
                return CK1.q;
            }
            return -1;
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @NotNull
        public final HttpUrl get(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "parse")
        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i, int i2, boolean z) {
            C6562gT0.p(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C5422bq c5422bq = new C5422bq();
                    c5422bq.Z1(str, i, i3);
                    writePercentDecoded(c5422bq, str, i3, i2, z);
                    return c5422bq.Y4();
                }
            }
            String substring = str.substring(i, i2);
            C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            C6562gT0.p(list, "<this>");
            C6562gT0.p(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                String str2 = str;
                int I3 = C10763xf2.I3(str2, '&', i, false, 4, null);
                if (I3 == -1) {
                    I3 = str2.length();
                }
                int I32 = C10763xf2.I3(str2, '=', i, false, 4, null);
                if (I32 != -1 && I32 <= I3) {
                    String substring = str2.substring(i, I32);
                    C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str2.substring(I32 + 1, I3);
                    C6562gT0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str2.substring(i, I3);
                    C6562gT0.o(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = I3 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            C6562gT0.p(list, "<this>");
            C6562gT0.p(sb, "out");
            C10711xR0 B1 = C5075aO1.B1(C5075aO1.W1(0, list.size()), 2);
            int j = B1.j();
            int k = B1.k();
            int l = B1.l();
            if ((l <= 0 || j > k) && (l >= 0 || k > j)) {
                return;
            }
            while (true) {
                String str = list.get(j);
                String str2 = list.get(j + 1);
                if (j > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (j != k) {
                    j += l;
                } else {
                    return;
                }
            }
        }

        private Companion() {
        }

        @InterfaceC8046mW0(name = "-deprecated_get")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m90deprecated_get(@NotNull URL url) {
            C6562gT0.p(url, "url");
            return get(url);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            C6562gT0.p(url, "<this>");
            String url2 = url.toString();
            C6562gT0.o(url2, "toString()");
            return parse(url2);
        }

        @InterfaceC8046mW0(name = "-deprecated_get")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m89deprecated_get(@NotNull URI uri) {
            C6562gT0.p(uri, "uri");
            return get(uri);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            C6562gT0.p(uri, "<this>");
            String uri2 = uri.toString();
            C6562gT0.o(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        C6562gT0.p(str, "scheme");
        C6562gT0.p(str2, "username");
        C6562gT0.p(str3, C3167Hn0.c);
        C6562gT0.p(str4, "host");
        C6562gT0.p(list, "pathSegments");
        C6562gT0.p(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = C6562gT0.g(str, "https");
    }

    @InterfaceC9511sW0
    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "parse")
    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedFragment")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedFragment", imports = {}))
    @Nullable
    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m69deprecated_encodedFragment() {
        return encodedFragment();
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedPassword")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedPassword", imports = {}))
    @NotNull
    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m70deprecated_encodedPassword() {
        return encodedPassword();
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedPath")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedPath", imports = {}))
    @NotNull
    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m71deprecated_encodedPath() {
        return encodedPath();
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedPathSegments")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedPathSegments", imports = {}))
    @NotNull
    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m72deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedQuery")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedQuery", imports = {}))
    @Nullable
    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m73deprecated_encodedQuery() {
        return encodedQuery();
    }

    @InterfaceC8046mW0(name = "-deprecated_encodedUsername")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "encodedUsername", imports = {}))
    @NotNull
    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m74deprecated_encodedUsername() {
        return encodedUsername();
    }

    @InterfaceC8046mW0(name = "-deprecated_fragment")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "fragment", imports = {}))
    @Nullable
    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m75deprecated_fragment() {
        return this.fragment;
    }

    @InterfaceC8046mW0(name = "-deprecated_host")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "host", imports = {}))
    @NotNull
    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m76deprecated_host() {
        return this.host;
    }

    @InterfaceC8046mW0(name = "-deprecated_password")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = C3167Hn0.c, imports = {}))
    @NotNull
    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m77deprecated_password() {
        return this.password;
    }

    @InterfaceC8046mW0(name = "-deprecated_pathSegments")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "pathSegments", imports = {}))
    @NotNull
    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m78deprecated_pathSegments() {
        return this.pathSegments;
    }

    @InterfaceC8046mW0(name = "-deprecated_pathSize")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "pathSize", imports = {}))
    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m79deprecated_pathSize() {
        return pathSize();
    }

    @InterfaceC8046mW0(name = "-deprecated_port")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "port", imports = {}))
    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m80deprecated_port() {
        return this.port;
    }

    @InterfaceC8046mW0(name = "-deprecated_query")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = SearchIntents.b, imports = {}))
    @Nullable
    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m81deprecated_query() {
        return query();
    }

    @InterfaceC8046mW0(name = "-deprecated_queryParameterNames")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "queryParameterNames", imports = {}))
    @NotNull
    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m82deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @InterfaceC8046mW0(name = "-deprecated_querySize")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "querySize", imports = {}))
    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m83deprecated_querySize() {
        return querySize();
    }

    @InterfaceC8046mW0(name = "-deprecated_scheme")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "scheme", imports = {}))
    @NotNull
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m84deprecated_scheme() {
        return this.scheme;
    }

    @InterfaceC8046mW0(name = "-deprecated_uri")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to toUri()", replaceWith = @IR1(expression = "toUri()", imports = {}))
    @NotNull
    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m85deprecated_uri() {
        return uri();
    }

    @InterfaceC8046mW0(name = "-deprecated_url")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to toUrl()", replaceWith = @IR1(expression = "toUrl()", imports = {}))
    @NotNull
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m86deprecated_url() {
        return url();
    }

    @InterfaceC8046mW0(name = "-deprecated_username")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "username", imports = {}))
    @NotNull
    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m87deprecated_username() {
        return this.username;
    }

    @InterfaceC8046mW0(name = "encodedFragment")
    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(C10763xf2.I3(this.url, '#', 0, false, 6, null) + 1);
        C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @InterfaceC8046mW0(name = "encodedPassword")
    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int I3 = C10763xf2.I3(this.url, C11304zt1.a, 0, false, 6, null);
        String substring = this.url.substring(C10763xf2.I3(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, I3);
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @InterfaceC8046mW0(name = "encodedPath")
    @NotNull
    public final String encodedPath() {
        int I3 = C10763xf2.I3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String substring = this.url.substring(I3, Util.delimiterOffset(str, "?#", I3, str.length()));
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @InterfaceC8046mW0(name = "encodedPathSegments")
    @NotNull
    public final List<String> encodedPathSegments() {
        int I3 = C10763xf2.I3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", I3, str.length());
        ArrayList arrayList = new ArrayList();
        while (I3 < delimiterOffset) {
            int i = I3 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, delimiterOffset2);
            C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            I3 = delimiterOffset2;
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "encodedQuery")
    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int I3 = C10763xf2.I3(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        String substring = this.url.substring(I3, Util.delimiterOffset(str, '#', I3, str.length()));
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @InterfaceC8046mW0(name = "encodedUsername")
    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof HttpUrl) && C6562gT0.g(((HttpUrl) obj).url, this.url)) {
            return true;
        }
        return false;
    }

    @InterfaceC8046mW0(name = "fragment")
    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @InterfaceC8046mW0(name = "host")
    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @InterfaceC8046mW0(name = C3167Hn0.c)
    @NotNull
    public final String password() {
        return this.password;
    }

    @InterfaceC8046mW0(name = "pathSegments")
    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @InterfaceC8046mW0(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @InterfaceC8046mW0(name = "port")
    public final int port() {
        return this.port;
    }

    @InterfaceC8046mW0(name = SearchIntents.b)
    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String str) {
        C6562gT0.p(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C10711xR0 B1 = C5075aO1.B1(C5075aO1.W1(0, list.size()), 2);
        int j = B1.j();
        int k = B1.k();
        int l = B1.l();
        if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
            while (!C6562gT0.g(str, this.queryNamesAndValues.get(j))) {
                if (j != k) {
                    j += l;
                }
            }
            return this.queryNamesAndValues.get(j + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            C6562gT0.m(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @InterfaceC8046mW0(name = "queryParameterNames")
    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return B22.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10711xR0 B1 = C5075aO1.B1(C5075aO1.W1(0, this.queryNamesAndValues.size()), 2);
        int j = B1.j();
        int k = B1.k();
        int l = B1.l();
        if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
            while (true) {
                String str = this.queryNamesAndValues.get(j);
                C6562gT0.m(str);
                linkedHashSet.add(str);
                if (j == k) {
                    break;
                }
                j += l;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C6562gT0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String str) {
        C6562gT0.p(str, "name");
        if (this.queryNamesAndValues == null) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList();
        C10711xR0 B1 = C5075aO1.B1(C5075aO1.W1(0, this.queryNamesAndValues.size()), 2);
        int j = B1.j();
        int k = B1.k();
        int l = B1.l();
        if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
            while (true) {
                if (C6562gT0.g(str, this.queryNamesAndValues.get(j))) {
                    arrayList.add(this.queryNamesAndValues.get(j + 1));
                }
                if (j == k) {
                    break;
                }
                j += l;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C6562gT0.o(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    @InterfaceC8046mW0(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        C6562gT0.m(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String str) {
        C6562gT0.p(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @InterfaceC8046mW0(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @InterfaceC8046mW0(name = "uri")
    @NotNull
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C10219vQ1("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").o(builder, ""));
                C6562gT0.o(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @InterfaceC8046mW0(name = "url")
    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @InterfaceC8046mW0(name = "username")
    @NotNull
    public final String username() {
        return this.username;
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @Nullable
    public final Builder newBuilder(@NotNull String str) {
        C6562gT0.p(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
