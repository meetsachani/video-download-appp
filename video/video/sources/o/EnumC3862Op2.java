package o;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Op2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC3862Op2 implements InterfaceC3959Pp2 {
    public static final EnumC3862Op2 X = new a("DOUBLE", 0);
    public static final EnumC3862Op2 Y = new EnumC3862Op2("LAZILY_PARSED_NUMBER", 1) { // from class: o.Op2.b
        @Override // o.InterfaceC3959Pp2
        public Number e(OV0 ov0) throws IOException {
            return new DY0(ov0.G());
        }
    };
    public static final EnumC3862Op2 Z = new EnumC3862Op2("LONG_OR_DOUBLE", 2) { // from class: o.Op2.c
        @Override // o.InterfaceC3959Pp2
        public Number e(OV0 ov0) throws IOException, KV0 {
            String G = ov0.G();
            if (G.indexOf(46) >= 0) {
                return h(G, ov0);
            }
            try {
                return Long.valueOf(Long.parseLong(G));
            } catch (NumberFormatException unused) {
                return h(G, ov0);
            }
        }

        public final Number h(String str, OV0 ov0) throws IOException {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!ov0.s()) {
                    throw new A71("JSON forbids NaN and infinities: " + valueOf + "; at path " + ov0.p());
                }
                return valueOf;
            } catch (NumberFormatException e) {
                throw new KV0("Cannot parse " + str + "; at path " + ov0.p(), e);
            }
        }
    };
    public static final EnumC3862Op2 Y0 = new EnumC3862Op2("BIG_DECIMAL", 3) { // from class: o.Op2.d
        @Override // o.InterfaceC3959Pp2
        /* renamed from: h */
        public BigDecimal e(OV0 ov0) throws IOException {
            String G = ov0.G();
            try {
                return C3286Is1.b(G);
            } catch (NumberFormatException e) {
                throw new KV0("Cannot parse " + G + "; at path " + ov0.p(), e);
            }
        }
    };
    public static final /* synthetic */ EnumC3862Op2[] Z0 = g();

    /* renamed from: o.Op2$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC3862Op2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.InterfaceC3959Pp2
        /* renamed from: h */
        public Double e(OV0 ov0) throws IOException {
            return Double.valueOf(ov0.x());
        }
    }

    public EnumC3862Op2(String str, int i) {
    }

    public static /* synthetic */ EnumC3862Op2[] g() {
        return new EnumC3862Op2[]{X, Y, Z, Y0};
    }

    public static EnumC3862Op2 valueOf(String str) {
        return (EnumC3862Op2) Enum.valueOf(EnumC3862Op2.class, str);
    }

    public static EnumC3862Op2[] values() {
        return (EnumC3862Op2[]) Z0.clone();
    }

    public /* synthetic */ EnumC3862Op2(String str, int i, a aVar) {
        this(str, i);
    }
}
