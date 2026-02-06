package o;

/* loaded from: classes4.dex */
public class RF0 implements F90<Integer> {
    @Override // o.F90, o.InterfaceC8919q62
    /* renamed from: b */
    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            if (charSequence.length() == charSequence2.length()) {
                int i = 0;
                for (int i2 = 0; i2 < charSequence.length(); i2++) {
                    if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            }
            throw new IllegalArgumentException("CharSequences must have the same length");
        }
        throw new IllegalArgumentException("CharSequences must not be null");
    }
}
