package o;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* renamed from: o.Ms1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3677Ms1 {
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal a(BigDecimal bigDecimal) {
        C6562gT0.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        C6562gT0.o(subtract, "subtract(...)");
        return subtract;
    }

    @XP0
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C6562gT0.p(bigDecimal, "<this>");
        C6562gT0.p(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        C6562gT0.o(divide, "divide(...)");
        return divide;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal c(BigDecimal bigDecimal) {
        C6562gT0.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        C6562gT0.o(add, "add(...)");
        return add;
    }

    @XP0
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C6562gT0.p(bigDecimal, "<this>");
        C6562gT0.p(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        C6562gT0.o(subtract, "subtract(...)");
        return subtract;
    }

    @XP0
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C6562gT0.p(bigDecimal, "<this>");
        C6562gT0.p(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        C6562gT0.o(add, "add(...)");
        return add;
    }

    @XP0
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C6562gT0.p(bigDecimal, "<this>");
        C6562gT0.p(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        C6562gT0.o(remainder, "remainder(...)");
        return remainder;
    }

    @XP0
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C6562gT0.p(bigDecimal, "<this>");
        C6562gT0.p(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        C6562gT0.o(multiply, "multiply(...)");
        return multiply;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal h(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal i(double d, MathContext mathContext) {
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal j(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal k(float f, MathContext mathContext) {
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal l(int i) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        C6562gT0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal m(int i, MathContext mathContext) {
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal n(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        C6562gT0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal o(long j, MathContext mathContext) {
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @XP0
    public static final BigDecimal p(BigDecimal bigDecimal) {
        C6562gT0.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        C6562gT0.o(negate, "negate(...)");
        return negate;
    }
}
