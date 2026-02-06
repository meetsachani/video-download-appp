package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.oQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8510oQ {
    public static final void a(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Throwable th) {
        for (InterfaceC8023mQ interfaceC8023mQ : C8266nQ.b()) {
            try {
                interfaceC8023mQ.S(interfaceC5809dQ, th);
            } catch (C10029uf0 unused) {
                return;
            } catch (Throwable th2) {
                C8266nQ.c(C8753pQ.c(th, th2));
            }
        }
        try {
            C3917Pf0.a(th, new C5960e30(interfaceC5809dQ));
        } catch (Throwable unused2) {
        }
        C8266nQ.c(th);
    }
}
