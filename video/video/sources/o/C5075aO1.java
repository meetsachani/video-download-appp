package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.NoSuchElementException;
import o.C10711xR0;
import o.TA;
import o.U41;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
/* renamed from: o.aO1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5075aO1 extends ZN1 {
    public static final float A(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Integer A0(@NotNull C10711xR0 c10711xR0) {
        C6562gT0.p(c10711xR0, "<this>");
        if (c10711xR0.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c10711xR0.j());
    }

    @NotNull
    public static final TA A1(@NotNull TA ta, int i) {
        boolean z;
        C6562gT0.p(ta, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        ZN1.a(z, Integer.valueOf(i));
        TA.a aVar = TA.Y0;
        char j = ta.j();
        char k = ta.k();
        if (ta.l() <= 0) {
            i = -i;
        }
        return aVar.a(j, k, i);
    }

    public static int B(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Long B0(@NotNull U41 u41) {
        C6562gT0.p(u41, "<this>");
        if (u41.isEmpty()) {
            return null;
        }
        return Long.valueOf(u41.j());
    }

    @NotNull
    public static C10711xR0 B1(@NotNull C10711xR0 c10711xR0, int i) {
        boolean z;
        C6562gT0.p(c10711xR0, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        ZN1.a(z, Integer.valueOf(i));
        C10711xR0.a aVar = C10711xR0.Y0;
        int j = c10711xR0.j();
        int k = c10711xR0.k();
        if (c10711xR0.l() <= 0) {
            i = -i;
        }
        return aVar.a(j, k, i);
    }

    public static long C(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    @InterfaceC8046mW0(name = "floatRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(InterfaceC6987iE interfaceC6987iE, byte b) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Float.valueOf(b));
    }

    @NotNull
    public static final U41 C1(@NotNull U41 u41, long j) {
        boolean z;
        C6562gT0.p(u41, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        ZN1.a(z, Long.valueOf(j));
        U41.a aVar = U41.Y0;
        long j2 = u41.j();
        long k = u41.k();
        if (u41.l() <= 0) {
            j = -j;
        }
        return aVar.a(j2, k, j);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T D(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(t2, "maximumValue");
        if (t.compareTo(t2) > 0) {
            return t2;
        }
        return t;
    }

    @InterfaceC8046mW0(name = "floatRangeContains")
    public static final boolean D0(@NotNull InterfaceC6987iE<Float> interfaceC6987iE, double d) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Float.valueOf((float) d));
    }

    @Nullable
    public static final Byte D1(double d) {
        if (-128.0d <= d && d <= 127.0d) {
            return Byte.valueOf((byte) d);
        }
        return null;
    }

    public static final short E(short s, short s2) {
        if (s > s2) {
            return s2;
        }
        return s;
    }

    @InterfaceC8046mW0(name = "floatRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(InterfaceC6987iE interfaceC6987iE, int i) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Float.valueOf(i));
    }

    @Nullable
    public static final Byte E1(float f) {
        if (-128.0f <= f && f <= 127.0f) {
            return Byte.valueOf((byte) f);
        }
        return null;
    }

    public static final byte F(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            if (b < b2) {
                return b2;
            }
            if (b > b3) {
                return b3;
            }
            return b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
    }

    @InterfaceC8046mW0(name = "floatRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(InterfaceC6987iE interfaceC6987iE, long j) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Float.valueOf((float) j));
    }

    @Nullable
    public static final Byte F1(int i) {
        if (-128 <= i && i < 128) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    public static final double G(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    @InterfaceC8046mW0(name = "floatRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(InterfaceC6987iE interfaceC6987iE, short s) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Float.valueOf(s));
    }

    @Nullable
    public static final Byte G1(long j) {
        if (-128 <= j && j < 128) {
            return Byte.valueOf((byte) j);
        }
        return null;
    }

    public static float H(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    public static final boolean H0(@NotNull InterfaceC6987iE<Integer> interfaceC6987iE, byte b) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Integer.valueOf(b));
    }

    @Nullable
    public static final Byte H1(short s) {
        if (-128 <= s && s < 128) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    public static int I(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(InterfaceC6987iE interfaceC6987iE, double d) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Integer I1 = I1(d);
        if (I1 != null) {
            return interfaceC6987iE.e(I1);
        }
        return false;
    }

    @Nullable
    public static final Integer I1(double d) {
        if (-2.147483648E9d <= d && d <= 2.147483647E9d) {
            return Integer.valueOf((int) d);
        }
        return null;
    }

    public static final int J(int i, @NotNull InterfaceC6987iE<Integer> interfaceC6987iE) {
        C6562gT0.p(interfaceC6987iE, V12.q);
        if (interfaceC6987iE instanceof InterfaceC6246fE) {
            return ((Number) N(Integer.valueOf(i), (InterfaceC6246fE) interfaceC6987iE)).intValue();
        }
        if (!interfaceC6987iE.isEmpty()) {
            if (i < interfaceC6987iE.d().intValue()) {
                return interfaceC6987iE.d().intValue();
            }
            if (i > interfaceC6987iE.h().intValue()) {
                return interfaceC6987iE.h().intValue();
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6987iE + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(InterfaceC6987iE interfaceC6987iE, float f) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Integer J1 = J1(f);
        if (J1 != null) {
            return interfaceC6987iE.e(J1);
        }
        return false;
    }

    @Nullable
    public static final Integer J1(float f) {
        if (-2.1474836E9f <= f && f <= 2.1474836E9f) {
            return Integer.valueOf((int) f);
        }
        return null;
    }

    public static long K(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    public static final boolean K0(@NotNull InterfaceC6987iE<Integer> interfaceC6987iE, long j) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Integer K1 = K1(j);
        if (K1 != null) {
            return interfaceC6987iE.e(K1);
        }
        return false;
    }

    @Nullable
    public static final Integer K1(long j) {
        if (-2147483648L <= j && j < 2147483648L) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    public static long L(long j, @NotNull InterfaceC6987iE<Long> interfaceC6987iE) {
        C6562gT0.p(interfaceC6987iE, V12.q);
        if (interfaceC6987iE instanceof InterfaceC6246fE) {
            return ((Number) N(Long.valueOf(j), (InterfaceC6246fE) interfaceC6987iE)).longValue();
        }
        if (!interfaceC6987iE.isEmpty()) {
            if (j < interfaceC6987iE.d().longValue()) {
                return interfaceC6987iE.d().longValue();
            }
            if (j > interfaceC6987iE.h().longValue()) {
                return interfaceC6987iE.h().longValue();
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6987iE + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    public static final boolean L0(@NotNull InterfaceC6987iE<Integer> interfaceC6987iE, short s) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Integer.valueOf(s));
    }

    @Nullable
    public static final Long L1(double d) {
        if (-9.223372036854776E18d <= d && d <= 9.223372036854776E18d) {
            return Long.valueOf((long) d);
        }
        return null;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T M(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        C6562gT0.p(t, "<this>");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) <= 0) {
                if (t.compareTo(t2) < 0) {
                    return t2;
                }
                if (t.compareTo(t3) > 0) {
                    return t3;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
        } else if (t2 != null && t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean M0(@NotNull InterfaceC2796Dv1<Integer> interfaceC2796Dv1, byte b) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Integer.valueOf(b));
    }

    @Nullable
    public static final Long M1(float f) {
        if (-9.223372E18f <= f && f <= 9.223372E18f) {
            return Long.valueOf(f);
        }
        return null;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T N(@NotNull T t, @NotNull InterfaceC6246fE<T> interfaceC6246fE) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(interfaceC6246fE, V12.q);
        if (!interfaceC6246fE.isEmpty()) {
            if (interfaceC6246fE.f(t, interfaceC6246fE.d()) && !interfaceC6246fE.f(interfaceC6246fE.d(), t)) {
                return interfaceC6246fE.d();
            }
            if (interfaceC6246fE.f(interfaceC6246fE.h(), t) && !interfaceC6246fE.f(t, interfaceC6246fE.h())) {
                return interfaceC6246fE.h();
            }
            return t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6246fE + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean N0(@NotNull InterfaceC2796Dv1<Integer> interfaceC2796Dv1, long j) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Integer K1 = K1(j);
        if (K1 != null) {
            return interfaceC2796Dv1.e(K1);
        }
        return false;
    }

    @Nullable
    public static final Short N1(double d) {
        if (-32768.0d <= d && d <= 32767.0d) {
            return Short.valueOf((short) d);
        }
        return null;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T O(@NotNull T t, @NotNull InterfaceC6987iE<T> interfaceC6987iE) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(interfaceC6987iE, V12.q);
        if (interfaceC6987iE instanceof InterfaceC6246fE) {
            return (T) N(t, (InterfaceC6246fE) interfaceC6987iE);
        }
        if (!interfaceC6987iE.isEmpty()) {
            if (t.compareTo(interfaceC6987iE.d()) < 0) {
                return interfaceC6987iE.d();
            }
            if (t.compareTo(interfaceC6987iE.h()) > 0) {
                return interfaceC6987iE.h();
            }
            return t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6987iE + '.');
    }

    @InterfaceC8046mW0(name = "intRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean O0(@NotNull InterfaceC2796Dv1<Integer> interfaceC2796Dv1, short s) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Integer.valueOf(s));
    }

    @Nullable
    public static final Short O1(float f) {
        if (-32768.0f <= f && f <= 32767.0f) {
            return Short.valueOf((short) f);
        }
        return null;
    }

    public static final short P(short s, short s2, short s3) {
        if (s2 <= s3) {
            if (s < s2) {
                return s2;
            }
            if (s > s3) {
                return s3;
            }
            return s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    @InterfaceC6480g82(version = "1.7")
    public static final char P0(@NotNull TA ta) {
        C6562gT0.p(ta, "<this>");
        if (!ta.isEmpty()) {
            return ta.k();
        }
        throw new NoSuchElementException("Progression " + ta + " is empty.");
    }

    @Nullable
    public static final Short P1(int i) {
        if (-32768 <= i && i < 32768) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean Q(VA va, Character ch) {
        C6562gT0.p(va, "<this>");
        if (ch != null && va.w(ch.charValue())) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.7")
    public static final int Q0(@NotNull C10711xR0 c10711xR0) {
        C6562gT0.p(c10711xR0, "<this>");
        if (!c10711xR0.isEmpty()) {
            return c10711xR0.k();
        }
        throw new NoSuchElementException("Progression " + c10711xR0 + " is empty.");
    }

    @Nullable
    public static final Short Q1(long j) {
        if (-32768 <= j && j < PlaybackStateCompat.w1) {
            return Short.valueOf((short) j);
        }
        return null;
    }

    @XP0
    public static final boolean R(C11197zR0 c11197zR0, byte b) {
        C6562gT0.p(c11197zR0, "<this>");
        return H0(c11197zR0, b);
    }

    @InterfaceC6480g82(version = "1.7")
    public static final long R0(@NotNull U41 u41) {
        C6562gT0.p(u41, "<this>");
        if (!u41.isEmpty()) {
            return u41.k();
        }
        throw new NoSuchElementException("Progression " + u41 + " is empty.");
    }

    @NotNull
    public static final VA R1(char c, char c2) {
        if (C6562gT0.t(c2, 0) <= 0) {
            return VA.Z0.a();
        }
        return new VA(c, (char) (c2 - 1));
    }

    @XP0
    public static final boolean S(C11197zR0 c11197zR0, long j) {
        C6562gT0.p(c11197zR0, "<this>");
        return K0(c11197zR0, j);
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Character S0(@NotNull TA ta) {
        C6562gT0.p(ta, "<this>");
        if (ta.isEmpty()) {
            return null;
        }
        return Character.valueOf(ta.k());
    }

    @NotNull
    public static final C11197zR0 S1(byte b, byte b2) {
        return new C11197zR0(b, b2 - 1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean T(C11197zR0 c11197zR0, Integer num) {
        C6562gT0.p(c11197zR0, "<this>");
        if (num != null && c11197zR0.w(num.intValue())) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Integer T0(@NotNull C10711xR0 c10711xR0) {
        C6562gT0.p(c10711xR0, "<this>");
        if (c10711xR0.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c10711xR0.k());
    }

    @NotNull
    public static final C11197zR0 T1(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C11197zR0.Z0.a();
        }
        return new C11197zR0(b, i - 1);
    }

    @XP0
    public static final boolean U(C11197zR0 c11197zR0, short s) {
        C6562gT0.p(c11197zR0, "<this>");
        return L0(c11197zR0, s);
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Long U0(@NotNull U41 u41) {
        C6562gT0.p(u41, "<this>");
        if (u41.isEmpty()) {
            return null;
        }
        return Long.valueOf(u41.k());
    }

    @NotNull
    public static final C11197zR0 U1(byte b, short s) {
        return new C11197zR0(b, s - 1);
    }

    @XP0
    public static final boolean V(W41 w41, byte b) {
        C6562gT0.p(w41, "<this>");
        return V0(w41, b);
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    public static final boolean V0(@NotNull InterfaceC6987iE<Long> interfaceC6987iE, byte b) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Long.valueOf(b));
    }

    @NotNull
    public static final C11197zR0 V1(int i, byte b) {
        return new C11197zR0(i, b - 1);
    }

    @XP0
    public static final boolean W(W41 w41, int i) {
        C6562gT0.p(w41, "<this>");
        return Y0(w41, i);
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(InterfaceC6987iE interfaceC6987iE, double d) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Long L1 = L1(d);
        if (L1 != null) {
            return interfaceC6987iE.e(L1);
        }
        return false;
    }

    @NotNull
    public static C11197zR0 W1(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C11197zR0.Z0.a();
        }
        return new C11197zR0(i, i2 - 1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean X(W41 w41, Long l) {
        C6562gT0.p(w41, "<this>");
        if (l != null && w41.w(l.longValue())) {
            return true;
        }
        return false;
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(InterfaceC6987iE interfaceC6987iE, float f) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Long M1 = M1(f);
        if (M1 != null) {
            return interfaceC6987iE.e(M1);
        }
        return false;
    }

    @NotNull
    public static final C11197zR0 X1(int i, short s) {
        return new C11197zR0(i, s - 1);
    }

    @XP0
    public static final boolean Y(W41 w41, short s) {
        C6562gT0.p(w41, "<this>");
        return Z0(w41, s);
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    public static final boolean Y0(@NotNull InterfaceC6987iE<Long> interfaceC6987iE, int i) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Long.valueOf(i));
    }

    @NotNull
    public static final C11197zR0 Y1(short s, byte b) {
        return new C11197zR0(s, b - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(InterfaceC6987iE interfaceC6987iE, byte b) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Double.valueOf(b));
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    public static final boolean Z0(@NotNull InterfaceC6987iE<Long> interfaceC6987iE, short s) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Long.valueOf(s));
    }

    @NotNull
    public static final C11197zR0 Z1(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C11197zR0.Z0.a();
        }
        return new C11197zR0(s, i - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    public static final boolean a0(@NotNull InterfaceC6987iE<Double> interfaceC6987iE, float f) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Double.valueOf(f));
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean a1(@NotNull InterfaceC2796Dv1<Long> interfaceC2796Dv1, byte b) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Long.valueOf(b));
    }

    @NotNull
    public static final C11197zR0 a2(short s, short s2) {
        return new C11197zR0(s, s2 - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(InterfaceC6987iE interfaceC6987iE, int i) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Double.valueOf(i));
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean b1(@NotNull InterfaceC2796Dv1<Long> interfaceC2796Dv1, int i) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Long.valueOf(i));
    }

    @NotNull
    public static final W41 b2(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return W41.Z0.a();
        }
        return new W41(b, j - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(InterfaceC6987iE interfaceC6987iE, long j) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Double.valueOf(j));
    }

    @InterfaceC8046mW0(name = "longRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean c1(@NotNull InterfaceC2796Dv1<Long> interfaceC2796Dv1, short s) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Long.valueOf(s));
    }

    @NotNull
    public static final W41 c2(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return W41.Z0.a();
        }
        return new W41(i, j - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(InterfaceC6987iE interfaceC6987iE, short s) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Double.valueOf(s));
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final char d1(VA va) {
        C6562gT0.p(va, "<this>");
        return e1(va, AbstractC10696xN1.X);
    }

    @NotNull
    public static final W41 d2(long j, byte b) {
        return new W41(j, b - 1);
    }

    @InterfaceC8046mW0(name = "doubleRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean e0(@NotNull InterfaceC2796Dv1<Double> interfaceC2796Dv1, float f) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Double.valueOf(f));
    }

    @InterfaceC6480g82(version = "1.3")
    public static final char e1(@NotNull VA va, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(va, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        try {
            return (char) abstractC10696xN1.n(va.j(), va.k() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    public static final W41 e2(long j, int i) {
        return new W41(j, i - 1);
    }

    @NotNull
    public static final TA f0(char c, char c2) {
        return TA.Y0.a(c, c2, -1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final int f1(C11197zR0 c11197zR0) {
        C6562gT0.p(c11197zR0, "<this>");
        return g1(c11197zR0, AbstractC10696xN1.X);
    }

    @NotNull
    public static final W41 f2(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return W41.Z0.a();
        }
        return new W41(j, j2 - 1);
    }

    @NotNull
    public static final C10711xR0 g0(byte b, byte b2) {
        return C10711xR0.Y0.a(b, b2, -1);
    }

    @InterfaceC6480g82(version = "1.3")
    public static int g1(@NotNull C11197zR0 c11197zR0, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c11197zR0, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        try {
            return JN1.h(abstractC10696xN1, c11197zR0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    public static final W41 g2(long j, short s) {
        return new W41(j, s - 1);
    }

    @NotNull
    public static final C10711xR0 h0(byte b, int i) {
        return C10711xR0.Y0.a(b, i, -1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final long h1(W41 w41) {
        C6562gT0.p(w41, "<this>");
        return i1(w41, AbstractC10696xN1.X);
    }

    @NotNull
    public static final W41 h2(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return W41.Z0.a();
        }
        return new W41(s, j - 1);
    }

    @NotNull
    public static final C10711xR0 i0(byte b, short s) {
        return C10711xR0.Y0.a(b, s, -1);
    }

    @InterfaceC6480g82(version = "1.3")
    public static final long i1(@NotNull W41 w41, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(w41, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        try {
            return JN1.i(abstractC10696xN1, w41);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(InterfaceC6987iE interfaceC6987iE, double d) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Byte D1 = D1(d);
        if (D1 != null) {
            return interfaceC6987iE.e(D1);
        }
        return false;
    }

    @NotNull
    public static final C10711xR0 j0(int i, byte b) {
        return C10711xR0.Y0.a(i, b, -1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Character j1(VA va) {
        C6562gT0.p(va, "<this>");
        return k1(va, AbstractC10696xN1.X);
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(InterfaceC6987iE interfaceC6987iE, float f) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Byte E1 = E1(f);
        if (E1 != null) {
            return interfaceC6987iE.e(E1);
        }
        return false;
    }

    @NotNull
    public static C10711xR0 k0(int i, int i2) {
        return C10711xR0.Y0.a(i, i2, -1);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character k1(@NotNull VA va, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(va, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (va.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) abstractC10696xN1.n(va.j(), va.k() + 1));
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    public static final boolean l(@NotNull InterfaceC6987iE<Byte> interfaceC6987iE, int i) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Byte F1 = F1(i);
        if (F1 != null) {
            return interfaceC6987iE.e(F1);
        }
        return false;
    }

    @NotNull
    public static final C10711xR0 l0(int i, short s) {
        return C10711xR0.Y0.a(i, s, -1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Integer l1(C11197zR0 c11197zR0) {
        C6562gT0.p(c11197zR0, "<this>");
        return m1(c11197zR0, AbstractC10696xN1.X);
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    public static final boolean m(@NotNull InterfaceC6987iE<Byte> interfaceC6987iE, long j) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Byte G1 = G1(j);
        if (G1 != null) {
            return interfaceC6987iE.e(G1);
        }
        return false;
    }

    @NotNull
    public static final C10711xR0 m0(short s, byte b) {
        return C10711xR0.Y0.a(s, b, -1);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer m1(@NotNull C11197zR0 c11197zR0, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c11197zR0, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (c11197zR0.isEmpty()) {
            return null;
        }
        return Integer.valueOf(JN1.h(abstractC10696xN1, c11197zR0));
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    public static final boolean n(@NotNull InterfaceC6987iE<Byte> interfaceC6987iE, short s) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Byte H1 = H1(s);
        if (H1 != null) {
            return interfaceC6987iE.e(H1);
        }
        return false;
    }

    @NotNull
    public static final C10711xR0 n0(short s, int i) {
        return C10711xR0.Y0.a(s, i, -1);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Long n1(W41 w41) {
        C6562gT0.p(w41, "<this>");
        return o1(w41, AbstractC10696xN1.X);
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean o(@NotNull InterfaceC2796Dv1<Byte> interfaceC2796Dv1, int i) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Byte F1 = F1(i);
        if (F1 != null) {
            return interfaceC2796Dv1.e(F1);
        }
        return false;
    }

    @NotNull
    public static final C10711xR0 o0(short s, short s2) {
        return C10711xR0.Y0.a(s, s2, -1);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long o1(@NotNull W41 w41, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(w41, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (w41.isEmpty()) {
            return null;
        }
        return Long.valueOf(JN1.i(abstractC10696xN1, w41));
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean p(@NotNull InterfaceC2796Dv1<Byte> interfaceC2796Dv1, long j) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Byte G1 = G1(j);
        if (G1 != null) {
            return interfaceC2796Dv1.e(G1);
        }
        return false;
    }

    @NotNull
    public static final U41 p0(byte b, long j) {
        return U41.Y0.a(b, j, -1L);
    }

    @NotNull
    public static final TA p1(@NotNull TA ta) {
        C6562gT0.p(ta, "<this>");
        return TA.Y0.a(ta.k(), ta.j(), -ta.l());
    }

    @InterfaceC8046mW0(name = "byteRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean q(@NotNull InterfaceC2796Dv1<Byte> interfaceC2796Dv1, short s) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Byte H1 = H1(s);
        if (H1 != null) {
            return interfaceC2796Dv1.e(H1);
        }
        return false;
    }

    @NotNull
    public static final U41 q0(int i, long j) {
        return U41.Y0.a(i, j, -1L);
    }

    @NotNull
    public static final C10711xR0 q1(@NotNull C10711xR0 c10711xR0) {
        C6562gT0.p(c10711xR0, "<this>");
        return C10711xR0.Y0.a(c10711xR0.k(), c10711xR0.j(), -c10711xR0.l());
    }

    public static final byte r(byte b, byte b2) {
        if (b < b2) {
            return b2;
        }
        return b;
    }

    @NotNull
    public static final U41 r0(long j, byte b) {
        return U41.Y0.a(j, b, -1L);
    }

    @NotNull
    public static final U41 r1(@NotNull U41 u41) {
        C6562gT0.p(u41, "<this>");
        return U41.Y0.a(u41.k(), u41.j(), -u41.l());
    }

    public static final double s(double d, double d2) {
        if (d < d2) {
            return d2;
        }
        return d;
    }

    @NotNull
    public static final U41 s0(long j, int i) {
        return U41.Y0.a(j, i, -1L);
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    public static final boolean s1(@NotNull InterfaceC6987iE<Short> interfaceC6987iE, byte b) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        return interfaceC6987iE.e(Short.valueOf(b));
    }

    public static float t(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    @NotNull
    public static final U41 t0(long j, long j2) {
        return U41.Y0.a(j, j2, -1L);
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(InterfaceC6987iE interfaceC6987iE, double d) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Short N1 = N1(d);
        if (N1 != null) {
            return interfaceC6987iE.e(N1);
        }
        return false;
    }

    public static int u(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    @NotNull
    public static final U41 u0(long j, short s) {
        return U41.Y0.a(j, s, -1L);
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    @InterfaceC9150r20(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC9636t20(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(InterfaceC6987iE interfaceC6987iE, float f) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Short O1 = O1(f);
        if (O1 != null) {
            return interfaceC6987iE.e(O1);
        }
        return false;
    }

    public static long v(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    @NotNull
    public static final U41 v0(short s, long j) {
        return U41.Y0.a(s, j, -1L);
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    public static final boolean v1(@NotNull InterfaceC6987iE<Short> interfaceC6987iE, int i) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Short P1 = P1(i);
        if (P1 != null) {
            return interfaceC6987iE.e(P1);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T w(@NotNull T t, @NotNull T t2) {
        C6562gT0.p(t, "<this>");
        C6562gT0.p(t2, "minimumValue");
        if (t.compareTo(t2) < 0) {
            return t2;
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.7")
    public static final char w0(@NotNull TA ta) {
        C6562gT0.p(ta, "<this>");
        if (!ta.isEmpty()) {
            return ta.j();
        }
        throw new NoSuchElementException("Progression " + ta + " is empty.");
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    public static final boolean w1(@NotNull InterfaceC6987iE<Short> interfaceC6987iE, long j) {
        C6562gT0.p(interfaceC6987iE, "<this>");
        Short Q1 = Q1(j);
        if (Q1 != null) {
            return interfaceC6987iE.e(Q1);
        }
        return false;
    }

    public static final short x(short s, short s2) {
        if (s < s2) {
            return s2;
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.7")
    public static final int x0(@NotNull C10711xR0 c10711xR0) {
        C6562gT0.p(c10711xR0, "<this>");
        if (!c10711xR0.isEmpty()) {
            return c10711xR0.j();
        }
        throw new NoSuchElementException("Progression " + c10711xR0 + " is empty.");
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean x1(@NotNull InterfaceC2796Dv1<Short> interfaceC2796Dv1, byte b) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        return interfaceC2796Dv1.e(Short.valueOf(b));
    }

    public static final byte y(byte b, byte b2) {
        if (b > b2) {
            return b2;
        }
        return b;
    }

    @InterfaceC6480g82(version = "1.7")
    public static final long y0(@NotNull U41 u41) {
        C6562gT0.p(u41, "<this>");
        if (!u41.isEmpty()) {
            return u41.j();
        }
        throw new NoSuchElementException("Progression " + u41 + " is empty.");
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean y1(@NotNull InterfaceC2796Dv1<Short> interfaceC2796Dv1, int i) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Short P1 = P1(i);
        if (P1 != null) {
            return interfaceC2796Dv1.e(P1);
        }
        return false;
    }

    public static final double z(double d, double d2) {
        if (d > d2) {
            return d2;
        }
        return d;
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final Character z0(@NotNull TA ta) {
        C6562gT0.p(ta, "<this>");
        if (ta.isEmpty()) {
            return null;
        }
        return Character.valueOf(ta.j());
    }

    @InterfaceC8046mW0(name = "shortRangeContains")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final boolean z1(@NotNull InterfaceC2796Dv1<Short> interfaceC2796Dv1, long j) {
        C6562gT0.p(interfaceC2796Dv1, "<this>");
        Short Q1 = Q1(j);
        if (Q1 != null) {
            return interfaceC2796Dv1.e(Q1);
        }
        return false;
    }
}
