package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* renamed from: o.Ns1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3776Ns1 extends C3677Ms1 {
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger A(BigInteger bigInteger, int i) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i);
        C6562gT0.o(shiftRight, "shiftRight(...)");
        return shiftRight;
    }

    @XP0
    public static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        C6562gT0.o(multiply, "multiply(...)");
        return multiply;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal C(BigInteger bigInteger) {
        C6562gT0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal D(BigInteger bigInteger, int i, MathContext mathContext) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
        }
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger F(int i) {
        BigInteger valueOf = BigInteger.valueOf(i);
        C6562gT0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger G(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        C6562gT0.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @XP0
    public static final BigInteger H(BigInteger bigInteger) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        C6562gT0.o(negate, "negate(...)");
        return negate;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        C6562gT0.o(xor, "xor(...)");
        return xor;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        C6562gT0.o(and, "and(...)");
        return and;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger r(BigInteger bigInteger) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        C6562gT0.o(subtract, "subtract(...)");
        return subtract;
    }

    @XP0
    public static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        C6562gT0.o(divide, "divide(...)");
        return divide;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger t(BigInteger bigInteger) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        C6562gT0.o(add, "add(...)");
        return add;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger u(BigInteger bigInteger) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        C6562gT0.o(not, "not(...)");
        return not;
    }

    @XP0
    public static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        C6562gT0.o(subtract, "subtract(...)");
        return subtract;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        C6562gT0.o(or, "or(...)");
        return or;
    }

    @XP0
    public static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        C6562gT0.o(add, "add(...)");
        return add;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        C6562gT0.p(bigInteger, "<this>");
        C6562gT0.p(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        C6562gT0.o(remainder, "remainder(...)");
        return remainder;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger z(BigInteger bigInteger, int i) {
        C6562gT0.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        C6562gT0.o(shiftLeft, "shiftLeft(...)");
        return shiftLeft;
    }
}
