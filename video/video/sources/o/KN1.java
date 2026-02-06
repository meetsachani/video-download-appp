package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes4.dex */
public final class KN1 {
    public final int a;
    public final int b;
    public final Set<InterfaceC9428sB> c;
    public final InterfaceC4044Qm2 d;
    public final List<Character> e;

    /* loaded from: classes4.dex */
    public static class b implements InterfaceC4836Yq<KN1> {
        public static final int a1 = 1114111;
        public static final int b1 = 0;
        public static final int c1 = 0;
        public int X = 0;
        public int Y = a1;
        public InterfaceC4044Qm2 Y0;
        public Set<InterfaceC9428sB> Z;
        public List<Character> Z0;

        @Override // o.InterfaceC4836Yq
        /* renamed from: a */
        public KN1 build() {
            return new KN1(this.X, this.Y, this.Z, this.Y0, this.Z0);
        }

        public b b(InterfaceC9428sB... interfaceC9428sBArr) {
            if (C4206Se.n1(interfaceC9428sBArr)) {
                this.Z = null;
                return this;
            }
            Set<InterfaceC9428sB> set = this.Z;
            if (set == null) {
                this.Z = new HashSet();
            } else {
                set.clear();
            }
            Collections.addAll(this.Z, interfaceC9428sBArr);
            return this;
        }

        public b c(char... cArr) {
            this.Z0 = new ArrayList();
            for (char c : cArr) {
                this.Z0.add(Character.valueOf(c));
            }
            return this;
        }

        public b d(InterfaceC4044Qm2 interfaceC4044Qm2) {
            this.Y0 = interfaceC4044Qm2;
            return this;
        }

        public b e(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            C11147zE2.B(z, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C11147zE2.A(z2, "Minimum code point %d is negative", i);
            if (i2 <= 1114111) {
                z3 = true;
            }
            C11147zE2.A(z3, "Value %d is larger than Character.MAX_CODE_POINT.", i2);
            this.X = i;
            this.Y = i2;
            return this;
        }

        public b f(char[]... cArr) {
            boolean z;
            this.Z0 = new ArrayList();
            for (char[] cArr2 : cArr) {
                boolean z2 = true;
                if (cArr2.length == 2) {
                    z = true;
                } else {
                    z = false;
                }
                C11147zE2.B(z, "Each pair must contain minimum and maximum code point", new Object[0]);
                char c = cArr2[0];
                char c2 = cArr2[1];
                if (c > c2) {
                    z2 = false;
                }
                C11147zE2.B(z2, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(c), Integer.valueOf(c2));
                for (int i = c; i <= c2; i++) {
                    this.Z0.add(Character.valueOf((char) i));
                }
            }
            return this;
        }
    }

    public String a(int i) {
        boolean z;
        int c;
        if (i == 0) {
            return "";
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        long j = i;
        C11147zE2.A(z, "Length %d is smaller than zero.", j);
        StringBuilder sb = new StringBuilder(i);
        do {
            List<Character> list = this.e;
            if (list != null && !list.isEmpty()) {
                c = d(this.e);
            } else {
                c = c(this.a, this.b);
            }
            int type = Character.getType(c);
            if (type != 0 && type != 18 && type != 19) {
                Set<InterfaceC9428sB> set = this.c;
                if (set != null) {
                    for (InterfaceC9428sB interfaceC9428sB : set) {
                        if (interfaceC9428sB.test(c)) {
                            sb.appendCodePoint(c);
                            j--;
                            break;
                        }
                    }
                } else {
                    sb.appendCodePoint(c);
                    j--;
                    break;
                }
            }
        } while (j != 0);
        return sb.toString();
    }

    public String b(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.A(z, "Minimum length %d is smaller than zero.", i);
        if (i <= i2) {
            z2 = true;
        }
        C11147zE2.B(z2, "Maximum length %d is smaller than minimum length %d.", Integer.valueOf(i2), Integer.valueOf(i));
        return a(c(i, i2));
    }

    public final int c(int i, int i2) {
        InterfaceC4044Qm2 interfaceC4044Qm2 = this.d;
        if (interfaceC4044Qm2 != null) {
            return interfaceC4044Qm2.nextInt((i2 - i) + 1) + i;
        }
        return ThreadLocalRandom.current().nextInt(i, i2 + 1);
    }

    public final int d(List<Character> list) {
        int size = list.size();
        InterfaceC4044Qm2 interfaceC4044Qm2 = this.d;
        if (interfaceC4044Qm2 != null) {
            return String.valueOf(list.get(interfaceC4044Qm2.nextInt(size))).codePointAt(0);
        }
        return String.valueOf(list.get(ThreadLocalRandom.current().nextInt(0, size))).codePointAt(0);
    }

    public KN1(int i, int i2, Set<InterfaceC9428sB> set, InterfaceC4044Qm2 interfaceC4044Qm2, List<Character> list) {
        this.a = i;
        this.b = i2;
        this.c = set;
        this.d = interfaceC4044Qm2;
        this.e = list;
    }
}
