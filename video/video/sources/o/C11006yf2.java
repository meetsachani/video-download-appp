package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1260#2,14:109\n1584#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* renamed from: o.yf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11006yf2 extends C10763xf2 {
    @XP0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal A6(CharSequence charSequence, HA0<? super Character, ? extends BigDecimal> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add(ha0.invoke(Character.valueOf(charSequence.charAt(i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger B6(CharSequence charSequence, HA0<? super Character, ? extends BigInteger> ha0) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add(ha0.invoke(Character.valueOf(charSequence.charAt(i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @NotNull
    public static final SortedSet<Character> C6(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return (SortedSet) C2832Ef2.H9(charSequence, new TreeSet());
    }

    @XP0
    public static final char t6(CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character u6(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return C2832Ef2.s8(charSequence);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character v6(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
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

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character w6(CharSequence charSequence, Comparator comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C2832Ef2.u8(charSequence, comparator);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character x6(CharSequence charSequence) {
        C6562gT0.p(charSequence, "<this>");
        return C2832Ef2.G8(charSequence);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character y6(CharSequence charSequence, HA0<? super Character, ? extends R> ha0) {
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

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character z6(CharSequence charSequence, Comparator comparator) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C2832Ef2.I8(charSequence, comparator);
    }
}
