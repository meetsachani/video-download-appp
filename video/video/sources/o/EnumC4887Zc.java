package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Zc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4887Zc {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    
    @NotNull
    public static final a X = new a(null);

    /* renamed from: o.Zc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final EnumC4887Zc a(@NotNull String str) {
            C6562gT0.p(str, "rawValue");
            if (C6562gT0.g(str, "MOBILE_APP_INSTALL")) {
                return EnumC4887Zc.MOBILE_APP_INSTALL;
            }
            if (C6562gT0.g(str, "CUSTOM_APP_EVENTS")) {
                return EnumC4887Zc.CUSTOM;
            }
            return EnumC4887Zc.OTHER;
        }

        public a() {
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC4887Zc[] valuesCustom() {
        EnumC4887Zc[] valuesCustom = values();
        return (EnumC4887Zc[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
