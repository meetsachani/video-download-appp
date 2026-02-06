package okhttp3.internal.http2;

import o.C6562gT0;
import o.C8859ps;
import o.C9516sY;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Header {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps PSEUDO_PREFIX;
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps RESPONSE_STATUS;
    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps TARGET_AUTHORITY;
    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps TARGET_METHOD;
    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps TARGET_PATH;
    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps TARGET_SCHEME;
    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    @InterfaceC7058iW0
    public final int hpackSize;
    @InterfaceC7058iW0
    @NotNull
    public final C8859ps name;
    @InterfaceC7058iW0
    @NotNull
    public final C8859ps value;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    static {
        C8859ps.a aVar = C8859ps.Y0;
        PSEUDO_PREFIX = aVar.l(":");
        RESPONSE_STATUS = aVar.l(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.l(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.l(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.l(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.l(TARGET_AUTHORITY_UTF8);
    }

    public Header(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2) {
        C6562gT0.p(c8859ps, "name");
        C6562gT0.p(c8859ps2, "value");
        this.name = c8859ps;
        this.value = c8859ps2;
        this.hpackSize = c8859ps.g0() + 32 + c8859ps2.g0();
    }

    public static /* synthetic */ Header copy$default(Header header, C8859ps c8859ps, C8859ps c8859ps2, int i, Object obj) {
        if ((i & 1) != 0) {
            c8859ps = header.name;
        }
        if ((i & 2) != 0) {
            c8859ps2 = header.value;
        }
        return header.copy(c8859ps, c8859ps2);
    }

    @NotNull
    public final C8859ps component1() {
        return this.name;
    }

    @NotNull
    public final C8859ps component2() {
        return this.value;
    }

    @NotNull
    public final Header copy(@NotNull C8859ps c8859ps, @NotNull C8859ps c8859ps2) {
        C6562gT0.p(c8859ps, "name");
        C6562gT0.p(c8859ps2, "value");
        return new Header(c8859ps, c8859ps2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return C6562gT0.g(this.name, header.name) && C6562gT0.g(this.value, header.value);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return this.name.s0() + ": " + this.value.s0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Header(@NotNull String str, @NotNull String str2) {
        this(r0.l(str), r0.l(str2));
        C6562gT0.p(str, "name");
        C6562gT0.p(str2, "value");
        C8859ps.a aVar = C8859ps.Y0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull C8859ps c8859ps, @NotNull String str) {
        this(c8859ps, C8859ps.Y0.l(str));
        C6562gT0.p(c8859ps, "name");
        C6562gT0.p(str, "value");
    }
}
