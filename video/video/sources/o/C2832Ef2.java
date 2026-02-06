package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2571:1\n130#1,2:2572\n221#1,5:2574\n507#1,5:2580\n507#1,5:2585\n467#1:2590\n1188#1,2:2591\n468#1,2:2593\n1190#1:2595\n470#1:2596\n467#1:2597\n1188#1,2:2598\n468#1,2:2600\n1190#1:2602\n470#1:2603\n1188#1,3:2604\n497#1,2:2607\n497#1,2:2609\n755#1,4:2611\n724#1,4:2615\n740#1,4:2619\n787#1,4:2623\n887#1,5:2627\n928#1,3:2632\n931#1,3:2642\n946#1,3:2645\n949#1,3:2655\n1046#1,3:2672\n1016#1,4:2675\n1005#1:2679\n1188#1,2:2680\n1190#1:2683\n1006#1:2684\n1188#1,3:2685\n1037#1:2688\n1179#1:2689\n1180#1:2691\n1038#1:2692\n1179#1,2:2693\n1188#1,3:2695\n2069#1,2:2698\n2071#1,6:2701\n2093#1,2:2707\n2095#1,6:2710\n2516#1,6:2716\n2546#1,7:2722\n1#2:2579\n1#2:2682\n1#2:2690\n1#2:2700\n1#2:2709\n384#3,7:2635\n384#3,7:2648\n384#3,7:2658\n384#3,7:2665\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2572,2\n66#1:2574,5\n425#1:2580,5\n434#1:2585,5\n445#1:2590\n445#1:2591,2\n445#1:2593,2\n445#1:2595\n445#1:2596\n456#1:2597\n456#1:2598,2\n456#1:2600,2\n456#1:2602\n456#1:2603\n467#1:2604,3\n479#1:2607,2\n488#1:2609,2\n682#1:2611,4\n697#1:2615,4\n711#1:2619,4\n774#1:2623,4\n847#1:2627,5\n903#1:2632,3\n903#1:2642,3\n916#1:2645,3\n916#1:2655,3\n975#1:2672,3\n985#1:2675,4\n995#1:2679\n995#1:2680,2\n995#1:2683\n995#1:2684\n1005#1:2685,3\n1029#1:2688\n1029#1:2689\n1029#1:2691\n1029#1:2692\n1037#1:2693,2\n1875#1:2695,3\n2163#1:2698,2\n2163#1:2701,6\n2180#1:2707,2\n2180#1:2710,6\n2505#1:2716,6\n2533#1:2722,7\n995#1:2682\n1029#1:2690\n2163#1:2700\n2180#1:2709\n903#1:2635,7\n916#1:2648,7\n930#1:2658,7\n948#1:2665,7\n*E\n"})
/* renamed from: o.Ef2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2832Ef2 extends C11006yf2 {

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,17:1\n2560#2:18\n*E\n"})
    /* renamed from: o.Ef2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterable<Character>, GW0 {
        public final /* synthetic */ CharSequence X;

        public a(CharSequence charSequence) {
            this.X = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return C10763xf2.U3(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,22:1\n2568#2:23\n*E\n"})
    /* renamed from: o.Ef2$b */
    /* loaded from: classes3.dex */
    public static final class b implements B02<Character> {
        public final /* synthetic */ CharSequence a;

        public b(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // o.B02
        public Iterator<Character> iterator() {
            return C10763xf2.U3(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* renamed from: o.Ef2$c */
    /* loaded from: classes3.dex */
    public static final class c<K> implements UE0<Character, K> {
        public final /* synthetic */ CharSequence a;
        public final /* synthetic */ HA0<Character, K> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CharSequence charSequence, HA0<? super Character, ? extends K> ha0) {
            this.a = charSequence;
            this.b = ha0;
        }

        @Override // o.UE0
        public /* bridge */ /* synthetic */ Object a(Character ch) {
            return c(ch.charValue());
        }

        @Override // o.UE0
        public Iterator<Character> b() {
            return C10763xf2.U3(this.a);
        }

        public K c(char c) {
            return this.b.invoke(Character.valueOf(c));
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <R> R A7(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R A8(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(0)));
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    R invoke2 = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static String A9(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, C5075aO1.B(i, str.length()));
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @Nullable
    public static final Character B7(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R B8(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }

    @NotNull
    public static final CharSequence B9(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - C5075aO1.B(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @Nullable
    public static final Character C7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double C8(CharSequence charSequence, HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @NotNull
    public static final String C9(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String substring = str.substring(length - C5075aO1.B(i, length));
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> D7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            C9444sF.q0(arrayList, ha0.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float D8(CharSequence charSequence, HA0<? super Character, Float> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final CharSequence D9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int A3 = C10763xf2.A3(charSequence); -1 < A3; A3--) {
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(A3))).booleanValue()) {
                return charSequence.subSequence(A3 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> E7(CharSequence charSequence, VA0<? super Integer, ? super Character, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R E8(CharSequence charSequence, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            Object obj = (R) ha0.invoke(Character.valueOf(charSequence.charAt(0)));
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final String E9(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int A3 = C10763xf2.A3(str); -1 < A3; A3--) {
            if (!ha0.invoke(Character.valueOf(str.charAt(A3))).booleanValue()) {
                String substring = str.substring(A3 + 1);
                C6562gT0.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C F7(CharSequence charSequence, C c2, VA0<? super Integer, ? super Character, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R F8(CharSequence charSequence, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return (R) obj;
    }

    @NotNull
    public static final CharSequence F9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C G7(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull HA0<? super Character, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            C9444sF.q0(c2, ha0.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c2;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character G8(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (C6562gT0.t(charAt, charAt2) > 0) {
                    charAt = charAt2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final String G9(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(0, i);
                C6562gT0.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    public static final <R> R H7(@NotNull CharSequence charSequence, R r, @NotNull VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r = va0.i(r, Character.valueOf(charSequence.charAt(i)));
        }
        return r;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char H8(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    char charAt2 = charSequence.charAt(i);
                    if (C6562gT0.t(charAt, charAt2) > 0) {
                        charAt = charAt2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C H9(@NotNull CharSequence charSequence, @NotNull C c2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c2.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c2;
    }

    public static final boolean I6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R I7(@NotNull CharSequence charSequence, R r, @NotNull XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r = xa0.P(Integer.valueOf(i2), r, Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
        return r;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character I8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final HashSet<Character> I9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return (HashSet) H9(charSequence, new HashSet(C8683p81.j(C5075aO1.B(charSequence.length(), 128))));
    }

    public static final boolean J6(@NotNull CharSequence charSequence) {
        boolean z;
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final <R> R J7(@NotNull CharSequence charSequence, R r, @NotNull VA0<? super Character, ? super R, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        for (int A3 = C10763xf2.A3(charSequence); A3 >= 0; A3--) {
            r = va0.i(Character.valueOf(charSequence.charAt(A3)), r);
        }
        return r;
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char J8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    char charAt2 = charSequence.charAt(i);
                    if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                        charAt = charAt2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Character> J9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                return K9(charSequence);
            }
            return C7979mF.k(Character.valueOf(charSequence.charAt(0)));
        }
        return C8222nF.H();
    }

    public static final boolean K6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> R K7(@NotNull CharSequence charSequence, R r, @NotNull XA0<? super Integer, ? super Character, ? super R, ? extends R> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int A3 = C10763xf2.A3(charSequence); A3 >= 0; A3--) {
            r = xa0.P(Integer.valueOf(A3), Character.valueOf(charSequence.charAt(A3)), r);
        }
        return r;
    }

    public static final boolean K8(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Character> K9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return (List) H9(charSequence, new ArrayList(charSequence.length()));
    }

    @NotNull
    public static final Iterable<Character> L6(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if ((charSequence instanceof String) && charSequence.length() == 0) {
            return C8222nF.H();
        }
        return new a(charSequence);
    }

    public static final void L7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, C7458kA2> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            ha0.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static final boolean L8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Set<Character> L9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                return (Set) H9(charSequence, new LinkedHashSet(C8683p81.j(C5075aO1.B(charSequence.length(), 128))));
            }
            return A22.f(Character.valueOf(charSequence.charAt(0)));
        }
        return B22.k();
    }

    @NotNull
    public static final B02<Character> M6(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if ((charSequence instanceof String) && charSequence.length() == 0) {
            return U02.l();
        }
        return new b(charSequence);
    }

    public static final void M7(@NotNull CharSequence charSequence, @NotNull VA0<? super Integer, ? super Character, C7458kA2> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "action");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S M8(@NotNull S s, @NotNull HA0<? super Character, C7458kA2> ha0) {
        C6562gT0.p(s, "<this>");
        C6562gT0.p(ha0, "action");
        for (int i = 0; i < s.length(); i++) {
            ha0.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<String> M9(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        return N9(charSequence, i, i2, z, new HA0() { // from class: o.zf2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String Q9;
                Q9 = C2832Ef2.Q9((CharSequence) obj);
                return Q9;
            }
        });
    }

    @NotNull
    public static final <K, V> Map<K, V> N6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    public static final char N7(CharSequence charSequence, int i, HA0<? super Integer, Character> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return ha0.invoke(Integer.valueOf(i)).charValue();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S N8(@NotNull S s, @NotNull VA0<? super Integer, ? super Character, C7458kA2> va0) {
        C6562gT0.p(s, "<this>");
        C6562gT0.p(va0, "action");
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            va0.i(Integer.valueOf(i2), Character.valueOf(s.charAt(i)));
            i++;
            i2++;
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <R> List<R> N9(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull HA0<? super CharSequence, ? extends R> ha0) {
        int i3;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        C8688p92.a(i, i2);
        int length = charSequence.length();
        int i4 = length / i2;
        int i5 = 0;
        if (length % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList(i4 + i3);
        while (i5 >= 0 && i5 < length) {
            int i6 = i5 + i;
            if (i6 < 0 || i6 > length) {
                if (!z) {
                    break;
                }
                i6 = length;
            }
            arrayList.add(ha0.invoke(charSequence.subSequence(i5, i6)));
            i5 += i2;
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, Character> O6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(ha0.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Character O7(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0 && i < charSequence.length()) {
            return Character.valueOf(charSequence.charAt(i));
        }
        return null;
    }

    @NotNull
    public static final C4180Rx1<CharSequence, CharSequence> O8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new C4180Rx1<>(sb, sb2);
    }

    public static /* synthetic */ List O9(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return M9(charSequence, i, i2, z);
    }

    @NotNull
    public static final <K, V> Map<K, V> P6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(ha0.invoke(Character.valueOf(charAt)), ha02.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> P7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            K invoke = ha0.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final C4180Rx1<String, String> P8(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new C4180Rx1<>(sb.toString(), sb2.toString());
    }

    public static /* synthetic */ List P9(CharSequence charSequence, int i, int i2, boolean z, HA0 ha0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return N9(charSequence, i, i2, z, ha0);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M Q6(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(ha0.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> Q7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            K invoke = ha0.invoke(Character.valueOf(charAt));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final char Q8(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return R8(charSequence, AbstractC10696xN1.X);
    }

    public static final String Q9(CharSequence charSequence) {
        C6562gT0.p(charSequence, "it");
        return charSequence.toString();
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M R6(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(ha0.invoke(Character.valueOf(charAt)), ha02.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M R7(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            K invoke = ha0.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final char R8(@NotNull CharSequence charSequence, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(abstractC10696xN1.m(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final B02<String> R9(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        return S9(charSequence, i, i2, z, new HA0() { // from class: o.Af2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String V9;
                V9 = C2832Ef2.V9((CharSequence) obj);
                return V9;
            }
        });
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(invoke.e(), invoke.f());
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M S7(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            K invoke = ha0.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Character S8(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return T8(charSequence, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <R> B02<R> S9(@NotNull final CharSequence charSequence, final int i, int i2, boolean z, @NotNull final HA0<? super CharSequence, ? extends R> ha0) {
        C11197zR0 W1;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        C8688p92.a(i, i2);
        if (z) {
            W1 = C10763xf2.z3(charSequence);
        } else {
            W1 = C5075aO1.W1(0, (charSequence.length() - i) + 1);
        }
        return C6695h12.L1(C10662xF.C1(C5075aO1.B1(W1, i2)), new HA0() { // from class: o.Df2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object W9;
                W9 = C2832Ef2.W9(i, charSequence, ha0, ((Integer) obj).intValue());
                return W9;
            }
        });
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> T6(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends V> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C5075aO1.B(charSequence.length(), 128)), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(charAt), ha0.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K> UE0<Character, K> T7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "keySelector");
        return new c(charSequence, ha0);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character T8(@NotNull CharSequence charSequence, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(abstractC10696xN1.m(charSequence.length())));
    }

    public static /* synthetic */ B02 T9(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return R9(charSequence, i, i2, z);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M U6(@NotNull CharSequence charSequence, @NotNull M m, @NotNull HA0<? super Character, ? extends V> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(Character.valueOf(charAt), ha0.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    public static final int U7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (ha0.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final char U8(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    charAt = va0.i(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static /* synthetic */ B02 U9(CharSequence charSequence, int i, int i2, boolean z, HA0 ha0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return S9(charSequence, i, i2, z, ha0);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<String> V6(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        return M9(charSequence, i, i, true);
    }

    public static final int V7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (ha0.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final char V8(@NotNull CharSequence charSequence, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    charAt = xa0.P(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final String V9(CharSequence charSequence) {
        C6562gT0.p(charSequence, "it");
        return charSequence.toString();
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <R> List<R> W6(@NotNull CharSequence charSequence, int i, @NotNull HA0<? super CharSequence, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        return N9(charSequence, i, i, true, ha0);
    }

    public static char W7(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(C10763xf2.A3(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character W8(@NotNull CharSequence charSequence, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                charAt = xa0.P(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final Object W9(int i, CharSequence charSequence, HA0 ha0, int i2) {
        int i3 = i + i2;
        if (i3 < 0 || i3 > charSequence.length()) {
            i3 = charSequence.length();
        }
        return ha0.invoke(charSequence.subSequence(i2, i3));
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final B02<String> X6(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        return Y6(charSequence, i, new HA0() { // from class: o.Bf2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String Z6;
                Z6 = C2832Ef2.Z6((CharSequence) obj);
                return Z6;
            }
        });
    }

    public static final char X7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = charSequence.charAt(length);
                if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                    return charAt;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character X8(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                charAt = va0.i(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final Iterable<C9485sP0<Character>> X9(@NotNull final CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return new C9728tP0(new FA0() { // from class: o.Cf2
            @Override // o.FA0
            public final Object invoke() {
                Iterator Y9;
                Y9 = C2832Ef2.Y9(charSequence);
                return Y9;
            }
        });
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <R> B02<R> Y6(@NotNull CharSequence charSequence, int i, @NotNull HA0<? super CharSequence, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        return S9(charSequence, i, i, true, ha0);
    }

    @Nullable
    public static final Character Y7(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char Y8(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        int A3 = C10763xf2.A3(charSequence);
        if (A3 >= 0) {
            char charAt = charSequence.charAt(A3);
            for (int i = A3 - 1; i >= 0; i--) {
                charAt = va0.i(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final Iterator Y9(CharSequence charSequence) {
        return C10763xf2.U3(charSequence);
    }

    public static final String Z6(CharSequence charSequence) {
        C6562gT0.p(charSequence, "it");
        return charSequence.toString();
    }

    @Nullable
    public static final Character Z7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char charAt = charSequence.charAt(length);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i >= 0) {
                length = i;
            } else {
                return null;
            }
        }
    }

    public static final char Z8(@NotNull CharSequence charSequence, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        int A3 = C10763xf2.A3(charSequence);
        if (A3 >= 0) {
            char charAt = charSequence.charAt(A3);
            for (int i = A3 - 1; i >= 0; i--) {
                charAt = xa0.P(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @NotNull
    public static final List<C4180Rx1<Character, Character>> Z9(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C6670gv2.a(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @XP0
    public static final int a7(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final <R> List<R> a8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(ha0.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character a9(@NotNull CharSequence charSequence, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        int A3 = C10763xf2.A3(charSequence);
        if (A3 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(A3);
        for (int i = A3 - 1; i >= 0; i--) {
            charAt = xa0.P(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final <V> List<V> aa(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull VA0<? super Character, ? super Character, ? extends V> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(va0.i(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    public static final int b7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (ha0.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @NotNull
    public static final <R> List<R> b8(@NotNull CharSequence charSequence, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            arrayList.add(va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character b9(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        int A3 = C10763xf2.A3(charSequence);
        if (A3 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(A3);
        for (int i = A3 - 1; i >= 0; i--) {
            charAt = va0.i(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final List<C4180Rx1<Character, Character>> ba(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            i++;
            arrayList.add(C6670gv2.a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence c7(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(C5075aO1.B(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> c8(@NotNull CharSequence charSequence, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R i4 = va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (i4 != null) {
                arrayList.add(i4);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence c9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <R> List<R> ca(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            i++;
            arrayList.add(va0.i(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    public static String d7(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C5075aO1.B(i, str.length()));
            C6562gT0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C d8(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            R i4 = va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (i4 != null) {
                c2.add(i4);
            }
            i++;
            i2 = i3;
        }
        return c2;
    }

    @XP0
    public static final String d9(String str) {
        C6562gT0.p(str, "<this>");
        return c9(str).toString();
    }

    @NotNull
    public static final CharSequence e7(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            return z9(charSequence, C5075aO1.u(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C e8(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            c2.add(va0.i(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c2;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <R> List<R> e9(@NotNull CharSequence charSequence, R r, @NotNull VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        if (charSequence.length() == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = va0.i(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static String f7(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        if (i >= 0) {
            return A9(str, C5075aO1.u(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> f8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <R> List<R> f9(@NotNull CharSequence charSequence, R r, @NotNull XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        if (charSequence.length() == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = xa0.P(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence g7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int A3 = C10763xf2.A3(charSequence); -1 < A3; A3--) {
            if (!ha0.invoke(Character.valueOf(charSequence.charAt(A3))).booleanValue()) {
                return charSequence.subSequence(0, A3 + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C g8(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c2.add(invoke);
            }
        }
        return c2;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final List<Character> g9(@NotNull CharSequence charSequence, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        if (charSequence.length() == 0) {
            return C8222nF.H();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character i2 = va0.i(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i)));
            char charValue = i2.charValue();
            arrayList.add(i2);
            i++;
            charAt = charValue;
        }
        return arrayList;
    }

    @NotNull
    public static final String h7(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int A3 = C10763xf2.A3(str); -1 < A3; A3--) {
            if (!ha0.invoke(Character.valueOf(str.charAt(A3))).booleanValue()) {
                String substring = str.substring(0, A3 + 1);
                C6562gT0.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C h8(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            c2.add(ha0.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c2;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final List<Character> h9(@NotNull CharSequence charSequence, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        if (charSequence.length() == 0) {
            return C8222nF.H();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        int i = 1;
        while (i < length) {
            Character P = xa0.P(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i)));
            char charValue = P.charValue();
            arrayList.add(P);
            i++;
            charAt = charValue;
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence i7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
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

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character i8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        if (A3 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = ha0.invoke(Character.valueOf(charAt));
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                R invoke2 = ha0.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <R> List<R> i9(@NotNull CharSequence charSequence, R r, @NotNull VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "operation");
        if (charSequence.length() == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        for (int i = 0; i < charSequence.length(); i++) {
            r = va0.i(r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final String j7(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(i);
                C6562gT0.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> char j8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            if (A3 != 0) {
                R invoke = ha0.invoke(Character.valueOf(charAt));
                int i = 1;
                if (1 <= A3) {
                    while (true) {
                        char charAt2 = charSequence.charAt(i);
                        R invoke2 = ha0.invoke(Character.valueOf(charAt2));
                        if (invoke.compareTo(invoke2) < 0) {
                            charAt = charAt2;
                            invoke = invoke2;
                        }
                        if (i == A3) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <R> List<R> j9(@NotNull CharSequence charSequence, R r, @NotNull XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(xa0, "operation");
        if (charSequence.length() == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            r = xa0.P(Integer.valueOf(i), r, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(r);
        }
        return arrayList;
    }

    @XP0
    public static final char k7(CharSequence charSequence, int i, HA0<? super Integer, Character> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return ha0.invoke(Integer.valueOf(i)).charValue();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double k8(CharSequence charSequence, HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            double doubleValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final char k9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @XP0
    public static final Character l7(CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        return O7(charSequence, i);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float l8(CharSequence charSequence, HA0<? super Character, Float> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            float floatValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final char l9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (!z) {
                    ch = Character.valueOf(charAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final CharSequence m7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R m8(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(0)));
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    R invoke2 = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public static final Character m9(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final String n7(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R n8(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }

    @Nullable
    public static final Character n9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return ch;
    }

    @NotNull
    public static final CharSequence o7(@NotNull CharSequence charSequence, @NotNull VA0<? super Integer, ? super Character, Boolean> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(va0, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (va0.i(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double o8(CharSequence charSequence, HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @NotNull
    public static final CharSequence o9(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(b0);
        for (Integer num : iterable) {
            sb.append(charSequence.charAt(num.intValue()));
        }
        return sb;
    }

    @NotNull
    public static final String p7(@NotNull String str, @NotNull VA0<? super Integer, ? super Character, Boolean> va0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(va0, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (va0.i(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return sb.toString();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float p8(CharSequence charSequence, HA0<? super Character, Float> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final CharSequence p9(@NotNull CharSequence charSequence, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return "";
        }
        return C10763xf2.D5(charSequence, c11197zR0);
    }

    @NotNull
    public static final <C extends Appendable> C q7(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull VA0<? super Integer, ? super Character, Boolean> va0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (va0.i(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                c2.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R q8(CharSequence charSequence, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            Object obj = (R) ha0.invoke(Character.valueOf(charSequence.charAt(0)));
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @XP0
    public static final String q9(String str, Iterable<Integer> iterable) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(iterable, "indices");
        return o9(str, iterable).toString();
    }

    @NotNull
    public static final CharSequence r7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R r8(CharSequence charSequence, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                R invoke = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return (R) obj;
    }

    @NotNull
    public static final String r9(@NotNull String str, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return "";
        }
        return C10763xf2.H5(str, c11197zR0);
    }

    @NotNull
    public static final String s7(@NotNull String str, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character s8(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (C6562gT0.t(charAt, charAt2) < 0) {
                    charAt = charAt2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int s9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Integer> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += ha0.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    @NotNull
    public static final <C extends Appendable> C t7(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                c2.append(charAt);
            }
        }
        return c2;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char t8(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    char charAt2 = charSequence.charAt(i);
                    if (C6562gT0.t(charAt, charAt2) < 0) {
                        charAt = charAt2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double t9(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        double d = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            d += ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final <C extends Appendable> C u7(@NotNull CharSequence charSequence, @NotNull C c2, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                c2.append(charAt);
            }
        }
        return c2;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character u8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double u9(CharSequence charSequence, HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        double d = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            d += ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    @XP0
    public static final Character v7(CharSequence charSequence, HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char v8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    char charAt2 = charSequence.charAt(i);
                    if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                        charAt = charAt2;
                    }
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int v9(CharSequence charSequence, HA0<? super Character, Integer> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += ha0.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    @XP0
    public static final Character w7(CharSequence charSequence, HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char charAt = charSequence.charAt(length);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i >= 0) {
                length = i;
            } else {
                return null;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character w8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = C10763xf2.A3(charSequence);
        if (A3 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = ha0.invoke(Character.valueOf(charAt));
        int i = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                R invoke2 = ha0.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i == A3) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long w9(CharSequence charSequence, HA0<? super Character, Long> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        long j = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            j += ha0.invoke(Character.valueOf(charSequence.charAt(i))).longValue();
        }
        return j;
    }

    public static final char x7(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> char x8(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            int A3 = C10763xf2.A3(charSequence);
            if (A3 != 0) {
                R invoke = ha0.invoke(Character.valueOf(charAt));
                int i = 1;
                if (1 <= A3) {
                    while (true) {
                        char charAt2 = charSequence.charAt(i);
                        R invoke2 = ha0.invoke(Character.valueOf(charAt2));
                        if (invoke.compareTo(invoke2) > 0) {
                            charAt = charAt2;
                            invoke = invoke2;
                        }
                        if (i == A3) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int x9(CharSequence charSequence, HA0<? super Character, C7162ix2> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        int n = C7162ix2.n(0);
        for (int i = 0; i < charSequence.length(); i++) {
            n = C7162ix2.n(n + ha0.invoke(Character.valueOf(charSequence.charAt(i))).p0());
        }
        return n;
    }

    public static final char y7(@NotNull CharSequence charSequence, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double y8(CharSequence charSequence, HA0<? super Character, Double> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            double doubleValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue());
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long y9(CharSequence charSequence, HA0<? super Character, C9860tx2> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        long n = C9860tx2.n(0L);
        for (int i = 0; i < charSequence.length(); i++) {
            n = C9860tx2.n(n + ha0.invoke(Character.valueOf(charSequence.charAt(i))).p0());
        }
        return n;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <R> R z7(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
        R r;
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "transform");
        int i = 0;
        while (true) {
            if (i < charSequence.length()) {
                r = ha0.invoke(Character.valueOf(charSequence.charAt(i)));
                if (r != null) {
                    break;
                }
                i++;
            } else {
                r = null;
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float z8(CharSequence charSequence, HA0<? super Character, Float> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        if (charSequence.length() != 0) {
            float floatValue = ha0.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            int A3 = C10763xf2.A3(charSequence);
            int i = 1;
            if (1 <= A3) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Character.valueOf(charSequence.charAt(i))).floatValue());
                    if (i == A3) {
                        break;
                    }
                    i++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final CharSequence z9(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(0, C5075aO1.B(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
