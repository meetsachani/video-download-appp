package o;

import java.util.HashMap;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* renamed from: o.xe0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10757xe0 {
    public static final AbstractC10514we0 a = new a();

    /* renamed from: o.xe0$a */
    /* loaded from: classes3.dex */
    public class a extends PA {
        @Override // o.PA, o.AbstractC10514we0
        public String b(String str) {
            return (String) C10664xF1.E(str);
        }

        @Override // o.PA
        @MB
        public char[] c(char c) {
            return null;
        }
    }

    /* renamed from: o.xe0$b */
    /* loaded from: classes3.dex */
    public class b extends Wz2 {
        public final /* synthetic */ PA c;

        public b(PA pa) {
            this.c = pa;
        }

        @Override // o.Wz2
        @MB
        public char[] d(int i) {
            int i2;
            int i3;
            if (i < 65536) {
                return this.c.c((char) i);
            }
            char[] cArr = new char[2];
            Character.toChars(i, cArr, 0);
            char[] c = this.c.c(cArr[0]);
            char[] c2 = this.c.c(cArr[1]);
            if (c == null && c2 == null) {
                return null;
            }
            if (c != null) {
                i2 = c.length;
            } else {
                i2 = 1;
            }
            if (c2 != null) {
                i3 = c2.length;
            } else {
                i3 = 1;
            }
            char[] cArr2 = new char[i3 + i2];
            if (c != null) {
                for (int i4 = 0; i4 < c.length; i4++) {
                    cArr2[i4] = c[i4];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (c2 != null) {
                for (int i5 = 0; i5 < c2.length; i5++) {
                    cArr2[i2 + i5] = c2[i5];
                }
                return cArr2;
            }
            cArr2[i2] = cArr[1];
            return cArr2;
        }
    }

    /* renamed from: o.xe0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public final Map<Character, String> a;
        public char b;
        public char c;
        @MB
        public String d;

        /* renamed from: o.xe0$c$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC5131ae {
            @MB
            public final char[] g;

            public a(Map map, char c, char c2) {
                super(map, c, c2);
                char[] cArr;
                if (c.this.d != null) {
                    cArr = c.this.d.toCharArray();
                } else {
                    cArr = null;
                }
                this.g = cArr;
            }

            @Override // o.AbstractC5131ae
            @MB
            public char[] f(char c) {
                return this.g;
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @InterfaceC6181ey
        public c b(char c, String str) {
            C10664xF1.E(str);
            this.a.put(Character.valueOf(c), str);
            return this;
        }

        public AbstractC10514we0 c() {
            return new a(this.a, this.b, this.c);
        }

        @InterfaceC6181ey
        public c d(char c, char c2) {
            this.b = c;
            this.c = c2;
            return this;
        }

        @InterfaceC6181ey
        public c e(String str) {
            this.d = str;
            return this;
        }

        public c() {
            this.a = new HashMap();
            this.b = (char) 0;
            this.c = (char) 65535;
            this.d = null;
        }
    }

    public static Wz2 a(AbstractC10514we0 abstractC10514we0) {
        String str;
        C10664xF1.E(abstractC10514we0);
        if (abstractC10514we0 instanceof Wz2) {
            return (Wz2) abstractC10514we0;
        }
        if (abstractC10514we0 instanceof PA) {
            return g((PA) abstractC10514we0);
        }
        String name = abstractC10514we0.getClass().getName();
        if (name.length() != 0) {
            str = "Cannot create a UnicodeEscaper from: ".concat(name);
        } else {
            str = new String("Cannot create a UnicodeEscaper from: ");
        }
        throw new IllegalArgumentException(str);
    }

    public static c b() {
        return new c(null);
    }

    @MB
    public static String c(PA pa, char c2) {
        return f(pa.c(c2));
    }

    @MB
    public static String d(Wz2 wz2, int i) {
        return f(wz2.d(i));
    }

    public static AbstractC10514we0 e() {
        return a;
    }

    @MB
    public static String f(@MB char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public static Wz2 g(PA pa) {
        return new b(pa);
    }
}
