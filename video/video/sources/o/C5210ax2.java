package o;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.ax2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5210ax2 {
    @InterfaceC8046mW0(name = "sumOfUByte")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int a(@NotNull Iterable<Vw2> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (Vw2 vw2 : iterable) {
            i = C7162ix2.n(i + C7162ix2.n(vw2.n0() & 255));
        }
        return i;
    }

    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int b(@NotNull Iterable<C7162ix2> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (C7162ix2 c7162ix2 : iterable) {
            i = C7162ix2.n(i + c7162ix2.p0());
        }
        return i;
    }

    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long c(@NotNull Iterable<C9860tx2> iterable) {
        C6562gT0.p(iterable, "<this>");
        long j = 0;
        for (C9860tx2 c9860tx2 : iterable) {
            j = C9860tx2.n(j + c9860tx2.p0());
        }
        return j;
    }

    @InterfaceC8046mW0(name = "sumOfUShort")
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int d(@NotNull Iterable<Xx2> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (Xx2 xx2 : iterable) {
            i = C7162ix2.n(i + C7162ix2.n(xx2.n0() & Xx2.Y0));
        }
        return i;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final byte[] e(@NotNull Collection<Vw2> collection) {
        C6562gT0.p(collection, "<this>");
        byte[] f = Ww2.f(collection.size());
        int i = 0;
        for (Vw2 vw2 : collection) {
            Ww2.J(f, i, vw2.n0());
            i++;
        }
        return f;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final int[] f(@NotNull Collection<C7162ix2> collection) {
        C6562gT0.p(collection, "<this>");
        int[] f = C8395nx2.f(collection.size());
        int i = 0;
        for (C7162ix2 c7162ix2 : collection) {
            C8395nx2.J(f, i, c7162ix2.p0());
            i++;
        }
        return f;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final long[] g(@NotNull Collection<C9860tx2> collection) {
        C6562gT0.p(collection, "<this>");
        long[] f = C10103ux2.f(collection.size());
        int i = 0;
        for (C9860tx2 c9860tx2 : collection) {
            C10103ux2.J(f, i, c9860tx2.p0());
            i++;
        }
        return f;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final short[] h(@NotNull Collection<Xx2> collection) {
        C6562gT0.p(collection, "<this>");
        short[] f = Yx2.f(collection.size());
        int i = 0;
        for (Xx2 xx2 : collection) {
            Yx2.J(f, i, xx2.n0());
            i++;
        }
        return f;
    }
}
