package o;

import java.util.HashSet;

/* renamed from: o.tU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9748tU0 implements InterfaceC8919q62<Double> {
    @Override // o.InterfaceC8919q62
    /* renamed from: b */
    public Double a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return c(charSequence, charSequence2);
        }
        throw new IllegalArgumentException("Input cannot be null");
    }

    public final Double c(CharSequence charSequence, CharSequence charSequence2) {
        HashSet hashSet;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0 && length2 == 0) {
            return Double.valueOf(1.0d);
        }
        if (length != 0 && length2 != 0) {
            HashSet hashSet2 = new HashSet();
            for (int i = 0; i < length; i++) {
                hashSet2.add(Character.valueOf(charSequence.charAt(i)));
            }
            HashSet hashSet3 = new HashSet();
            for (int i2 = 0; i2 < length2; i2++) {
                hashSet3.add(Character.valueOf(charSequence2.charAt(i2)));
            }
            new HashSet(hashSet2).addAll(hashSet3);
            return Double.valueOf((((hashSet2.size() + hashSet3.size()) - hashSet.size()) * 1.0d) / hashSet.size());
        }
        return Double.valueOf(0.0d);
    }
}
