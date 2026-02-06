package o;

import java.util.HashMap;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* loaded from: classes3.dex */
public final class QA {
    public int b = -1;
    public final Map<Character, String> a = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends PA {
        public final char[][] c;
        public final int d;

        public a(char[][] cArr) {
            this.c = cArr;
            this.d = cArr.length;
        }

        @Override // o.PA, o.AbstractC10514we0
        public String b(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.c;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return d(str, i);
                }
            }
            return str;
        }

        @Override // o.PA
        @MB
        public char[] c(char c) {
            if (c < this.d) {
                return this.c[c];
            }
            return null;
        }
    }

    @InterfaceC6181ey
    public QA a(char c, String str) {
        this.a.put(Character.valueOf(c), (String) C10664xF1.E(str));
        if (c > this.b) {
            this.b = c;
        }
        return this;
    }

    @InterfaceC6181ey
    public QA b(char[] cArr, String str) {
        C10664xF1.E(str);
        for (char c : cArr) {
            a(c, str);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.b + 1];
        for (Map.Entry<Character, String> entry : this.a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public AbstractC10514we0 d() {
        return new a(c());
    }
}
