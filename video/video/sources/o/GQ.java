package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class GQ {
    public static Map<CharSequence, Integer> a(CharSequence[] charSequenceArr) {
        HashMap hashMap = new HashMap();
        for (CharSequence charSequence : charSequenceArr) {
            int i = 1;
            if (hashMap.containsKey(charSequence)) {
                i = 1 + ((Integer) hashMap.get(charSequence)).intValue();
            }
            hashMap.put(charSequence, Integer.valueOf(i));
        }
        return hashMap;
    }
}
