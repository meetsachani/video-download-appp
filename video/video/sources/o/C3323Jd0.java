package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Jd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3323Jd0 {
    @InterfaceC6480g82(version = "2.0")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final /* synthetic */ <T extends Enum<T>> InterfaceC3127Hd0<T> a() {
        throw new C9592sr1(null, 1, null);
    }

    @HK1
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    public static final <E extends Enum<E>> InterfaceC3127Hd0<E> b(@NotNull FA0<E[]> fa0) {
        C6562gT0.p(fa0, "entriesProvider");
        return new C3421Kd0(fa0.invoke());
    }

    @HK1
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    public static final <E extends Enum<E>> InterfaceC3127Hd0<E> c(@NotNull E[] eArr) {
        C6562gT0.p(eArr, RemoteConfigConstants.ResponseFieldKey.h0);
        return new C3421Kd0(eArr);
    }
}
