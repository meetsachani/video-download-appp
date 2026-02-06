package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Ex2 implements ON2 {
    public final C5499c90 a = new C5499c90();

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.UPC_A) {
            return this.a.a("0".concat(String.valueOf(str)), EnumC3839Ok.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) throws PN2 {
        return a(str, enumC3839Ok, i, i2, null);
    }
}
