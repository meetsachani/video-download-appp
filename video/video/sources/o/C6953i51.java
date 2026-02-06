package o;

/* renamed from: o.i51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6953i51 implements F90<Integer> {
    public final C6710h51 a = new C6710h51();

    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return Integer.valueOf((charSequence.length() + charSequence2.length()) - (this.a.a(charSequence, charSequence2).intValue() * 2));
        }
        throw new IllegalArgumentException("Inputs must not be null");
    }
}
