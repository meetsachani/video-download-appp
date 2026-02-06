package o;

import java.util.Iterator;

/* renamed from: o.Kl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3455Kl2 {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException(C5445bv2.b0);
    }
}
