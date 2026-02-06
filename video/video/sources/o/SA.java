package o;

import java.util.Arrays;
import java.util.BitSet;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* loaded from: classes3.dex */
public abstract class SA implements IF1<Character> {
    public static final int X = 65536;

    /* loaded from: classes3.dex */
    public static class A extends SA {
        public final String Y;
        public final char[] Y0;
        public final char[] Z;

        public A(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.Y = str;
            this.Z = cArr;
            this.Y0 = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C10664xF1.d(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C10664xF1.d(z3);
                }
                i = i2;
            }
        }

        @Override // o.SA
        public boolean B(char c) {
            int binarySearch = Arrays.binarySearch(this.Z, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i >= 0 && c <= this.Y0[i]) {
                return true;
            }
            return false;
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return this.Y;
        }
    }

    /* loaded from: classes3.dex */
    public static final class B extends A {
        public static final B Z0 = new B();

        public B() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public static final class C extends v {
        public static final int Y0 = 1682554634;
        public static final String Z = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        public static final int Z0 = Integer.numberOfLeadingZeros(31);
        public static final C a1 = new C();

        public C() {
            super("CharMatcher.whitespace()");
        }

        @Override // o.SA
        public boolean B(char c) {
            if (Z.charAt((Y0 * c) >>> Z0) == c) {
                return true;
            }
            return false;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(Z.charAt(i));
            }
        }
    }

    /* renamed from: o.SA$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C4187a extends x {
        public final /* synthetic */ String Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4187a(SA sa, SA sa2, String str) {
            super(sa2);
            this.Z = str;
        }

        @Override // o.SA.w, o.SA
        public String toString() {
            return this.Z;
        }
    }

    /* renamed from: o.SA$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C4188b extends SA {
        public final SA Y;
        public final SA Z;

        public C4188b(SA sa, SA sa2) {
            this.Y = (SA) C10664xF1.E(sa);
            this.Z = (SA) C10664xF1.E(sa2);
        }

        @Override // o.SA
        public boolean B(char c) {
            if (this.Y.B(c) && this.Z.B(c)) {
                return true;
            }
            return false;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.Y.Q(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.Z.Q(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            String valueOf = String.valueOf(this.Y);
            String valueOf2 = String.valueOf(this.Z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19 + valueOf2.length());
            sb.append("CharMatcher.and(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.SA$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C4189c extends v {
        public static final C4189c Z = new C4189c();

        public C4189c() {
            super("CharMatcher.any()");
        }

        @Override // o.SA
        public int A(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // o.SA
        public boolean B(char c) {
            return true;
        }

        @Override // o.SA
        public boolean C(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return true;
        }

        @Override // o.SA
        public boolean E(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // o.SA.i, o.SA
        public SA F() {
            return SA.G();
        }

        @Override // o.SA
        public SA I(SA sa) {
            C10664xF1.E(sa);
            return this;
        }

        @Override // o.SA
        public String M(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return "";
        }

        @Override // o.SA
        public String N(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        @Override // o.SA
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // o.SA
        public String U(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return "";
        }

        @Override // o.SA
        public SA b(SA sa) {
            return (SA) C10664xF1.E(sa);
        }

        @Override // o.SA
        public String h(CharSequence charSequence, char c) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c);
        }

        @Override // o.SA
        public int i(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // o.SA
        public int n(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return -1;
            }
            return 0;
        }

        @Override // o.SA
        public int o(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C10664xF1.d0(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends SA {
        public final char[] Y;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.Y = charArray;
            Arrays.sort(charArray);
        }

        @Override // o.SA
        public boolean B(char c) {
            if (Arrays.binarySearch(this.Y, c) >= 0) {
                return true;
            }
            return false;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            for (char c : this.Y) {
                bitSet.set(c);
            }
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.Y) {
                sb.append(SA.R(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends v {
        public static final e Z = new e();

        public e() {
            super("CharMatcher.ascii()");
        }

        @Override // o.SA
        public boolean B(char c) {
            if (c <= 127) {
                return true;
            }
            return false;
        }
    }

    @InterfaceC11149zF0
    /* loaded from: classes3.dex */
    public static final class f extends v {
        public final BitSet Z;

        public /* synthetic */ f(BitSet bitSet, String str, C4187a c4187a) {
            this(bitSet, str);
        }

        @Override // o.SA
        public boolean B(char c) {
            return this.Z.get(c);
        }

        @Override // o.SA
        public void Q(BitSet bitSet) {
            bitSet.or(this.Z);
        }

        public f(BitSet bitSet, String str) {
            super(str);
            this.Z = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends SA {
        public static final SA Y = new g();

        @Override // o.SA
        public boolean B(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c != 8199) {
                    if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                        switch (c) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c >= 8192 && c <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends A {
        public static final String Z0 = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";
        public static final h a1 = new h();

        public h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        public static char[] Y() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (Z0.charAt(i) + '\t');
            }
            return cArr;
        }

        public static char[] Z() {
            return Z0.toCharArray();
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends SA {
        public final IF1<? super Character> Y;

        public j(IF1<? super Character> if1) {
            this.Y = (IF1) C10664xF1.E(if1);
        }

        @Override // o.SA
        public boolean B(char c) {
            return this.Y.apply(Character.valueOf(c));
        }

        @Override // o.SA, o.IF1
        /* renamed from: e */
        public boolean apply(Character ch) {
            return this.Y.apply(C10664xF1.E(ch));
        }

        @Override // o.SA
        public String toString() {
            String valueOf = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("CharMatcher.forPredicate(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends i {
        public final char Y;
        public final char Z;

        public k(char c, char c2) {
            boolean z;
            if (c2 >= c) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            this.Y = c;
            this.Z = c2;
        }

        @Override // o.SA
        public boolean B(char c) {
            if (this.Y <= c && c <= this.Z) {
                return true;
            }
            return false;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            bitSet.set(this.Y, this.Z + 1);
        }

        @Override // o.SA
        public String toString() {
            String R = SA.R(this.Y);
            String R2 = SA.R(this.Z);
            StringBuilder sb = new StringBuilder(String.valueOf(R).length() + 27 + String.valueOf(R2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(R);
            sb.append("', '");
            sb.append(R2);
            sb.append("')");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class l extends A {
        public static final String Z0 = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";
        public static final String a1 = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        public static final l b1 = new l();

        public l() {
            super("CharMatcher.invisible()", Z0.toCharArray(), a1.toCharArray());
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends i {
        public final char Y;

        public m(char c) {
            this.Y = c;
        }

        @Override // o.SA
        public boolean B(char c) {
            if (c == this.Y) {
                return true;
            }
            return false;
        }

        @Override // o.SA.i, o.SA
        public SA F() {
            return SA.s(this.Y);
        }

        @Override // o.SA
        public SA I(SA sa) {
            if (sa.B(this.Y)) {
                return sa;
            }
            return super.I(sa);
        }

        @Override // o.SA
        public String N(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.Y, c);
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            bitSet.set(this.Y);
        }

        @Override // o.SA
        public SA b(SA sa) {
            if (sa.B(this.Y)) {
                return this;
            }
            return SA.G();
        }

        @Override // o.SA
        public String toString() {
            String R = SA.R(this.Y);
            StringBuilder sb = new StringBuilder(String.valueOf(R).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(R);
            sb.append("')");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class n extends i {
        public final char Y;
        public final char Z;

        public n(char c, char c2) {
            this.Y = c;
            this.Z = c2;
        }

        @Override // o.SA
        public boolean B(char c) {
            if (c != this.Y && c != this.Z) {
                return false;
            }
            return true;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            bitSet.set(this.Y);
            bitSet.set(this.Z);
        }

        @Override // o.SA
        public String toString() {
            String R = SA.R(this.Y);
            String R2 = SA.R(this.Z);
            StringBuilder sb = new StringBuilder(String.valueOf(R).length() + 21 + String.valueOf(R2).length());
            sb.append("CharMatcher.anyOf(\"");
            sb.append(R);
            sb.append(R2);
            sb.append("\")");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o extends i {
        public final char Y;

        public o(char c) {
            this.Y = c;
        }

        @Override // o.SA
        public boolean B(char c) {
            if (c != this.Y) {
                return true;
            }
            return false;
        }

        @Override // o.SA.i, o.SA
        public SA F() {
            return SA.q(this.Y);
        }

        @Override // o.SA
        public SA I(SA sa) {
            if (sa.B(this.Y)) {
                return SA.c();
            }
            return this;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            bitSet.set(0, this.Y);
            bitSet.set(this.Y + 1, 65536);
        }

        @Override // o.SA
        public SA b(SA sa) {
            if (sa.B(this.Y)) {
                return super.b(sa);
            }
            return sa;
        }

        @Override // o.SA
        public String toString() {
            String R = SA.R(this.Y);
            StringBuilder sb = new StringBuilder(String.valueOf(R).length() + 21);
            sb.append("CharMatcher.isNot('");
            sb.append(R);
            sb.append("')");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class p extends SA {
        public static final p Y = new p();

        @Override // o.SA
        public boolean B(char c) {
            return Character.isDigit(c);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class q extends v {
        public static final q Z = new q();

        public q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // o.SA
        public boolean B(char c) {
            if (c > 31) {
                if (c < 127 || c > 159) {
                    return false;
                }
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class r extends SA {
        public static final r Y = new r();

        @Override // o.SA
        public boolean B(char c) {
            return Character.isLetter(c);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class s extends SA {
        public static final s Y = new s();

        @Override // o.SA
        public boolean B(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class t extends SA {
        public static final t Y = new t();

        @Override // o.SA
        public boolean B(char c) {
            return Character.isLowerCase(c);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends SA {
        public static final u Y = new u();

        @Override // o.SA
        public boolean B(char c) {
            return Character.isUpperCase(c);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class v extends i {
        public final String Y;

        public v(String str) {
            this.Y = (String) C10664xF1.E(str);
        }

        @Override // o.SA
        public final String toString() {
            return this.Y;
        }
    }

    /* loaded from: classes3.dex */
    public static class w extends SA {
        public final SA Y;

        public w(SA sa) {
            this.Y = (SA) C10664xF1.E(sa);
        }

        @Override // o.SA
        public boolean B(char c) {
            return !this.Y.B(c);
        }

        @Override // o.SA
        public boolean C(CharSequence charSequence) {
            return this.Y.E(charSequence);
        }

        @Override // o.SA
        public boolean E(CharSequence charSequence) {
            return this.Y.C(charSequence);
        }

        @Override // o.SA
        public SA F() {
            return this.Y;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.Y.Q(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public int i(CharSequence charSequence) {
            return charSequence.length() - this.Y.i(charSequence);
        }

        @Override // o.SA
        public String toString() {
            String valueOf = String.valueOf(this.Y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append(valueOf);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class y extends v {
        public static final y Z = new y();

        public y() {
            super("CharMatcher.none()");
        }

        @Override // o.SA
        public int A(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return -1;
        }

        @Override // o.SA
        public boolean B(char c) {
            return false;
        }

        @Override // o.SA
        public boolean C(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // o.SA
        public boolean E(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return true;
        }

        @Override // o.SA.i, o.SA
        public SA F() {
            return SA.c();
        }

        @Override // o.SA
        public SA I(SA sa) {
            return (SA) C10664xF1.E(sa);
        }

        @Override // o.SA
        public String M(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // o.SA
        public String N(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // o.SA
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            C10664xF1.E(charSequence2);
            return charSequence.toString();
        }

        @Override // o.SA
        public String U(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // o.SA
        public String V(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // o.SA
        public String W(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // o.SA
        public SA b(SA sa) {
            C10664xF1.E(sa);
            return this;
        }

        @Override // o.SA
        public String h(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // o.SA
        public int i(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return 0;
        }

        @Override // o.SA
        public int n(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            return -1;
        }

        @Override // o.SA
        public int o(CharSequence charSequence, int i) {
            C10664xF1.d0(i, charSequence.length());
            return -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class z extends SA {
        public final SA Y;
        public final SA Z;

        public z(SA sa, SA sa2) {
            this.Y = (SA) C10664xF1.E(sa);
            this.Z = (SA) C10664xF1.E(sa2);
        }

        @Override // o.SA
        public boolean B(char c) {
            if (!this.Y.B(c) && !this.Z.B(c)) {
                return false;
            }
            return true;
        }

        @Override // o.SA
        @InterfaceC11149zF0
        public void Q(BitSet bitSet) {
            this.Y.Q(bitSet);
            this.Z.Q(bitSet);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public String toString() {
            String valueOf = String.valueOf(this.Y);
            String valueOf2 = String.valueOf(this.Z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("CharMatcher.or(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    public static SA G() {
        return y.Z;
    }

    public static SA H(CharSequence charSequence) {
        return d(charSequence).F();
    }

    @InterfaceC11149zF0
    public static SA L(int i2, BitSet bitSet, String str) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (t(i2, bitSet.length())) {
                        return C9423s92.a0(bitSet, str);
                    }
                    return new f(bitSet, str, null);
                }
                char nextSetBit = (char) bitSet.nextSetBit(0);
                return r(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
            }
            return q((char) bitSet.nextSetBit(0));
        }
        return G();
    }

    public static String R(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = C10671xH0.b.charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static SA S() {
        return B.Z0;
    }

    public static SA X() {
        return C.a1;
    }

    public static SA c() {
        return C4189c.Z;
    }

    public static SA d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new d(charSequence);
                }
                return r(charSequence.charAt(0), charSequence.charAt(1));
            }
            return q(charSequence.charAt(0));
        }
        return G();
    }

    public static SA f() {
        return e.Z;
    }

    public static SA g() {
        return g.Y;
    }

    @Deprecated
    public static SA j() {
        return h.a1;
    }

    public static SA l(IF1<? super Character> if1) {
        if (if1 instanceof SA) {
            return (SA) if1;
        }
        return new j(if1);
    }

    public static SA m(char c, char c2) {
        return new k(c, c2);
    }

    @Deprecated
    public static SA p() {
        return l.b1;
    }

    public static SA q(char c) {
        return new m(c);
    }

    public static n r(char c, char c2) {
        return new n(c, c2);
    }

    public static SA s(char c) {
        return new o(c);
    }

    @InterfaceC11149zF0
    public static boolean t(int i2, int i3) {
        if (i2 <= 1023 && i3 > i2 * 64) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static SA u() {
        return p.Y;
    }

    public static SA v() {
        return q.Z;
    }

    @Deprecated
    public static SA w() {
        return r.Y;
    }

    @Deprecated
    public static SA x() {
        return s.Y;
    }

    @Deprecated
    public static SA y() {
        return t.Y;
    }

    @Deprecated
    public static SA z() {
        return u.Y;
    }

    public int A(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (B(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c);

    public boolean C(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence charSequence) {
        return !E(charSequence);
    }

    public boolean E(CharSequence charSequence) {
        if (n(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public SA F() {
        return new w(this);
    }

    public SA I(SA sa) {
        return new z(this, sa);
    }

    public SA J() {
        return C7226jD1.j(this);
    }

    @InterfaceC11149zF0
    public SA K() {
        String str;
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return L(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i2 = 65536 - cardinality;
        String sa = toString();
        if (sa.endsWith(".negate()")) {
            str = sa.substring(0, sa.length() - 9);
        } else if (".negate()".length() != 0) {
            str = sa.concat(".negate()");
        } else {
            str = new String(sa);
        }
        return new C4187a(this, L(i2, bitSet, str), sa);
    }

    public String M(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int n2 = n(charSequence2);
        if (n2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i2 = 1;
        while (true) {
            n2++;
            while (n2 != charArray.length) {
                if (B(charArray[n2])) {
                    break;
                }
                charArray[n2 - i2] = charArray[n2];
                n2++;
            }
            return new String(charArray, 0, n2 - i2);
            i2++;
        }
    }

    public String N(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int n2 = n(charSequence2);
        if (n2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[n2] = c;
        while (true) {
            n2++;
            if (n2 < charArray.length) {
                if (B(charArray[n2])) {
                    charArray[n2] = c;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String O(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return M(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return N(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int n2 = n(charSequence3);
        if (n2 == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) charSequence3, i2, n2);
            sb.append(charSequence2);
            i2 = n2 + 1;
            n2 = o(charSequence3, i2);
        } while (n2 != -1);
        sb.append((CharSequence) charSequence3, i2, length2);
        return sb.toString();
    }

    public String P(CharSequence charSequence) {
        return F().M(charSequence);
    }

    @InterfaceC11149zF0
    public void Q(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (B((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public String T(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && B(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && B(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return h(charSequence, c);
        }
        int i5 = i4 + 1;
        return k(charSequence, i3, i5, c, new StringBuilder(i5 - i3), false);
    }

    public String U(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && B(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && B(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String V(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!B(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public SA b(SA sa) {
        return new C4188b(this, sa);
    }

    @Override // o.IF1
    @Deprecated
    /* renamed from: e */
    public boolean apply(Character ch) {
        return B(ch.charValue());
    }

    public String h(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (B(charAt)) {
                if (charAt == c && (i2 == length - 1 || !B(charSequence.charAt(i2 + 1)))) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c);
                    return k(charSequence, i2 + 1, length, c, sb, true);
                }
            }
            i2++;
            c = c;
        }
        return charSequence.toString();
    }

    public int i(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (B(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public final String k(CharSequence charSequence, int i2, int i3, char c, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            if (B(charAt)) {
                if (!z2) {
                    sb.append(c);
                    z2 = true;
                }
            } else {
                sb.append(charAt);
                z2 = false;
            }
            i2++;
        }
        return sb.toString();
    }

    public int n(CharSequence charSequence) {
        return o(charSequence, 0);
    }

    public int o(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        C10664xF1.d0(i2, length);
        while (i2 < length) {
            if (B(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }

    /* loaded from: classes3.dex */
    public static abstract class i extends SA {
        @Override // o.SA
        public SA F() {
            return new x(this);
        }

        @Override // o.SA, o.IF1
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // o.SA
        public final SA J() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class x extends w {
        public x(SA sa) {
            super(sa);
        }

        @Override // o.SA
        public final SA J() {
            return this;
        }
    }
}
