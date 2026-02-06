package o;

/* renamed from: o.sU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9505sU0 implements F90<Double> {
    public final C9748tU0 a = new C9748tU0();

    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return Double.valueOf(1.0d - this.a.a(charSequence, charSequence2).doubleValue());
        }
        throw new IllegalArgumentException("Input cannot be null");
    }
}
