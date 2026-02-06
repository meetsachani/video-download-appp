package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.cE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5518cE {
    @InterfaceC5299bJ2
    public static final Logger a = Logger.getLogger(C5518cE.class.getName());

    public static void a(@MB Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (z) {
                a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void b(@MB InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void c(@MB Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
