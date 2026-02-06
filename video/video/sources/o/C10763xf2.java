package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1579:1\n80#1,22:1580\n114#1,5:1602\n131#1,5:1607\n80#1,22:1612\n108#1:1634\n80#1,22:1635\n114#1,5:1657\n125#1:1662\n114#1,5:1663\n131#1,5:1668\n142#1:1673\n131#1,5:1674\n80#1,22:1679\n114#1,5:1701\n131#1,5:1706\n1069#2,2:1711\n12717#3,2:1713\n12717#3,2:1715\n295#4,2:1717\n295#4,2:1719\n1563#4:1722\n1634#4,3:1723\n1563#4:1726\n1634#4,3:1727\n1#5:1721\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1580,22\n125#1:1602,5\n142#1:1607,5\n147#1:1612,22\n152#1:1634\n152#1:1635,22\n157#1:1657,5\n162#1:1662\n162#1:1663,5\n167#1:1668,5\n172#1:1673\n172#1:1674,5\n177#1:1679,22\n188#1:1701,5\n199#1:1706,5\n312#1:1711,2\n971#1:1713,2\n995#1:1715,2\n1034#1:1717,2\n1040#1:1719,2\n1401#1:1722\n1401#1:1723,3\n1426#1:1726\n1426#1:1727,3\n*E\n"})
/* renamed from: o.xf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10763xf2 extends C9545sf2 {

    /* renamed from: o.xf2$a */
    /* loaded from: classes3.dex */
    public static final class a extends RA {
        public int X;
        public final /* synthetic */ CharSequence Y;

        public a(CharSequence charSequence) {
            this.Y = charSequence;
        }

        @Override // o.RA
        public char c() {
            CharSequence charSequence = this.Y;
            int i = this.X;
            this.X = i + 1;
            return charSequence.charAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.length()) {
                return true;
            }
            return false;
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,22:1\n1486#2:23\n*E\n"})
    /* renamed from: o.xf2$b */
    /* loaded from: classes3.dex */
    public static final class b implements B02<String> {
        public final /* synthetic */ CharSequence a;

        public b(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // o.B02
        public Iterator<String> iterator() {
            return new C10361w01(this.a);
        }
    }

    public static final int A3(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @XP0
    public static final String A4(String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        return y4(str, i, i2).toString();
    }

    public static /* synthetic */ boolean A5(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return x5(charSequence, c, z);
    }

    public static final boolean B3(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0 && i <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }

    @XP0
    public static final String B4(String str, C11197zR0 c11197zR0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        return z4(str, c11197zR0).toString();
    }

    public static /* synthetic */ boolean B5(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return y5(charSequence, charSequence2, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <C extends CharSequence & R, R> R C3(C c, FA0<? extends R> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        if (O3(c)) {
            return fa0.invoke();
        }
        return c;
    }

    @NotNull
    public static final CharSequence C4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "suffix");
        if (t3(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static /* synthetic */ boolean C5(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z5(charSequence, charSequence2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <C extends CharSequence & R, R> R D3(C c, FA0<? extends R> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        if (c.length() == 0) {
            return fa0.invoke();
        }
        return c;
    }

    @NotNull
    public static String D4(@NotNull String str, @NotNull CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, "suffix");
        if (t3(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @NotNull
    public static final CharSequence D5(@NotNull CharSequence charSequence, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        return charSequence.subSequence(c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    public static final int E3(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return L3(charSequence, new char[]{c}, i, z);
    }

    @NotNull
    public static final CharSequence E4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, C5445bv2.b0);
        return F4(charSequence, charSequence2, charSequence2);
    }

    @XP0
    @InterfaceC9150r20(message = "Use parameters named startIndex and endIndex.", replaceWith = @IR1(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    public static final CharSequence E5(String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        return str.subSequence(i, i2);
    }

    public static final int F3(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return H3(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    @NotNull
    public static final CharSequence F4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "suffix");
        if (charSequence.length() >= charSequence2.length() + charSequence3.length() && C5(charSequence, charSequence2, false, 2, null) && t3(charSequence, charSequence3, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @XP0
    public static final String F5(CharSequence charSequence, int i, int i2) {
        C6562gT0.p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static final int G3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C10711xR0 k0;
        if (!z2) {
            k0 = new C11197zR0(C5075aO1.u(i, 0), C5075aO1.B(i2, charSequence.length()));
        } else {
            k0 = C5075aO1.k0(C5075aO1.B(i, A3(charSequence)), C5075aO1.u(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int j = k0.j();
            int k = k0.k();
            int l = k0.l();
            if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
                int i3 = j;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z3 = z;
                    if (C9545sf2.s2(str, 0, (String) charSequence, i3, str.length(), z3)) {
                        return i3;
                    }
                    if (i3 != k) {
                        i3 += l;
                        z = z3;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else {
            boolean z4 = z;
            int j2 = k0.j();
            int k2 = k0.k();
            int l2 = k0.l();
            if ((l2 > 0 && j2 <= k2) || (l2 < 0 && k2 <= j2)) {
                int i4 = j2;
                while (true) {
                    boolean z5 = z4;
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    z4 = z5;
                    if (v4(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                        return i4;
                    }
                    if (i4 != k2) {
                        i4 += l2;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }
    }

    @NotNull
    public static String G4(@NotNull String str, @NotNull CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, C5445bv2.b0);
        return H4(str, charSequence, charSequence);
    }

    @NotNull
    public static final String G5(@NotNull CharSequence charSequence, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        return charSequence.subSequence(c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return G3(charSequence, charSequence2, i, i2, z, z2);
    }

    @NotNull
    public static final String H4(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, "prefix");
        C6562gT0.p(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length() && C5(str, charSequence, false, 2, null) && t3(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @NotNull
    public static final String H5(@NotNull String str, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        String substring = str.substring(c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int I3(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return E3(charSequence, c, i, z);
    }

    @XP0
    public static final String I4(CharSequence charSequence, C10219vQ1 c10219vQ1, String str) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        C6562gT0.p(str, "replacement");
        return c10219vQ1.o(charSequence, str);
    }

    public static /* synthetic */ String I5(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        C6562gT0.p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return F3(charSequence, str, i, z);
    }

    @XP0
    public static final String J4(CharSequence charSequence, C10219vQ1 c10219vQ1, HA0<? super P81, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        C6562gT0.p(ha0, "transform");
        return c10219vQ1.p(charSequence, ha0);
    }

    @NotNull
    public static final String J5(@NotNull String str, char c, @NotNull String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "missingDelimiterValue");
        int I3 = I3(str, c, 0, false, 6, null);
        if (I3 == -1) {
            return str2;
        }
        String substring = str.substring(I3 + 1, str.length());
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static final int K3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(collection, "strings");
        C4180Rx1<Integer, String> v3 = v3(charSequence, collection, i, z, false);
        if (v3 != null) {
            return v3.e().intValue();
        }
        return -1;
    }

    @NotNull
    public static final String K4(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "replacement");
        C6562gT0.p(str3, "missingDelimiterValue");
        int I3 = I3(str, c, 0, false, 6, null);
        if (I3 == -1) {
            return str3;
        }
        return d5(str, I3 + 1, str.length(), str2).toString();
    }

    @NotNull
    public static final String K5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "missingDelimiterValue");
        int J3 = J3(str, str2, 0, false, 6, null);
        if (J3 == -1) {
            return str3;
        }
        String substring = str.substring(J3 + str2.length(), str.length());
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static final int L3(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C7330jf.gt(cArr), i);
        }
        int u = C5075aO1.u(i, 0);
        int A3 = A3(charSequence);
        if (u > A3) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(u);
            for (char c : cArr) {
                if (CB.J(c, charAt, z)) {
                    return u;
                }
            }
            if (u != A3) {
                u++;
            } else {
                return -1;
            }
        }
    }

    @NotNull
    public static final String L4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "replacement");
        C6562gT0.p(str4, "missingDelimiterValue");
        int J3 = J3(str, str2, 0, false, 6, null);
        if (J3 == -1) {
            return str4;
        }
        return d5(str, J3 + str2.length(), str.length(), str3).toString();
    }

    public static /* synthetic */ String L5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return J5(str, c, str2);
    }

    public static /* synthetic */ int M3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return K3(charSequence, collection, i, z);
    }

    public static /* synthetic */ String M4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return K4(str, c, str2, str3);
    }

    public static /* synthetic */ String M5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return K5(str, str2, str3);
    }

    public static /* synthetic */ int N3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return L3(charSequence, cArr, i, z);
    }

    public static /* synthetic */ String N4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return L4(str, str2, str3, str4);
    }

    @NotNull
    public static String N5(@NotNull String str, char c, @NotNull String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "missingDelimiterValue");
        int X3 = X3(str, c, 0, false, 6, null);
        if (X3 == -1) {
            return str2;
        }
        String substring = str.substring(X3 + 1, str.length());
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static boolean O3(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!BB.r(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String O4(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "replacement");
        C6562gT0.p(str3, "missingDelimiterValue");
        int X3 = X3(str, c, 0, false, 6, null);
        if (X3 == -1) {
            return str3;
        }
        return d5(str, X3 + 1, str.length(), str2).toString();
    }

    @NotNull
    public static final String O5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "missingDelimiterValue");
        int Y3 = Y3(str, str2, 0, false, 6, null);
        if (Y3 == -1) {
            return str3;
        }
        String substring = str.substring(Y3 + str2.length(), str.length());
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @XP0
    public static final boolean P3(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final String P4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "replacement");
        C6562gT0.p(str4, "missingDelimiterValue");
        int Y3 = Y3(str, str2, 0, false, 6, null);
        if (Y3 == -1) {
            return str4;
        }
        return d5(str, Y3 + str2.length(), str.length(), str3).toString();
    }

    public static /* synthetic */ String P5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return N5(str, c, str2);
    }

    @XP0
    public static final boolean Q3(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return !O3(charSequence);
    }

    public static /* synthetic */ String Q4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return O4(str, c, str2, str3);
    }

    public static /* synthetic */ String Q5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return O5(str, str2, str3);
    }

    @XP0
    public static final boolean R3(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String R4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return P4(str, str2, str3, str4);
    }

    @NotNull
    public static final String R5(@NotNull String str, char c, @NotNull String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "missingDelimiterValue");
        int I3 = I3(str, c, 0, false, 6, null);
        if (I3 == -1) {
            return str2;
        }
        String substring = str.substring(0, I3);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @XP0
    public static final boolean S3(CharSequence charSequence) {
        if (charSequence != null && !O3(charSequence)) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final String S4(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "replacement");
        C6562gT0.p(str3, "missingDelimiterValue");
        int I3 = I3(str, c, 0, false, 6, null);
        if (I3 == -1) {
            return str3;
        }
        return d5(str, 0, I3, str2).toString();
    }

    @NotNull
    public static final String S5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "missingDelimiterValue");
        int J3 = J3(str, str2, 0, false, 6, null);
        if (J3 == -1) {
            return str3;
        }
        String substring = str.substring(0, J3);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @XP0
    public static final boolean T3(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final String T4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "replacement");
        C6562gT0.p(str4, "missingDelimiterValue");
        int J3 = J3(str, str2, 0, false, 6, null);
        if (J3 == -1) {
            return str4;
        }
        return d5(str, 0, J3, str3).toString();
    }

    public static /* synthetic */ String T5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return R5(str, c, str2);
    }

    @NotNull
    public static final RA U3(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    public static /* synthetic */ String U4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return S4(str, c, str2, str3);
    }

    public static /* synthetic */ String U5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return S5(str, str2, str3);
    }

    public static final int V3(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return a4(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ String V4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return T4(str, str2, str3, str4);
    }

    @NotNull
    public static final String V5(@NotNull String str, char c, @NotNull String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "missingDelimiterValue");
        int X3 = X3(str, c, 0, false, 6, null);
        if (X3 == -1) {
            return str2;
        }
        String substring = str.substring(0, X3);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static final int W3(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return G3(charSequence, str, i, 0, z, true);
    }

    @NotNull
    public static final String W4(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "replacement");
        C6562gT0.p(str3, "missingDelimiterValue");
        int X3 = X3(str, c, 0, false, 6, null);
        if (X3 == -1) {
            return str3;
        }
        return d5(str, 0, X3, str2).toString();
    }

    @NotNull
    public static final String W5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "missingDelimiterValue");
        int Y3 = Y3(str, str2, 0, false, 6, null);
        if (Y3 == -1) {
            return str3;
        }
        String substring = str.substring(0, Y3);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int X3(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = A3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return V3(charSequence, c, i, z);
    }

    @NotNull
    public static final String X4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, C5445bv2.b0);
        C6562gT0.p(str3, "replacement");
        C6562gT0.p(str4, "missingDelimiterValue");
        int Y3 = Y3(str, str2, 0, false, 6, null);
        if (Y3 == -1) {
            return str4;
        }
        return d5(str, 0, Y3, str3).toString();
    }

    public static /* synthetic */ String X5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return V5(str, c, str2);
    }

    public static /* synthetic */ int Y3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = A3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return W3(charSequence, str, i, z);
    }

    public static /* synthetic */ String Y4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return W4(str, c, str2, str3);
    }

    public static /* synthetic */ String Y5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return W5(str, str2, str3);
    }

    public static final int Z3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(collection, "strings");
        C4180Rx1<Integer, String> v3 = v3(charSequence, collection, i, z, true);
        if (v3 != null) {
            return v3.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String Z4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return X4(str, str2, str3, str4);
    }

    @InterfaceC6480g82(version = "1.5")
    public static final boolean Z5(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        if (C6562gT0.g(str, "true")) {
            return true;
        }
        if (C6562gT0.g(str, C3855Oo.a)) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int a4(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C7330jf.gt(cArr), i);
        }
        for (int B = C5075aO1.B(i, A3(charSequence)); -1 < B; B--) {
            char charAt = charSequence.charAt(B);
            for (char c : cArr) {
                if (CB.J(c, charAt, z)) {
                    return B;
                }
            }
        }
        return -1;
    }

    @XP0
    public static final String a5(CharSequence charSequence, C10219vQ1 c10219vQ1, String str) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        C6562gT0.p(str, "replacement");
        return c10219vQ1.q(charSequence, str);
    }

    @InterfaceC6480g82(version = "1.5")
    @Nullable
    public static final Boolean a6(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        if (C6562gT0.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (C6562gT0.g(str, C3855Oo.a)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int b4(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = A3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Z3(charSequence, collection, i, z);
    }

    @XP0
    @InterfaceC8046mW0(name = "replaceFirstCharWithChar")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String b5(String str, HA0<? super Character, Character> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "transform");
        if (str.length() > 0) {
            char charValue = ha0.invoke(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            C6562gT0.o(substring, "substring(...)");
            return charValue + substring;
        }
        return str;
    }

    @NotNull
    public static CharSequence b6(@NotNull CharSequence charSequence) {
        int i;
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean r = BB.r(charSequence.charAt(i));
            if (!z) {
                if (!r) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!r) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static /* synthetic */ int c4(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = A3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a4(charSequence, cArr, i, z);
    }

    @XP0
    @InterfaceC8046mW0(name = "replaceFirstCharWithCharSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String c5(String str, HA0<? super Character, ? extends CharSequence> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "transform");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) ha0.invoke(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            C6562gT0.o(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @NotNull
    public static final CharSequence c6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        int i;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean booleanValue = ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final B02<String> d4(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return new b(charSequence);
    }

    @NotNull
    public static final CharSequence d5(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C6562gT0.o(sb, "append(...)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C6562gT0.o(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @NotNull
    public static final CharSequence d6(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        int i;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean w8 = C7330jf.w8(cArr, charSequence.charAt(i));
            if (!z) {
                if (!w8) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!w8) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final List<String> e4(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return C6695h12.G3(d4(charSequence));
    }

    @NotNull
    public static final CharSequence e5(@NotNull CharSequence charSequence, @NotNull C11197zR0 c11197zR0, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        C6562gT0.p(charSequence2, "replacement");
        return d5(charSequence, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1, charSequence2);
    }

    @XP0
    public static final String e6(String str) {
        C6562gT0.p(str, "<this>");
        return b6(str).toString();
    }

    @NotNull
    public static final String f3(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && CB.J(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (B3(charSequence, i2) || B3(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @XP0
    public static final boolean f4(CharSequence charSequence, C10219vQ1 c10219vQ1) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.m(charSequence);
    }

    @XP0
    public static final String f5(String str, int i, int i2, CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, "replacement");
        return d5(str, i, i2, charSequence).toString();
    }

    @NotNull
    public static final String f6(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        int i;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean booleanValue = ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static /* synthetic */ String g3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return f3(charSequence, charSequence2, z);
    }

    @XP0
    public static final String g4(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    @XP0
    public static final String g5(String str, C11197zR0 c11197zR0, CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        C6562gT0.p(charSequence, "replacement");
        return e5(str, c11197zR0, charSequence).toString();
    }

    @NotNull
    public static final String g6(@NotNull String str, @NotNull char... cArr) {
        int i;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean w8 = C7330jf.w8(cArr, str.charAt(i));
            if (!z) {
                if (!w8) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!w8) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    @NotNull
    public static final String h3(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        int length;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        int length2 = charSequence.length();
        int min = Math.min(length2, charSequence2.length());
        int i = 0;
        while (i < min && CB.J(charSequence.charAt((length2 - i) - 1), charSequence2.charAt((length - i) - 1), z)) {
            i++;
        }
        if (B3(charSequence, (length2 - i) - 1) || B3(charSequence2, (length - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length2 - i, length2).toString();
    }

    @NotNull
    public static final CharSequence h4(@NotNull CharSequence charSequence, int i, char c) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
    }

    public static final void h5(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    @NotNull
    public static final CharSequence h6(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!BB.r(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static /* synthetic */ String i3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h3(charSequence, charSequence2, z);
    }

    @NotNull
    public static final String i4(@NotNull String str, int i, char c) {
        C6562gT0.p(str, "<this>");
        return h4(str, i, c).toString();
    }

    @XP0
    public static final List<String> i5(CharSequence charSequence, C10219vQ1 c10219vQ1, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.r(charSequence, i);
    }

    @NotNull
    public static final CharSequence i6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static final boolean j3(@NotNull CharSequence charSequence, char c, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        if (I3(charSequence, c, 0, z, 2, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ CharSequence j4(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return h4(charSequence, i, c);
    }

    @NotNull
    public static final List<String> j5(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "delimiters");
        if (cArr.length == 1) {
            return l5(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C11197zR0> j0 = C6695h12.j0(r4(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C8466oF.b0(j0, 10));
        for (C11197zR0 c11197zR0 : j0) {
            arrayList.add(G5(charSequence, c11197zR0));
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence j6(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!C7330jf.w8(cArr, charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static final boolean k3(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (J3(charSequence, (String) charSequence2, 0, z, 2, null) < 0) {
                return false;
            }
            return true;
        } else if (H3(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static /* synthetic */ String k4(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return i4(str, i, c);
    }

    @NotNull
    public static final List<String> k5(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return l5(charSequence, str, z, i);
            }
        }
        Iterable<C11197zR0> j0 = C6695h12.j0(s4(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C8466oF.b0(j0, 10));
        for (C11197zR0 c11197zR0 : j0) {
            arrayList.add(G5(charSequence, c11197zR0));
        }
        return arrayList;
    }

    @XP0
    public static final String k6(String str) {
        C6562gT0.p(str, "<this>");
        return h6(str).toString();
    }

    @XP0
    public static final boolean l3(CharSequence charSequence, C10219vQ1 c10219vQ1) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.c(charSequence);
    }

    @NotNull
    public static final CharSequence l4(@NotNull CharSequence charSequence, int i, char c) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
    }

    public static final List<String> l5(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        h5(i);
        int i2 = 0;
        int F3 = F3(charSequence, str, 0, z);
        if (F3 != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2) {
                i3 = C5075aO1.B(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, F3).toString());
                i2 = str.length() + F3;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                F3 = F3(charSequence, str, i2, z);
            } while (F3 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return C7979mF.k(charSequence.toString());
    }

    @NotNull
    public static final String l6(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        CharSequence charSequence;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ha0.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ boolean m3(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return j3(charSequence, c, z);
    }

    @NotNull
    public static String m4(@NotNull String str, int i, char c) {
        C6562gT0.p(str, "<this>");
        return l4(str, i, c).toString();
    }

    public static /* synthetic */ List m5(CharSequence charSequence, C10219vQ1 c10219vQ1, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.r(charSequence, i);
    }

    @NotNull
    public static final String m6(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C7330jf.w8(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ boolean n3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k3(charSequence, charSequence2, z);
    }

    public static /* synthetic */ CharSequence n4(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return l4(charSequence, i, c);
    }

    public static /* synthetic */ List n5(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return j5(charSequence, cArr, z, i);
    }

    @NotNull
    public static final CharSequence n6(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!BB.r(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean o3(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C9545sf2.c2((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CB.J(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String o4(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m4(str, i, c);
    }

    public static /* synthetic */ List o5(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return k5(charSequence, strArr, z, i);
    }

    @NotNull
    public static final CharSequence o6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean p3(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C6562gT0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final B02<C11197zR0> p4(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        h5(i2);
        return new C6697h20(charSequence, i, i2, new VA0() { // from class: o.uf2
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                C4180Rx1 t4;
                t4 = C10763xf2.t4(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
                return t4;
            }
        });
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final B02<String> p5(CharSequence charSequence, C10219vQ1 c10219vQ1, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.t(charSequence, i);
    }

    @NotNull
    public static final CharSequence p6(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C7330jf.w8(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean q3(@NotNull CharSequence charSequence, char c, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() > 0 && CB.J(charSequence.charAt(A3(charSequence)), c, z)) {
            return true;
        }
        return false;
    }

    public static final B02<C11197zR0> q4(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        h5(i2);
        final List t = C4788Ye.t(strArr);
        return new C6697h20(charSequence, i, i2, new VA0() { // from class: o.vf2
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                C4180Rx1 u4;
                u4 = C10763xf2.u4(t, z, (CharSequence) obj, ((Integer) obj2).intValue());
                return u4;
            }
        });
    }

    @NotNull
    public static final B02<String> q5(@NotNull final CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(cArr, "delimiters");
        return C6695h12.L1(r4(charSequence, cArr, 0, z, i, 2, null), new HA0() { // from class: o.tf2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String w5;
                w5 = C10763xf2.w5(charSequence, (C11197zR0) obj);
                return w5;
            }
        });
    }

    @XP0
    public static final String q6(String str) {
        C6562gT0.p(str, "<this>");
        return n6(str).toString();
    }

    public static final boolean r3(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C9545sf2.b2((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return v4(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ B02 r4(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return p4(charSequence, cArr, i, z, i2);
    }

    @NotNull
    public static final B02<String> r5(@NotNull final CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(strArr, "delimiters");
        return C6695h12.L1(s4(charSequence, strArr, 0, z, i, 2, null), new HA0() { // from class: o.wf2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String v5;
                v5 = C10763xf2.v5(charSequence, (C11197zR0) obj);
                return v5;
            }
        });
    }

    @NotNull
    public static final String r6(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        CharSequence charSequence;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                    charSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean s3(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return q3(charSequence, c, z);
    }

    public static /* synthetic */ B02 s4(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return q4(charSequence, strArr, i, z, i2);
    }

    public static /* synthetic */ B02 s5(CharSequence charSequence, C10219vQ1 c10219vQ1, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c10219vQ1, "regex");
        return c10219vQ1.t(charSequence, i);
    }

    @NotNull
    public static final String s6(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!C7330jf.w8(cArr, str.charAt(i))) {
                    charSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean t3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return r3(charSequence, charSequence2, z);
    }

    public static final C4180Rx1 t4(char[] cArr, boolean z, CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "$this$DelimitedRangesSequence");
        int L3 = L3(charSequence, cArr, i, z);
        if (L3 < 0) {
            return null;
        }
        return C6670gv2.a(Integer.valueOf(L3), 1);
    }

    public static /* synthetic */ B02 t5(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return q5(charSequence, cArr, z, i);
    }

    @Nullable
    public static final C4180Rx1<Integer, String> u3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(collection, "strings");
        return v3(charSequence, collection, i, z, false);
    }

    public static final C4180Rx1 u4(List list, boolean z, CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "$this$DelimitedRangesSequence");
        C4180Rx1<Integer, String> v3 = v3(charSequence, list, i, z, false);
        if (v3 != null) {
            return C6670gv2.a(v3.e(), Integer.valueOf(v3.f().length()));
        }
        return null;
    }

    public static /* synthetic */ B02 u5(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return r5(charSequence, strArr, z, i);
    }

    public static final C4180Rx1<Integer, String> v3(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        C10711xR0 k0;
        CharSequence charSequence2;
        Object obj;
        boolean z3;
        Object obj2;
        int Y3;
        if (!z && collection.size() == 1) {
            String str = (String) C10662xF.i5(collection);
            if (!z2) {
                Y3 = J3(charSequence, str, i, false, 4, null);
            } else {
                Y3 = Y3(charSequence, str, i, false, 4, null);
            }
            if (Y3 < 0) {
                return null;
            }
            return C6670gv2.a(Integer.valueOf(Y3), str);
        }
        CharSequence charSequence3 = charSequence;
        if (!z2) {
            k0 = new C11197zR0(C5075aO1.u(i, 0), charSequence3.length());
        } else {
            k0 = C5075aO1.k0(C5075aO1.B(i, A3(charSequence3)), 0);
        }
        if (charSequence3 instanceof String) {
            int j = k0.j();
            int k = k0.k();
            int l = k0.l();
            if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
                int i2 = j;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            z3 = z;
                            if (C9545sf2.s2(str2, 0, (String) charSequence3, i2, str2.length(), z3)) {
                                break;
                            }
                            z = z3;
                        } else {
                            z3 = z;
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return C6670gv2.a(Integer.valueOf(i2), str3);
                    }
                    if (i2 == k) {
                        break;
                    }
                    i2 += l;
                    z = z3;
                }
            }
        } else {
            boolean z4 = z;
            int j2 = k0.j();
            int k2 = k0.k();
            int l2 = k0.l();
            if ((l2 > 0 && j2 <= k2) || (l2 < 0 && k2 <= j2)) {
                int i3 = j2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            boolean z5 = z4;
                            charSequence2 = charSequence3;
                            z4 = z5;
                            if (v4(str4, 0, charSequence2, i3, str4.length(), z5)) {
                                break;
                            }
                            charSequence3 = charSequence2;
                        } else {
                            charSequence2 = charSequence3;
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return C6670gv2.a(Integer.valueOf(i3), str5);
                    }
                    if (i3 == k2) {
                        break;
                    }
                    i3 += l2;
                    charSequence3 = charSequence2;
                }
            }
        }
        return null;
    }

    public static final boolean v4(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!CB.J(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String v5(CharSequence charSequence, C11197zR0 c11197zR0) {
        C6562gT0.p(c11197zR0, "it");
        return G5(charSequence, c11197zR0);
    }

    public static /* synthetic */ C4180Rx1 w3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return u3(charSequence, collection, i, z);
    }

    @NotNull
    public static final CharSequence w4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "prefix");
        if (C5(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String w5(CharSequence charSequence, C11197zR0 c11197zR0) {
        C6562gT0.p(c11197zR0, "it");
        return G5(charSequence, c11197zR0);
    }

    @Nullable
    public static final C4180Rx1<Integer, String> x3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(collection, "strings");
        return v3(charSequence, collection, i, z, true);
    }

    @NotNull
    public static String x4(@NotNull String str, @NotNull CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, "prefix");
        if (C5(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final boolean x5(@NotNull CharSequence charSequence, char c, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() <= 0 || !CB.J(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ C4180Rx1 y3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = A3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return x3(charSequence, collection, i, z);
    }

    @NotNull
    public static final CharSequence y4(@NotNull CharSequence charSequence, int i, int i2) {
        C6562gT0.p(charSequence, "<this>");
        if (i2 >= i) {
            if (i2 == i) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            C6562gT0.o(sb, "append(...)");
            sb.append(charSequence, i2, charSequence.length());
            C6562gT0.o(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final boolean y5(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C9545sf2.I2((String) charSequence, (String) charSequence2, i, false, 4, null);
        }
        return v4(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    @NotNull
    public static final C11197zR0 z3(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return new C11197zR0(0, charSequence.length() - 1);
    }

    @NotNull
    public static final CharSequence z4(@NotNull CharSequence charSequence, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        return y4(charSequence, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    public static final boolean z5(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C9545sf2.J2((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return v4(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }
}
