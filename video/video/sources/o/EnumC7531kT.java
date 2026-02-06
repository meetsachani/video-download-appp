package o;

import com.facebook.appevents.C2326p;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.kT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC7531kT {
    EVENT_TIME(FK.b),
    EVENT_NAME(FK.c),
    VALUE_TO_SUM(C2326p.g0),
    CONTENT_IDS(C2326p.R),
    CONTENTS(C2326p.Q),
    CONTENT_TYPE(C2326p.P),
    DESCRIPTION(C2326p.Y),
    LEVEL(C2326p.X),
    MAX_RATING_VALUE(C2326p.U),
    NUM_ITEMS(C2326p.W),
    PAYMENT_INFO_AVAILABLE(C2326p.V),
    REGISTRATION_METHOD(C2326p.O),
    SEARCH_STRING(C2326p.S),
    SUCCESS(C2326p.T),
    ORDER_ID(C2326p.f0),
    AD_TYPE(C2326p.e0),
    CURRENCY(C2326p.N);
    
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public final String X;

    /* renamed from: o.kT$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final EnumC7531kT a(@NotNull String str) {
            EnumC7531kT[] valuesCustom;
            C6562gT0.p(str, "rawValue");
            for (EnumC7531kT enumC7531kT : EnumC7531kT.valuesCustom()) {
                if (C6562gT0.g(enumC7531kT.g(), str)) {
                    return enumC7531kT;
                }
            }
            return null;
        }

        public a() {
        }
    }

    EnumC7531kT(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC7531kT[] valuesCustom() {
        EnumC7531kT[] valuesCustom = values();
        return (EnumC7531kT[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
