package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Objects;

/* renamed from: o.vz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10357vz2 {
    public static UncheckedIOException a(Object obj) {
        String objects = Objects.toString(obj);
        return new UncheckedIOException(objects, new IOException(objects));
    }

    public static UncheckedIOException b(IOException iOException, Object obj) {
        return new UncheckedIOException(Objects.toString(obj), iOException);
    }
}
