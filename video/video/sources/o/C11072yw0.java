package o;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.yw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11072yw0 {
    public static final Logger a = Logger.getLogger(C11072yw0.class.getName());

    public static void a(Flushable flushable, boolean z) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e) {
            if (z) {
                a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e) {
            a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e);
        }
    }
}
