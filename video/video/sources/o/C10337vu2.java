package o;

import java.util.Deque;
import o.AbstractC6044eO0;

@InterfaceC10420wF0
/* renamed from: o.vu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10337vu2 {
    public static final C7782lV0 a = C7782lV0.p("");

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Deque<CharSequence> deque, CharSequence charSequence, int i, AbstractC6044eO0.b<String, GK1> bVar) {
        int length = charSequence.length();
        char c = 0;
        int i2 = i;
        while (i2 < length && (c = charSequence.charAt(i2)) != '&' && c != '?' && c != '!' && c != ':' && c != ',') {
            i2++;
        }
        deque.push(c(charSequence.subSequence(i, i2)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            String k = a.k(deque);
            if (k.length() > 0) {
                bVar.i(k, GK1.g(c));
            }
        }
        int i3 = i2 + 1;
        if (c != '?' && c != ',') {
            while (i3 < length) {
                i3 += a(deque, charSequence, i3, bVar);
                if (charSequence.charAt(i3) == '?' || charSequence.charAt(i3) == ',') {
                    i3++;
                    break;
                }
                while (i3 < length) {
                }
            }
        }
        deque.pop();
        return i3 - i;
    }

    public static AbstractC6044eO0<String, GK1> b(CharSequence charSequence) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += a(C10445wL1.d(), charSequence, i, b);
        }
        return b.d();
    }

    public static CharSequence c(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
