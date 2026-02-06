package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import o.C10763xf2;
import o.C4180Rx1;
import o.C6562gT0;
import o.C6670gv2;
import o.C6757hH0;
import o.C6766hJ1;
import o.C8222nF;
import o.C8319ne2;
import o.C9046qe;
import o.C9444sF;
import o.C9516sY;
import o.C9545sf2;
import o.EnumC9879u20;
import o.GW0;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Headers implements Iterable<C4180Rx1<? extends String, ? extends String>>, GW0 {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String[] namesAndValues;

    @InterfaceC8303na2({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String str) {
            C6562gT0.p(str, "line");
            int I3 = C10763xf2.I3(str, ':', 0, false, 6, null);
            if (I3 != -1) {
                String substring = str.substring(0, I3);
                C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = C10763xf2.b6(substring).toString();
                String substring2 = str.substring(I3 + 1);
                C6562gT0.o(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            C6562gT0.p(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str) {
            C6562gT0.p(str, "line");
            int I3 = C10763xf2.I3(str, ':', 1, false, 4, null);
            if (I3 != -1) {
                String substring = str.substring(0, I3);
                C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(I3 + 1);
                C6562gT0.o(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
                return this;
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C6562gT0.o(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
                return this;
            } else {
                addLenient$okhttp("", str);
                return this;
            }
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        @Nullable
        public final String get(@NotNull String str) {
            C6562gT0.p(str, "name");
            int size = this.namesAndValues.size() - 2;
            int c = C6766hJ1.c(size, 0, -2);
            if (c <= size) {
                while (!C9545sf2.c2(str, this.namesAndValues.get(size), true)) {
                    if (size != c) {
                        size -= 2;
                    } else {
                        return null;
                    }
                }
                return this.namesAndValues.get(size + 1);
            }
            return null;
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String str) {
            C6562gT0.p(str, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (C9545sf2.c2(str, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull Date date) {
            C6562gT0.p(str, "name");
            C6562gT0.p(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String str, @NotNull Instant instant) {
            long epochMilli;
            C6562gT0.p(str, "name");
            C6562gT0.p(instant, "value");
            epochMilli = instant.toEpochMilli();
            return set(str, new Date(epochMilli));
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull Date date) {
            C6562gT0.p(str, "name");
            C6562gT0.p(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(C10763xf2.b6(str2).toString());
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String str, @NotNull Instant instant) {
            long epochMilli;
            C6562gT0.p(str, "name");
            C6562gT0.p(instant, "value");
            epochMilli = instant.toEpochMilli();
            add(str, new Date(epochMilli));
            return this;
        }
    }

    @InterfaceC8303na2({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (Util.isSensitiveHeader(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c = C6766hJ1.c(length, 0, -2);
            if (c <= length) {
                while (!C9545sf2.c2(str, strArr[length], true)) {
                    if (length != c) {
                        length -= 2;
                    } else {
                        return null;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        @InterfaceC8046mW0(name = "-deprecated_of")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "function name changed", replaceWith = @IR1(expression = "headersOf(*namesAndValues)", imports = {}))
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m68deprecated_of(@NotNull String... strArr) {
            C6562gT0.p(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "of")
        @NotNull
        public final Headers of(@NotNull String... strArr) {
            C6562gT0.p(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = strArr2[i2];
                    if (str != null) {
                        strArr2[i2] = C10763xf2.b6(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int c = C6766hJ1.c(0, strArr2.length - 1, 2);
                if (c >= 0) {
                    while (true) {
                        String str2 = strArr2[i];
                        String str3 = strArr2[i + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i == c) {
                            break;
                        }
                        i += 2;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        private Companion() {
        }

        @InterfaceC8046mW0(name = "-deprecated_of")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "function moved to extension", replaceWith = @IR1(expression = "headers.toHeaders()", imports = {}))
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m67deprecated_of(@NotNull Map<String, String> map) {
            C6562gT0.p(map, "headers");
            return of(map);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "of")
        @NotNull
        public final Headers of(@NotNull Map<String, String> map) {
            C6562gT0.p(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String obj = C10763xf2.b6(entry.getKey()).toString();
                String obj2 = C10763xf2.b6(entry.getValue()).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, C9516sY c9516sY) {
        this(strArr);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "of")
    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return Companion.of(map);
    }

    @InterfaceC8046mW0(name = "-deprecated_size")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m66deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String get(@NotNull String str) {
        C6562gT0.p(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    @Nullable
    public final Date getDate(@NotNull String str) {
        C6562gT0.p(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String str) {
        C6562gT0.p(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return C6757hH0.a(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C4180Rx1<? extends String, ? extends String>> iterator() {
        int size = size();
        C4180Rx1[] c4180Rx1Arr = new C4180Rx1[size];
        for (int i = 0; i < size; i++) {
            c4180Rx1Arr[i] = C6670gv2.a(name(i), value(i));
        }
        return C9046qe.a(c4180Rx1Arr);
    }

    @NotNull
    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C9545sf2.i2(C8319ne2.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C6562gT0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        C9444sF.s0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @InterfaceC8046mW0(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C9545sf2.i2(C8319ne2.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            C6562gT0.o(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String str) {
        C6562gT0.p(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C9545sf2.c2(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C6562gT0.o(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return C8222nF.H();
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "of")
    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return Companion.of(strArr);
    }
}
