package o;

/* renamed from: o.uU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9991uU0 implements F90<Double> {
    @Deprecated
    public static final int b = -1;
    public final C10234vU0 a = new C10234vU0();

    @Deprecated
    public static int[] c(CharSequence charSequence, CharSequence charSequence2) {
        return C10234vU0.c(charSequence, charSequence2);
    }

    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return Double.valueOf(1.0d - this.a.a(charSequence, charSequence2).doubleValue());
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }
}
