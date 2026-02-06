package o;

import java.util.NoSuchElementException;
import o.C10835xx2;
import o.C9132qx2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class Ux2 {
    @InterfaceC6480g82(version = "1.7")
    public static final int A(@NotNull C9132qx2 c9132qx2) {
        C6562gT0.p(c9132qx2, "<this>");
        if (!c9132qx2.isEmpty()) {
            return c9132qx2.j();
        }
        throw new NoSuchElementException("Progression " + c9132qx2 + " is empty.");
    }

    @InterfaceC6480g82(version = "1.7")
    public static final long B(@NotNull C10835xx2 c10835xx2) {
        C6562gT0.p(c10835xx2, "<this>");
        if (!c10835xx2.isEmpty()) {
            return c10835xx2.j();
        }
        throw new NoSuchElementException("Progression " + c10835xx2 + " is empty.");
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final C7162ix2 C(@NotNull C9132qx2 c9132qx2) {
        C6562gT0.p(c9132qx2, "<this>");
        if (c9132qx2.isEmpty()) {
            return null;
        }
        return C7162ix2.g(c9132qx2.j());
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final C9860tx2 D(@NotNull C10835xx2 c10835xx2) {
        C6562gT0.p(c10835xx2, "<this>");
        if (c10835xx2.isEmpty()) {
            return null;
        }
        return C9860tx2.g(c10835xx2.j());
    }

    @InterfaceC6480g82(version = "1.7")
    public static final int E(@NotNull C9132qx2 c9132qx2) {
        C6562gT0.p(c9132qx2, "<this>");
        if (!c9132qx2.isEmpty()) {
            return c9132qx2.k();
        }
        throw new NoSuchElementException("Progression " + c9132qx2 + " is empty.");
    }

    @InterfaceC6480g82(version = "1.7")
    public static final long F(@NotNull C10835xx2 c10835xx2) {
        C6562gT0.p(c10835xx2, "<this>");
        if (!c10835xx2.isEmpty()) {
            return c10835xx2.k();
        }
        throw new NoSuchElementException("Progression " + c10835xx2 + " is empty.");
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final C7162ix2 G(@NotNull C9132qx2 c9132qx2) {
        C6562gT0.p(c9132qx2, "<this>");
        if (c9132qx2.isEmpty()) {
            return null;
        }
        return C7162ix2.g(c9132qx2.k());
    }

    @InterfaceC6480g82(version = "1.7")
    @Nullable
    public static final C9860tx2 H(@NotNull C10835xx2 c10835xx2) {
        C6562gT0.p(c10835xx2, "<this>");
        if (c10835xx2.isEmpty()) {
            return null;
        }
        return C9860tx2.g(c10835xx2.k());
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int I(C9617sx2 c9617sx2) {
        C6562gT0.p(c9617sx2, "<this>");
        return J(c9617sx2, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int J(@NotNull C9617sx2 c9617sx2, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c9617sx2, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        try {
            return Sx2.h(abstractC10696xN1, c9617sx2);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long K(C11321zx2 c11321zx2) {
        C6562gT0.p(c11321zx2, "<this>");
        return L(c11321zx2, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long L(@NotNull C11321zx2 c11321zx2, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c11321zx2, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        try {
            return Sx2.l(abstractC10696xN1, c11321zx2);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final C7162ix2 M(C9617sx2 c9617sx2) {
        C6562gT0.p(c9617sx2, "<this>");
        return N(c9617sx2, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    @Nullable
    public static final C7162ix2 N(@NotNull C9617sx2 c9617sx2, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c9617sx2, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (c9617sx2.isEmpty()) {
            return null;
        }
        return C7162ix2.g(Sx2.h(abstractC10696xN1, c9617sx2));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    public static final C9860tx2 O(C11321zx2 c11321zx2) {
        C6562gT0.p(c11321zx2, "<this>");
        return P(c11321zx2, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class, InterfaceC5880dj0.class})
    @Nullable
    public static final C9860tx2 P(@NotNull C11321zx2 c11321zx2, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(c11321zx2, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (c11321zx2.isEmpty()) {
            return null;
        }
        return C9860tx2.g(Sx2.l(abstractC10696xN1, c11321zx2));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9132qx2 Q(@NotNull C9132qx2 c9132qx2) {
        C6562gT0.p(c9132qx2, "<this>");
        return C9132qx2.Y0.a(c9132qx2.k(), c9132qx2.j(), -c9132qx2.l());
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C10835xx2 R(@NotNull C10835xx2 c10835xx2) {
        C6562gT0.p(c10835xx2, "<this>");
        return C10835xx2.Y0.a(c10835xx2.k(), c10835xx2.j(), -c10835xx2.l());
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9132qx2 S(@NotNull C9132qx2 c9132qx2, int i) {
        boolean z;
        C6562gT0.p(c9132qx2, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        ZN1.a(z, Integer.valueOf(i));
        C9132qx2.a aVar = C9132qx2.Y0;
        int j = c9132qx2.j();
        int k = c9132qx2.k();
        if (c9132qx2.l() <= 0) {
            i = -i;
        }
        return aVar.a(j, k, i);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C10835xx2 T(@NotNull C10835xx2 c10835xx2, long j) {
        boolean z;
        C6562gT0.p(c10835xx2, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        ZN1.a(z, Long.valueOf(j));
        C10835xx2.a aVar = C10835xx2.Y0;
        long j2 = c10835xx2.j();
        long k = c10835xx2.k();
        if (c10835xx2.l() <= 0) {
            j = -j;
        }
        return aVar.a(j2, k, j);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9617sx2 U(short s, short s2) {
        int i = s2 & Xx2.Y0;
        if (C6562gT0.t(i, 0) <= 0) {
            return C9617sx2.Z0.a();
        }
        return new C9617sx2(C7162ix2.n(s & Xx2.Y0), C7162ix2.n(C7162ix2.n(i) - 1), null);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static C9617sx2 V(int i, int i2) {
        int compare;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return C9617sx2.Z0.a();
        }
        return new C9617sx2(i, C7162ix2.n(i2 - 1), null);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9617sx2 W(byte b, byte b2) {
        int i = b2 & 255;
        if (C6562gT0.t(i, 0) <= 0) {
            return C9617sx2.Z0.a();
        }
        return new C9617sx2(C7162ix2.n(b & 255), C7162ix2.n(C7162ix2.n(i) - 1), null);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static C11321zx2 X(long j, long j2) {
        int compare;
        compare = Long.compare(j2 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            return C11321zx2.Z0.a();
        }
        return new C11321zx2(j, C9860tx2.n(j2 - C9860tx2.n(1 & 4294967295L)), null);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short a(short s, short s2) {
        if (C6562gT0.t(s & Xx2.Y0, 65535 & s2) < 0) {
            return s2;
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int b(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i2;
        }
        return i;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte c(byte b, byte b2) {
        if (C6562gT0.t(b & 255, b2 & 255) < 0) {
            return b2;
        }
        return b;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long d(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (compare < 0) {
            return j2;
        }
        return j;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short e(short s, short s2) {
        if (C6562gT0.t(s & Xx2.Y0, 65535 & s2) > 0) {
            return s2;
        }
        return s;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int f(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return i2;
        }
        return i;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte g(byte b, byte b2) {
        if (C6562gT0.t(b & 255, b2 & 255) > 0) {
            return b2;
        }
        return b;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long h(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return j2;
        }
        return j;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long i(long j, @NotNull InterfaceC6987iE<C9860tx2> interfaceC6987iE) {
        int compare;
        int compare2;
        C6562gT0.p(interfaceC6987iE, V12.q);
        if (interfaceC6987iE instanceof InterfaceC6246fE) {
            return ((C9860tx2) C5075aO1.N(C9860tx2.g(j), (InterfaceC6246fE) interfaceC6987iE)).p0();
        }
        if (!interfaceC6987iE.isEmpty()) {
            compare = Long.compare(j ^ Long.MIN_VALUE, interfaceC6987iE.d().p0() ^ Long.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Long.compare(j ^ Long.MIN_VALUE, interfaceC6987iE.h().p0() ^ Long.MIN_VALUE);
                if (compare2 > 0) {
                    return interfaceC6987iE.h().p0();
                }
                return j;
            }
            return interfaceC6987iE.d().p0();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6987iE + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short j(short s, short s2, short s3) {
        int i = s2 & Xx2.Y0;
        int i2 = s3 & Xx2.Y0;
        if (C6562gT0.t(i, i2) <= 0) {
            int i3 = 65535 & s;
            if (C6562gT0.t(i3, i) < 0) {
                return s2;
            }
            if (C6562gT0.t(i3, i2) > 0) {
                return s3;
            }
            return s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) Xx2.h0(s3)) + " is less than minimum " + ((Object) Xx2.h0(s2)) + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int k(int i, int i2, int i3) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare2 >= 0) {
                compare3 = Integer.compare(i ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
                if (compare3 > 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C7162ix2.j0(i3)) + " is less than minimum " + ((Object) C7162ix2.j0(i2)) + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte l(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (C6562gT0.t(i, i2) <= 0) {
            int i3 = b & 255;
            if (C6562gT0.t(i3, i) < 0) {
                return b2;
            }
            if (C6562gT0.t(i3, i2) > 0) {
                return b3;
            }
            return b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) Vw2.h0(b3)) + " is less than minimum " + ((Object) Vw2.h0(b2)) + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long m(long j, long j2, long j3) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                compare3 = Long.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
                if (compare3 > 0) {
                    return j3;
                }
                return j;
            }
            return j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C9860tx2.j0(j3)) + " is less than minimum " + ((Object) C9860tx2.j0(j2)) + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int n(int i, @NotNull InterfaceC6987iE<C7162ix2> interfaceC6987iE) {
        int compare;
        int compare2;
        C6562gT0.p(interfaceC6987iE, V12.q);
        if (interfaceC6987iE instanceof InterfaceC6246fE) {
            return ((C7162ix2) C5075aO1.N(C7162ix2.g(i), (InterfaceC6246fE) interfaceC6987iE)).p0();
        }
        if (!interfaceC6987iE.isEmpty()) {
            compare = Integer.compare(i ^ Integer.MIN_VALUE, interfaceC6987iE.d().p0() ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Integer.compare(i ^ Integer.MIN_VALUE, interfaceC6987iE.h().p0() ^ Integer.MIN_VALUE);
                if (compare2 > 0) {
                    return interfaceC6987iE.h().p0();
                }
                return i;
            }
            return interfaceC6987iE.d().p0();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC6987iE + '.');
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean o(@NotNull C9617sx2 c9617sx2, byte b) {
        C6562gT0.p(c9617sx2, "$this$contains");
        return c9617sx2.r(C7162ix2.n(b & 255));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean p(C11321zx2 c11321zx2, C9860tx2 c9860tx2) {
        C6562gT0.p(c11321zx2, "$this$contains");
        if (c9860tx2 != null && c11321zx2.r(c9860tx2.p0())) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean q(@NotNull C11321zx2 c11321zx2, int i) {
        C6562gT0.p(c11321zx2, "$this$contains");
        return c11321zx2.r(C9860tx2.n(i & 4294967295L));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean r(@NotNull C11321zx2 c11321zx2, byte b) {
        C6562gT0.p(c11321zx2, "$this$contains");
        return c11321zx2.r(C9860tx2.n(b & 255));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean s(@NotNull C9617sx2 c9617sx2, short s) {
        C6562gT0.p(c9617sx2, "$this$contains");
        return c9617sx2.r(C7162ix2.n(s & Xx2.Y0));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean t(C9617sx2 c9617sx2, C7162ix2 c7162ix2) {
        C6562gT0.p(c9617sx2, "$this$contains");
        if (c7162ix2 != null && c9617sx2.r(c7162ix2.p0())) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean u(@NotNull C9617sx2 c9617sx2, long j) {
        C6562gT0.p(c9617sx2, "$this$contains");
        if (C9860tx2.n(j >>> 32) == 0 && c9617sx2.r(C7162ix2.n((int) j))) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final boolean v(@NotNull C11321zx2 c11321zx2, short s) {
        C6562gT0.p(c11321zx2, "$this$contains");
        return c11321zx2.r(C9860tx2.n(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9132qx2 w(short s, short s2) {
        return C9132qx2.Y0.a(C7162ix2.n(s & Xx2.Y0), C7162ix2.n(s2 & Xx2.Y0), -1);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9132qx2 x(int i, int i2) {
        return C9132qx2.Y0.a(i, i2, -1);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C9132qx2 y(byte b, byte b2) {
        return C9132qx2.Y0.a(C7162ix2.n(b & 255), C7162ix2.n(b2 & 255), -1);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final C10835xx2 z(long j, long j2) {
        return C10835xx2.Y0.a(j, j2, -1L);
    }
}
