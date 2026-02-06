package o;

import java.util.Arrays;

/* renamed from: o.v3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC10125v3 implements InterfaceC2828Ee2 {

    /* renamed from: o.v3$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC10125v3 {
        public final InterfaceC2828Ee2[] a;

        public a(InterfaceC2828Ee2... interfaceC2828Ee2Arr) {
            this.a = (InterfaceC2828Ee2[]) interfaceC2828Ee2Arr.clone();
        }

        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            InterfaceC2828Ee2[] interfaceC2828Ee2Arr;
            int i4 = 0;
            for (InterfaceC2828Ee2 interfaceC2828Ee2 : this.a) {
                if (interfaceC2828Ee2 != null) {
                    int b = interfaceC2828Ee2.b(cArr, i, i2, i3);
                    if (b == 0) {
                        return 0;
                    }
                    i4 += b;
                    i += b;
                }
            }
            return i4;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC2828Ee2[] interfaceC2828Ee2Arr;
            int i4 = 0;
            for (InterfaceC2828Ee2 interfaceC2828Ee2 : this.a) {
                if (interfaceC2828Ee2 != null) {
                    int c = interfaceC2828Ee2.c(charSequence, i, i2, i3);
                    if (c == 0) {
                        return 0;
                    }
                    i4 += c;
                    i += c;
                }
            }
            return i4;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            InterfaceC2828Ee2[] interfaceC2828Ee2Arr;
            int i = 0;
            for (InterfaceC2828Ee2 interfaceC2828Ee2 : this.a) {
                if (interfaceC2828Ee2 != null) {
                    i += interfaceC2828Ee2.size();
                }
            }
            return i;
        }
    }

    /* renamed from: o.v3$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC10125v3 {
        public final char[] a;
        public final String b;

        public b(char... cArr) {
            this.b = String.valueOf(cArr);
            this.a = (char[]) cArr.clone();
        }

        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            int size = size();
            if (i + size > i3) {
                return 0;
            }
            int i4 = 0;
            while (i4 < size) {
                if (this.a[i4] != cArr[i]) {
                    return 0;
                }
                i4++;
                i++;
            }
            return size;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            int size = size();
            if (i + size > i3) {
                return 0;
            }
            int i4 = 0;
            while (i4 < size) {
                if (this.a[i4] != charSequence.charAt(i)) {
                    return 0;
                }
                i4++;
                i++;
            }
            return size;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            return this.a.length;
        }

        public String toString() {
            return super.toString() + "[\"" + this.b + "\"]";
        }
    }

    /* renamed from: o.v3$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC10125v3 {
        public final char a;

        public c(char c) {
            this.a = c;
        }

        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            if (this.a == cArr[i]) {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            if (this.a == charSequence.charAt(i)) {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + "['" + this.a + "']";
        }
    }

    /* renamed from: o.v3$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC10125v3 {
        public final char[] a;

        public d(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.a = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.a, cArr[i]) >= 0) {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.a, charSequence.charAt(i)) >= 0) {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + Arrays.toString(this.a);
        }
    }

    /* renamed from: o.v3$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC10125v3 {
        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            return 0;
        }
    }

    /* renamed from: o.v3$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC10125v3 {
        public static final int a = 32;

        @Override // o.InterfaceC2828Ee2
        public int b(char[] cArr, int i, int i2, int i3) {
            if (cArr[i] <= ' ') {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int c(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.charAt(i) <= ' ') {
                return 1;
            }
            return 0;
        }

        @Override // o.InterfaceC2828Ee2
        public int size() {
            return 1;
        }
    }
}
