package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class Wx2 {
    @InterfaceC8046mW0(name = "sumOfUByte")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int a(@NotNull B02<Vw2> b02) {
        C6562gT0.p(b02, "<this>");
        int i = 0;
        for (Vw2 vw2 : b02) {
            i = C7162ix2.n(i + C7162ix2.n(vw2.n0() & 255));
        }
        return i;
    }

    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int b(@NotNull B02<C7162ix2> b02) {
        C6562gT0.p(b02, "<this>");
        int i = 0;
        for (C7162ix2 c7162ix2 : b02) {
            i = C7162ix2.n(i + c7162ix2.p0());
        }
        return i;
    }

    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long c(@NotNull B02<C9860tx2> b02) {
        C6562gT0.p(b02, "<this>");
        long j = 0;
        for (C9860tx2 c9860tx2 : b02) {
            j = C9860tx2.n(j + c9860tx2.p0());
        }
        return j;
    }

    @InterfaceC8046mW0(name = "sumOfUShort")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int d(@NotNull B02<Xx2> b02) {
        C6562gT0.p(b02, "<this>");
        int i = 0;
        for (Xx2 xx2 : b02) {
            i = C7162ix2.n(i + C7162ix2.n(xx2.n0() & Xx2.Y0));
        }
        return i;
    }
}
