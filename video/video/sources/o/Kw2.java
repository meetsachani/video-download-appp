package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class Kw2 {

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC8896q1<C7162ix2> implements RandomAccess {
        public final /* synthetic */ int[] Z;

        public a(int[] iArr) {
            this.Z = iArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C7162ix2)) {
                return false;
            }
            return h(((C7162ix2) obj).p0());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return C8395nx2.B(this.Z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C7162ix2.g(i(i));
        }

        public boolean h(int i) {
            return C8395nx2.j(this.Z, i);
        }

        public int i(int i) {
            return C8395nx2.r(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C7162ix2)) {
                return -1;
            }
            return j(((C7162ix2) obj).p0());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return C8395nx2.G(this.Z);
        }

        public int j(int i) {
            return C7330jf.Qf(this.Z, i);
        }

        public int k(int i) {
            return C7330jf.Uh(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C7162ix2)) {
                return -1;
            }
            return k(((C7162ix2) obj).p0());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC8896q1<C9860tx2> implements RandomAccess {
        public final /* synthetic */ long[] Z;

        public b(long[] jArr) {
            this.Z = jArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C9860tx2)) {
                return false;
            }
            return h(((C9860tx2) obj).p0());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return C10103ux2.B(this.Z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C9860tx2.g(i(i));
        }

        public boolean h(long j) {
            return C10103ux2.j(this.Z, j);
        }

        public long i(int i) {
            return C10103ux2.r(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C9860tx2)) {
                return -1;
            }
            return j(((C9860tx2) obj).p0());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return C10103ux2.G(this.Z);
        }

        public int j(long j) {
            return C7330jf.Rf(this.Z, j);
        }

        public int k(long j) {
            return C7330jf.Vh(this.Z, j);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C9860tx2)) {
                return -1;
            }
            return k(((C9860tx2) obj).p0());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC8896q1<Vw2> implements RandomAccess {
        public final /* synthetic */ byte[] Z;

        public c(byte[] bArr) {
            this.Z = bArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Vw2)) {
                return false;
            }
            return h(((Vw2) obj).n0());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return Ww2.B(this.Z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return Vw2.g(i(i));
        }

        public boolean h(byte b) {
            return Ww2.j(this.Z, b);
        }

        public byte i(int i) {
            return Ww2.r(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Vw2)) {
                return -1;
            }
            return j(((Vw2) obj).n0());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return Ww2.G(this.Z);
        }

        public int j(byte b) {
            return C7330jf.Mf(this.Z, b);
        }

        public int k(byte b) {
            return C7330jf.Qh(this.Z, b);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Vw2)) {
                return -1;
            }
            return k(((Vw2) obj).n0());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends AbstractC8896q1<Xx2> implements RandomAccess {
        public final /* synthetic */ short[] Z;

        public d(short[] sArr) {
            this.Z = sArr;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Xx2)) {
                return false;
            }
            return h(((Xx2) obj).n0());
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return Yx2.B(this.Z);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return Xx2.g(i(i));
        }

        public boolean h(short s) {
            return Yx2.j(this.Z, s);
        }

        public short i(int i) {
            return Yx2.r(this.Z, i);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Xx2)) {
                return -1;
            }
            return j(((Xx2) obj).n0());
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return Yx2.G(this.Z);
        }

        public int j(short s) {
            return C7330jf.Tf(this.Z, s);
        }

        public int k(short s) {
            return C7330jf.Xh(this.Z, s);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Xx2)) {
                return -1;
            }
            return k(((Xx2) obj).n0());
        }
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Xx2 A(short[] sArr, Comparator comparator) {
        C6562gT0.p(sArr, "$this$maxWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.E6(sArr, comparator);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C9860tx2 B(long[] jArr, Comparator comparator) {
        C6562gT0.p(jArr, "$this$maxWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.F6(jArr, comparator);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C7162ix2 C(int[] iArr) {
        C6562gT0.p(iArr, "$this$min");
        return Pw2.y7(iArr);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Vw2 D(byte[] bArr) {
        C6562gT0.p(bArr, "$this$min");
        return Pw2.z7(bArr);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C9860tx2 E(long[] jArr) {
        C6562gT0.p(jArr, "$this$min");
        return Pw2.A7(jArr);
    }

    @InterfaceC9150r20(message = "Use minOrNull instead.", replaceWith = @IR1(expression = "this.minOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Xx2 F(short[] sArr) {
        C6562gT0.p(sArr, "$this$min");
        return Pw2.B7(sArr);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> Vw2 G(byte[] bArr, HA0<? super Vw2, ? extends R> ha0) {
        C6562gT0.p(bArr, "$this$minBy");
        C6562gT0.p(ha0, "selector");
        if (Ww2.G(bArr)) {
            return null;
        }
        byte r = Ww2.r(bArr, 0);
        int ze = C7330jf.ze(bArr);
        if (ze == 0) {
            return Vw2.g(r);
        }
        R invoke = ha0.invoke(Vw2.g(r));
        int i = 1;
        if (1 <= ze) {
            while (true) {
                byte r2 = Ww2.r(bArr, i);
                R invoke2 = ha0.invoke(Vw2.g(r2));
                if (invoke.compareTo(invoke2) > 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == ze) {
                    break;
                }
                i++;
            }
        }
        return Vw2.g(r);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> C9860tx2 H(long[] jArr, HA0<? super C9860tx2, ? extends R> ha0) {
        C6562gT0.p(jArr, "$this$minBy");
        C6562gT0.p(ha0, "selector");
        if (C10103ux2.G(jArr)) {
            return null;
        }
        long r = C10103ux2.r(jArr, 0);
        int Ee = C7330jf.Ee(jArr);
        if (Ee == 0) {
            return C9860tx2.g(r);
        }
        R invoke = ha0.invoke(C9860tx2.g(r));
        int i = 1;
        if (1 <= Ee) {
            while (true) {
                long r2 = C10103ux2.r(jArr, i);
                R invoke2 = ha0.invoke(C9860tx2.g(r2));
                if (invoke.compareTo(invoke2) > 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == Ee) {
                    break;
                }
                i++;
            }
        }
        return C9860tx2.g(r);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> C7162ix2 I(int[] iArr, HA0<? super C7162ix2, ? extends R> ha0) {
        C6562gT0.p(iArr, "$this$minBy");
        C6562gT0.p(ha0, "selector");
        if (C8395nx2.G(iArr)) {
            return null;
        }
        int r = C8395nx2.r(iArr, 0);
        int De = C7330jf.De(iArr);
        if (De == 0) {
            return C7162ix2.g(r);
        }
        R invoke = ha0.invoke(C7162ix2.g(r));
        int i = 1;
        if (1 <= De) {
            while (true) {
                int r2 = C8395nx2.r(iArr, i);
                R invoke2 = ha0.invoke(C7162ix2.g(r2));
                if (invoke.compareTo(invoke2) > 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == De) {
                    break;
                }
                i++;
            }
        }
        return C7162ix2.g(r);
    }

    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> Xx2 J(short[] sArr, HA0<? super Xx2, ? extends R> ha0) {
        C6562gT0.p(sArr, "$this$minBy");
        C6562gT0.p(ha0, "selector");
        if (Yx2.G(sArr)) {
            return null;
        }
        short r = Yx2.r(sArr, 0);
        int Ge = C7330jf.Ge(sArr);
        if (Ge == 0) {
            return Xx2.g(r);
        }
        R invoke = ha0.invoke(Xx2.g(r));
        int i = 1;
        if (1 <= Ge) {
            while (true) {
                short r2 = Yx2.r(sArr, i);
                R invoke2 = ha0.invoke(Xx2.g(r2));
                if (invoke.compareTo(invoke2) > 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == Ge) {
                    break;
                }
                i++;
            }
        }
        return Xx2.g(r);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Vw2 K(byte[] bArr, Comparator comparator) {
        C6562gT0.p(bArr, "$this$minWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.G7(bArr, comparator);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C7162ix2 L(int[] iArr, Comparator comparator) {
        C6562gT0.p(iArr, "$this$minWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.H7(iArr, comparator);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Xx2 M(short[] sArr, Comparator comparator) {
        C6562gT0.p(sArr, "$this$minWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.I7(sArr, comparator);
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C9860tx2 N(long[] jArr, Comparator comparator) {
        C6562gT0.p(jArr, "$this$minWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.J7(jArr, comparator);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal O(byte[] bArr, HA0<? super Vw2, ? extends BigDecimal> ha0) {
        C6562gT0.p(bArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = Ww2.B(bArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(Vw2.g(Ww2.r(bArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal P(int[] iArr, HA0<? super C7162ix2, ? extends BigDecimal> ha0) {
        C6562gT0.p(iArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = C8395nx2.B(iArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(C7162ix2.g(C8395nx2.r(iArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal Q(long[] jArr, HA0<? super C9860tx2, ? extends BigDecimal> ha0) {
        C6562gT0.p(jArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = C10103ux2.B(jArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(C9860tx2.g(C10103ux2.r(jArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigDecimal")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigDecimal R(short[] sArr, HA0<? super Xx2, ? extends BigDecimal> ha0) {
        C6562gT0.p(sArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = Yx2.B(sArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(Xx2.g(Yx2.r(sArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger S(byte[] bArr, HA0<? super Vw2, ? extends BigInteger> ha0) {
        C6562gT0.p(bArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = Ww2.B(bArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(Vw2.g(Ww2.r(bArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger T(int[] iArr, HA0<? super C7162ix2, ? extends BigInteger> ha0) {
        C6562gT0.p(iArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = C8395nx2.B(iArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(C7162ix2.g(C8395nx2.r(iArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger U(long[] jArr, HA0<? super C9860tx2, ? extends BigInteger> ha0) {
        C6562gT0.p(jArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = C10103ux2.B(jArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(C9860tx2.g(C10103ux2.r(jArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC8046mW0(name = "sumOfBigInteger")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final BigInteger V(short[] sArr, HA0<? super Xx2, ? extends BigInteger> ha0) {
        C6562gT0.p(sArr, "$this$sumOf");
        C6562gT0.p(ha0, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        C6562gT0.o(valueOf, "valueOf(...)");
        int B = Yx2.B(sArr);
        for (int i = 0; i < B; i++) {
            valueOf = valueOf.add(ha0.invoke(Xx2.g(Yx2.r(sArr, i))));
            C6562gT0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final List<C7162ix2> a(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "$this$asList");
        return new a(iArr);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final List<Vw2> b(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "$this$asList");
        return new c(bArr);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final List<C9860tx2> c(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "$this$asList");
        return new b(jArr);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final List<Xx2> d(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "$this$asList");
        return new d(sArr);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int e(@NotNull int[] iArr, int i, int i2, int i3) {
        C6562gT0.p(iArr, "$this$binarySearch");
        AbstractC8896q1.X.d(i2, i3, C8395nx2.B(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int e = ZB2.e(iArr[i5], i);
            if (e < 0) {
                i2 = i5 + 1;
            } else if (e > 0) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C8395nx2.B(iArr);
        }
        return e(iArr, i, i2, i3);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int g(@NotNull short[] sArr, short s, int i, int i2) {
        C6562gT0.p(sArr, "$this$binarySearch");
        AbstractC8896q1.X.d(i, i2, Yx2.B(sArr));
        int i3 = s & Xx2.Y0;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int e = ZB2.e(sArr[i5], i3);
            if (e < 0) {
                i = i5 + 1;
            } else if (e > 0) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = Yx2.B(sArr);
        }
        return g(sArr, s, i, i2);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int i(@NotNull long[] jArr, long j, int i, int i2) {
        C6562gT0.p(jArr, "$this$binarySearch");
        AbstractC8896q1.X.d(i, i2, C10103ux2.B(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int n = ZB2.n(jArr[i4], j);
            if (n < 0) {
                i = i4 + 1;
            } else if (n > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C10103ux2.B(jArr);
        }
        return i(jArr, j, i, i2);
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int k(@NotNull byte[] bArr, byte b2, int i, int i2) {
        C6562gT0.p(bArr, "$this$binarySearch");
        AbstractC8896q1.X.d(i, i2, Ww2.B(bArr));
        int i3 = b2 & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int e = ZB2.e(bArr[i5], i3);
            if (e < 0) {
                i = i5 + 1;
            } else if (e > 0) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = Ww2.B(bArr);
        }
        return k(bArr, b2, i, i2);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final byte m(byte[] bArr, int i) {
        C6562gT0.p(bArr, "$this$elementAt");
        return Ww2.r(bArr, i);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final short n(short[] sArr, int i) {
        C6562gT0.p(sArr, "$this$elementAt");
        return Yx2.r(sArr, i);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int o(int[] iArr, int i) {
        C6562gT0.p(iArr, "$this$elementAt");
        return C8395nx2.r(iArr, i);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final long p(long[] jArr, int i) {
        C6562gT0.p(jArr, "$this$elementAt");
        return C10103ux2.r(jArr, i);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C7162ix2 q(int[] iArr) {
        C6562gT0.p(iArr, "$this$max");
        return Pw2.u6(iArr);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Vw2 r(byte[] bArr) {
        C6562gT0.p(bArr, "$this$max");
        return Pw2.v6(bArr);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C9860tx2 s(long[] jArr) {
        C6562gT0.p(jArr, "$this$max");
        return Pw2.w6(jArr);
    }

    @InterfaceC9150r20(message = "Use maxOrNull instead.", replaceWith = @IR1(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Xx2 t(short[] sArr) {
        C6562gT0.p(sArr, "$this$max");
        return Pw2.x6(sArr);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> Vw2 u(byte[] bArr, HA0<? super Vw2, ? extends R> ha0) {
        C6562gT0.p(bArr, "$this$maxBy");
        C6562gT0.p(ha0, "selector");
        if (Ww2.G(bArr)) {
            return null;
        }
        byte r = Ww2.r(bArr, 0);
        int ze = C7330jf.ze(bArr);
        if (ze == 0) {
            return Vw2.g(r);
        }
        R invoke = ha0.invoke(Vw2.g(r));
        int i = 1;
        if (1 <= ze) {
            while (true) {
                byte r2 = Ww2.r(bArr, i);
                R invoke2 = ha0.invoke(Vw2.g(r2));
                if (invoke.compareTo(invoke2) < 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == ze) {
                    break;
                }
                i++;
            }
        }
        return Vw2.g(r);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> C9860tx2 v(long[] jArr, HA0<? super C9860tx2, ? extends R> ha0) {
        C6562gT0.p(jArr, "$this$maxBy");
        C6562gT0.p(ha0, "selector");
        if (C10103ux2.G(jArr)) {
            return null;
        }
        long r = C10103ux2.r(jArr, 0);
        int Ee = C7330jf.Ee(jArr);
        if (Ee == 0) {
            return C9860tx2.g(r);
        }
        R invoke = ha0.invoke(C9860tx2.g(r));
        int i = 1;
        if (1 <= Ee) {
            while (true) {
                long r2 = C10103ux2.r(jArr, i);
                R invoke2 = ha0.invoke(C9860tx2.g(r2));
                if (invoke.compareTo(invoke2) < 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == Ee) {
                    break;
                }
                i++;
            }
        }
        return C9860tx2.g(r);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> C7162ix2 w(int[] iArr, HA0<? super C7162ix2, ? extends R> ha0) {
        C6562gT0.p(iArr, "$this$maxBy");
        C6562gT0.p(ha0, "selector");
        if (C8395nx2.G(iArr)) {
            return null;
        }
        int r = C8395nx2.r(iArr, 0);
        int De = C7330jf.De(iArr);
        if (De == 0) {
            return C7162ix2.g(r);
        }
        R invoke = ha0.invoke(C7162ix2.g(r));
        int i = 1;
        if (1 <= De) {
            while (true) {
                int r2 = C8395nx2.r(iArr, i);
                R invoke2 = ha0.invoke(C7162ix2.g(r2));
                if (invoke.compareTo(invoke2) < 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == De) {
                    break;
                }
                i++;
            }
        }
        return C7162ix2.g(r);
    }

    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> Xx2 x(short[] sArr, HA0<? super Xx2, ? extends R> ha0) {
        C6562gT0.p(sArr, "$this$maxBy");
        C6562gT0.p(ha0, "selector");
        if (Yx2.G(sArr)) {
            return null;
        }
        short r = Yx2.r(sArr, 0);
        int Ge = C7330jf.Ge(sArr);
        if (Ge == 0) {
            return Xx2.g(r);
        }
        R invoke = ha0.invoke(Xx2.g(r));
        int i = 1;
        if (1 <= Ge) {
            while (true) {
                short r2 = Yx2.r(sArr, i);
                R invoke2 = ha0.invoke(Xx2.g(r2));
                if (invoke.compareTo(invoke2) < 0) {
                    r = r2;
                    invoke = invoke2;
                }
                if (i == Ge) {
                    break;
                }
                i++;
            }
        }
        return Xx2.g(r);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ Vw2 y(byte[] bArr, Comparator comparator) {
        C6562gT0.p(bArr, "$this$maxWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.C6(bArr, comparator);
    }

    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final /* synthetic */ C7162ix2 z(int[] iArr, Comparator comparator) {
        C6562gT0.p(iArr, "$this$maxWith");
        C6562gT0.p(comparator, "comparator");
        return Pw2.D6(iArr, comparator);
    }
}
