package o;

import android.annotation.SuppressLint;

/* renamed from: o.ox0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8637ox0 {
    public static final String a = "ForcedSender";

    @InterfaceC10697xN2
    @SuppressLint({"DiscouragedApi"})
    public static void a(InterfaceC3584Lt2<?> interfaceC3584Lt2, EnumC10429wH1 enumC10429wH1) {
        if (interfaceC3584Lt2 instanceof Rt2) {
            Ut2.c().e().l(((Rt2) interfaceC3584Lt2).d().f(enumC10429wH1), 1);
            return;
        }
        C7676l41.i(a, "Expected instance of `TransportImpl`, got `%s`.", interfaceC3584Lt2);
    }
}
