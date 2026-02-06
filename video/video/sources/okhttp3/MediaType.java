package okhttp3;

import com.google.firebase.messaging.GmsRpc;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C4317Th1;
import o.C6562gT0;
import o.C6766hJ1;
import o.C9516sY;
import o.C9545sf2;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class MediaType {
    @NotNull
    private static final String QUOTED = "\"([^\"]*)\"";
    @NotNull
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    @NotNull
    private final String mediaType;
    @NotNull
    private final String[] parameterNamesAndValues;
    @NotNull
    private final String subtype;
    @NotNull
    private final String type;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @InterfaceC8303na2({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @InterfaceC8046mW0(name = "-deprecated_get")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @NotNull
        /* renamed from: -deprecated_get */
        public final MediaType m94deprecated_get(@NotNull String str) {
            C6562gT0.p(str, "mediaType");
            return get(str);
        }

        @InterfaceC8046mW0(name = "-deprecated_parse")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @Nullable
        /* renamed from: -deprecated_parse */
        public final MediaType m95deprecated_parse(@NotNull String str) {
            C6562gT0.p(str, "mediaType");
            return parse(str);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @NotNull
        public final MediaType get(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C6562gT0.o(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C6562gT0.o(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C6562gT0.o(group2, "typeSubtype.group(2)");
                C6562gT0.o(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                C6562gT0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C9545sf2.J2(group4, "'", false, 2, null) && C9545sf2.b2(group4, "'", false, 2, null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C6562gT0.o(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "parse")
        @Nullable
        public final MediaType parse(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, C9516sY c9516sY) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @NotNull
    public static final MediaType get(@NotNull String str) {
        return Companion.get(str);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "parse")
    @Nullable
    public static final MediaType parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @InterfaceC8046mW0(name = "-deprecated_subtype")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = GmsRpc.r, imports = {}))
    @NotNull
    /* renamed from: -deprecated_subtype */
    public final String m92deprecated_subtype() {
        return this.subtype;
    }

    @InterfaceC8046mW0(name = "-deprecated_type")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "type", imports = {}))
    @NotNull
    /* renamed from: -deprecated_type */
    public final String m93deprecated_type() {
        return this.type;
    }

    @InterfaceC8289nW0
    @Nullable
    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof MediaType) && C6562gT0.g(((MediaType) obj).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @Nullable
    public final String parameter(@NotNull String str) {
        C6562gT0.p(str, "name");
        int i = 0;
        int c = C6766hJ1.c(0, this.parameterNamesAndValues.length - 1, 2);
        if (c >= 0) {
            while (!C9545sf2.c2(this.parameterNamesAndValues[i], str, true)) {
                if (i != c) {
                    i += 2;
                } else {
                    return null;
                }
            }
            return this.parameterNamesAndValues[i + 1];
        }
        return null;
    }

    @InterfaceC8046mW0(name = GmsRpc.r)
    @NotNull
    public final String subtype() {
        return this.subtype;
    }

    @NotNull
    public String toString() {
        return this.mediaType;
    }

    @InterfaceC8046mW0(name = "type")
    @NotNull
    public final String type() {
        return this.type;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    @InterfaceC8289nW0
    @Nullable
    public final Charset charset(@Nullable Charset charset) {
        String parameter = parameter(C4317Th1.g);
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
