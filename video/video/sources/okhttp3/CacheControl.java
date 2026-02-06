package okhttp3;

import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C10763xf2;
import o.C6562gT0;
import o.C6566gU0;
import o.C9516sY;
import o.C9545sf2;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC7058iW0;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CacheControl {
    @Nullable
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @InterfaceC7058iW0
    @NotNull
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    @InterfaceC7058iW0
    @NotNull
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @InterfaceC8303na2({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @NotNull
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int i, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        @NotNull
        public final Builder maxStale(int i, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        @NotNull
        public final Builder minFresh(int i, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        @NotNull
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C10763xf2.m3(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        @InterfaceC9511sW0
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CacheControl parse(@NotNull Headers headers) {
            String str;
            int i;
            int i2;
            String str2;
            int i3;
            String str3;
            Headers headers2 = headers;
            C6562gT0.p(headers2, "headers");
            int size = headers2.size();
            boolean z = true;
            boolean z2 = true;
            int i4 = 0;
            String str4 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i5 = -1;
            int i6 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i4 < size) {
                String name = headers2.name(i4);
                String value = headers2.value(i4);
                if (C9545sf2.c2(name, "Cache-Control", z)) {
                    if (str4 == null) {
                        str4 = value;
                        i = 0;
                        while (i < value.length()) {
                            int indexOfElement = indexOfElement(value, "=,;", i);
                            String substring = value.substring(i, indexOfElement);
                            boolean z11 = z;
                            C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = C10763xf2.b6(substring).toString();
                            if (indexOfElement != value.length()) {
                                i2 = size;
                                if (value.charAt(indexOfElement) != ',' && value.charAt(indexOfElement) != ';') {
                                    int indexOfNonWhitespace = Util.indexOfNonWhitespace(value, indexOfElement + 1);
                                    if (indexOfNonWhitespace < value.length() && value.charAt(indexOfNonWhitespace) == '\"') {
                                        int i9 = indexOfNonWhitespace + 1;
                                        String str5 = value;
                                        int I3 = C10763xf2.I3(str5, '\"', i9, false, 4, null);
                                        str2 = str5;
                                        String substring2 = str2.substring(i9, I3);
                                        C6562gT0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i3 = I3 + 1;
                                        str3 = substring2;
                                    } else {
                                        str2 = value;
                                        i3 = indexOfElement(str2, ",;", indexOfNonWhitespace);
                                        String substring3 = str2.substring(indexOfNonWhitespace, i3);
                                        C6562gT0.o(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                        str3 = C10763xf2.b6(substring3).toString();
                                    }
                                    if (!C9545sf2.c2(FirebaseInstallationServiceClient.u, obj, z11)) {
                                        i = i3;
                                        z = z11;
                                        z3 = z;
                                    } else if (C9545sf2.c2("no-store", obj, z11)) {
                                        i = i3;
                                        z = z11;
                                        z4 = z;
                                    } else {
                                        if (C9545sf2.c2("max-age", obj, z11)) {
                                            i5 = Util.toNonNegativeInt(str3, -1);
                                        } else if (C9545sf2.c2("s-maxage", obj, z11)) {
                                            i6 = Util.toNonNegativeInt(str3, -1);
                                        } else if (C9545sf2.c2("private", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z5 = z;
                                        } else if (C9545sf2.c2("public", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z6 = z;
                                        } else if (C9545sf2.c2("must-revalidate", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z7 = z;
                                        } else if (C9545sf2.c2("max-stale", obj, z11)) {
                                            i7 = Util.toNonNegativeInt(str3, Integer.MAX_VALUE);
                                        } else if (C9545sf2.c2("min-fresh", obj, z11)) {
                                            i8 = Util.toNonNegativeInt(str3, -1);
                                        } else if (C9545sf2.c2("only-if-cached", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z8 = z;
                                        } else if (C9545sf2.c2("no-transform", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z9 = z;
                                        } else if (C9545sf2.c2("immutable", obj, z11)) {
                                            i = i3;
                                            z = z11;
                                            z10 = z;
                                        }
                                        i = i3;
                                        z = z11;
                                    }
                                    value = str2;
                                    size = i2;
                                }
                            } else {
                                i2 = size;
                            }
                            str2 = value;
                            i3 = indexOfElement + 1;
                            str3 = null;
                            if (!C9545sf2.c2(FirebaseInstallationServiceClient.u, obj, z11)) {
                            }
                            value = str2;
                            size = i2;
                        }
                        i4++;
                        headers2 = headers;
                        z = z;
                        size = size;
                    }
                } else if (!C9545sf2.c2(name, AI0.e, z)) {
                    i4++;
                    headers2 = headers;
                    z = z;
                    size = size;
                }
                z2 = false;
                i = 0;
                while (i < value.length()) {
                }
                i4++;
                headers2 = headers;
                z = z;
                size = size;
            }
            if (!z2) {
                str = null;
            } else {
                str = str4;
            }
            return new CacheControl(z3, z4, i5, i6, z5, z6, z7, i7, i8, z8, z9, z10, str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C9516sY c9516sY) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final CacheControl parse(@NotNull Headers headers) {
        return Companion.parse(headers);
    }

    @InterfaceC8046mW0(name = "-deprecated_immutable")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "immutable", imports = {}))
    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m30deprecated_immutable() {
        return this.immutable;
    }

    @InterfaceC8046mW0(name = "-deprecated_maxAgeSeconds")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "maxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m31deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @InterfaceC8046mW0(name = "-deprecated_maxStaleSeconds")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "maxStaleSeconds", imports = {}))
    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m32deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @InterfaceC8046mW0(name = "-deprecated_minFreshSeconds")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "minFreshSeconds", imports = {}))
    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m33deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @InterfaceC8046mW0(name = "-deprecated_mustRevalidate")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "mustRevalidate", imports = {}))
    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m34deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @InterfaceC8046mW0(name = "-deprecated_noCache")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "noCache", imports = {}))
    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m35deprecated_noCache() {
        return this.noCache;
    }

    @InterfaceC8046mW0(name = "-deprecated_noStore")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "noStore", imports = {}))
    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m36deprecated_noStore() {
        return this.noStore;
    }

    @InterfaceC8046mW0(name = "-deprecated_noTransform")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "noTransform", imports = {}))
    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m37deprecated_noTransform() {
        return this.noTransform;
    }

    @InterfaceC8046mW0(name = "-deprecated_onlyIfCached")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "onlyIfCached", imports = {}))
    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m38deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @InterfaceC8046mW0(name = "-deprecated_sMaxAgeSeconds")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "sMaxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m39deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @InterfaceC8046mW0(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @InterfaceC8046mW0(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @InterfaceC8046mW0(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @InterfaceC8046mW0(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @InterfaceC8046mW0(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @InterfaceC8046mW0(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @InterfaceC8046mW0(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @InterfaceC8046mW0(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @InterfaceC8046mW0(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @InterfaceC8046mW0(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @NotNull
    public String toString() {
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.noCache) {
                sb.append("no-cache, ");
            }
            if (this.noStore) {
                sb.append("no-store, ");
            }
            if (this.maxAgeSeconds != -1) {
                sb.append("max-age=");
                sb.append(this.maxAgeSeconds);
                sb.append(C6566gU0.h);
            }
            if (this.sMaxAgeSeconds != -1) {
                sb.append("s-maxage=");
                sb.append(this.sMaxAgeSeconds);
                sb.append(C6566gU0.h);
            }
            if (this.isPrivate) {
                sb.append("private, ");
            }
            if (this.isPublic) {
                sb.append("public, ");
            }
            if (this.mustRevalidate) {
                sb.append("must-revalidate, ");
            }
            if (this.maxStaleSeconds != -1) {
                sb.append("max-stale=");
                sb.append(this.maxStaleSeconds);
                sb.append(C6566gU0.h);
            }
            if (this.minFreshSeconds != -1) {
                sb.append("min-fresh=");
                sb.append(this.minFreshSeconds);
                sb.append(C6566gU0.h);
            }
            if (this.onlyIfCached) {
                sb.append("only-if-cached, ");
            }
            if (this.noTransform) {
                sb.append("no-transform, ");
            }
            if (this.immutable) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = sb2;
            return sb2;
        }
        return str;
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }
}
